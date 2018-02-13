package com.collectionconcept.islam.farhad;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<>();

        list1.add("Cockroach");
        list1.add("Bee");
        list1.add("Dragon fly");

        list2.addAll(list1);

        for(String s : list1){

            System.out.println(" ");
        }


    }

}