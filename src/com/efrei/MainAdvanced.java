package com.efrei;

import java.util.Scanner;

public class MainAdvanced {

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
                    int arr[] = new int[]{9, 5, 7, 6, 8};
                    sortArr(arr, arr.length);
                    for (int element : arr) {
                        System.out.print(element + " ");
                    }

                    break;
                }
                case 2: {
                    System.out.println("Enter a word");
                    String word = scanner.nextLine();
                    System.out.println(word + " is palindrome " + isPalindrome(word));
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

    public static int positionMax(int[] arr, int size) {
        int max = 0;
        int maxPosition = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    public static void swapValues(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortArr(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapValues(arr, j, j + 1);
                }
            }
        }
    }

    public static String reverseString(String stringToReverse) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedString.append(stringToReverse.charAt(i));
        }
        return reversedString.toString();
    }

    private static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
        //        return str1.compareTo(str2) == 0;
    }

    private static boolean isPalindrome(String word) {
        String reverseString = reverseString(word);
        System.out.println("reverseString : " + reverseString);
        return compareStrings(word, reverseString);
    }

}
