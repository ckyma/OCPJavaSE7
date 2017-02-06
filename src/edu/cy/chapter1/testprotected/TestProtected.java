package edu.cy.chapter1.testprotected;

import edu.cy.chapter1.testprotected.library.Book;

/**
 * Created by yc on 1/16/2017.
 */

public class TestProtected extends Book {
    public String getAuthor(){
        this.author = "ABC";
        return this.author;
    }

    public static void main(String[] args) {
        Book book = new Book();
        // book.author = "ABC"; // Compilation error, no access to the protected member via the object reference variable.

        TestProtected test = new TestProtected(); // Can access protected members using instance variable.
        System.out.println(test.getAuthor());
    }
}
