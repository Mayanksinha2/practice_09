package com.internshala;

class Animal{

    public static void name(){
        System.out.println("I am an animal.");
    }

    public static void run(){
        System.out.println("I can run");
    }
}

class Dog extends Animal{

    public static void bark(){
        System.out.println("I can bark........'bhow' 'bhow' ");
        super.run();
    }

    public static void color(){
        System.out.println("My color is Black");
    }
}

class Cat extends Animal{

    public static void meow(){
        System.out.println("I can meow.........'meow' 'meow' ");
    }

    public static void pattern(){
        System.out.println("My patter is grey & white");
    }
}

class puppy extends Dog {
    public static void size() {
        System.out.println("Hiii, I'm the little one");
        super.run();
    }
}

public class practice_09 {
    public static void main(String[] args) {
//        Dog dg = new Dog();
//        dg.bark();
//        dg.name();
//        dg.run();

        puppy pup = new puppy();
    pup.bark();
    pup.name();
    pup.size();
    pup.color();
    }
}
