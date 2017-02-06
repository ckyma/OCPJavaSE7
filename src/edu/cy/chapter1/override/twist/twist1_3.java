package edu.cy.chapter1.override.twist;

/**
 * Created by metastock on 2/6/2017.
 */

class BookB{
    static void print(){}
}

class CourseBookB extends BookB{
    // void print(){} // Compile error, can't override static method, can only hide it use the same "static" access modifier
}

class BookC{
    void print(){}
}

class CourseBookC extends BookC{
    // static void print(){} // Compile error, can't override base method using the "static" access modifier
}

public class twist1_3 {
    public static void main(String[] args) {

    }
}
