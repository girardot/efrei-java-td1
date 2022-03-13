package com.efrei;

import java.util.Scanner;

public class SwitchCaseWithoutBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1: {
                System.out.println("1");
                // break;
            }
            case 2: {
                System.out.println("2");
                // break;
            }
            default: {
                System.out.println("5");
                // break;
            }
        }
    }
}
