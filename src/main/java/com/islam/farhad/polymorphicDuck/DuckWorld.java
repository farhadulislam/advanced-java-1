package com.islam.farhad.polymorphicDuck;

public class DuckWorld {

    public static void main (String [] args){

        Duck1 duck1 = new Duck1("Donald");

        duck1.quack();


        DuckCall1 duckCall1 = new DuckCall1("Duck1 call");
        duckCall1.quack();

        Quackable quackable1 = new Duck2("Donald 2");
        Quackable quackable2 = new DuckCall2 ("Duck call 2");

        quackable1.quack();
        quackable2.quack();

        // Now, client use of Quackables

        Quackable quacker = QuackFactory.createQuacker("Duck call");
        quacker.quack(); // We don't know if QuackFactory returns a Duck or a DuckCall, and for our purposes, we don't care.


        //using decorator pattern

        Quackable quacker2 = new QuackDecorator(new Duck2 ("Donald from decorator"));
        quacker2.quack();


        Quackable quacker3 = new QuackDecorator(new DuckCall2 ("DuckCall2 from decorator"));
        quacker3.quack();

        System.out.println("Total # of Quacks: " + QuackDecorator.getQuackCount());




    }
}
