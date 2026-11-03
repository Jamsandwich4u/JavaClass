package com.Cconditionals;

public class Main {

    public static void main(String[] args) {

        // if statement - runs a block of code gated behind a condition.
        // must be a boolean returned by the expression.
        // () surrounds the condition.
        // {} surrounds the logic; makes future edits safer even if single line.

        // else
        // supplies an alternative when the if was false.
        // exactly 1 block can run.
        // else does not have a conditional.

        // else if
        // a chain that checks several possibilities.
        // read top to bottom.
        // first matching condition gets run.
        // the rest gets skipped.
        // final else.
        // vs separate if blocks - all will run if true.

        // Nested if statements.
        // only reached if surrounding branch is triggered.
        // indentation for readability.
        /*
         * int x = 10;
         * 
         * if (x > 0) {
         * String y = x + " is positive";
         * if (x % 2 == 0) {
         * System.out.println(y + " and even.");
         * } else {
         * System.out.println(y + " and odd.");
         * }
         * } else if (x < 0) {
         * System.out.println(x + " is not positive.");
         * } else {
         * System.out.println(x + " is 0.");
         * }
         * 
         * System.out.println("checker.");
         */

        // Ternary operator
        // condition ? valueiftrue : valueiffalse
        // produces a value.
        // value assigned to a variable.
        // keep simple and short.

        /*
        int a = 10;
        int b = 12;
        int c = 15;

        String result = !(a > b)
                ? (b > c
                    ? "b is the largest"
                    : "c is the largest")
                : "a is the largest";
        System.out.println(result);
        */

        // && (logical "and") + || (logical "or")

        /*
        int age = 20;
        boolean hasLicense = true;

        if (age >= 17 || hasLicense) {
            System.out.println("You can drive");
        } else {
            System.out.println("You cannot drive");
        }
        */

        // order of precedence:
            // ()
            // ! (not)
            // * / %
            // + -
            // < <= > >=
            // == !=
            // &&
            // ||
            // ? :

        /*
        boolean isAdmin = true;
        boolean isVerified = true;
        boolean onHoliday = false;

        if ((isAdmin || isVerified) && !onHoliday) {
            System.out.println("Access granted");
        }
        */

        // switch:
            // value(selector)
            // When a case matches the value trigger code block.
            // default - can be used if no other matches.
            // good for discrete and unchanging values.
            // very similar to if else if else flow.

            // constraints:
                // supported types: primitives (ints/bytes/chars/shorts).
                    // Strings
                    // enums

        /*
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
                break;
        }
        System.out.println("Post switch check");
        */

        /*
        int day = 1;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not a valid day");
        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Not a valid day");
        }
        */

        String grade = "B";
        String result = switch (grade) {
            case "A", "B" -> {
                System.out.println("successful");
                yield "passed";
            }
            case "C" -> {
            System.out.println("average");
                yield "failed";
            }
            default -> {yield "invalid";}
        };

        System.out.println(result);



    }

    public static int squareValue(int x) {
        return x * x;
    }

    public static int doubleValue(int x) {
        return x * 2;
    }

}
