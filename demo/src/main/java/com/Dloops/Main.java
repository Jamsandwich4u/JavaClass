package com.Dloops;

// import java.util.Scanner;

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

        /*
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
        */

        /*
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.println("Enter choice");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose to add");
                    break;
                case 2:
                    System.out.println("You chose to subtract");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 3);
        scanner.close();
        */

        // Standard for loop - grous setup, condition, incrementation.
        /*
        for (int i = 0; i < 10; i+=2) {
            System.out.println("count: " + i);
        }

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index " + i + ": " + numbers[i]);
        }
        */

        // Enhanced for loop
        /*
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("number: " + number);
        }

        String word = "Hello";
        for (char letter : word.toCharArray()) {
            System.out.println(letter);
        }
        */

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("count: " + i);
        }




        
    }
}
