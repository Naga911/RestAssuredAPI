package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import pojo.GetApplicationByApplicationIdAPI.SerializeDeserialize;
import resources.APIResources;
import resources.Utils;

import java.io.IOException;

public class GetApplicationByApplicationIdAPI extends Utils {
    String bodyString;
    Response response;
    RequestSpecification res;
    ResponseSpecification resspec;
    SerializeDeserialize serializeDeserialize = new SerializeDeserialize();

    @Given("Add {string} as Input")
    public void addInput(String applicationId) throws IOException {
        res = given().queryParam("applicationId", applicationId).spec(requestSpecification());
    }

    @When("user calls {string} with {string} http request")
    public void userCallsWithHttpRequest(String resource, String method) {
        System.out.println("Resources:" + resource);
        APIResources resourceAPI = APIResources.valueOf(resource); // RegistrationAPI
        System.out.println(resourceAPI.getResource());

        resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

        if (method.equalsIgnoreCase("POST"))
            response = res.when().post(resourceAPI.getResource());
            //  System.out.println(response.toString());
        else if (method.equalsIgnoreCase("GET"))
            response = res.when().get(resourceAPI.getResource());
        System.out.println("Response from API:" + response.asString());
    }

    @Then("the API Call got success with status {string}")
    public void apiCallIsWithStatus(String statuscode) { //success 200
        int code = Integer.parseInt(statuscode);
        assertEquals(response.getStatusCode(), code);
    }
}


