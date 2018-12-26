//package com.ianramzy;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class Graph extends JFrame {
//    int NUM  = 6;
//    public int list[] = new int [NUM];  // List of values from sort times
//    private int width;       // Applet size:
//    private int height;      // Applet size:
//    private boolean restart = false;
//    int maxHeight;
//
//    public Graph() {
//        JPanel panel = new JPanel();
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setBounds(100, 100, 800, 800);
//        this.setContentPane(panel);
//        this.setVisible(true);
//    }
//
//    public void paint(Graphics g) {
//        super.paint(g);
//        showList(g);
//    }
//
//    public void makeList(int selectionSortTime, int insertionSortTime, int bubbleSortTime, int betterBubbleSortTime, int mergeSortTime, int quickSortTime) {
//        list[0] = selectionSortTime;
//        list[1] = insertionSortTime;
//        list[2] = bubbleSortTime;
//        list[3] = betterBubbleSortTime;
//        list[4] = mergeSortTime;
//        list[5] = quickSortTime;
//        Arrays.sort(list);
//        System.out.println("5: "+list[5]);
//        System.out.println("0: "+list[0]);
//        maxHeight = list[5];
//    }
//
//    public void showList(Graphics g) {
//        int x;
//        g.clearRect(0, 0, width, height);
//        for (int i = 0; i < NUM; i++) {
//            g.setColor(Color.red);
//            g.drawLine(0,400,800,400);
//            g.drawLine(400,0,400,800);
//            g.setColor(Color.blue);
//
//            x = (list[i] * (height / maxHeight))-1; //maxheight
//            g.fillRect((i * width / NUM)/2, (height - x - 1)/2, ((width / NUM)/2)-5, x/2);
//            g.setColor(Color.black);  //Black Borders
//            g.drawRect((i * width / NUM)/2, (height - x - 1)/2, ((width / NUM)/2)-5, x/2);
//            g.setColor(Color.black);
//            g.drawString("10 Items", 0, 20);
//        }
//    }
//
//    public static void main(String[] args) {
//        new Graph();
//    }
//}
//
