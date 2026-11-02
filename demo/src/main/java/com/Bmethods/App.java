package com.Bmethods;

import java.util.Scanner;

public class App {    
    public static void main(String[] args) {
    /*
        App a = new App();
        a.add(1, 2);
        a.greet("J");
    }
    
    private void greet(String name) {
        System.out.println("Hello" + name);
    }

    private void greet(String name, int age) {
        System.out.println("Hello Steven");
    }

    private void add(int i, int j) {
        System.out.println(i + j);
    }
    */

        /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("name: ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("score");
        double score = scanner.nextDouble();
        System.out.println(score);

        scanner.nextLine();

        System.out.println("enter another string: ");
        String newString = scanner.nextLine();
        System.out.println(newString);

        System.out.println("Hello " + name + " you are " + age + " years old and your score is " + score + " your next line is " + newString);

        scanner.close();
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(age);




        scanner.close();

    }
}


/*

Methods:
    a block of code.
    Performs a task/returns a value.
    Has to be in a class

public:
    - access modifier - public, private, protected, default.
    - public = accessible from anywhere.
    - private = accessible only within the class.
    - protected = accessible within the package and subclasses.
    - default = accessible within the package.

params:
    - none eg void greet()
    - single void greet(String name)
    - multi void greet(String name, int age)

obj creation:
    Obj obj = new Obj();

Overloading:
    - Multiple methods with the same name.
    - Must have different params.
    - order, number, type.

input
printf + .format





*/