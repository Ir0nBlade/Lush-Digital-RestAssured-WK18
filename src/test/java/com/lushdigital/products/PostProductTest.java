package com.lushdigital.products;

import com.lushdigital.model.LushDigitalPojo;
import com.lushdigital.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * @author Vimal Vithalpura
 * @project Lush-Digital-RestAssured-WK18
 * @created 04/01/2022
 */
public class PostProductTest extends TestBase {

    @Test
    public void createNewProductWithPost() {

        LushDigitalPojo lushDigitalPojo = new LushDigitalPojo();
        lushDigitalPojo.setName("Mango Lassi Yogurt Drink");
        lushDigitalPojo.setAvailable(100);
        Response response = given()
                .body(lushDigitalPojo)
                .when()
                .post();
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
