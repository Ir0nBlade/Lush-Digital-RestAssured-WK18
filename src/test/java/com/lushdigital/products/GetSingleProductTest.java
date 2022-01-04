package com.lushdigital.products;

import com.lushdigital.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * @author Vimal Vithalpura
 * @project Lush-Digital-RestAssured-WK18
 * @created 04/01/2022
 */
public class GetSingleProductTest extends TestBase {

    @Test
    public void getSingleProductById() {
        Response response = given()
                .pathParam("id", 1)
                .when()
                .get("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
