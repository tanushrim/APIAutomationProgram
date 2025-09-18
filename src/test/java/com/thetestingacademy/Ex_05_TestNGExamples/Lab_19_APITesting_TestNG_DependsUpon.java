package com.thetestingacademy.Ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab_19_APITesting_TestNG_DependsUpon {

    @Test
    public void serverStartedok(){
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "serverStartedok")
    public void test1(){
        System.out.println("method 1");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "serverStartedok")
    public void test2(){
        System.out.println("method 2");
        Assert.assertTrue(true);
    }
}
