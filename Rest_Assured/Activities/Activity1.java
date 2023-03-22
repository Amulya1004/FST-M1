package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity1 {
    final static String BASE_URI = " https://petstore.swagger.io/v2/pet";

    @Test(priority = 1)
    public void addPet(){
            String request = "{"
                    + "\"id\": 77232,"
                    + "\"name\": \"Riley\","
                    + " \"status\": \"alive\""
                    + "}";
        Response response = given().contentType(ContentType.JSON).body(request).when().post(BASE_URI);

        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority = 2)
    public void petInfo(){
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .when().pathParam("petId", "77232") // Set path parameter
                        .get(BASE_URI + "/{petId}"); // Send GET request
        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority = 3)
    public void deletePet(){
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .when().pathParam("petId", "77232") // Set path parameter
                        .delete(BASE_URI + "/{petId}"); // Send DELETE request
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("77232"));
    }
}
