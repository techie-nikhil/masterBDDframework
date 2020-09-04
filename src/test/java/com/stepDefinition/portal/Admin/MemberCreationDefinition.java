package com.stepDefinition.portal.Admin;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.PageFactory.Admin.AdminLoginPage;
import com.PageFactory.Admin.CreateMemberPage;
import com.PageFactory.Admin.SearchMemberPage;
import com.generics.BaseTest;
import com.generics.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MemberCreationDefinition {
	private Pojo objPojo;
	private AdminLoginPage objAdminLoginPage;
	private CreateMemberPage objCreateMemberPage;
	private SearchMemberPage objSearchMemberPage;
	private String testData;

	// Constructor
	public MemberCreationDefinition(BaseTest pojo) {
		objPojo = pojo.initializeWebEnvironment();
		objAdminLoginPage = new AdminLoginPage(objPojo);
		objCreateMemberPage = new CreateMemberPage(objPojo);
		objSearchMemberPage = new SearchMemberPage(objPojo);
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@When("^Verify title of User Admin Page$")
	public void verify_Title_of_User_Admin_Page() {
		objAdminLoginPage.verifyLoginPageTitle();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@When("Click on {string} Menu, {string} Link on Admin Home Page")
	public void clickOnSpecificMenyOptions(String menuName, String subMenuName) {
		By locator = By.xpath("//nav[@id='mainNav']/ul/li//a[normalize-space()='" + menuName + "']");
		objPojo.getObjUtilities().logReporter("Click Specific Menu Links", menuName,
				objPojo.getObjWrapperFunctions().click(locator));
		if (!subMenuName.equals("")) {
			By locator2 = By.xpath("//nav[@id='mainNav']/ul/li//a[normalize-space()='" + menuName
					+ "']//following-sibling::ul//a[normalize-space()='" + subMenuName + "']");
			objPojo.getObjUtilities().logReporter("Click Specific Menu Sub-Links under : " + menuName, subMenuName,
					objPojo.getObjWrapperFunctions().click(locator2));
		}
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @updated by : Vikash Thakur
	 * @Date of Creation : 09-July-2019
	 * @date of Update : 29-07-2019
	 * @updated by : Saurabh Shekhar
	 * @date of Update : 30-07-2019
	 *
	 */
	@Then("Enter following details in Member Creation Page")
	public void enter_following_details_in_Member_Creation_Page(DataTable credentials) {
		List<Map<String, String>> data1 = credentials.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("NAME");
			if (!testData.equals(""))
				objCreateMemberPage.setMemberNameInMemberCreationPage(testData);
			testData = data.get("SHORTNAME");
			if (!testData.equals(""))
				objCreateMemberPage.setShortNameInMemberCreationPage(testData);
			testData = data.get("MEMBERCODE");
			if (!testData.equals("")) {
				if (testData.trim().toLowerCase().contains("dynamic"))
					testData = objPojo.getObjUtilities().getRandomNumbers(testData);
				objPojo.getObjUtilities().setDataPool("RuntimeCreatedMember", testData);
				objCreateMemberPage.setMemberCodeInMemberCreationPage(testData);
			}
			testData = data.get("ADDRESS1");
			if (!testData.equals(""))
				if (testData.trim().toLowerCase().contains("dynamic"))
					testData = objPojo.getObjUtilities().getRandomNumbers1(testData);
			objPojo.getObjUtilities().setDataPool("RuntimeAddress", testData);
			objCreateMemberPage.setAddress1InMemberCreationPage(testData);
			testData = data.get("ADDRESS2");
			if (!testData.equals(""))
				if (testData.trim().toLowerCase().contains("dynamic"))
					testData = objPojo.getObjUtilities().getRandomNumbers1(testData);
			objPojo.getObjUtilities().setDataPool("RuntimeAddress1", testData);
			objCreateMemberPage.setAddress2InMemberCreationPage(testData);
			testData = data.get("PINCODE");
			if (!testData.equals(""))
				objCreateMemberPage.setPinCodeInMemberCreationPage(testData);
			testData = data.get("TELEPHONE");
			if (!testData.equals(""))
				objCreateMemberPage.setTelephoneNumberInMemberCreationPage(testData);
			testData = data.get("FAXNUMBER");
			if (!testData.equals(""))
				objCreateMemberPage.setFaxNumberInMembercreationPage(testData);
			testData = data.get("CONTACTNAME");
			if (!testData.equals(""))
				objCreateMemberPage.setContactNameInMemberCreationPage(testData);
			testData = data.get("EMAILID");
			if (!testData.equals(""))
				objCreateMemberPage.setEmailIDInMemberCreationPage(testData);
			testData = data.get("MEMBERKOB");
			if (!testData.equals(""))
				objCreateMemberPage.setMemberKOBInMemberCreationPage(testData);
			testData = data.get("MEMBERGROUPING");
			if (!testData.equals(""))
				objCreateMemberPage.setMemberGroupingInMemberCreationPage(testData);
			/*
			 * testData = data.get("ADDONNAME"); if (!testData.equals(""))
			 * objCreateMemberPage.setAddOnInMemberCreationPage(testData);
			 */

			testData = data.get("MEMBERACCESSSTSTUS");
			if (!testData.equals(""))
				objCreateMemberPage.setMemberAccessStatusInMemberCreationPage(testData);
			testData = data.get("STATE");
			if (!testData.equals(""))
				objCreateMemberPage.setStateInMemberCreationPage(testData);
			testData = data.get("CITY");
			if (!testData.equals(""))
				objCreateMemberPage.setCityInMemberCreationPage(testData);
		}
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Click save button on Member Creation Page")
	public void click_save_button_on_Member_Creation_Page() {
		objCreateMemberPage.clickSaveButtonOnMemberCreationPage();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Search for Member Code : {string} on Member Search page")
	public void search_for_Member_Code(String string) {
		objSearchMemberPage.setMemberCodeInSearchMemberPage(string);
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Verify Table content with Created Member Code")
	public void verify_Table_content_with_Created_Member_Code() {
		testData = objPojo.getObjUtilities().dpString("RuntimeCreatedMember");
		if (!testData.equals(""))
			objSearchMemberPage.verifyRuntimeDataInResultTable(testData);
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Click on Member Search button on Member Search page")
	public void click_on_Member_Search_button() {
		objSearchMemberPage.clickSearchButtonOnMemberSearchPage();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Verify common error message on top of member Creation Page as {string}")
	public void verify_common_error_message_on_top_of_member_Creation_Page_as(String string) {
		testData = objCreateMemberPage.getCommonErrorMessageOnMemberCreationPage();
		objPojo.getObjUtilities().logReporter("Verify common error message on top of page", string, testData,
				testData.trim().equals(string.trim()));
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 30-July-2019
	 */

	@Then("Verify common error message on Admin login Page as {string}")
	public void verify_common_error_message_on_top_of_login_Page_as(String string) {
		testData = objAdminLoginPage.getCommonErrorMessageOnLoginPage();
		objPojo.getObjUtilities().logReporter("Verify common error message on top of login page", string, testData,
				testData.trim().equals(string.trim()));
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 31-July-2019
	 *
	 */
	@Then("Deselect {string} Checkbox for {string} in Member Creation Page")
	public void deselect_optional_checkbox_in_member_Creation_Page(String string, String string1) {
		objCreateMemberPage.deselectAddOnOptionalCheckBox(string1);
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 * @Updated By Vikash on 12-July-2019
	 */
	@Then("Verify Member Details In Member Creation Page")
	public void verify_Member_Details_In_Member_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("MEMBERGROUPING");
			if (!testData.equals(""))
				objCreateMemberPage.verifySelectedValueForMemberGroupingDropDown(testData);
			testData = data.get("ADDRESS1");
			if (!testData.equals(""))
				objCreateMemberPage.verifyValueForAddress1Field(testData);
			testData = data.get("ADDRESS2");
			if (!testData.equals(""))
				objCreateMemberPage.verifyValueForAddress2Field(testData);
			testData = data.get("CONTACTNAME");
			if (!testData.equals(""))
				objCreateMemberPage.verifyValueForContactNameField(testData);
			testData = data.get("EMAILID");
			if (!testData.equals(""))
				objCreateMemberPage.verifyValueForEmailIdField(testData);
			testData = data.get("STATE");
			if (!testData.equals(""))
				objCreateMemberPage.verifyValueForDropdownStateField(testData);
			testData = data.get("CITY");
			if (!testData.equals(""))
				objCreateMemberPage.verifyValueForDropdownCityField(testData);
		}
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Upload {string} File in Bulk upload for {string}")
	public void upload_File_in_Bulk_upload_for(String string, String string2) {
		By locator = By.xpath("//h3[text()='" + string2 + "']//parent::form[@id='bulkForm']//input[@id='fileinput']");
		objPojo.getObjUtilities().logReporter("Upload file for " + string2, string,
				objPojo.getObjWrapperFunctions().uploadFile(locator, string, 2));
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Click on Submit button for {string}")
	public void click_on_Submit_button_for(String string) {
		By locator = By.xpath("//h3[text()='" + string + "']//parent::form[@id='bulkForm']//button[text()='Submit']");
		objPojo.getObjUtilities().logReporter("Click Specific Submit Butoon on Bulk upload screen", string,
				objPojo.getObjWrapperFunctions().click(locator));
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Click Download option for {string} for specific bulk History")
	public void click_Download_option_for_for_specific_bulk_History(String string) {
		By locator = By.xpath("//table[@id='attrsetsearch']//td[text()='" + string
				+ "']//parent::tr//i[contains(@class,'file-excel')]");
		objPojo.getObjUtilities().logReporter("Click download option for Specific record" + string,
				objPojo.getObjWrapperFunctions().click(locator));
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Verify error message for {string} as : {string} on Member Creation Page")
	public void verify_error_message_for_as(String string, String string2) {
		testData = objCreateMemberPage.getErrorMessageForSpecificField(string);
		objPojo.getObjUtilities().logReporter("Verify Error Message for Field : " + string, string2, testData,
				testData.trim().equals(string2.trim()));
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Enter following details in Search Member Page")
	public void Enter_following_details_in_Search_Member_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("NAME");
			if (!testData.equals(""))
				objSearchMemberPage.setMemberNameInSearchMemberPage(testData);
			testData = data.get("MEMBERACCESSSTSTUS");
			if (!testData.equals(""))
				objSearchMemberPage.setMemberAccessStatusInSearchMemberPage(testData);
			testData = data.get("SHORTNAME");
			if (!testData.equals(""))
				objSearchMemberPage.setMemberShortNameInSearchMemberPage(testData);
			testData = data.get("MEMBERCODE");
			if (!testData.equals(""))
				objSearchMemberPage.setMemberCodeInSearchMemberPage(testData);
		}
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify successful login message {string} on Admin Home Page")
	public void verify_successful_login(String string) {
		objAdminLoginPage.verifySuccessfulLoginMessage(string);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Click on logout button on Admin Home Page")
	public void click_on_logout_button() {
		objAdminLoginPage.clickAdminLogoutButton();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Click Login button on Admin Login Page")
	public void click_on_login_button() {
		objAdminLoginPage.clickAdminLoginButton();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Fill {string} and {string} on Admin Login Page")
	public void fill_username_password(String string1, String string2) {
		if (!string1.equals(""))
			objAdminLoginPage.setUserNameInAdminLoginPage(string1);
		if (!string2.equals(""))
			objAdminLoginPage.setPasswordInAdminLoginPage(string2);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify the {string} on Admin Login Page")
	public void verify_login_error_message(String string) {
		objAdminLoginPage.verifyErrorLoginMessage(string);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify password expiry message on Admin Home Page")
	public void verify_password_expiry_message_on_homepage() {
		objCreateMemberPage.verifyPasswordExpiryMessageOnHomepage();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("^Login to User Admin Using Following Credentials :")
	public void user_enters_username_and_password(DataTable credentials) {
		List<Map<String, String>> data1 = credentials.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("USERNAME");
			if (!testData.equals(""))
				if (testData.toLowerCase().contains("runtime"))
					testData = objPojo.getObjUtilities().dpString("RuntimeCreatedAdminUserId");
			objAdminLoginPage.setUserNameInAdminLoginPage(testData);
			testData = data.get("PASSWORD");
			if (!testData.equals(""))
				if (testData.toLowerCase().contains("runtime"))
					testData = objPojo.getObjUtilities().dpString("RuntimeCreatedGenratedPassword");
			objAdminLoginPage.setPasswordInAdminLoginPage(testData);
		}
		objAdminLoginPage.clickLoginButtonOnAdminLoginPage();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Click Edit button on Search Member Page")
	public void Click_on_SearchMemberPage_Edit_button() {
		objSearchMemberPage.clickSearchMemberPageEditbutton();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Click on View button on Search Member Page")
	public void Click_on_SearchMemberPage_View_button() {
		objSearchMemberPage.clickSearchMemberPageViewbutton();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Click on Reset button on Search Member Page")
	public void Click_on_SearchMemberPage_Reset_button() {
		objSearchMemberPage.clickSearchMemberPageResetbutton();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("click on Save button on Search Member Page PopUp")
	public void click_on_SearchMemberPage_PopUp_Save_button() {
		objSearchMemberPage.clickonSearchMemberPagePopUpSavebutton();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("click on Search Member Page Updation PopUp button")
	public void click_on_SearchMemberPage_UpdationPopUp_button() {
		objSearchMemberPage.clickonSearchMemberPageUpdationPopupbbutton();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("click on member Successfully Updated Alert Ok button")
	public void click_on_member_Successfully_Updated_Alert_Ok_button() {
		objSearchMemberPage.clickonSearchMemberPageSuccessfullyUpdatedAleartOkbutton();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 * @Updated By : Shwetha on 18-07-2019
	 */
	@Then("Verify Search Member Page Result")
	public void Verify_Search_Member_Result(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("MEMBERCODE");
			if (!testData.equals(""))
				objSearchMemberPage.verifyMemberCodeSearchMemberPage(testData);
			testData = data.get("MEMBERNAME");
			if (!testData.equals(""))
				objSearchMemberPage.verifyMemberNameSearchMemberPage(testData);
		}
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Click on Search Member view Popup Close button")
	public void Click_on_SearchMember_view_Popup_Close_button() {
		objSearchMemberPage.clickonSearchMemberPageViewPopUpClosebutton();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@When("Verify title of Search Member Admin Page")
	public void Verify_title_of_SearchMember_Admin_Page() {
		objSearchMemberPage.verifySearchMemberPageTitle();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Enter following details in Search Member Edit Popup Page")
	public void enter_following_details_in_SearchMember_EditPopup_Page(DataTable credentials) {
		List<Map<String, String>> data1 = credentials.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("NAME");
			if (!testData.equals(""))
				objSearchMemberPage.setNameInSearchMemberEditpopupPage(testData);

		}
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify following details in Search Member Popup Page")
	public void Verify_following_details_in_SearchMember_EditPopup_Page(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("NAME");
			if (!testData.equals(""))
				objSearchMemberPage.verifyEditPopUpMemberNameSearchMemberPage(testData);
		}
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 25-July-2019
	 */
	@Then("Click Reset button On View / Modify Member PopUp")
	public void clickResetButtonOnViewModifyMemberPopUp() {
		objSearchMemberPage.clickResetButtonOnViewModifyMemberPopUp();
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 26-July-2019
	 */
	@Then("Select {string} Checkbox for {string} in Member Creation Page")
	public void Select_optional_checkbox_in_member_Creation_Page(String String1, String string) {
		objCreateMemberPage.selectAddOnOptionalCheckBox(string);
	}

	//
	// //////////////////////////////////////////////////////////////
	// /////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////
	// //////////////////////////////////////////////////////////////////////
	// //////////////////////////////////////////////////////////////
	//
	@Then("Capture MemberCode")
	public void Capture_MemberCode() {
		objCreateMemberPage.verifyCreatedMemberCodeAndCapture();
	}

	@Then("title member page Admin")
	public void title_of_login_page_is_Member_Admin() {
		objCreateMemberPage.verifyMemberCreationPageDisplayed();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify common error message on top of Search member Page as {string}")
	public void verify_common_error_message_on_top_of_Search_member_Page_as(String string) {
		testData = objSearchMemberPage.getCommonErrorMessageOnSearchMemberPage();
		objPojo.getObjUtilities().logReporter("Verify common error message on top of page", string, testData,
				testData.trim().equals(string.trim()));
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("click on Member Creation Page Reset button")
	public void click_on_MemberCreation_Reset_button() {
		objCreateMemberPage.clickMemberCreationResetButton();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("click Add Another Button on Success PopUp")
	public void click_AddAnotherButton_on_Success_PopUp() {
		objCreateMemberPage.MemberCreationAddAnotherButtononSuccessPopUpButton();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify Member Creation Add Another button")
	public void Verify_MemberCreation_AddAnother_button() {
		objCreateMemberPage.verifyAddAnotherMemberCreationPageDisplayed();
	}

	@Then("Click Mandatory Checkbox for {string}")
	public void click_mandatory_checkbox_in_member_Creation_Page(String string) {
		objCreateMemberPage.selectAddOnMandatoryCheckBox(string);
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 31-July-2019
	 *
	 */
	@Then("Deselect Mandatory Checkbox for {string}")
	public void deselect_mandatory_checkbox_in_member_Creation_Page(String string) {
		objCreateMemberPage.deselectAddOnMandatoryCheckBox(string);
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify Member Success Ok button")
	public void Verify_Member_Success_Ok_button() {
		objCreateMemberPage.verifySuccessOKMemberCreationPageDisplayed();
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 12-July-2019
	 */
	@Then("Verify Member Creation confirm Message : {string}")
	public void Verify_MemberCreation_confirm_Message(String string) {
		testData = objCreateMemberPage.getConfirmationMessageMemberCreation();
		objPojo.getObjUtilities().logReporter("Verify Member Creation Confirmation Message", string, testData,
				testData.equals(string));
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 02-Aug-2019
	 * @Updated By : Vikash on 05-August-2019
	 */
	@Then("Read error message from {string} excel as {string} in Row {string} and column {string}")
	public void read_excel(String FilePath, String testData, String RowNumber, String Colno) {
		objCreateMemberPage.readExcelData(testData, RowNumber, Colno, FilePath);
	}

	/**
	 * @author : Saurabh Shekhar
	 * @Date of Creation : 05-Aug-2019
	 */
	@Then("Check whether Addon is already checked")
	public void verify_whether_checkbox_is_checked_in_user_update_page() {
		objCreateMemberPage.checkWhetherAddOnCheckboxIsSelected();
	}
}
