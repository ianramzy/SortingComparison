package com.ianramzy;

import java.util.*;

// The "SortTester" class.
public class SortTester {
    // Number of values in the list:
    private static final int NUM = 100;

    // List of random numbers
    private static int list[] = new int[NUM];

    // "Seed" for the random number generator
    // (so that each sort algorithm is given the same set of data)
    private static long seed = new Random().nextLong();

    public static void main(String[] args) {
        System.out.println("Original list:");
        makeList();
        showList();
        System.out.println("----------------------------------------");
        System.out.println("Selection sort:");
        test(new SelectionSorter());
        System.out.println("----------------------------------------");
        System.out.println("Insertion sort:");
        test(new InsertionSorter());
        System.out.println("----------------------------------------");
        System.out.println("Bubble sort:");
        test(new BubbleSorter());
        System.out.println("----------------------------------------");
        System.out.println("Better bubble sort:");
        test(new BetterBubbleSorter());
        System.out.println("----------------------------------------");
        System.out.println("Merge sort:");
        test(new MergeSorter());
        System.out.println("----------------------------------------");
        System.out.println("Quick sort:");
        test(new QuickSorter());
    }

    public static void test(Sorter x) {
        makeList();
        x.sort(NUM, list); // call the sort method of the Sorter
        showList();
    }

    public static void makeList() {
        Random rand = new Random(seed);
        for (int i = 0; i < NUM; i++) {
            list[i] = (int) (rand.nextDouble() * 100 + 1);
        }
    }

    public static void showList() {
        for (int i = 0; i < NUM; i++) {
            System.out.print(list[i]);
            System.out.print("  ");
        }
        System.out.println();
    }
}