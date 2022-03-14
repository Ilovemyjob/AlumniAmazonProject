package amazon.com.api.stepdefinitions;

import amazon.com.api.trellopojos.CreateListPojo;
import amazon.com.api.trellopojos.RequestForList;
import amazon.com.ui.utilities.ConfigReader;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.checkerframework.checker.units.qual.C;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class CreateListWithPojo extends TestBaseApi{
    Response response;
CreateListPojo resPojo;
    @Given("POST request for create list {string}with pojo")
    public void postRequestForCreateListWithPojo(String listName) {
        RequestForList req=new RequestForList(ConfigReader.getProperty("key"),
                ConfigReader.getProperty("token"),listName,ConfigReader.getProperty("idBoard"));
        setUp();
        spec.pathParams("param1",1,
                "param2","lists");

response=given().
        contentType("application/json").
        spec(spec).body(req).
        when().
        post("{param1}/{param2}");

    response.prettyPrint();
    }

    @Then("get list response with pojo")
    public void getListResponseWithPojo() {
        resPojo=response.as(CreateListPojo.class);
        System.out.println(resPojo);


    }

    @And("assert list response {string}")
    public void assertListResponse(String listName) {
        assertEquals(200,response.getStatusCode());
        assertEquals(listName,resPojo.getName());
    }

    @Given("PUT request for update list {string} with pojo")
    public void putRequestForUpdateListWithPojo(String listName) {
        setUp();
        spec.pathParams("param1",1,
                "param2","lists","param3",
                ConfigReader.getProperty("idList"));

        RequestForList pojoPut=
                new RequestForList(ConfigReader.getProperty("key"),
                        ConfigReader.getProperty("token"),listName,"son");
response=given().
        contentType("application/json").
        spec(spec).
        body(pojoPut).
        when().
        put("/{param1}/{param2}/{param3}");
response.prettyPrint();


    }


    @Then("Verify update response with pojo {string}")
    public void verifyUpdateResponseWithPojo(String listNmae) {
        assertEquals(200,response.getStatusCode());
        assertEquals(listNmae,resPojo.getName());
        assertEquals(ConfigReader.getProperty("idList"),resPojo.getId());
        assertEquals(ConfigReader.getProperty("idBoard"),resPojo.getIdBoard());

    }
}
