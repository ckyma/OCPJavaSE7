package edu.cy.chapter2;

/**
 * Created by metastock on 2/17/2017.
 */

class TestStaticInitializer{
    static{
        //++rate;   // Can't use ++, compile error as forward reference
        // rate++;
        rate = 10;
    }
    static int rate = 0;
    static{
        ++rate;
    }
    public TestStaticInitializer(){
        System.out.println(rate);
    }
}

public class StaticMembers {
    TestStaticInitializer test = new TestStaticInitializer();

    // output: 1
}
