package com.thetestingacademy.Ex_03_TestNG_AllureReport;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab_06_APITesting_TestCases {
    @Test
    public void test_GET_Positive_TC1(){
        String pincode= "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }

    @Test
    public void test_GET_negative_TC2(){
        String pincode="@";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    public void test_GET_Negative_TC2() {

        String pincode = " ";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
