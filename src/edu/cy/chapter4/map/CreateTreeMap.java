package edu.cy.chapter4.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by yc on 1/3/2017.
 */

class Flavor implements Comparable<Flavor> {
    String name;
    Flavor(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Flavor f) {
        return this.name.compareTo(f.name);
    }
}

class MyComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor f1, Flavor f2) {
        return f2.name.compareTo(f1.name); // reverse alphabetical order of names
    }
}

public class CreateTreeMap {
    public static void main(String[] args) {
        Map<Flavor, String> flavorMap = new TreeMap<>(new MyComparator()); // use the comparator's compare() instead of the key's compareTo()
        flavorMap.put(new Flavor("Chocolate"), "Paul");
        flavorMap.put(new Flavor("Vanilla"), "Selvan");

        for (Flavor flavor : flavorMap.keySet()){
            System.out.println(flavor.name);
        }

        System.out.println(flavorMap.get(new Flavor("Vanilla"))); // use compare() instead of hasCode() and equals(), even the two are not defined
    }
}
