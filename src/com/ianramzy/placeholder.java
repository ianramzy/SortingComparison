//package com.ianramzy;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class Graph extends JFrame {
//    int NUM = 6;
//    public int list[] = new int[NUM];  // List of random numbers
//    public int list2[] = new int[NUM];  // List of random numbers
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
//        width = getWidth();
//        height = getHeight();
//        System.out.println(width + ", " + height);
//        //makeList(selectionSortTime, insertionSortTime, bubbleSortTime, betterBubbleSortTime, mergeSortTime, quickSortTime);
//    }
//
//    public void paint(Graphics g, int selectionSortTime, int insertionSortTime, int bubbleSortTime, int betterBubbleSortTime, int mergeSortTime, int quickSortTime) {
//        super.paint(g);
//        showList(g, selectionSortTime, insertionSortTime, bubbleSortTime, betterBubbleSortTime, mergeSortTime, quickSortTime);
//    }
//
//    public void makeList(int selectionSortTime, int insertionSortTime, int bubbleSortTime, int betterBubbleSortTime, int mergeSortTime, int quickSortTime) {
////        for (int i = 0; i < NUM; i++) {
////            list[i] = (int) (Math.random() * 100); //hmm
////        }
//        list[0] = selectionSortTime;
//        list[1] = insertionSortTime;
//        list[2] = bubbleSortTime;
//        list[3] = betterBubbleSortTime;
//        list[4] = mergeSortTime;
//        list[5] = quickSortTime;
//
//        System.out.println("5: " + list[5]);
//        System.out.println("0: " + list[0]);
//        maxHeight = list[5];  //Y-axis equals largest value in list
//    }
//
//    public void showList(Graphics g, int selectionSortTime, int insertionSortTime, int bubbleSortTime, int betterBubbleSortTime, int mergeSortTime, int quickSortTime ) {
//        int x;
//        g.clearRect(0, 0, width, height);
//        for (int i = 0; i < NUM; i++) {
//            g.setColor(Color.red);
//            g.drawLine(0, 400, 800, 400);
//            g.drawLine(400, 0, 400, 800);
//            g.setColor(Color.blue);
//
//            x = (list[i] * (height / maxHeight)) - 1; //maxheight
//            g.fillRect((i * width / NUM) / 2, (height - x - 1) / 2, ((width / NUM) / 2) - 5, x / 2);
//            g.setColor(Color.black);  //Black Borders
//            g.drawRect((i * width / NUM) / 2, (height - x - 1) / 2, ((width / NUM) / 2) - 5, x / 2);
//            g.setColor(Color.black);
//            g.drawString("10 Items", 0, 20);
////            g.drawString(matchValue(list[i],selectionSortTime,  insertionSortTime,  bubbleSortTime,  betterBubbleSortTime,  mergeSortTime,  quickSortTime),(i * width / NUM) / 2,(height - x - 1) / 2);
//
////            System.out.println(" width: "+width+" Height: "+height+" num: "+NUM+" X: "+x);
//        }
//    }
//
//    public String matchValue(int value, int selectionSortTime, int insertionSortTime, int bubbleSortTime, int betterBubbleSortTime, int mergeSortTime, int quickSortTime) {
//        if (value == selectionSortTime) {
//            return "Selection Sort\n" + selectionSortTime;
//        }if (value == insertionSortTime) {
//            return "Insertion Sort\n" + insertionSortTime;
//        }if (value == bubbleSortTime) {
//            return "Bubble Sort\n" + bubbleSortTime;
//        }if (value == betterBubbleSortTime) {
//            return "Better Bubble Sort\n" + betterBubbleSortTime;
//        }if (value == mergeSortTime) {
//            return "Merge Sort\n" + mergeSortTime;
//        }if (value == quickSortTime) {
//            return "Quick Sort\n" + quickSortTime;
//        }else {
//            return "error";
//        }
//    }
//
//    public static void main(String[] args) {
//        new Graph();
//    }
//}
//
