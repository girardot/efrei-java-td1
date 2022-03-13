package com.efrei;

import java.util.Scanner;

public class NextIntSample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter int");
        int i = scanner.nextInt();
      //  scanner.nextLine();
        System.out.println(i);
        System.out.println("enter string");
        String myString = scanner.nextLine();
        System.out.println(myString);
    }
}
