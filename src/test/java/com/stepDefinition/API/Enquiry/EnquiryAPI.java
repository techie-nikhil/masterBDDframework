package com.stepDefinition.API.Enquiry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EnquiryAPI {

	private WebDriver driver;
	private String BaseURI;
	private String URI;
	private String Token;
	private JsonObject parentnode;
	private JsonArray jarr;
	private JsonArray telephonearr;
	private JsonArray jarr1;
	private JsonPath jsonPathEvaluator;
	private JsonObject arrobj;
	private JsonObject AddressJSON;
	private JsonObject parameters;
	private JsonObject jsonobj;
	private Response response;

	@Given("^I am requesting \"([^\"]*)\"\\.$")
	public void i_am_requesting(String arg1) throws Throwable {

		File file = new File(
				"Z:\\AQM - Combat Automation\\Abhishek\\24-Jun-19\\combatqaautomation\\src\\test\\resources\\config.properties");
		FileInputStream fileInaddProperty = null;
		try {
			fileInaddProperty = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		// load properties file
		try {
			prop.load(fileInaddProperty);
		} catch (IOException e) {
			e.printStackTrace();
		}
		BaseURI = prop.getProperty(arg1);
		System.out.println(BaseURI);
	}

	@When("^I am on \"([^\"]*)\" resource\\.$")
	public void i_am_on_resource(String arg1) throws Throwable {
		URI = BaseURI + arg1;
		System.out.println(URI);

	}

	@When("^I go to \"([^\"]*)\" with access token as \"([^\"]*)\"\\.$")
	public void i_go_to_with_access_token_as(String arg1, String arg2) throws Throwable {
		URI = BaseURI + arg1;
		System.out.println(URI);
		Token = arg2;
		System.out.println(Token);

	}

	@Then("^I am sending the GET request and get \"([^\"]*)\" with following parameters\\.$")
	public void i_am_sending_the_GET_request_and_get_with_following_parameters(String arg1, DataTable arg2)
			throws Throwable {
		System.out.println(URI);
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, URI);
		int code = Integer.parseInt(arg1);
		Assert.assertEquals(code, response.getStatusCode());
//		Reporter.addStepLog(" Response Code is " +response.getStatusCode());
		JsonPath jsonPathEvaluator = response.jsonPath();
		System.out.println("This is " + jsonPathEvaluator.get("page"));
		List<List<String>> data = arg2.asLists();
		for (int i = 0; i < data.get(0).size(); i++) {
			System.out.println(data.get(0).get(i));
			System.out.println("This is " + jsonPathEvaluator.get(data.get(0).get(i)) + " And " + data.get(0).get(i));
			Assert.assertEquals("" + data.get(1).get(i), "" + jsonPathEvaluator.get(data.get(0).get(i)).toString());
//			Reporter.addStepLog("This is from Json " + jsonPathEvaluator.get(data.get(0).get(i)) + " for " + data.get(0).get(i));
			System.out.println(data.get(1).get(i));
		}
		long time = TimeUnit.MILLISECONDS.toSeconds(response.getTime());
		System.out.println("This is time Taken in seconds :" + time);
//		Reporter.addStepLog("This is time Taken in seconds :"+ time);
	}

	@Then("^I am sending the GET request and get \"([^\"]*)\" with following details in"
			+ " parentnode \"([^\"]*)\" on position \"([^\"]*)\" for token API and multi values$")
	public void i_am_sending_the_GET_request_and_get_with_following_details_in_parentnode_on_position_for_token_API_and_multi_values(
			String arg1, String arg2, String arg3, DataTable arg4) throws Throwable {
		System.out.println(URI);
		RequestSpecification httpRequest = RestAssured.given().header("Authorization", "Bearer " + Token);
		Response response = httpRequest.request(Method.GET, URI);
		System.out.println(response.getStatusCode());
		int code = Integer.parseInt(arg1);
		Assert.assertEquals(code, response.getStatusCode());
//		Reporter.addStepLog(" Response Code is " +response.getStatusCode());
		JsonPath jsonPathEvaluator = response.jsonPath();
		int position = Integer.parseInt(arg3);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		HashMap list1 = (HashMap) (((List<List<String>>) jsonPathEvaluator.get(arg2)).get(position));
		System.out.println(list1);
		List<List<String>> data = arg4.asLists();
		for (int i = 0; i < data.get(0).size(); i++) {
			// System.out.println(data.get(0).get(i));
			// String Value = jsonPathEvaluator.get(data.get(0).get(i)).toString();
			System.out.println("This is Header " + data.get(0).get(i).toString() + " and this is child "
					+ data.get(1).get(i).toString());
			Assert.assertEquals("" + data.get(1).get(i).toString(), "" + list1.get(data.get(0).get(i).toString()));
//			Reporter.addStepLog("This is from Json " + list1.get(data.get(0).get(i).toString())
//			+ " for " + data.get(0).get(i).toString());
			// Assert.assertEquals(""+data.get(1).get(i),""+
			// parentnode.get(data.get(0).get(i)));
			// System.out.println(data.get(1).get(i));
		}
		long time = TimeUnit.MILLISECONDS.toSeconds(response.getTime());
		System.out.println("This is time Taken in seconds :" + time);
//		Reporter.addStepLog("This is time Taken in seconds :"+ time);
	}

	@Then("^I am sending the GET request and get \"([^\"]*)\" with following details in parentnode \"([^\"]*)\"\\.$")
	public void i_am_sending_the_GET_request_and_get_with_following_details_in_parentnode(int arg1, String arg2,
			DataTable arg3) throws Throwable {
		RequestSpecification httpRequest = RestAssured.given().header("Authorization", "Bearer " + Token);
		System.out.println(URI);
		Response response = httpRequest.request(Method.GET, URI);
		Assert.assertEquals(arg1, response.getStatusCode());
//	Reporter.addStepLog(" Response Code is " +response.getStatusCode());
		JsonPath jsonPathEvaluator = response.jsonPath();
		@SuppressWarnings("rawtypes")
		Map parentnode = ((Map) jsonPathEvaluator.get(arg2));

		List<List<String>> data = arg3.asLists();

		for (int i = 0; i < data.get(0).size(); i++) {
			System.out.println(data.get(0).get(i));

			// String Value = jsonPathEvaluator.get(data.get(0).get(i)).toString();

			System.out.println("This is " + parentnode.get(data.get(0).get(i).toString()) + " for "
					+ data.get(0).get(i).toString());

			Assert.assertEquals("" + data.get(1).get(i), "" + parentnode.get(data.get(0).get(i)));
//		Reporter.addStepLog("This is from Json " + parentnode.get(data.get(0).get(i).toString())
//		+ " for " + data.get(0).get(i).toString());

			// System.out.println(data.get(1).get(i));

		}
		long time = TimeUnit.MILLISECONDS.toSeconds(response.getTime());
		System.out.println("This is time Taken in seconds :" + time);
//	Reporter.addStepLog("This is time Taken in seconds :"+ time);
	}

	@Then("^I am sending the GET request and get \"([^\"]*)\" with following details in parentnode \"([^\"]*)\" and child node \"([^\"]*)\"\\.$")
	public void i_am_sending_the_GET_request_and_get_with_following_details_in_parentnode_and_child_node(int arg1,
			String arg2, String arg3, DataTable arg4) throws Throwable {

		RequestSpecification httpRequest = RestAssured.given().header("Authorization", "Bearer " + Token);
		System.out.println(URI);
		Response response = httpRequest.request(Method.GET, URI);

		Assert.assertEquals(arg1, response.getStatusCode());
//		Reporter.addStepLog(" Response Code is " +response.getStatusCode());
		JsonPath jsonPathEvaluator = response.jsonPath();

		@SuppressWarnings("rawtypes")
		Map parentnode = ((Map) jsonPathEvaluator.get(arg2));

		@SuppressWarnings("rawtypes")
		Map childnode = ((Map) parentnode.get(arg3));

		System.out.println(parentnode.get("rateLimit"));
		System.out.println(response.getStatusCode());

		System.out.println(childnode.size());

		List<List<String>> data = arg4.asLists();
		System.out.println("This is data " + (data.get(0).toString().replace("[", "").replace("]", "")));

		System.out.println(
				"This is Json data " + childnode.get(data.get(0).toString().replace("[", "").replace("]", "")));

		for (int i = 0; i < data.get(0).size(); i++) {
			System.out.println(data.get(0).get(i));

			// String Value = jsonPathEvaluator.get(data.get(0).get(i)).toString();

			System.out.println("This is " + childnode.get(data.get(0).toString().replace("[", "").replace("]", ""))
					+ " for " + data.get(0).get(i).toString());

			Assert.assertEquals("" + data.get(1).get(i),
					"" + childnode.get(data.get(0).toString().replace("[", "").replace("]", "")));
//			Reporter.addStepLog("This is from Json " + childnode.get(data.get(0).get(i).toString())
//			+ " for " + data.get(0).get(i).toString());
			// System.out.println(data.get(1).get(i));

		}
		long time = TimeUnit.MILLISECONDS.toSeconds(response.getTime());
		System.out.println("This is time Taken in seconds :" + time);
//		Reporter.addStepLog("This is time Taken in seconds :"+ time);
	}

	@When("^I go to \"([^\"]*)\" and post the following parmeters$")
	public void i_go_to_and_post_the_following_parmeters(String arg1, DataTable arg2) throws Throwable {
		URI = BaseURI + arg1;
//		Reporter.addStepLog("This is URI :"+ URI);
		jsonobj = new JsonObject();
		List<List<String>> data = arg2.asLists();
		for (int i = 0; i < data.get(0).size(); ++i) {
			jsonobj.addProperty(data.get(0).get(i).toString(), data.get(1).get(i).toString());
		}
		System.out.println(jsonobj);
//		Reporter.addStepLog("This is Request Payload :"+ jsonobj);
	}

//	@Given("^I go to \"([^\"]*)\" and post the following parmeters in \"([^\"]*)\" object in the body$")
//	public void i_go_to_and_post_the_following_parmeters_in_object_in_the_body
//	(String arg1, String arg2, DataTable arg3) throws Throwable {
//		URI = BaseURI + arg1;
////		Reporter.addStepLog("This is URI :"+ URI);
//		System.out.println("This is URI :"+ URI);
//			
//		parameters = new JsonObject();
//				
//		List<List<String>> data = arg3.asLists();
//		for (int i = 0; i < data.get(0).size(); ++i) {
//			parameters.addProperty(data.get(0).get(i).toString(), data.get(1).get(i).toString());
//		}
//		
//		parentnode = new JsonObject();
//		parentnode.addProperty(arg2, parameters);
//		System.out.println(parentnode.toString());
////		Reporter.addStepLog("This is Json Object :"+ parentnode.toString());
//	}

	@When("I go to {string} with JSON of following parmeters in {string} object in the body")
	public void i_go_to_with_JSON_of_following_parmeters_in_object_in_the_body(String arg1, String arg2,
			io.cucumber.datatable.DataTable arg3) {
		URI = BaseURI + arg1;
//		Reporter.addStepLog("This is URI :"+ URI);
		System.out.println("This is URI :" + URI);

		parameters = new JsonObject();

		List<List<String>> data = arg3.asLists();
		for (int i = 0; i < data.get(0).size(); ++i) {
			parameters.addProperty(data.get(0).get(i).toString(), data.get(1).get(i).toString());
		}

		jsonobj = new JsonObject();
		jsonobj.add(arg2, parameters);
		System.out.println(jsonobj.toString());
//		Reporter.addStepLog("This is Json Object :"+ parentnode.toString());
	}

	@When("I am merging JSON array with key value pair with following details with Header as {string}")
	public void i_am_merging_JSON_array_with_key_value_pair_with_following_details_with_Header_as(String arg1,
			io.cucumber.datatable.DataTable arg2) {
		List<List<String>> data = arg2.asLists();

		JsonObject childobj = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			childobj.addProperty(data.get(0).get(i), data.get(1).get(i));
		}

		jarr = new JsonArray();
		arrobj = new JsonObject();

		jarr.add(childobj);
		arrobj.add(arg1, jarr);
//		jsonobj.merge(arrobj);
		System.out.println(jsonobj.toString());
//		Reporter.addStepLog("This is new Json Array :"+ arrobj.toString());
	}

	@When("I am merging JSON array with key value pair with following details with Header as {string} into the Json Object with header {string}")
	public void i_am_merging_JSON_array_with_key_value_pair_with_following_details_with_Header_as_into_the_Json_Object_with_header(
			String string, String string2, io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();

		JsonObject childobj = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			childobj.addProperty(data.get(0).get(i), data.get(1).get(i));
		}

		jarr = new JsonArray();
		arrobj = new JsonObject();

		jarr.add(childobj);
		arrobj.add(string, jarr);

		JsonObject headerobj = new JsonObject();
		headerobj.add(string2, arrobj);

