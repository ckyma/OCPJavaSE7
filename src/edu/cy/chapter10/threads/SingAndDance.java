package edu.cy.chapter10.threads;

/**
 * Created by metastock on 1/3/2017.
 */
class Sing extends Thread{
    @Override
    public void run(){
        System.out.println("Singing......");
    }
}
public class SingAndDance {
    public static void main(String[] args) {
        Thread sing = new Sing();
        sing.start();
        System.out.println("Dancing");
    }
}
