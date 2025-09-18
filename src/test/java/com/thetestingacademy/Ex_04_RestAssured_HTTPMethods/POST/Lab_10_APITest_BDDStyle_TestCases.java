package com.thetestingacademy.Ex_04_RestAssured_HTTPMethods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab_10_APITest_BDDStyle_TestCases {

    @Test
    public void test_POST_Create_Auth_Token() {
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)
                .when().log().all().post()
                .then().log().all().statusCode(200);

    }
}
