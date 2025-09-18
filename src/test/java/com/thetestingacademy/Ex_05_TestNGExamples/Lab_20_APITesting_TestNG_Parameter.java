package com.thetestingacademy.Ex_05_TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab_20_APITesting_TestNG_Parameter {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hi I am demo");
        System.out.println("You are running this param");

        if (value.equalsIgnoreCase("Firefox")){
            System.out.println("Start the Firefox");
        }
        if (value.equalsIgnoreCase("Chrome")){
            System.out.println("Start the Chrome!");
        }
    }
}

