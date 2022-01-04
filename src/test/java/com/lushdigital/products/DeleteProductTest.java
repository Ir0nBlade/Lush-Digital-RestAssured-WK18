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
public class DeleteProductTest extends TestBase {

    @Test
    public void deleteSingleProduct(){
        Response response = given()
                .pathParam("id",2)
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
