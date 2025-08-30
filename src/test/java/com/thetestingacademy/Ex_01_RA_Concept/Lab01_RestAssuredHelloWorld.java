package com.thetestingacademy.Ex_01_RA_Concept;

import io.restassured.RestAssured;

public class Lab01_RestAssuredHelloWorld {
    public static void main(String[] args) {

        RestAssured.given()
                .baseUri("https://api.postalpincode.in/")
                .basePath("/pincode/560036")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
