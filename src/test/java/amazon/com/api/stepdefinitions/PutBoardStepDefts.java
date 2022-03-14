package amazon.com.api.stepdefinitions;

import amazon.com.api.trellopojos.RequestPojo;
import amazon.com.ui.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class PutBoardStepDefts extends TestBaseApi {

    Response response;

JsonPath jsonPath;


    @Given("Send PUT request for {string}  board")
    public void sendPUTRequestForBoard(String name) {

        setUp();

        spec.pathParams("parametre1",1,"parametre2","boards","parametre3",ConfigReader.getProperty("id"));

        RequestPojo putPojo =
                new RequestPojo(name,ConfigReader.getProperty("key"), ConfigReader.getProperty("token"));
        response = given().
                contentType("application/json").
                spec(spec).
                body(putPojo).
                when().
                put("{parametre1}/{parametre2}/{parametre3}");

        response.prettyPrint();
        jsonPath=response.jsonPath();



//PUT /1/boards/{id}
    }


    @Then("Assert put status code {int}")
    public void assertPutStatusCode(int statusCode) {
        assertEquals(statusCode,response.getStatusCode());

    }

    @Then("Assert new board name {string}")
    public void assertNewBoardName(String boardName) {
        assertEquals(boardName,jsonPath.getString("name"));

    }




    }


