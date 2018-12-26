//package com.ianramzy;
//
//import java.util.*;
//
//// The "SortComparison" class.
//public class SortComparison {
//    // Number of values in the list:
//    public static int NUM = 10000; //made smaller
//    public int selectionSortTime;
//    public int insertionSortTime;
//    public int bubbleSortTime;
//    public int betterBubbleSortTime;
//    public int mergeSortTime;
//    public int quickSortTime;
//    public int maxValue; //max for y-axis in charts
//
//    // List of random numbers
//    private static int list[] = new int[NUM];
//
//    // "Seed" for the random number generator
//    private static int seed = new Random().nextInt();
//
//    public SortComparison() {
//        calculateTimes();
//        System.out.println("selectionSortTime: "+selectionSortTime);
//        System.out.println("insertionSortTime: : "+insertionSortTime);
//        System.out.println("bubbleSortTime: : "+bubbleSortTime);
//        System.out.println("betterBubbleSortTime: : "+betterBubbleSortTime);
//        System.out.println("mergeSortTime: : "+mergeSortTime);
//        System.out.println("quickSortTime: : "+quickSortTime);
//        new Graph().makeList(selectionSortTime, insertionSortTime, bubbleSortTime, betterBubbleSortTime, mergeSortTime, quickSortTime);
//    }
//
//    public static void main(String[] args) {
//        new SortComparison();
//    }
//
//    public static void makeList() {
//        Random rand = new Random(seed);
//        for (int i = 0; i < NUM; i++) {
//            list[i] = (int) (rand.nextDouble() * 100 + 1);
//        }
//    }
//
//    public void calculateTimes(){
//       selectionSortTime = time(new SelectionSorter());
//       insertionSortTime = time(new InsertionSorter());
//       bubbleSortTime = time(new BubbleSorter());
//       betterBubbleSortTime = time(new BetterBubbleSorter());
//       mergeSortTime = time(new MergeSorter());
//       quickSortTime = time(new QuickSorter());
//    }
//
//    public static int time(Sorter x) {
//        int startTime;
//        makeList();
//        startTime = (int)(Calendar.getInstance().getTimeInMillis());
//        x.sort(NUM, list);
//        return (int)(Calendar.getInstance().getTimeInMillis() - startTime);
//    }
//}
