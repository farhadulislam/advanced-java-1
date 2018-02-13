package com.islam.farhad.polymorphicDuck;

public class Duck {

    private String myName;

    public Duck (String theName){

        myName = theName;
    }

    public void quack(){

        System.out.println(myName + " : Quack!");
    }
}