//		jsonobj.merge(headerobj);
		System.out.println(jsonobj.toString());

	}

	@When("I am creating and saving another Json object as {string}")
	public void i_am_creating_and_saving_another_Json_object_as(String string,
			io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();

		AddressJSON = new JsonObject();

		for (int i = 0; i < data.get(0).size(); i++) {
			AddressJSON.addProperty(data.get(0).get(i), data.get(1).get(i));
		}
		System.out.println(AddressJSON.toString());
	}

	@When("I am creating and saving another Json array object as {string} with {int} keys for each object")
	public void i_am_creating_and_saving_another_Json_array_object_as_with_keys_for_each_object(String string,
			Integer int1, io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();

		JsonObject childobj = new JsonObject();
		JsonObject childobj1 = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			if (i >= int1) {
				childobj.addProperty(data.get(0).get(i), data.get(1).get(i));
			} else {
				childobj1.addProperty(data.get(0).get(i), data.get(1).get(i));
			}
		}
		telephonearr = new JsonArray();
		telephonearr.add(childobj);
		telephonearr.add(childobj1);
		System.out.println(jarr.toString());
	}

	@When("I am merging another JSON array with key value and objects following details with Header as {string} into the Json Object with header {string}")
	public void i_am_merging_another_JSON_array_with_key_value_and_objects_following_details_with_Header_as_into_the_Json_Object_with_header(
			String string, String string2, io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();

		JsonObject childobj = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			String testdata = data.get(1).get(i).trim().toLowerCase();
			if (testdata.contains("json")) {
				if (testdata.contains("address")) {
					childobj.add(data.get(0).get(i), AddressJSON);
				}
				if (testdata.contains("telephone")) {
					childobj.add(data.get(0).get(i), telephonearr);
					System.out.println("This is ");
				}
			} else {
				childobj.addProperty(data.get(0).get(i), data.get(1).get(i));
			}
		}
		jarr1 = new JsonArray();
		arrobj = new JsonObject();

		jarr1.add(childobj);
		arrobj.add(string, jarr1);

		JsonObject headerobj = new JsonObject();
		headerobj.add(string2, arrobj);

