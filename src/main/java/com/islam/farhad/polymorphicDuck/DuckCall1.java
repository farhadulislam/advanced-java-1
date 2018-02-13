package com.islam.farhad.polymorphicDuck;

public class DuckCall {

    private String myName;

    protected DuckCall(String theName){

        myName = theName;
    }

    protected void quack(){

        System.out.println(myName + " : Fake Quack!");
    }

}
