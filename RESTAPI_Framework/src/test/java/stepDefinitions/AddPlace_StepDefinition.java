package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import static org.junit.Assert.*;
import pojo.Add_Place_API_RQ;
import pojo.Location_Child_Add_Place_RQ;
import resources.TestData_Builder;
import utility.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class AddPlace_StepDefinition {
	
	RequestSpecification res;
	ResponseSpecification respec;
	Response response;
	String responseString;
	TestData_Builder data= new TestData_Builder();
	Utils util=new Utils();
	@Given("Add place Payload")
	public void add_place_Payload() {
		
		
		respec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		//RestAssured.baseURI="http://216.10.245.166/";
		
		res=given().spec(util.requestSpecification()).
				log().all()
		.body(data.addPlaceAPIBuilder());
	}
	@When("user calls {string} with Post http request")
	public void user_calls_with_Post_http_request(String string) {
		 response=res.when().post("/maps/api/place/add/json").
				then().spec(respec).extract().response();
	}
	@Then("the API call got sucess with status code {int}")
	public void the_API_call_got_sucess_with_status_code(Integer int1) {
	  assertEquals(response.getStatusCode(),200);
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyvalue, String Expectedvalue) {
		 responseString=response.asString();
		 JsonPath js=new JsonPath(responseString);
		 assertEquals(js.get(keyvalue).toString(),Expectedvalue);
	}


	
	


}
