package com.Ftypes;

public class Main {
    public static void main(String[] args) {
        
        // 2 types of type.
        // primitive and reference.
        // definining a class introduces a new ref type.
        // null when ref type has no actual object.
        
        // ref types:
            //  class defines state and behaviour of a type:
                // state: fields (variables) that hold data.
                // behaviour: methods.

        // == and .equals()
        // == for prims looked at value.
        // == for refs are refs to same object.
        // Object.equals is same as '=='.
        // Strings have already overridden.

        /*
        int a = 5;
        int b = 5;

        System.out.println(a == b);  // true

        Person person1 = new Person();
        Person person2 = person1;
        Person person3 = new Person();

        System.out.println(person1 == person2);  // true
        System.out.println(person1 == person3);  // false

        System.out.println(person1.equals(person2));  // true
        System.out.println(person1.equals(person3));  // false

        person2.age = 11;
        System.out.println(person1.age);  // 11
        System.out.println(person2.age);  // 11

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2);  // false
        System.out.println(str1.equals(str2));  // true
        */

        // mutability
        // String is immutable.
        // custom classes by default are mutable.
        // Controlled by:
            // ENCAPSULATION:
                // control access to an object's state.
                // make state private.
                // use public getters and setters (not every field).
                // validate!!
        /*
        Person person1 = new Person("J", 20);
        person1.introduce();
        System.out.println(person1.getName());
        person1.setAge(-20);
        */

        // Composition
        Engine engine = new Engine();
        Car car = new Car(engine);

        car.startCar();

    }
}


class Engine {
    public void start() {
        System.out.println("Engine started...");
    }
}

class Car {
    private final Engine engine;

    public Car(Engine engine) {
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null");
        }
        this.engine = engine;
    }
    public void startCar() {
        engine.start();  // delegating
        System.out.println("Car powers up...");
    }
}



/*
class Person{
    // state
    private String name;
    private int age;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.age = age;
    }

    // behaviour
    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}
*/