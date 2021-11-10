package stepDefinations;
//import org.testng.internal.Utils;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import resources.Utils;
import io.restassured.response.Response;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.io.IOException;
import java.util.Arrays;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.builder.ResponseSpecBuilder;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import resources.APIResources;

import io.restassured.http.ContentType;
import pojo.RegistrationAPI.SerializeDeserialize;
public class Registration extends Utils {
    String bodyString;
    Response response;
    RequestSpecification res;
    ResponseSpecification resspec;
    SerializeDeserialize serializeDeserialize= new SerializeDeserialize();
    @Given("Add Registration payload")
    public void add_Register_payload() throws IOException {
        res=given().spec(requestSpecification())
        .body(serializeDeserialize.register());
}
@When("User call {string} with {string} http request")
    public void user_call_with_post_http_request(String resource,String method) {
        System.out.println("Resources:" +resource);
        APIResources resourceAPI=APIResources.valueOf(resource); // RegistrationAPI
        System.out.println(resourceAPI.getResource());

        resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

        if(method.equalsIgnoreCase("POST"))
            response =res.when().post(resourceAPI.getResource());
            System.out.println(response.toString());
         if(method.equalsIgnoreCase("GET"))
            response =res.when().get(resourceAPI.getResource());

    }


    @Then("API Call is success with status code {int}")
    public void api_call_is_success_with_status_code(Integer int1) {
        try {
            //      childTest = parentTest.createNode("the API Call is success with status code"+int1);
            int statusCode = response.getStatusCode();
            System.out.println("StatusCode :" + statusCode);
           // assertEquals(200,statusCode);
            assertEquals(response.getStatusCode(),200);
            //  childTest.log( response.toString());
        }
        catch (AssertionError | Exception e) {
            String e1 = Arrays.toString(e.getStackTrace());
         //   testStepHandle("PASS", childTest, e1);
        }
    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String keyvalue,String Expectedvalue) {


  String resp=response.asString();
        JsonPath js= new JsonPath(resp);
        assertEquals(js.get(keyvalue).toString(),Expectedvalue);

        assertEquals(getJsonPath(response,keyvalue),Expectedvalue);
    }
}