//		jsonobj.merge(headerobj);
		System.out.println(jsonobj.toString());

		System.out.println(jsonobj.toString());

	}

	@When("I merging the above jsonobject with header as {string}")
	public void i_merging_the_above_jsonobject_with_header_as(String string) {
		parameters = new JsonObject();
		parameters.add(string, jsonobj);
		System.out.println("THis is it" + parameters.toString());
	}

	@When("I am Merging another Json object in the above array with header as {string}")
	public void i_am_Merging_another_Json_object_in_the_above_array_with_header_as(String string,
			io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();

		JsonObject childobj = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			childobj.addProperty(data.get(0).get(i), data.get(1).get(i));
		}

//		jarr1 = new JsonArray();
		arrobj = new JsonObject();

		arrobj.add(string, childobj);
		jarr1.add(arrobj);

		System.out.println(jarr1.toString());

//		jsonobj.merge(arrobj);
		System.out.println(jsonobj.toString());
	}

	@When("^I am adding Json array with above object with Header as \"([^\"]*)\"$")
	public void i_am_adding_Json_array_with_above_object_with_Header_as(String arg1) throws Throwable {
		jarr = new JsonArray();
		arrobj = new JsonObject();
		arrobj.add(arg1, jarr);
//		parentnode.merge(arrobj);
		System.out.println("This is merged" + parentnode.toString());
//		Reporter.addStepLog("This is nested Json object :"+ parentnode.toString());
	}

	@When("^I am adding Json object in the new Jsonarray$")
	public void i_am_adding_Json_object_in_the_new_Jsonarray(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.asLists();
		JsonObject childobj = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			childobj.addProperty(data.get(0).get(i), data.get(1).get(i));
		}
		jarr = new JsonArray();
		jarr.add(childobj);

		System.out.println(jarr.toString());

