package com.Dloops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Loops repeat blocks of code.
        // 1 loop is called an iteration.
        // loops controlled with conditionals.
        // needs a way to start and a way to stop.

        // while loops:
        /*
        int i = 0;
        while (i < 10) {
            System.out.println("count: " + i);
            i++;
        }
        System.out.println("loop finished");
        */

        // do while loops - body runs at least once.
        /*
        int i = 10;
        do {
            System.out.println("count: " + i);
            i++;
        } while (i < 5);
        */

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a positive number");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Invalid number, must be above zero");
            }
        } while (number <= 0);

        System.out.println("You entered " + number);
        scanner.close();


        
    }
}
