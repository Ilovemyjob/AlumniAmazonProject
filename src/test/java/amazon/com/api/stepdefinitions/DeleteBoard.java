package amazon.com.api.stepdefinitions;

import amazon.com.ui.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class DeleteBoard extends TestBaseApi{
Response response;

    @Given("Delete board with id of {string}")
    public void deleteBoardWithIdOf(String idBoard) {
        setUp();
        spec.pathParams("first" , 1 , "second" , "boards" , "third" , idBoard);

        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));

        response =given().
                spec(spec).
                contentType("application/json").
                body(requestBody).
                when().
                delete("/{first}/{second}/{third}");

        assertEquals(200,response.getStatusCode());
    }


}
