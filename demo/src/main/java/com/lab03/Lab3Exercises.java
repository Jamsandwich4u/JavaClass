package com.lab03;

import java.util.Scanner;

public class Lab3Exercises {
    public void theLunchQueue() {
        String mainCourse = getString("What main dish would you like (fish, burgers, or veg)?");
        int potatoes = getInt("How many roast potatoes would you like?");
        int sprouts = getInt("How many Brussels sprouts would you like?");

        System.out.println("Hello, your lunch is " + mainCourse + " with " + potatoes + " roast potatoes and " + sprouts + " Brussels sprouts.");
    }

    public void convertInputToStonesPounds(int pounds) {
        int stone = pounds / 14;
        int remainder = pounds % 14;
        System.out.println("You are " + stone + " stone and " + remainder + " pounds.");
    }

    public void convertKgsToStonesPounds(int kg) {
        int pounds = (int) (kg * 2.20462);
        convertInputToStonesPounds(pounds);
    }

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
}
