package com.thetestingacademy.Ex_04_RestAssured_HTTPMethods.POST;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_11_APITest_NonBDDStyle_TestCases {


        RequestSpecification r;
        Response response;
        ValidatableResponse vr;

    @Test
    public void create_token_non_BDD_Style_TC(){
        String payload= "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        System.out.println("------Part1-------");

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        System.out.println("---------Part2----------");

        response= r.when().log().all().post();

        System.out.println("-----Part3----------");

        vr= response.then().log().all();
        vr.statusCode(200);

    }

}
