package com.stepDefinition.portal.Admin;

import java.util.List;
import java.util.Map;

import com.PageFactory.Admin.ChangePasswordAndValidationPage;
import com.generics.BaseTest;
import com.generics.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class ChangePasswordAndValidationDefinition {

	private Pojo objPojo;
	private String testData;
	private String testData2;
	private ChangePasswordAndValidationPage objChangePasswordAndValidationPage;

	public ChangePasswordAndValidationDefinition(BaseTest pojo) {
		objPojo = pojo.initializeWebEnvironment();
		objChangePasswordAndValidationPage = new ChangePasswordAndValidationPage(objPojo);
	}
	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 15-July-2019
	 */
	@Then("Click Logout Button In Admin Home Page")
	public void click_logout_button_in_homepage() {
		objChangePasswordAndValidationPage.clickLogoutButtonInHomepage();
	}
	////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////
	
	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 15-July-2019
	 */
	@Then("Click Change Password Link in Login Page")
	public void click_change_Password_link_on_login_page() {
		objChangePasswordAndValidationPage.clickChangePasswordLinkInLoginPage();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 15-July-2019
	 */

	@Then("Fill Follwing Details in Change Password Page")
	public void fill_Follwing_Details_In_Change_Password_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("CURRENT_PASSWORD");
			if (!testData.equals(""))
				objChangePasswordAndValidationPage.setCurrentPasswordInChangePasswordPage(testData);
			testData = data.get("NEW_PASSWORD");
			if (!testData.equals(""))
				objChangePasswordAndValidationPage.setNewPasswordInChangePasswordPage(testData);
			testData = data.get("CONFIRM_PASSWORD");
			if (!testData.equals(""))
				objChangePasswordAndValidationPage.setConfirmPasswordInChangePasswordPage(testData);

		}
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 15-July-2019
	 */
	@Then("Click Change Button on Change Password Page")
	public void click_change_button_on_change_password_page() {
		objChangePasswordAndValidationPage.clickChangeButtonInChangePasswordPage();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 25-July-2019
	 */
	@Then("Verify Error Message on Admin Password Change Page as : {string}")
	public void verifyErrorMessageonAdminPasswordChangePageas(String string) {
		testData = objChangePasswordAndValidationPage.getCommonErrorMessageOnChangePasswordPage();
		objPojo.getObjUtilities().logReporter("Verify Error Message on Change Password Page", string, testData,
				testData.trim().equals(string.trim()));
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 25-July-2019
	 */
	@Then("Verify Error Message For {string} as : {string}")
	public void verify_error_message_for_as(String string, String string2) {
		testData = objChangePasswordAndValidationPage.getErrorMessageForSpecificField(string);
		objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + string, string2, testData,
				testData.trim().equals(string2.trim()));
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 15-July-2019
	 */
	@Then("Click Reset Button on Change Password Page")
	public void click_reset_button_on_change_password_page() {
		objChangePasswordAndValidationPage.clickResetButtonInChangePasswordPage();
	}	

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 15-July-2019
	 */
	@Then("Click Logout Button on Change Password Page")
	public void click_logout_button_on_change_password_page() {
		objChangePasswordAndValidationPage.clickLogoutButtonInChangePasswordPage();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 15-July-2019
	 */
	@Then("Verify Error Message for following Fields in Change Password Page")
	public void verify_error_message_for_following_fields_in_change_password_page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("FIELDS");
			if (!testData.equals("")) {
				testData2 = objChangePasswordAndValidationPage.getErrorMessageForSpecificField(testData);
				objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + testData,
						data.get("ERRORMESSAGE"), testData2, testData2.equals(data.get("ERRORMESSAGE")));
			}
		}
	}

	@Then("Verify Password Not Match Error Message as : {string}")
	public void verify_password_not_match_in_change_password_page(String string) {
		testData = objChangePasswordAndValidationPage.getCommonErrorMessageOnChangePasswordPage();
		objPojo.getObjUtilities().logReporter("Verify common error message on top of page", string, testData,
				testData.trim().equals(string.trim()));
	}

	@Then("Verify Incorrect ID Password Error Message as : {string}")
	public void verify_incorrect_ID_Password_in_login_page(String string) {
		testData = objChangePasswordAndValidationPage.getCommonErrorMessageOnChangePasswordPage();
		objPojo.getObjUtilities().logReporter("Verify incorrect ID Password error message on top of page", string,
				testData, testData.trim().equals(string.trim()));
	}

}