//		Reporter.addStepLog("This is nested Json array :"+ jarr.toString());
	}

	@When("^I am adding Json object in the above array with Header as \"([^\"]*)\" nesting the same with above object\\.$")
	public void i_am_adding_Json_object_in_the_above_array_with_Header_as_nesting_the_same_with_above_object(
			String arg1, DataTable arg2) throws Throwable {
		List<List<String>> data = arg2.asLists();
		JsonObject childobj = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			childobj.addProperty(data.get(0).get(i), data.get(1).get(i));
		}
		jarr.add(childobj);
		parameters.add(arg1, jarr);
		System.out.println(jarr.toString());
		System.out.println(parentnode.toString());
//		Reporter.addStepLog("This is Json array :"+ jarr.toString());
//		Reporter.addStepLog("This is Json object :"+ parentnode.toString());
	}

	@When("^I am adding nested JSON object with key value pair with following details with Header as \"([^\"]*)\"$")
	public void i_am_adding_nested_JSON_object_with_key_value_pair_with_following_details_with_Header_as(String arg1,
			DataTable arg2) throws Throwable {
		List<List<String>> data = arg2.asLists();
		JsonObject childobj = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			childobj.addProperty(data.get(0).get(i), data.get(1).get(i));
		}
		parameters.add(arg1, childobj);
		System.out.println("This is try " + parentnode.toString());
