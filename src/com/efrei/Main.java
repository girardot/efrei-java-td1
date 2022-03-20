package com.efrei;

import java.util.Arrays;
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
                    System.out.println("The result of the sum is : " + (firstInt + secondInt));
                    break;
                }
                case 3: {
                    double average = 0;
                    for (String arg : args) {
                        average += Integer.parseInt(arg);
                    }
                    average /= args.length;
                    System.out.println("values : " + Arrays.toString(args));
                    System.out.println("average : " + average);
                    break;
                }
                case 4: {
                    System.out.println("Enter scores in the range [0-20] (to stop entry enter other value)");
                    int score;
                    int scoreSum = 0;
                    int[] scores = new int[100];
                    int i = 0;
                    do {
                        score = scanner.nextInt();
                        if (score >= 0 && score <= 20) {
                            scores[i] = score;
                            scoreSum += score;
                            i++;
                        }
                    }
                    while (score >= 0 && score <= 20);
                    scanner.nextLine();
                    System.out.println("scores number : " + i);
                    System.out.println("sum : " + scoreSum);
                    System.out.println("average : " + average(scores, i));
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

    private static double average(int[] numbers, int numberOfElement) {
        double average = 0;
        for (int number : numbers) {
            average += number;
        }
        average /= numberOfElement;
        return average;
    }

}
