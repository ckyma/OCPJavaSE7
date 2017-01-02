package edu.cy.chapter4.set;

import java.util.HashSet;

/**
 * Created by yuchen on 1/2/2017.
 */
public class TestHashSet {
}

class AddElementsToHashSet {
    public static void main(String[] args) {
        String str1 = new String("Harry");
        String str2 = new String("Shreya");
        String str3 = new String("Selvan");
        String str4 = new String("Shreya");

        HashSet<String> set = new HashSet<>();

        set.add(str1);
        set.add(str2);
        set.add(str3);
        System.out.println(set.add(str4)); // return false, duplicated not added

        for(String e : set){
            System.out.println(e);
        }
    }
}