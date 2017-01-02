package edu.cy.chapter4.twists;

/**
 * Created by yuchen on 1/2/2017.
 */
import java.util.*;

public class twist4_3 {

}

class RemoveArrayListElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer age1  = 20;
        Integer age2  = 20;
        list.add(age1);
        list.add(age2);
        System.out.print(list.size() + ":");
        age1 = 30;
        list.remove(age1); // Wrapper class acts like a primitive value, so it won't be removed like a object.
        System.out.print(list.size());
    }
}