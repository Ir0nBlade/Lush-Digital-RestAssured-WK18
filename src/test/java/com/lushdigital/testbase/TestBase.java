package com.lushdigital.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * @author Vimal Vithalpura
 * @project Lush-Digital-RestAssured-WK18
 * @created 04/01/2022
 */
public class TestBase {
    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/products";
    }

}
