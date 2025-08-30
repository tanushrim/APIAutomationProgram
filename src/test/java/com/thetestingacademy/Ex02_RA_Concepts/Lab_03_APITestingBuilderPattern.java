package com.thetestingacademy.Ex02_RA_Concepts;

public class Lab_03_APITestingBuilderPattern {
    public Lab_03_APITestingBuilderPattern step1 (){
        System.out.println("Step 1");
        return this;
    }
    public Lab_03_APITestingBuilderPattern step2() {
        System.out.println("Step 2");
        return this;
    }
    public Lab_03_APITestingBuilderPattern step3 () {
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        Lab_03_APITestingBuilderPattern bp= new Lab_03_APITestingBuilderPattern();
        bp.step1().step2().step3();

    }
}
