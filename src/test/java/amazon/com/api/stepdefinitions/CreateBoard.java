package amazon.com.api.stepdefinitions;

import amazon.com.ui.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateBoard extends TestBaseApi{
 Response response;
    JsonPath jsonPath;



    @Given("Send POST request for create {string} board")
    public void send_post_request_for_create_board(String boardName) {

        //url tanımla
        //expected data-request data
        // request gönder
        //resposu al
        //assert et
        setUp();
        spec.pathParams("parametre1",1,"parametre2","boards");

        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("name",boardName);
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));

        System.out.println(requestBody);

        response =given().
                spec(spec).
                contentType("application/json").
                body(requestBody).
                when().
                post("/{parametre1}/{parametre2}");

        response.prettyPrint();
        jsonPath=response.jsonPath();


    }


    @Then("Assert board name is {string}")
    public void assert_board_name_is(String boardName) {

        Assert.assertEquals(boardName,jsonPath.getString("name"));

    }


    @Then("Assert post status code {int}")
    public void assertPostStatusCode(int statusCode) {

         Assert.assertEquals(statusCode,response.getStatusCode());
    }
}
