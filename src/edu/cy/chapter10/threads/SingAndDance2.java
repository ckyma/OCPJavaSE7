package edu.cy.chapter10.threads;

/**
 * Created by metastock on 1/3/2017.
 */
class Sing2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Singing......");
    }
}

public class SingAndDance2 {
    public static void main(String[] args) {
        Thread sing = new Thread(new Sing2());
        sing.start();
        System.out.println("Dancing");
    }
}
