package com.thetestingacademy.Ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class Lab_17_APITesting_TestNG_Priority {
    @Test(priority = 1)
    public void t1(){
        System.out.println("1");
    }
    @Test(priority=3)
    public void t2(){
        System.out.println("3");
    }
    @Test(priority=2)
    public void t3(){
        System.out.println("2");
    }
    @Test(priority=4)
    public void t4(){
        System.out.println("4");
    }
}
