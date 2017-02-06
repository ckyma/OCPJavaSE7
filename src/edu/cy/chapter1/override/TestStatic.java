package edu.cy.chapter1.override;

/**
 * Created by metastock on 2/6/2017.
 */

class Book{
    static void printName(){
        System.out.println("Book");
    }
}

class CourseBook extends Book{

    // For static method, it's hiding NOT overriding
    // @Override // Compile error
    static void printName(){
        System.out.println("CourseBook");
    }
}

public class TestStatic {
    public static void main(String[] args) {
        Book.printName();
        Book base = new Book();
        base.printName();

        CourseBook.printName();
        Book derived = new CourseBook();
        // Hiding is like overloading, which is bound at compile time, so use the object reference variable's method
        derived.printName();

        // Static method in Java can be called by using both object variable and the Class name, not like C++ which only accepts ClassName::StaticMethod.
        /* Output:
        Book
        Book
        CourseBook
        Book
        * */
    }
}
