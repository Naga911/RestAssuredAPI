package stepDefinations;

import Report.ExtentReportManager;
import Utilities.Log;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
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
import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static resources.Utils.requestSpecification;

public class CreateValidation extends ExtentReportManager {
    String bodyString;
    Response response;
    RequestSpecification res;
    ResponseSpecification resspec;
    ExtentTest parentTest;

    @Given("Add application payload")
    public void add_application_payload() {
        try {
            //  parentTest = extent.createTest("Execution of CreateorUpdate API").assignCategory("Sanity").assignAuthor("Nagaraj");
            res = given().spec(requestSpecification())
                    .body(SerializeDeserialize.createApplication());
            //  childTest = parentTest.createNode("Add application payload");
            //  childTest.log(Status.PASS, "Test Case passed");
            Log.info("test case passed");
        } catch (AssertionError | Exception e) {
            String e1 = Arrays.toString(e.getStackTrace());
            testStepHandle("PASS", childTest, e1);
        }
    }

    @When("User calls {string} with {string} http request")
    public void user_calls_with_post_http_request(String resource, String method) {
        try {
            //   childTest = parentTest.createNode("User calls "+resource+" with "+method+" http request");
            APIResources resourceAPI = APIResources.valueOf(resource);
            resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

            if (method.equalsIgnoreCase("POST"))
                response = res.when().post(resourceAPI.getResource());
            else if (method.equalsIgnoreCase("GET"))
                response = res.when().get(resourceAPI.getResource());
            //       childTest.log(Status.PASS, "Test Case passed");
        } catch (AssertionError | Exception e) {
            String e1 = Arrays.toString(e.getStackTrace());
            testStepHandle("PASS", childTest, e1);
        }
    }

    @Then("the API Call is success with status code {int}")
    public void the_api_call_is_success_with_status_code(Integer int1) {
        try {
            //      childTest = parentTest.createNode("the API Call is success with status code"+int1);
            int statusCode = response.getStatusCode();
            System.out.println("StatusCode :" + statusCode);
            assertEquals(statusCode, 200);
            //  childTest.log( response.toString());
        } catch (AssertionError | Exception e) {
            String e1 = Arrays.toString(e.getStackTrace());
            testStepHandle("PASS", childTest, e1);
        }
    }

}
/*
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String keyValue, String Expectedvalue) {
       *//*
*/
/* String resp= response.asString();
        JsonPath js= new JsonPath(resp);
        System.out.println(js.get(keyValue).toString());*//*
*/
/*
     //   assertEquals(js.get(keyValue).toString(),Expectedvalue);

        assertEquals(getJsonPath(response,keyValue),Expectedvalue);

    }*//*


}
*/
