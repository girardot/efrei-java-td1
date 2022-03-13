package com.efrei;

import java.util.Scanner;

public class MainIntermediate {

    // Your static methods (if needed) here
    public static void main(String[] args) {
        int numExo;
        String reponse;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an exercise number : ");
            numExo = scanner.nextInt();
            // !!!!!!!!!!!!!!!!!!!!!!!!!
            scanner.nextLine();
            switch (numExo) {
                case 1: {
                    testIsEven();
                    break;
                }
                case 2: {
                    System.out.println("enter a year to check if is leap ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(year + " is leap " + isLeap(year));
                    break;
                }
                case 3: {
                    int[] scores = new int[5];
                    fillArr(scores, scores.length);
                    displayArr(scores, scores.length);
                    System.out.println("max " + maxArr(scores, scores.length));
                    break;
                }

                default:
                    System.out.println("This exercise number does not exist");
            }
            System.out.println("Continue ? y / n ");
            reponse = scanner.next();
            if (reponse.charAt(0) == 'n') {
                break; // Quit the loop
            }
        }
        System.out.println("Bye ! ");
        scanner.close();
    }

    private static void testIsEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a positive integer to check if is even ");
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i >= 0) {
            System.out.println(i + " is even " + isEven(i));
        } else {
            System.out.println(i + " is negatif !!!!");
        }
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isLeap(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void fillArr(int[] arr, int size) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("enter int");
            int inputInt = scanner.nextInt();
            scanner.nextLine();
            arr[i] = inputInt;
        }
    }

    public static void displayArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int maxArr(int[] arr, int size) {
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
