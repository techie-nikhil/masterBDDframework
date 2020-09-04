package com.stepDefinition.portal.Olm;

import java.util.List;
import java.util.Map;

import com.PageFactory.Olm.OlmLoginPage;
import com.generics.BaseTest;
import com.generics.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OlmLoginDefinition {

	private Pojo objPojo;
	private OlmLoginPage objOlmLoginPage;
	private String testData;

	public OlmLoginDefinition(BaseTest pojo) {
		objPojo = pojo.initializeWebEnvironment();
		objOlmLoginPage = new OlmLoginPage(objPojo);

	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Verify common error message on OLM login Page as {string}")
	public void verify_login_error_message(String string) {
		objOlmLoginPage.verifyOlmErrorLoginMessageOnOlmHomepage(string);
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 29-July-2019
	 */
	@When("^Verify title of OLM Login Page$")
	public void verify_title_of_OLM_Login_page() {
		objOlmLoginPage.verifyOlmLoginPageTitle();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 29-July-2019
	 */
	@Then("^Login to Olm Using Following Credentials :")
	public void user_enters_username_and_password(DataTable credentials) {
		List<Map<String, String>> data1 = credentials.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("USERNAME");
			if (!testData.equals(""))
				objOlmLoginPage.setUserNameInOlmLoginPage(testData);
			testData = data.get("PASSWORD");
			if (!testData.equals(""))
				objOlmLoginPage.setPasswordInOlmLoginPage(testData);
		}
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Click on Login button OLM Login Page")
	public void click_on_login_button() {
		objOlmLoginPage.clickLoginButtonOnOlmLoginPage();
	}

	/**
	 * @author : vikash thakur
	 * @Date of Creation : 30-July-2019
	 */
	@Then("Verify Service Unavailable Error Message for OLM Login Page: {string}")
	public void verify_service_unavailable_error_message(String string) {
		objOlmLoginPage.verifyserviceunavailableLoginErrorMessageOnOlmHomepage(string);
	}

	//
	// //////////////////////////////////////////////////////////////
	// /////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////
	// //////////////////////////////////////////////////////////////////////
	// //////////////////////////////////////////////////////////////
	//
	//
	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Click on Olm logout button")
	public void click_on_logout_button() {
		objOlmLoginPage.clickOlmLogoutButton();
	}

}
