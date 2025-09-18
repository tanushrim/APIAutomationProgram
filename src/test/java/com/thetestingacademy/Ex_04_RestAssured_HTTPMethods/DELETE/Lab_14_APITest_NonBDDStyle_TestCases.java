package com.thetestingacademy.Ex_04_RestAssured_HTTPMethods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_14_APITest_NonBDDStyle_TestCases {
    @Test
    public void test_Delete_non_BDD(){
        String token= "2333ffd2ef4ab35";
        String bookingid= "4993";

        RequestSpecification requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/" + bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);

        requestSpecification.log().all();
        Response response = requestSpecification.when().delete();
        ValidatableResponse validatableResponse= response.then().log().all();
        validatableResponse.statusCode(200);
    }
}
