package com.lab03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        theLunchQueue();
    }

    public static void theLunchQueue() {
        String mainCourse = getString("What main dish would you like (fish, burgers, or veg)?");
        int potatoes = getInt("How many roast potatoes would you like?");
        int sprouts = getInt("How many Brussels sprouts would you like?");

        System.out.println("Hello, your lunch is " + mainCourse + " with " + potatoes + " roast potatoes and " + sprouts + " Brussels sprouts.");
    }

    public static int getInt(String prompt) {
        System.out.print(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }





}
