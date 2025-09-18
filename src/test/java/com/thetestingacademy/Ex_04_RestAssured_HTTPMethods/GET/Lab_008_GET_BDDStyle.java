package com.thetestingacademy.Ex_04_RestAssured_HTTPMethods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab_008_GET_BDDStyle {
    //BDD Style

    @Test
    public void test_GET_Positive(){
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

}
