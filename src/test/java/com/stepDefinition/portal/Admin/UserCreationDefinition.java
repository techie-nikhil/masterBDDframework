package com.stepDefinition.portal.Admin;

import java.util.List;
import java.util.Map;

import com.PageFactory.Admin.CreateUserPage;
import com.PageFactory.Admin.SearchUserPage;
import com.generics.BaseTest;
import com.generics.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class UserCreationDefinition {
	private Pojo objPojo;
	private CreateUserPage objCreateUserPage;
	private SearchUserPage objSearchUserPage;
	private String testData;
	private String testData2;

	public UserCreationDefinition(BaseTest pojo) {
		objPojo = pojo.initializeWebEnvironment();
		objCreateUserPage = new CreateUserPage(objPojo);
		objSearchUserPage = new SearchUserPage(objPojo);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Click on User Search button on User Search Page")
	public void click_on_User_Search_button() {
		objSearchUserPage.clickSearchButtonOnUserSearchPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 16-July-2019
	 */
	@Then("Click on update icon on User Search Page")
	public void click_on_edit_icon_on_user_search_page() {
		objSearchUserPage.clickUpdateIconOnUserSearchPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 16-July-2019
	 */
	@Then("Edit Bureau Roles in Update User Page")
	public void edit_Bureau_Roles_in_Update_User_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("PRODUCTSUBSCRIPTION");
			String[] arr = null;
			if (!testData.equals("")) {
				arr = testData.split("/");
				for (int i = 0; i < arr.length; i++) {
					objCreateUserPage.selectProductSubscriptionInUserCreationPage(arr[i].trim());
				}
			}

		}
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Click save button on User Creation Page")
	public void click_save_button_on_User_Creation_Page() {
		objCreateUserPage.clickSaveButtonOnUserCreationPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 16-July-2019
	 */
	@Then("Click OK button on User Update confirm PopUp")
	public void click_OK_Button_on_UserUpdate_PopUp() {
		objCreateUserPage.clickOKButtonOnUserUpdatePageConfirmPopUp();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Click Generate Password button on User Creation Page")
	public void click_generate_password_Button_on_User_Creation_Page() {
		objCreateUserPage.clickGeneratePasswordButtonUserCreationPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 18-July-2019
	 */
	@Then("Fetch the value of password generated on User creation page")
	public void verify_password_generated() {
		objCreateUserPage.verifyGeneratedPassword();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify common error message on top of user Creation Page as {string}")
	public void verify_common_error_message_on_top_of_user_Creation_Page_as(String string) {
		testData = objCreateUserPage.getCommonErrorMessageOnUserCreationPage();
		objPojo.getObjUtilities().logReporter("Verify common error message on top of page", string, testData,
				testData.trim().equals(string.trim()));
	}

	/**
	 * @author : vikash thakur
	 * @Date of Creation : 30-July-2019
	 */
	@Then("Verify Bureau Roles in Update User Page")
	public void verify_Bureau_Roles_in_Update_User_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("PRODUCTSUBSCRIPTION");
			String[] arr = null;
			if (!testData.equals("")) {
				arr = testData.split("/");
				for (int i = 0; i < arr.length; i++) {
					objCreateUserPage.verifySelectedValueForProductSubscriptionInUserCreationPage(arr[i].trim());
				}
			}

		}
	}

	/**
	 * @author : vikash thakur
	 * @Date of Creation : 30-July-2019
	 */
	@Then("Deselect Bureau Roles in Update User Page")
	public void Deselect_Bureau_Roles_in_Update_User_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("PRODUCTSUBSCRIPTION");
			String[] arr = null;
			if (!testData.equals("")) {
				arr = testData.split("/");
				for (int i = 0; i < arr.length; i++) {
					objCreateUserPage.DeselectProductSubscriptionInUserCreationPage(arr[i].trim());
				}
			}
		}
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 * @Updated By : Shwetha on 15-07-2019
	 * @Updated By : Shwetha on 17-07-2019
	 * @Updated By : Shwetha on 25-07-2019
	 * @Updated By : Shwetha on 26-07-2019
	 */
	@Then("Fill Following Details in User Creation Page")
	public void fill_Follwing_Details_in_User_Creation_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("FIRSTNAME");
			if (!testData.equals(""))
				objCreateUserPage.setFirstNameInUserCreationPage(testData);
			testData = data.get("LASTNAME");
			if (!testData.equals(""))
				objCreateUserPage.setLastNameInUserCreationPage(testData);
			testData = data.get("ADDRESS1");
			if (!testData.equals(""))
				objCreateUserPage.setAddress1InUserCreationPage(testData);
			testData = data.get("ADDRESS2");
			if (!testData.equals(""))
				objCreateUserPage.setAddress2InUserCreationPage(testData);
			testData = data.get("TELEPHONE");
			if (!testData.equals(""))
				objCreateUserPage.setTelephoneInUserCreationPage(testData);
			testData = data.get("FAXNUMBER");
			if (!testData.equals(""))
				objCreateUserPage.setFaxNumberInUserCreationPage(testData);
			testData = data.get("MEMBERKOB");
			if (!testData.equals(""))
				objCreateUserPage.selectMemberKOBInUserCreationPage(testData);
			testData = data.get("MEMBERBASE");
			if (!testData.equals(""))
				objCreateUserPage.selectMemberBaseInUserCreationPage(testData);
			testData = data.get("MEMBERCODE");
			if (!testData.equals(""))
				objCreateUserPage.selectMemberCodeInUserCreationPage(testData);
			testData = data.get("PRODUCTSUBSCRIPTION");
			String[] arr = null;
			if (!testData.equals("")) {
				arr = testData.split("/");
				for (int i = 0; i < arr.length; i++) {
					objCreateUserPage.selectProductSubscriptionInUserCreationPage(arr[i].trim());
				}
			}
			testData = data.get("STATE");
			if (!testData.equals(""))
				objCreateUserPage.selectStateUTInUserCreationPage(testData);

			testData = data.get("CITY");
			if (!testData.equals(""))
				objCreateUserPage.selectCityInUserCreationPage(testData);
			testData = data.get("PINCODE");
			if (!testData.equals(""))
				objCreateUserPage.setPinCodeInUserCreationPage(testData);
			testData = data.get("EMAIL");
			if (!testData.equals(""))
				if (testData.trim().toLowerCase().contains("dynamic")) {
					testData = objPojo.getObjUtilities().getRandomString(8) + "@gmail.com";
					objPojo.getObjUtilities().setDataPool("RuntimeCreatedEmail", testData);
					objCreateUserPage.setEmailInUserCreationPage(testData);
				} else {
					objCreateUserPage.setEmailInUserCreationPage(testData);
				}
			testData = data.get("USERID");
			if (!testData.equals("")) {
				if (testData.trim().toLowerCase().contains("dynamic")) {
					testData = objPojo.getObjUtilities().getRandomNumbers(testData);
					objPojo.getObjUtilities().setDataPool("RuntimeCreatedUser", testData);
					objCreateUserPage.setUserCodeInUserCreationPage(testData);
				} else {
					objCreateUserPage.setUserCodeInUserCreationPage(testData);
				}
			}
		}
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Search for User Code : {string} in User Search Page")
	public void search_for_User_Code(String string) {
		testData = string + objPojo.getObjUtilities().dpString("RuntimeCreatedUser");
		objSearchUserPage.setUserCodeInSearchUserPage(testData);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify Table content with Created User Code {string}")
	public void verify_Table_content_with_Created_User_Code(String string) {
		objSearchUserPage.verifyRuntimeDataInUserIdResultTable(string);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify {string} for {string} on Create User Page")
	public void verify_error_message_for_Individual_fields(String string, String string2) {
		testData = objCreateUserPage.getErrorMessageForSpecificUserField(string2);
		objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + string2, string, testData,
				testData.trim().equals(string.trim()));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	@Then("Click reset button on User Update Page")
	public void click_reset_button_on_User_Update_Page() {
		objCreateUserPage.clickResetButtonOnUserUpdatePage();
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
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Click OK button on User Creation PopUp")
	public void click_OK_Button_on_User_Creation_PopUp() {
		objCreateUserPage.clickOKButtonOnUserCreationPageConfirmPopUp();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Click reset button on User Creation Page")
	public void click_reset_button_on_User_Creation_Page() {
		objCreateUserPage.clickResetButtonOnUserCreationPage();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 * @updated By : Shwetha Talapanty on 12-July-2019
	 */
	@Then("Click Create Another User on User Creation Page")
	public void click_create_another_user_on_success_popUp_user_creation_Page() {
		objCreateUserPage.clickCreateAnotherUserButton();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Verify Common Error on Top of User Creation Page {string}")
	public void Verify_Blank_Data_error_msg(String page) {
		testData = objCreateUserPage.getCommonErrorInUserCreationPage();
		objPojo.getObjUtilities().logReporter("Verify Common Error on Top of User Creation Page", page, testData,
				testData.equals(page));
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Verify Error Message for following Fields in User Creation Page")
	public void verify_Error_Message_for_following_Fields_in_User_Creation_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("FIELDS");
			if (!testData.equals("")) {
				testData2 = objCreateUserPage.getErrorMessageForSpecificField(testData);
				objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + testData,
						data.get("ERRORMESSAGE"), testData2, testData2.equals(data.get("ERRORMESSAGE")));
			}
		}
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Select Locked Checkbox on User Creation Page")
	public void select_Locked_Checkbox_on_User_Creation_Page() {
		objCreateUserPage.selectUserLockCheckBox();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Select Disabled Checkbox on User Creation Page")
	public void select_Disabled_Checkbox_on_User_Creation_Page() {
		objCreateUserPage.selectUserDisableCheckBox();
	}

	@Then("Capture User Code that is created successfully on {string} page")
	public void Capture_UserCode(String page) {
		testData = objCreateUserPage.getUserCreationSuccessPopUpMessage().split("-")[0];
		objPojo.getObjUtilities().logReporter("Verify User Created with Code : " + testData, !testData.equals(""));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Click OK button on User Creation Success PopUp")
	public void click_OK_Button_on_User_Creation_Success_PopUp() {
		objCreateUserPage.clickOKButtonOnUserCreationPageSuccessPopUp();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify error message for user field {string} as : {string}")
	public void verify_error_message_for_User_field_as(String string, String string2) {
		testData = objCreateUserPage.getErrorMessageForSpecificUserField(string);
		objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + string, string2, testData,
				testData.trim().equals(string2.trim()));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Check lock on User Creation Page")
	public void check_lock_on_User_Creation_Page() {
		objCreateUserPage.selectUserLockCheckBox();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Check disable on User Creation Page")
	public void check_disable_on_User_Creation_Page() {
		objCreateUserPage.selectUserDisableCheckBox();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Fill {string} and {string} on create user page")
	public void fill_firstName_LastName(String string1, String string2) {
		if (!string1.equals(""))
			objCreateUserPage.setFirstNameInUserCreationPage(string1);
		if (!string2.equals(""))
			objCreateUserPage.setLastNameInUserCreationPage(string2);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Fill {string} and {string} and {string} on create user page")
	public void fill_state_pincode_email_details(String string1, String string2, String string3) {
		if (!string1.equals(""))
			objCreateUserPage.selectStateUTInUserCreationPage(string1);
		if (!string2.equals(""))
			objCreateUserPage.setPinCodeInUserCreationPage(string2);
		if (!string3.equals(""))
			objCreateUserPage.setEmailInUserCreationPage(string3);
	}

	@Then("Capture UserCode")
	public void Capture_UserCode() {
		objCreateUserPage.verifyCreatedUserCodeAndCapture();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 16-July-2019
	 */
	@Then("Click on All In User Search Page")
	public void click_all_in_User_Search_Page() {
		objSearchUserPage.clickonAllUserSearchPage();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 16-July-2019
	 */
	@Then("Click on Locked In User Search Page")
	public void click_locked_in_User_Search_Page() {
		objSearchUserPage.clickonLockedUserSearchPage();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 16-July-2019
	 */
	@Then("Click on Disabled In User Search Page")
	public void click_disabled_in_User_Search_Page() {
		objSearchUserPage.clickonDisabledUserSearchPage();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 16-July-2019
	 */
	@Then("Click on Enabled In User Search Page")
	public void click_enabled_in_User_Search_Page() {
		objSearchUserPage.clickonEnabledUserSearchPage();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 16-July-2019
	 */
	@Then("Click on Unlocked In User Search Page")
	public void click_unlocked_in_User_Search_Page() {
		objSearchUserPage.clickonUnlockedUserSearchPage();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 16-July-2019
	 */
	@Then("Verify Error Message for User Field {string} as : {string}")
	public void verify_error_message_for_UserId_field_as(String string, String string2) {
		testData = objSearchUserPage.getErrorMessageForSpecificField(string);
		objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + string, string2, testData,
				testData.trim().equals(string2.trim()));
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 16-July-2019
	 */
	@Then("Verify Table status with Searched User Name is {string}")
	public void verify_Table_status_with_Searched_User_Name(String string) {
		objSearchUserPage.verifyStatusResultTable(string);

	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify common error message on top of {string} Page as {string}")
	public void verify_common_error_message_on_top_of_user_Creation_Page_as(String pageName, String string) {
		testData = objCreateUserPage.getCommonErrorMessageOnUserCreationPage();
		objPojo.getObjUtilities().logReporter("Verify common error message on top of page", string, testData,
				testData.trim().equals(string.trim()));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Fill {string} and {string} and {string} on {string} page")
	public void fill_state_pincode_email_details(String string1, String string2, String string3, String pageName) {
		if (!string1.equals(""))
			objCreateUserPage.selectStateUTInUserCreationPage(string1);
		if (!string2.equals(""))
			objCreateUserPage.setPinCodeInUserCreationPage(string2);
		if (!string3.equals(""))
			objCreateUserPage.setEmailInUserCreationPage(string3);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify {string} for {string} on {string} page")
	public void verify_error_message_for_Individual_fields(String string, String string2, String pageName) {
		testData = objCreateUserPage.getErrorMessageForSpecificUserField(string2);
		objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + string2, string, testData,
				testData.trim().equals(string.trim()));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Fill {string} and {string} on {string} page")
	public void fill_firstName_LastName(String string1, String string2, String pageName) {
		if (!string1.equals(""))
			objCreateUserPage.setFirstNameInUserCreationPage(string1);
		if (!string2.equals(""))
			objCreateUserPage.setLastNameInUserCreationPage(string2);
	}

	@Then("Update firstname on update user page")
	public void update_firstName_on_userSearch_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("FIRSTNAME");
			if (!testData.equals(""))
				if (testData.trim().toLowerCase().contains("dynamic")) {
					testData = objPojo.getObjUtilities().getRandomString(6);
					objPojo.getObjUtilities().setDataPool("RuntimeCreatedFirstName", testData);
					objCreateUserPage.setFirstNameInUserCreationPage(testData);
				}
		}
	}

	@Then("Verify {string} checkbox is displayed on update user page")
	public void verify_checkbox_is_present(String string) {
		objCreateUserPage.verifyArchivedCheckbox(string);

	}

	@Then("Verify successful user updation message {string}")
	public void verify_successful_user_updation_message(String string) {
		testData = objCreateUserPage.getSuccessfulUserupdationMessage();
		objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + string, string, testData,
				testData.trim().equals(string.trim()));
	}

	@Then("Verify updation is done successfully on user search page")
	public void verify_updation_of_individual_field() {
		objSearchUserPage.verifyFirstNameResultTable(testData);
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 * @Updated By : Shwetha on 16-07-2019
	 */
	@Then("Click OK button on {string} PopUp")
	public void click_OK_Button_on_User_Creation_PopUp(String pageName) {
		objCreateUserPage.clickOKButtonOnUserCreationPageConfirmPopUp();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Click OK button on {string} Success PopUp")
	public void click_OK_Button_on_User_Creation_Success_PopUp(String pageName) {
		objCreateUserPage.clickOKButtonOnUserCreationPageSuccessPopUp();
	}

	@Then("Click OK button on {string} Success message PopUp")
	public void click_OK_Button_on_UserUpdate_Success_PopUp(String pageName) {
		objCreateUserPage.clickOKButtonOnUserUpdatePageSuccessPopUp();
	}

	@Then("Click cancel button on {string} confirm PopUp")
	public void click_cancel_Button_on_UserUpdate_confirm_PopUp(String pageName) {
		objCreateUserPage.clickCancelButtonOnUserUpdatePageConfirmPopUp();
	}

	@Then("Verify lastname is {string} on user search table")
	public void verify_lastname_user_search_tabel(String string) {
		objSearchUserPage.verifyLastNameResultTable(string);
	}

	@Then("Update lastname on update user page")
	public void update_lastname_on_userSearch_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("LASTNAME");
			if (!testData.equals(""))
				if (testData.trim().toLowerCase().contains("dynamic")) {
					testData = objPojo.getObjUtilities().getRandomString(6);
					objCreateUserPage.setLastNameInUserCreationPage(testData);
				}
		}
	}

	@Then("Click on close icon on user search page")
	public void click_close_icon_on_user_search_page() {
		objCreateUserPage.clickCloseIconOnUserUpdatePageConfirmPopUp();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	@Then("Verify password expire message {string} on user update page")
	public void verify_password_expire_message(String string) {
		testData = objCreateUserPage.verifyPasswordExpireMessageOnUserUpdatePage();
		objPojo.getObjUtilities().logReporter("Verify password expire message on user update page : " + string, string,
				testData, testData.trim().equals(string.trim()));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	@Then("Check enabled on User Update Page")
	public void check_enabled_on_User_Update_Page() {
		objCreateUserPage.selectUserEnabledCheckBox();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 * @Updated By : Shwetha on 17-07-2019
	 */
	@Then("Click generate password button on {string} Page")
	public void click_generate_password_Button_on_User_Creation_Page(String string) {
		objCreateUserPage.clickGeneratePasswordButtonUserCreationPage();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 * @Updated By : Shwetha on 17-07-2019
	 */
	@Then("Click reset button on {string} Page")
	public void click_reset_button_on_User_Creation_Page(String string) {
		objCreateUserPage.clickResetButtonOnUserCreationPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	@Then("Verify {string} field with value {string} on update user page")
	public void verify_individual_field_and_value(String field, String value) {
		testData = objCreateUserPage.verifyIndividualFieldOnUserUpdatePage(field);
		objPojo.getObjUtilities().logReporter("Verify value for particular field in user update page : " + field, value,
				testData, testData.trim().equals(value.trim()));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 * @Updated By : Shwetha on 17-07-2019
	 */
	@Then("Check lock on {string} Page")
	public void check_lock_on_User_Creation_Page(String string) {
		objCreateUserPage.selectUserLockCheckBox();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 * @Updated By : Shwetha on 17-07-2019
	 */
	@Then("Check disable on {string} Page")
	public void check_disable_on_User_Creation_Page(String string) {
		objCreateUserPage.selectUserDisableCheckBox();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 * 
	 */
	@Then("Edit details of Update user page")
	public void edit_details_of_update_user_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("FIRSTNAME");
			if (!testData.equals(""))
				objCreateUserPage.setFirstNameInUserCreationPage(testData);
			testData = data.get("LASTNAME");
			if (!testData.equals(""))
				objCreateUserPage.setLastNameInUserCreationPage(testData);
			testData = data.get("ADDRESS1");
			if (!testData.equals(""))
				objCreateUserPage.setAddress1InUserCreationPage(testData);
			testData = data.get("ADDRESS2");
			if (!testData.equals(""))
				objCreateUserPage.setAddress2InUserCreationPage(testData);
			testData = data.get("TELEPHONE");
			if (!testData.equals(""))
				objCreateUserPage.setTelephoneInUserCreationPage(testData);
			testData = data.get("FAXNUMBER");
			if (!testData.equals(""))
				objCreateUserPage.setFaxNumberInUserCreationPage(testData);
			testData = data.get("STATE");
			if (!testData.equals(""))
				objCreateUserPage.selectStateUTInUserCreationPage(testData);
			testData = data.get("CITY");
			if (!testData.equals(""))
				objCreateUserPage.selectCityInUserCreationPage(testData);
			testData = data.get("PINCODE");
			if (!testData.equals(""))
				objCreateUserPage.setPinCodeInUserCreationPage(testData);
			testData = data.get("EMAIL");
			if (!testData.equals(""))
				if (testData.trim().toLowerCase().contains("dynamic")) {
					testData = objPojo.getObjUtilities().getRandomString(8) + "@gmail.com";
					objCreateUserPage.setEmailInUserCreationPage(testData);
				} else {
					objCreateUserPage.setEmailInUserCreationPage(testData);
				}
		}
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	@Then("Check unlock on {string} Page")
	public void unlock_on_user_update_page(String string) {
		objCreateUserPage.deselectUserLockCheckBox();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 18-July-2019
	 */
	@Then("Check Archived on {string} Page")
	public void click_archived_on_user_update_page(String string) {
		objCreateUserPage.clickArchivedChechboxInUserUpdatePage();
	}

	@Then("Deselect Enabled on {string} Page")
	public void click_enabled_on_user_update_page(String string) {
		objCreateUserPage.deselectUserDisableCheckBox();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 18-July-2019
	 */
	@Then("Click on view icon on user search page")
	public void click_on_view_icon_on_user_search_page() {
		objSearchUserPage.clickViewIconOnUserSearchPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 18-July-2019
	 */
	@Then("Verify {string} dropdown with value {string} on update user page")
	public void verify_individual_dropdown_field_and_value(String field, String value) {
		testData = objCreateUserPage.verifyIndividualDropdownFieldOnUserUpdatePage(field);
		objPojo.getObjUtilities().logReporter(
				"Verify value for particular dropdown in view user details page : " + field, value, testData,
				testData.trim().equals(value.trim()));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 * @Updated By : Shwetha on 18-07-2019
	 */
	@Then("Verify {string} is {string} on user search table")
	public void verify_lastname_user_search_tabel(String field, String value) {
		objSearchUserPage.verifyNameResultTable(value);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 18-July-2019
	 */
	@Then("Check on user entry on user search Page")
	public void check_on_user_displayed_on_user_search_page() {
		objSearchUserPage.checkOnUserEntryDisplayedOnUserSearchPage();
	}

	@Then("Change the status of the user to {string}")
	public void select_status_to_be_changed_user_search_page(String string) {
		objSearchUserPage.selectStatusToBeChangedOnUserSearchPage(string);
	}

	@Then("Click on update button on user search page")
	public void click_on_update_button_on_user_search_page() {
		objSearchUserPage.clickUpdateButtonOnUserSearchPage();
	}

	@Then("Click on status update button on user search page")
	public void click_on_status_update_on_user_search_page() {
		objSearchUserPage.clickConfirmStatusOnUserSearchPage();
	}

	@Then("Click on Export Excel on user search page")
	public void click_on_export_excel_on_user_search_page() {
		objSearchUserPage.clickExportExcelOnUserSearchPage();
	}

	@Then("Check whether city dropdown is disabled on {string} page")
	public void check_city_dropdown_is_disabled(String string) {
		objCreateUserPage.checkCityDropDownisDisabled();
	}

	@Then("Check whether city dropdown is enabled on {string} page")
	public void check_city_dropdown_is_enablede(String string) {
		objCreateUserPage.checkCityDropDownIsEnabled();
	}

	@Then("Select state on {string} page")
	public void select_state_dropdown(String string, DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("STATE");
			objCreateUserPage.selectStateUTInUserCreationPage(testData);
		}
	}

	@Then("Select city mapped with state on {string} page")
	public void select_city_dropdown_mapped_with_state(String string, DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("CITY");
			objCreateUserPage.selectCityInUserCreationPage(testData);
			objCreateUserPage.verifyOptionSelectedIsMappedToState(testData);
		}
	}

	@Then("Verify The Result Table in User Search Page")
	public void verify_result_table_in_user_search_page(String string) {
		objCreateUserPage.checkCityDropDownIsEnabled();
	}

	@Then("Check whether archived is already checked")
	public void verify_whether_checkbox_is_checked_in_user_update_page() {
		objCreateUserPage.checkWhetherCheckboxIsSelected();
	}

	@Then("Fill email id same as diabled user email id")
	public void set_email_same_as_disabled() {
		objCreateUserPage.setEmailSameAsDisabledUserInUserCreationPage(testData);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 25-July-2019
	 */
	@Then("Enter the details along with disabled user email id on {string} page")
	public void fill_Following_Details_without_emailId_field_in_User_Creation_Page(String string, DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("FIRSTNAME");
			if (!testData.equals(""))
				objCreateUserPage.setFirstNameInUserCreationPage(testData);
			testData = data.get("LASTNAME");
			if (!testData.equals(""))
				objCreateUserPage.setLastNameInUserCreationPage(testData);
			testData = data.get("ADDRESS1");
			if (!testData.equals(""))
				objCreateUserPage.setAddress1InUserCreationPage(testData);
			testData = data.get("ADDRESS2");
			if (!testData.equals(""))
				objCreateUserPage.setAddress2InUserCreationPage(testData);
			testData = data.get("TELEPHONE");
			if (!testData.equals(""))
				objCreateUserPage.setTelephoneInUserCreationPage(testData);
			testData = data.get("FAXNUMBER");
			if (!testData.equals(""))
				objCreateUserPage.setFaxNumberInUserCreationPage(testData);
			testData = data.get("MEMBERKOB");
			if (!testData.equals(""))
				objCreateUserPage.selectMemberKOBInUserCreationPage(testData);
			testData = data.get("MEMBERBASE");
			if (!testData.equals(""))
				objCreateUserPage.selectMemberBaseInUserCreationPage(testData);
			testData = data.get("MEMBERCODE");
			if (!testData.equals(""))
				objCreateUserPage.selectMemberCodeInUserCreationPage(testData);
			testData = data.get("PRODUCTSUBSCRIPTION");
			String[] arr = null;
			if (!testData.equals("")) {
				arr = testData.split("/");
				for (int i = 0; i < arr.length; i++) {
					objCreateUserPage.selectProductSubscriptionInUserCreationPage(arr[i].trim());
				}
			}
			testData = data.get("STATE");
			if (!testData.equals(""))
				objCreateUserPage.selectStateUTInUserCreationPage(testData);

			testData = data.get("CITY");
			if (!testData.equals(""))
				objCreateUserPage.selectCityInUserCreationPage(testData);
			testData = data.get("PINCODE");
			if (!testData.equals(""))
				objCreateUserPage.setPinCodeInUserCreationPage(testData);
			testData = data.get("USERID");
			if (!testData.equals("")) {
				if (testData.trim().toLowerCase().contains("dynamic")) {
					testData = objPojo.getObjUtilities().getRandomNumbers(testData);
					objPojo.getObjUtilities().setDataPool("RuntimeCreatedUser", testData);
					objCreateUserPage.setUserCodeInUserCreationPage(testData);
				} else {
					objCreateUserPage.setUserCodeInUserCreationPage(testData);
				}
			}
		}
	}

	@Then("Check main checkbox for all users")
	public void check_on_main_checkbox_for_all_users_on_user_search_page() {
		objSearchUserPage.checkOnMainCheckboxForAllUserIdsOnUserSearchPage();
	}

	/**
	 * @author : vikash thakur
	 * @Date of Creation : 01-Aug-2019
	 */
	@Then("Deselect Checkbox Force to change password in user search page")
	public void click_DeselectCheckbox_Force_to_change_password_in_user_search_page() {
		objCreateUserPage.deselectCheckboxForcetochangepasswordinusersearchpage();
	}

	@Then("Capture User Code that is created successfully on User Admin page")
	public void Capture_User_Code_that_is_created_successfully_on_User_Admin_page() {
		testData = objCreateUserPage.getUserCreationSuccessPopUpMessage().split("-")[0];
		objPojo.getObjUtilities().setDataPool("RuntimeCreatedAdminUserId", testData);
		objPojo.getObjUtilities().logReporter("Verify User Created with Code : " + testData, !testData.equals(""));

	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 * @Updated By : Shwetha on 17-07-2019
	 */
	@Then("Verify Table status with User Code is {string}")
	public void verify_Table_status_with_Created_User_Code(String string) {
		objSearchUserPage.verifyStatusResultTable(string);

	}

	/**
	 * @author : vikash thakur
	 * @Date of Creation : 02-Aug-2019
	 */

	@Then("Verify colour of the disabled user id is {string}")
	public void verify_colour_for_disabled_user(String colour) {
		objSearchUserPage.verifyColorForUserEntryOnUserSearchPage(testData, colour);

	}

	/**
	 * @author : vikash thakur
	 * @Date of Creation : 02-Aug-2019
	 */

	@Then("Click on Export Csv on User Search Page")
	public void click_on_export_Csv_on_user_search_page() {
		objSearchUserPage.clickExportCsvOnUserSearchPage();
	}

	/**
	 * @author : vikash thakur
	 * @Date of Creation : 05-Aug-2019
	 */
	@Then("Verify Locked-Unlocked Status  on user search Result page : {string}")
	public void Verify_Locked_Unloked_Status_on_user_search_Result_page(String testData) {
		objSearchUserPage.verifyLockedUnlockedStatusOnUserSearchResultPage(testData);
	}

	/**
	 * @author : vikash thakur
	 * @Date of Creation : 05-Aug-2019
	 */
	@Then("Verify Enabled-Disabled Status  on user search Result page : {string}")
	public void Verify_Enabled_Disabled_Status_on_user_search_Result_page(String testData) {
		objSearchUserPage.verifyEnabledDisabledStatusOnUserSearchResultPage(testData);
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 12-July-2019
	 * @Updated By : Shwetha on 16-07-2019
	 * @Updated By : Vikash on 01-08-2019
	 */
	@Then("Fill details in User Search Page")
	public void search_for_User_Code(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("USER ID");
			if (!testData.equals(""))
				if (testData.trim().toLowerCase().contains("dynamic"))
					testData = objPojo.getObjUtilities().dpString("RuntimeCreatedAdminUserId");
			objSearchUserPage.setUserCodeInSearchUserPage(testData);
			testData = data.get("CITY");
			if (!testData.equals(""))
				objSearchUserPage.setCityInUserSearchPage(testData);
		}
	}

}