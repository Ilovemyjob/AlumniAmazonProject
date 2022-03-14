package amazon.com.api.stepdefinitions;

import amazon.com.api.trellopojos.ResponsePojo;
import amazon.com.ui.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class ReadBoard extends TestBaseApi {


Response response;

    @Given("Send GET request for {string}  board")
    public void send_get_request_for_read_board(String boardName) {
        setUp();
        spec.pathParams("parametre1",1,"board","boards","id",ConfigReader.getProperty("idBoard")).
                queryParams("key", ConfigReader.getProperty("key"),"token",ConfigReader.getProperty("token"));
response=given().spec(spec)
       // headers("key", ConfigReader.getProperty("key"),"token",ConfigReader.getProperty("token"))
        .contentType("application/json").
        when().
        get("/{parametre1}/{board}/{id}");
response.prettyPrint();



    }
//{{baseurl}}/1/boards/{{id}}?key={{apikey}}&token={{token}}

//GET /1/boards/{id}/memberships

    @Then("Assert get status code {int}")
    public void assertGetStatusCode(int statusCode) {
        Assert.assertEquals(statusCode,response.statusCode());
    }

}
