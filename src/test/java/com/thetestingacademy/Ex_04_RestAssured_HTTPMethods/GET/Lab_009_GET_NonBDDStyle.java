package com.thetestingacademy.Ex_04_RestAssured_HTTPMethods.GET;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_009_GET_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;

    @Test
    public  void test_GET_Non_BDD_Style() {
        pincode = "560048";
//Divide test cases in three parts
// given= part 1

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

//when= part 2
        response = r.when().log().all().get();

// then= part 3
        vr = response.then().log().all();
        vr.statusCode(200);
    }

    @Test
    public  void test_GET_Non_BDD_Style_Negative(){
            pincode= "560048";
//Divide test cases in three parts
// given= part 1

            r = RestAssured.given();
            r.baseUri("https://api.zippopotam.us");
            r.basePath("/IN/"+pincode);

//when= part 2
            response= r.when().log().all().get();

// then= part 3
            vr= response.then().log().all();
            vr.statusCode(400);

            //Can write further testcases or assertions also here
    }
}
