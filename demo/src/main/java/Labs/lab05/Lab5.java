package Labs.lab05;

import java.util.Scanner;

public class Lab5 {

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

    public void grades() {
        int examMark = getInt("exam mark");

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

    public void part2() {
        Boolean summer = getString("Is it Summer? (yes/no):").equalsIgnoreCase("yes");
        Boolean eve = getString("Is it early evening? (yes/no):").equalsIgnoreCase("yes");

        if (summer) {
            if (eve) {
                System.out.println("Eat outside");
            } else {
                System.out.println("Eat inside");
            }
            System.out.println("Do outdoors hobby");
        } else {
            System.out.println("Eat inside");
        if (eve) {
            System.out.println("Take a walk");
        }
        }

        System.out.println("Take a shower");
        System.out.println("Contact friends");        
    }
}

