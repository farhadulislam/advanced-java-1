package com.islam.farhad.polymorphicDuck;

public class QuackFactory {

    public static Quackable createQuacker ( String name ){

        return new DuckCall2(name);
    }
}
