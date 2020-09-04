package com.stepDefinition.portal.Enquiry;

import java.util.List;
import java.util.Map;

import com.PageFactory.Enquiry.EnquiryChangePasswordPage;
import com.generics.BaseTest;
import com.generics.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnquiryChangePasswordStepDefinition {

	private Pojo objPojo;
	private String testData;
	private EnquiryChangePasswordPage objEnquiryChangePasswordPage;

	public EnquiryChangePasswordStepDefinition(BaseTest pojo) {
		objPojo = pojo.initializeWebEnvironment();
		objEnquiryChangePasswordPage = new EnquiryChangePasswordPage(objPojo);
	}
//
//	//////////////////////////////////////////////////////////////
//	/////////////////////////////////////////////////////////////////
//	////////////////////////////////////////////////////////////////
//	//////////////////////////////////////////////////////////////////////
//	//////////////////////////////////////////////////////////////
	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */

	@Then("Fill Following Details in Enquiry Change Password Page")
	public void fill_Follwing_Details_In_Enquiry_Change_Password_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("CURRENT_PASSWORD");
			if (!testData.equals(""))
				objEnquiryChangePasswordPage.setEnquiryCurrentPasswordInChangePasswordPage(testData);
			testData = data.get("NEW_PASSWORD");
			if (!testData.equals(""))
				objEnquiryChangePasswordPage.setEnquiryNewPasswordInChangePasswordPage(testData);
			testData = data.get("CONFIRM_PASSWORD");
			if (!testData.equals(""))
				objEnquiryChangePasswordPage.setEnquiryConfirmPasswordInChangePasswordPage(testData);

		}
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Click Change Button on Enquiry Change Password Page")
	public void click_change_button_on_enquiry_change_password_page() {
		objEnquiryChangePasswordPage.clickChangeButtonInEnquiryChangePasswordPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Click Reset Button on Enquiry Change Password Page")
	public void click_reset_button_on_enquiry_change_password_page() {
		objEnquiryChangePasswordPage.clickResetButtonInEnquiryChangePasswordPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Click Logout Button on Enquiry Change Password Page")
	public void click_logout_button_on_enquiry_change_password_page() {
		objEnquiryChangePasswordPage.clickLogoutButtonInEnquiryChangePasswordPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Verify error message for {string} as : {string} on enquiry change password page")
	public void verify_error_message_on_enquiry_change_password_page(String string, String string2) {
		testData = objEnquiryChangePasswordPage.getErrorMessageForSpecificFieldOnEnquiryChangePasswordPage(string);
		objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + string, string2, testData,
				testData.trim().equals(string2.trim()));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Verify Error Message For {string} as : {string} on enquiry change password page")
	public void verify_error_message_on_enquiry_change_password(String string, String string2) {
		testData = objEnquiryChangePasswordPage.getErrorMessageForSpecificFieldOnEnquiryChangePasswordPage(string);
		objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + string, string2, testData,
				testData.trim().equals(string2.trim()));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@When("Click Change Password Link in Enquiry Login Page")
	public void click_change_Password_link_on_enquiry_login_page() {
		objEnquiryChangePasswordPage.clickEnquiryChangePasswordLinkInLoginPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Verify disclaimer message on change password page")
	public void verify_disclaimer_message_on_change_password() {
		objEnquiryChangePasswordPage.verifyDisclaimerMessageOnEnquiryChangePasswordpage();
	}

}
