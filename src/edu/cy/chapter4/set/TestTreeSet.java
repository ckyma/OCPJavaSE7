package edu.cy.chapter4.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by yuchen on 1/2/2017.
 */
public class TestTreeSet {
    public static void main(String[] args) {
        String[] myNames = {"Shreya", "Harry", "Paul", "Shreya", "Selvan"};
        TreeSet<String> treeSetNames = new TreeSet<>(Arrays.asList(myNames));
        Iterator<String> it = treeSetNames.descendingIterator();
        while( it.hasNext() ){
            System.out.println(it.next());
        }
    }
}
