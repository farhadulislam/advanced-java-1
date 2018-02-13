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

    }
}
