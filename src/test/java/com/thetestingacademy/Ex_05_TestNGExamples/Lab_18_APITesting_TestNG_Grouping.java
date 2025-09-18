package com.thetestingacademy.Ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab_18_APITesting_TestNG_Grouping {
    @Test(groups = {"sanity", "regression"})
    public void test_sanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups = {"Regression"})
    public void test_regressionRun(){
        System.out.println("Regression");
        Assert.assertTrue(false);
    }

    @Test(groups = {"smoke", "regression"})
    public void test_SmokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
