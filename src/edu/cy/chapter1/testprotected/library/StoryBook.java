package edu.cy.chapter1.testprotected.library;

/**
 * Created by metastock on 2/6/2017.
 */
public class StoryBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "ABC"; // Within the same package, can access to the protected member via the object reference variable.

        System.out.println(book.author);
    }
}
