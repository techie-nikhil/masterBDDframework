package com.stepDef;

import java.util.List;
import java.util.Map;

import com.generics.BaseTest;
import com.generics.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Page;

public class Definition {
	private Pojo objPojo;
	private Page objSearchUserPage;
	private String testData;

	public Definition(BaseTest pojo) {
		objPojo = pojo.initializeWebEnvironment();
		objSearchUserPage = new Page(objPojo);
	}

	@Then("Enter {string} in search input field")
	public void enter_in_search_input_field(String string) {
		objSearchUserPage.setInputSearchFieldInGoogleHomePage(string);
	}

	@Then("Click on Google Search button")
	public void click_on_Google_Search_button() {
		objSearchUserPage.clickGoogleSearchButton();
	}

	@Then("Click on {string} Link")
	public void click_on_Link(String string) {
		objSearchUserPage.clickSpecificLinkGoogleHomePage(string);
	}

	@Then("Verify Facebook login Page Displayed")
	public void verify_Facebook_login_Page_Displayed() {
		objSearchUserPage.verifyFacebookPageDisplayedh();
	}

	@Then("Click {string} link on Google Search Page")
	public void click_link_on_Google_Search_Page(String string) {
		objSearchUserPage.clickSpecificSearchResultGoogleSearchPage(string);
	}

	@Then("Enter Following User name and Password in Login Page")
	public void enter_Following_User_name_and_Password_in_Login_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("USER ID");
			if (!testData.equals(""))
				objSearchUserPage.setUserNameGmailLoginPage(testData);
		}
	}

	@Then("Click Sign In button on Gmail Sign In Page")
	public void click_Sign_In_button_on_Gmail_Sign_In_Page() {
		objSearchUserPage.clickSignInbutton();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 19-July-2019
	 */
	@After
	public void tearDown(Scenario scenario) {
		((BaseTest) objPojo).tearDownWebEnvironment(scenario);
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 19-July-2019
	 */
	@When("Navigate To Specific Portal : {string}")
	public void navigate_To_Specific_Portal(String string) {
		objPojo.getObjWrapperFunctions().loadBaseURL(string);
	}
}