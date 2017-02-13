package edu.cy.chapter2;

/**
 * Created by metastock on 2/10/2017.
 */

interface Live{
    String name = "Live";

    void eat();
    void sleep();
}

abstract class Animal implements Live{
    protected String name = "Animal"; // There is no restriction of the redeclaration of the member variable

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public abstract void eat(); // Must be public

    // abstract static void move(); // Can't define abstract + static
}

class Deer extends Animal{
    static String name = "Deer";

    public Deer(){
        super("Animal"); // Subclass must call at least one constructor of the super class.
        // name = "Dear";   // member variable is "public static final" in the interface
    }

    @Override
    public void eat(){
        System.out.println("Eating");
    }

    @Override
    public void sleep(){
        System.out.println("Eating");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal animal = new Deer();

        System.out.println(Live.name);
        System.out.println(animal.name);
        System.out.println(Deer.name);
    }
}
