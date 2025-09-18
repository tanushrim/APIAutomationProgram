package com.thetestingacademy.Ex_06_TestAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab_26_APITesting_TestNG_Assertion {
    @Test (enabled = true)
    public void test_hardAsserExample(){
        System.out.println("Start of the program");
        Assert.assertEquals("Tanushri", "Tanushri");
        System.out.println("End of program");
    }

    // Software Assertion

    @Test
    public void test_softAssertExample(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Tanushri", "Tanu");
        System.out.println("End of program");
        softAssert.assertAll();
    }
}
