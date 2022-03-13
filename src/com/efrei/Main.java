package com.efrei;

import java.util.Scanner;

public class Main {

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
                    System.out.println("Enter first name  : ");
                    String firstname = scanner.nextLine();
                    System.out.println("Hello " + firstname + "\n How are you ?");
                    String howAreYouResponse = scanner.nextLine();
                    if (howAreYouResponse.contains("good") || howAreYouResponse.contains("fine")) {
                        System.out.println(":-)");
                    }
                    break;
                }
                case 2: {
                    int firstInt = 5;
                    int secondInt = 7;
                    System.out.println("The result of the sum is : " + firstInt + secondInt);
                    int sum = firstInt + secondInt;
                    System.out.println("The result of the sum is : " + sum);
                    break;
                }
// …..
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
}
