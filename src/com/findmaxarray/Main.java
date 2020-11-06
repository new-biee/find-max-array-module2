package com.findmaxarray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //initializes the array with the number of elements less than 20

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
        } while (size > 20);

        //Import elements into the array you just initialized

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        //Finds the element with the maximum value and position in the array you just entered

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
