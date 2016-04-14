package com.example.helloworld;

/**
 * Created by emmabaddeley on 14/04/2016.
 */
class HelloWorld {

    private String message;

    public HelloWorld(String message){
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }
}
