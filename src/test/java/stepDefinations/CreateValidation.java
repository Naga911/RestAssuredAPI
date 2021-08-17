package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.CreateOrUpdateAPI.SerializeDeserialize;
import resources.APIResources;
import resources.Utils;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class CreateValidation extends Utils {
    String bodyString;
    Response response;
    RequestSpecification res;
    ResponseSpecification resspec;
    SerializeDeserialize serializeDeserialize= new SerializeDeserialize();

    @Given("Add application payload")
    public void add_application_payload() throws IOException {

        res=given().spec(requestSpecification())
                .body(serializeDeserialize.createApplication());
    }

    @When("User calls {string} with {string} http request")
    public void user_calls_with_post_http_request(String resource,String method) {

        APIResources resourceAPI=APIResources.valueOf(resource);
        System.out.println("printing resource name:"+resourceAPI.getResource());

        resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

        if(method.equalsIgnoreCase("POST"))
            response =res.when().post(resourceAPI.getResource());
        else if(method.equalsIgnoreCase("GET"))
            response =res.when().get(resourceAPI.getResource());

    }

    @Then("the API Call is success with status code {int}")
    public void the_api_call_is_success_with_status_code(Integer int1) {
        int statusCode = response.getStatusCode();
        System.out.println("StatusCode :"+statusCode);
        assertEquals(statusCode,200);

    }
/*
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String keyValue, String Expectedvalue) {
       *//* String resp= response.asString();
        JsonPath js= new JsonPath(resp);
        System.out.println(js.get(keyValue).toString());*//*
     //   assertEquals(js.get(keyValue).toString(),Expectedvalue);

        assertEquals(getJsonPath(response,keyValue),Expectedvalue);

    }*/

}
