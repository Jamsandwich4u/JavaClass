package com.lab06;

import java.util.Scanner;

public class Lab6 {
    public int getInt(String prompt) {
        System.out.print(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public void part1() {
        //grades();
        //account();
        multiplicationTableEnhanced();
    }

    public void grades() {
        String[] names = new String[5];
        int[] marks = new int[5];

        for (int i = 0; i < names.length; i++) {
            names[i] = getString("Student name: ");
            marks[i] = getInt("Exam mark for " + names[i] + ": ");
        }
        
        for (int i = 0; i < names.length; i++) {
            int examMark = marks[i];
            System.out.print(names[i] + " - " + examMark + " - ");

            if (examMark < 1 || examMark > 100) {
                System.out.println("Error: marks must be between 1..100");
            } else if (examMark < 50) {
                System.out.println("Fail");
            } else if (examMark <= 60) {
                System.out.println("Pass");
            } else if (examMark <= 70) {
                System.out.println("Merit");
            } else {
                System.out.println("Distinction");
            }
        }
    }

    public void account() {
        double initialMoney = 100;
        double currentMoney = initialMoney;
        double interestRate = 0.05;   // 5%
        int years = 0;

        while (currentMoney < 2 * initialMoney) {  // loop is unlikely to hit exactly £200.
            currentMoney = currentMoney + currentMoney * interestRate;
            years++;
        }

        System.out.println("It takes " + years + " years to double your money.");
        System.out.println("Balance after " + years + " years: £" + currentMoney);
    }

    public void multiplicationTable() {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.printf("%5d", col * row);
            }
            System.out.println();
        }
    }

    public void multiplicationTableEnhanced() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int row : numbers) {
            for (int col : numbers) {
                System.out.printf("%5d", col * row);
            }
            System.out.println();
        }
    }
}