//		Reporter.addStepLog("This is Json object :"+ parentnode.toString());
	}

	@When("^I am nesting above JSON object with another object with Header as \"([^\"]*)\" and below parameters\\.$")
	public void i_am_nesting_above_JSON_object_with_another_object_with_Header_as_and_below_parameters(String arg1,
			DataTable arg2) throws Throwable {

		List<List<String>> data = arg2.asLists();
		jsonobj = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			parentnode.addProperty(data.get(0).get(i), data.get(1).get(i));
		}

		jsonobj.add(arg1, parentnode);
		System.out.println("This is object " + jsonobj.toString());
//		Reporter.addStepLog("This is Json object :"+ parentnode.toString());
	}

	@When("^I am merging  another JSON object with above object with Header as \"([^\"]*)\"\\.$")
	public void i_am_merging_another_JSON_object_with_above_object_with_Header_as(String arg1, DataTable arg2)
			throws Throwable {
		List<List<String>> data = arg2.asLists();
		JsonObject childobj = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			childobj.addProperty(data.get(0).get(i), data.get(1).get(i));
		}
		JsonObject mainobj = new JsonObject();
		mainobj.add(arg1, childobj);
//		jsonobj.merge(mainobj);

		System.out.println(jsonobj.toString());
//		Reporter.addStepLog("This is Json object :"+ jsonobj.toString());
	}

	@When("^I am merging JSON object without header in the above object\\.$")
	public void i_am_merging_JSON_object_without_header_in_the_above_object(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.asLists();
		JsonObject childobj = new JsonObject();
		for (int i = 0; i < data.get(0).size(); i++) {
			childobj.addProperty(data.get(0).get(i), data.get(1).get(i));
		}
//		jsonobj.merge(childobj);
		System.out.println(jsonobj.toString());
//		Reporter.addStepLog("This is Json object :"+ jsonobj.toString());
	}

	@Then("^I am sending the \"([^\"]*)\" request\\.$")
	public void i_am_sending_the_request(String arg1) {
		try {
			System.out.println(URI);
			RequestSpecification httpRequest = RestAssured.given();
			httpRequest.body(parameters.toString());
			httpRequest.header("Accept", ContentType.JSON);
			httpRequest.header("Content-Type", ContentType.JSON);

			String P = "Post";
			String P1 = "addProperty";
			String D = "Delete";
			String G = "Get";

			if (P.equalsIgnoreCase(arg1)) {
				response = httpRequest.post(URI);
//			} else if (P1.equalsIgnoreCase(arg1)) {
//				response = httpRequest.addProperty(URI);
			} else if (D.equalsIgnoreCase(arg1)) {
				response = httpRequest.delete(URI);
			} else if (G.equalsIgnoreCase(arg1)) {
				response = httpRequest.get(URI);
			}

//		Reporter.addStepLog("The Response Code is :"+ response.getStatusCode());
//		Reporter.addStepLog("The Response Time in Miliseconds :"+ response.getTime());
//		Reporter.addStepLog("Json is  : "+ response.asString());

			System.out.println(response.getStatusCode());
			System.out.println(response.asString());
			jsonPathEvaluator = response.jsonPath();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * @Then("^I am sending the POST request and get \"([^\"]*)\" with below Bearer Token\\.$"
	 * ) public void i_am_sending_the_POST_request_and_get_with_below_Bearer_Token
	 * (int arg1, DataTable arg2) throws Throwable { System.out.println(URI);
	 * RequestSpecification httpRequest = RestAssured.given();
	 * httpRequest.body(requestparams.toJSONString());
	 * httpRequest.contentType(ContentType.JSON); Response response =
	 * httpRequest.post(URI);
	 * 
	 * JsonPath jsonPathEvaluator = response.jsonPath();
	 * 
	 * System.out.println(response.getStatusCode());
	 * 
	 * Assert.assertEquals(arg1, response.getStatusCode());
	 * Reporter.addStepLog(" Response Code is " +response.getStatusCode());
	 * List<List<String>> data = arg2.raw();
	 * 
	 * for (int i = 0; i < data.get(0).size(); i++) {
	 * System.out.println(data.get(0).get(i));
	 * 
	 * // String Value = jsonPathEvaluator.get(data.get(0).get(i)).toString();
	 * 
	 * System.out.println("This is " + jsonPathEvaluator.get(data.get(0).get(i)) +
	 * " And " + data.get(0).get(i));
	 * 
	 * Assert.assertEquals("" + data.get(1).get(i), "" +
	 * jsonPathEvaluator.get(data.get(0).get(i)).toString());
	 * 
	 * Reporter.addStepLog("This is from Json " +
	 * jsonPathEvaluator.get(data.get(0).get(i).toString()) + " for " +
	 * data.get(0).get(i).toString());
	 * 
	 * System.out.println(data.get(1).get(i));
	 * 
	 * }long time = TimeUnit.MILLISECONDS.toSeconds(response.getTime());
	 * System.out.println("This is time Taken in seconds :"+ time);
	 * Reporter.addStepLog("This is time Taken in seconds :"+ time); }
	 * 
	 * @Then("^I am sending the POST request and get \"([^\"]*)\" as response\\.$")
	 * public void i_am_sending_the_POST_request_and_get_as_response(int arg1)
	 * throws Throwable { System.out.println(URI); RequestSpecification httpRequest
	 * = RestAssured.given(); httpRequest.body(jsonobj.toJSONString());
	 * httpRequest.contentType(ContentType.JSON); Response response =
	 * httpRequest.post(URI); Reporter.addStepLog("The Response Code is :"+
	 * response.getStatusCode());
	 * Reporter.addStepLog("The Response Time in Miliseconds :"+
	 * response.getTime()); System.out.println(response.getStatusCode());
	 * System.out.println(response.asString());
	 * Assert.assertEquals(response.getStatusCode(), arg1);
	 * Reporter.addStepLog("The Response is :"+ response.asString());
	 * jsonPathEvaluator = response.jsonPath();
	 * 
	 * }
	 * 
	 * @Then("^I am sending the addProperty request and get \"([^\"]*)\" as response\\.$"
	 * ) public void i_am_sending_the_addProperty_request_and_get_as_response (int
	 * arg1) throws Throwable { System.out.println(URI); RequestSpecification
	 * httpRequest = RestAssured.given(); httpRequest.body(jsonobj.toJSONString());
	 * httpRequest.contentType(ContentType.JSON); Response response =
	 * httpRequest.addProperty(URI); Reporter.addStepLog("The Response Code is :"+
	 * response.getStatusCode());
	 * Reporter.addStepLog("The Response Time in Miliseconds :"+
	 * response.getTime()); System.out.println(response.getStatusCode());
	 * System.out.println(response.asString());
	 * Assert.assertEquals(response.getStatusCode(), arg1);
	 * Reporter.addStepLog("The Response is :"+ response.asString());
	 * jsonPathEvaluator = response.jsonPath();
	 * 
	 * }
	 * 
	 * @Then("^I am sending the DELETE request and get \"([^\"]*)\" as response\\.$"
	 * ) public void i_am_sending_the_DELETE_request_and_get_as_response(int arg1)
	 * throws Throwable { System.out.println(URI); RequestSpecification httpRequest
	 * = RestAssured.given(); httpRequest.body(jsonobj.toJSONString());
	 * httpRequest.contentType(ContentType.JSON); Response response =
	 * httpRequest.delete(URI); Reporter.addStepLog("The Response Code is :"+
	 * response.getStatusCode());
	 * Reporter.addStepLog("The Response Time in Miliseconds :"+
	 * response.getTime()); System.out.println(response.getStatusCode());
	 * System.out.println(response.asString());
	 * Assert.assertEquals(response.getStatusCode(), arg1);
	 * Reporter.addStepLog("The Response is :"+ response.asString());
	 * jsonPathEvaluator = response.jsonPath(); }
	 * 
	 * @When("^I go to \"([^\"]*)\" and post GET Request$") public void
	 * i_go_to_and_post_GET_Request(String arg1) throws Throwable { URI = BaseURI +
	 * arg1; Reporter.addStepLog("This is URI :"+ URI); RequestSpecification
	 * httpRequest = RestAssured.given(); httpRequest.contentType(ContentType.JSON);
	 * Response response = httpRequest.get(URI);
	 * Reporter.addStepLog("The Response Code is :"+ response.getStatusCode());
	 * Reporter.addStepLog("The Response Time in Miliseconds :"+
	 * response.getTime()); System.out.println(response.getStatusCode());
	 * System.out.println(response.asString());
	 * Assert.assertEquals(response.getStatusCode(), 200);
	 * Reporter.addStepLog("The Response is :"+ response.asString());
	 * jsonPathEvaluator = response.jsonPath(); }
	 */
	@Then("^I am validating object \"([^\"]*)\" for int value \"([^\"]*)\"\\.$")
	public void i_am_validating_object_for_int_value(String arg1, int arg2) throws Throwable {

		int value = jsonPathEvaluator.get(arg1);
		System.out.println(value);
//		Reporter.addStepLog("Value frm JSON is :"+ value);
		Assert.assertEquals(arg2, value);

	}

	@Then("^I am validating object \"([^\"]*)\" for String value \"([^\"]*)\"\\.$")
	public void i_am_validating_object_for_String_value(String arg1, String arg2) throws Throwable {

		String value = jsonPathEvaluator.get(arg1);
		System.out.println(value);
//		Reporter.addStepLog("Value frm JSON is :"+ value);
		Assert.assertEquals(arg2, value);
	}

	@Then("^I am validating object \"([^\"]*)\" contains header as \"([^\"]*)\" and value as \"([^\"]*)\" \\.$")
	public void i_am_validating_object_contains_header_as_and_value_as(String arg1, String arg2, String arg3)
			throws Throwable {

		List<Map<String, String>> List = jsonPathEvaluator.getList(arg1);

		ArrayList<String> JSonvalue = new ArrayList<String>();

		for (int i = 0; i < List.size(); i++) {
			JSonvalue.add(List.get(i).get(arg2));
		}

		System.out.println("This is Jsonvalue" + JSonvalue.toString());
		System.out.println(JSonvalue.contains(arg3));
		Assert.assertTrue(JSonvalue.contains(arg3));
//		Reporter.addStepLog("Array list does contains the expected value");
//		Reporter.addStepLog("Value frm JSON is :"+ JSonvalue.toString());
	}

	@Then("^I search id \"([^\"]*)\" and type \"([^\"]*)\"\\.$")
	public void i_search_id_and_type(String arg1, String arg2) throws Throwable {

		driver.findElement(By.id(arg1)).sendKeys(arg2);
	}

	@Then("^I click on button with relative Xpath \"([^\"]*)\"\\.$")
	public void i_click_on_button_with_relative_Xpath(String arg1) throws Throwable {

		driver.findElement(By.xpath(arg1)).click();
	}

	@Then("^I verify the value of element with Xpath \"([^\"]*)\" as \"([^\"]*)\"\\.$")
	public void i_verify_the_value_of_element_with_Xpath_as(String arg1, String arg2) throws Throwable {

		String Value = driver.findElement(By.xpath(arg1)).getText();
		System.out.println("Value from Website " + Value);
		Assert.assertEquals(Value, arg2);
//	 Reporter.addStepLog("Value is matching with Web as " + Value);

	}

}
