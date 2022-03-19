package com.example.springtesting;

public class Greeting {
    private static final String HELLO = "Hello";
    private static final String World = "World";

    public String helloWorld(){
        return HELLO+ " "+ World;
    }
    public String helloWorld(String name){
        return HELLO+" "+name;
    }
}
