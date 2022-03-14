package amazon.com.api.stepdefinitions;
import amazon.com.ui.utilities.ConfigReader;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import static org.junit.Assert.assertEquals;
import static io.restassured.RestAssured.given;
public class CreateCard extends TestBaseApi{
Response response;
JsonPath jsonPath;

    @Given("Send POST request for create {string} card")
    public void send_post_request_for_create_card(String cardName) {
//POST /1/cards
        setUp();
        spec.pathParams("first",1,"second","cards");

        HashMap<String,String>requestBody=new HashMap<>();
        requestBody.put("name",cardName);
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));
        requestBody.put("idList",ConfigReader.getProperty("idList"));



        response =given().
                spec(spec).
                contentType("application/json").
                body(requestBody).
                when().
                post("/{first}/{second}");
        response.prettyPrint();
        jsonPath=response.jsonPath();






    }
    @Then("Assert for create card status code is {int}")
    public void assert_for_create_card_status_code_is(int statusCode ) {
        assertEquals(statusCode,response.getStatusCode());

    }
    @Then("Assert card name is {string}")
    public void assert_card_name_is(String cardName) {
        assertEquals(cardName,jsonPath.getString("name"));

    }

}
