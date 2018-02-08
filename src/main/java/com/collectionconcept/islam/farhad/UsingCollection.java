package com.collectionconcept.islam.farhad;

import java.util.*;

public class UsingCollection {
    public static void main(String [] args) {


        Product door = new Product("wooden floor", 35);
        Product floorPanel = new Product("Floor panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products1 = new ArrayList<>();

        products1.add(door);
        products1.add(floorPanel);
        products1.add(window);

        final Iterator<Product> productIterator = products1.iterator();

        while (productIterator.hasNext()){
            Product product = productIterator.next();

            if (product.getWeight() > 20){
            System.out.println(product);
        }else{

            productIterator.remove();

            }
        }

        // Could've used an enhanced for loop instead which used Iterator obj under the hood anyway!

        for (Product product : products1){
            System.out.println(product);
        }

        System.out.println(products1.size());
        System.out.println(products1.isEmpty());
        System.out.println(products1.contains(window));




    }


}
