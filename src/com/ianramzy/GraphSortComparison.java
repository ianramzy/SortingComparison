// Class that shows a visual representation of sorting times of various algorithms at various dataset sizes
// Ian Ramzy
// Version 1.0

package com.ianramzy;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;

public class GraphSortComparison extends JFrame {


    public static int NUM = 10000;
    public int selectionSortTime;
    public int insertionSortTime;
    public int bubbleSortTime;
    public int betterBubbleSortTime;
    public int mergeSortTime;
    public int quickSortTime;
    public int xpos, ypos;
    Font roboto = new Font("Roboto", Font.BOLD, 12);


    public static BufferedImage myImage = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB); //Image that is drawn onto the frame

    int quadrant;
    int maxHeight; //max for y-axis in charts
    public static int list[];
    private static int seed = new Random().nextInt(); // "Seed" for the random number generator

    int NUM2 = 6;  //number of algorithms being compared
    public int list2[] = new int[NUM2];  // List of values from sort times
    private int width;
    private int height;
    JPanel panel = new JPanel();

    public GraphSortComparison() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 800);
        this.setContentPane(panel);
        this.setVisible(true);

        width = getWidth();
        height = getHeight();

        NUM = 2000;  //100 items
        quadrant = 1;  //first quadrant
        SimpleClass();

        NUM = 4000;
        quadrant = 2;
        SimpleClass();

        NUM = 8000;
        quadrant = 3;
        SimpleClass();

        NUM = 16000;
        quadrant = 4;
        SimpleClass();
    }

    public void SimpleClass() {
        list = new int[NUM];
        calculateTimes();
        makeTimeList();
        updateIMG();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.drawImage(myImage, 0, 0, null);  //Paint image onto panel

    }

    public void updateIMG() {
        Graphics g2 = myImage.getGraphics();
        Graphics2D d2 = (Graphics2D) g2;

        int x;
        for (int i = 0; i < NUM2; i++) {

            maxHeight = list2[5] + 50;  //tallest point on graph, plus buffer for labels
            x = (list2[i] * (height / maxHeight)); //maxheight

            if (quadrant == 1) {
                xpos = ((i * width / NUM2) / 2) + 400;
                ypos = ((height - x - 1) / 2);
            }
            if (quadrant == 2) {
                xpos = ((i * width / NUM2) / 2);
                ypos = ((height - x - 1) / 2);
            }
            if (quadrant == 3) {
                xpos = ((i * width / NUM2) / 2);
                ypos = ((height - x - 1) / 2) + 400;
            }
            if (quadrant == 4) {
                xpos = ((i * width / NUM2) / 2) + 400;
                ypos = ((height - x - 1) / 2) + 400;
            }




            g2.setColor(Color.WHITE);
            g2.setFont(roboto);
            g2.drawLine(0, 400, 800, 400);  //Separating lines down middle of frame
            g2.drawLine(400, 0, 400, 800);
            g2.fillRect(xpos, ypos, ((width / NUM2) / 2) - 5, x / 2);
            d2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.drawString(matchValue(list2[i]), xpos + 2, (ypos - 10));  //Draw Name Label
            g2.drawString(Integer.toString(list2[i]), xpos + 2, (ypos) - 25);  //Draw Value Label

            g2.drawString("2000 Items", 450, 50);  //Draw Quadrant Label
            g2.drawString("4000 Items", 50, 50);  //Draw Quadrant Label
            g2.drawString("8000 Items", 50, 450);  //Draw Quadrant Label
            g2.drawString("16000 Items", 450, 450);  //Draw Quadrant Label
            g2.drawString("Sort Comparison in ms", 250, 50);
            g2.drawString("(Smaller is better)", 250, 80);

//            g2.setColor(Color.red);  //Borders
//            g2.drawRect(xpos, ypos-30, ((width / NUM2) / 2) - 5, (x / 2));
        }
    }

    public void makeTimeList() {
        list2[0] = selectionSortTime;
        list2[1] = insertionSortTime;
        list2[2] = bubbleSortTime;
        list2[3] = betterBubbleSortTime;
        list2[4] = mergeSortTime;
        list2[5] = quickSortTime;
        Arrays.sort(list2);
        repaint();
    }

    public String matchValue(int value) {
        if (value == selectionSortTime) {
            return "Selection";
        }
        if (value == insertionSortTime) {
            return "Insertion";
        }
        if (value == bubbleSortTime) {
            return "Bubble";
        }
        if (value == betterBubbleSortTime) {
            return "Bubble2";
        }
        if (value == mergeSortTime) {
            return "Merge";
        }
        if (value == quickSortTime) {
            return "Quick";
        } else {
            return "error";
        }
    }

    public static void makeList() {
        Random rand = new Random(seed);
        for (int i = 0; i < NUM; i++) {
            list[i] = (int) (rand.nextDouble() * 100 + 1);
        }
    }

    public void calculateTimes() {
        selectionSortTime = time(new SelectionSorter());
        insertionSortTime = time(new InsertionSorter());
        bubbleSortTime = time(new BubbleSorter());
        betterBubbleSortTime = time(new BetterBubbleSorter());
        mergeSortTime = time(new MergeSorter());
        quickSortTime = time(new QuickSorter());
    }

    public static int time(Sorter x) {
        int startTime;
        makeList();
        startTime = (int) (Calendar.getInstance().getTimeInMillis());
        x.sort(NUM, list);
        return (int) (Calendar.getInstance().getTimeInMillis() - startTime);
    }

    public static void main(String[] args) {
        new GraphSortComparison();
    }
}