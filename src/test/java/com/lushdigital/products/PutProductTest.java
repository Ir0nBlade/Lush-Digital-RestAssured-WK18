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
public class PutProductTest extends TestBase {

    @Test
    public void updateSingleProductWithPut(){
        LushDigitalPojo lushDigitalPojo = new LushDigitalPojo();
        lushDigitalPojo.setName("Onken Biopot Fat Free Mango & Yogurt");
        lushDigitalPojo.setAvailable(50);

        Response response = given()
                .pathParam("id",1)
                .body(lushDigitalPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }


}
