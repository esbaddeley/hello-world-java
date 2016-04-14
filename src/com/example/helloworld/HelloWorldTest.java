package com.example.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emmabaddeley on 14/04/2016.
 */
public class HelloWorldTest {
    private String message = "Hello, World";
    HelloWorld helloWorld = new HelloWorld(message);


    @Test
    public void testPrintMessage(){
        assertEquals(helloWorld.printMessage(), message);
    }

}