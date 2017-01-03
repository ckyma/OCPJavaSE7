package edu.cy.chapter4.comparator;

import java.util.*;

/**
 * Created by metastock on 1/3/2017.
 */

class Person {
    String name;
    int age;
    Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name;
    }
}

public class TestComparator {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>(
          new Comparator<Person>() {
              public int compare(Person p1, Person p2){
                return (p1.age - p2.age);
              }
          }
        );

        set.add(new Person("Shreya", 12));
        set.add(new Person("Harry", 40));
        set.add(new Person("Paul", 30));

        Iterator<Person> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(set.contains(new Person("Paul", 30)));
    }
}
