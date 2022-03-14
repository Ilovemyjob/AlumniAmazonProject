package amazon.com.api.stepdefinitions;

import amazon.com.ui.utilities.ConfigReader;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class CreateAttachment extends TestBaseApi{

    Response response;
    JsonPath jsonPath;

    @Given("Send POST request for create {string} attachment")
    public void sendPOSTRequestForCreateAttachment(String attachmentName) {

        setUp();
        spec.pathParams("first",1,"second","cards","third", ConfigReader.getProperty("idCard"),"fourth","attachments");
//POST /1/cards/{id}/attachments
        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("name",attachmentName);
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));
        requestBody.put("url", ConfigReader.getProperty("urlForAttachment"));

        System.out.println(requestBody);

        response =given().
                spec(spec).
                contentType("application/json").
                body(requestBody).
                when().
                post("/{first}/{second}/{third}/{fourth}");

        response.prettyPrint();
        jsonPath=response.jsonPath();

    }

    @Then("Assert for create attachment status code is {int}")
    public void assertForCreateAttachmentStatusCodeIs(int statusCode) {

        assertEquals(statusCode,response.getStatusCode());

    }

    @And("Assert attachment name is {string}")
    public void assertAttachmentNameIs(String attachmentName) {

        assertEquals(attachmentName,jsonPath.getString("name"));


    }
}