package com.islam.farhad.polymorphicDuck;

public class DuckCall2 implements Quackable {

    private String myName;

     public DuckCall1(String theName){

        myName = theName;
    }

    public void quack(){

        System.out.println(myName + " : Fake Quack!");
    }
}
