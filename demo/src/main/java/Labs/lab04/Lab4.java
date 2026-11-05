package Labs.lab04;

import java.util.Scanner;

public class Lab4 {

    public int getInt(String prompt) {
        System.out.print(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public void part1() {
        int bagPrice = getInt("Price of a bag please?");        

        if (bagPrice <= 0) {
            System.out.println("Price must be positive number");
        } else {
            int money = getInt("How much money do you have?");

            if (money < 0) {
                System.out.println("Money must be positive number");
            } else if (money == 0) {
                System.out.println("Come back with your pocket money");
            } else {
                int numBag = money / bagPrice;
                System.out.println("If the price is " + bagPrice + "p, and you have " + money + "p, then you will be able to buy " + numBag + " bags");
            }
        }

        

        
        


    }
}

