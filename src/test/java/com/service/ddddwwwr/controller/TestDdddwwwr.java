package com.service.ddddwwwr.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDdddwwwr {

        DdddwwwrDelegate ddddwwwrDelegate = new DdddwwwrDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = ddddwwwrDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}