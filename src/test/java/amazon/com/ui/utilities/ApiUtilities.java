package amazon.com.ui.utilities;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import static io.restassured.RestAssured.given;
public class ApiUtilities {
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    Properties properties;
    Response response;
    String token;
    public String userCreatesTokenViaApiEndpoint() throws IOException {
        String postBody = "{\n" +
                "    \"username\" : \"Team73AdminV\",\n" +
                "    \"password\" : \"Aa1.123\",\n" +
                "    \"rememberMe\" : false\n" +
                "}";
        response = given().contentType("application/json").when().body(postBody).post("https://gmibank.com/api/authenticate");
        JsonPath js = response.jsonPath();
        token = js.get("id_token");
        System.out.println(token);
        fileInputStream = new FileInputStream("configuration.properties");
        properties = new Properties();
        properties.load(fileInputStream);
        properties.setProperty("token", token);
        fileOutputStream = new FileOutputStream("configuration.properties");
        properties.store(fileOutputStream, null);
        return token;
    }
//    get() methodu ile endpointleri degistirerek okutma yapabiliriz
//
//    public void readAllCountriesFromEndPoint(String newCountrEndpoint) {
//
//        Response response1 = given().headers("Authorization",
//                "Bearer " + ConfigReader.getProperty("token"),
//                "Content-Type", ContentType.JSON,
//                "Accept", ContentType.JSON)
//                .when()
//                .get(newCountrEndpoint)
//                .then()
//                .contentType(ContentType.JSON)
//                .extract().response();
//        response1.prettyPrint();


    //===== Bu metod ile otomatik olarak TOKEN alinabilir.======//
    public  void takeToken(String username, String password, String tokenEndPoint) {
        String credentials = "{\"username\" : \""+ username + "\",\n" +
                "\"password\" : \""+ password + "\",\n" +
                "\"rememberMe\" : false}";
        token = given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON)
                .when()
                .body(credentials)
                .post(tokenEndPoint)
                .then()
                .extract()
                .path("id_token");
        System.out.println("token: " +token);
    }
    //====READ metodu=====//
    public  Response getWithApiEndPoint(String api_endpoint) {
        response = given().headers("Authorization",
                        "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON, "Accept", ContentType.JSON)
                .when()
                .get(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        return response;
    }
    // ============================CREATE METODU =================================
    public  Response createWithApiEndPoint(String createdBody, String api_url) {
        response = given().headers("Authorization",
                        "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .body(createdBody) // this comes from JsonModels class for Country and States
                .post(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        return response;
    }
    // ============================  UPDATE metodu =================================
    public  Response updateWithApiEndPoint(String api_url, Map<String, Object> updateBody) {
        //bu ornege uygun bir Map olusturulabilir.
//        Map<String, Object> updateBody = new HashMap<>();
//        updateBody.put("id", id);
//        updateBody.put("name",name);
//        updateBody.put("states", null);
        response = given().headers("Authorization",
                        "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .body(updateBody) //buraya update edilecek kisma gore MAP formatindda data girilebilir.Ust kisimda ornegi var.
                .put(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        return response;
    }
    // ============================  DELETE METODU=================================
    //EndPointin sonuna veya id onune "/"  isareti koymaya gerek yok bu metodda
    // ==>api_url + "/"+ id boyle yeterli
    public  Response deleteWithApiEndPoint(String api_url, String id) {
        response = given().headers("Authorization",
                        "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .delete(api_url + "/"+ id) //api_url + "/"+ id ==> araya / konuldu.
                .then()
                .extract()
                .response();
        return response;
    }
}
