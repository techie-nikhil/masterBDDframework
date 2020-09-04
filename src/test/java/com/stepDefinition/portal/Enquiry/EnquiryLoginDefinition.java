package com.stepDefinition.portal.Enquiry;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.PageFactory.Enquiry.CommercialCreditInformationReportPage;
import com.PageFactory.Enquiry.EnquiryLoginPage;
import com.PageFactory.Enquiry.EnquiryOrderFormPage;
import com.PageFactory.Enquiry.TransUnionCIBILRankPage;
import com.generics.BaseTest;
import com.generics.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnquiryLoginDefinition {

	private Pojo objPojo;
	private EnquiryLoginPage objEnquiryLoginPage;
	private CommercialCreditInformationReportPage objCommercialCreditInformationReportPage;
	private EnquiryOrderFormPage objEnquiryOrderFormPage;

	private String testData;
	private TransUnionCIBILRankPage objTransUnionCIBILRankPage;

	public EnquiryLoginDefinition(BaseTest pojo) {
		objPojo = pojo.initializeWebEnvironment();
		objEnquiryLoginPage = new EnquiryLoginPage(objPojo);
		objCommercialCreditInformationReportPage = new CommercialCreditInformationReportPage(objPojo);
		objEnquiryOrderFormPage = new EnquiryOrderFormPage(objPojo);
		objTransUnionCIBILRankPage = new TransUnionCIBILRankPage(objPojo);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 26-July-2019
	 */
	@When("^Verify title of Enquiry Login Page$")
	public void verify_title_of_enquiry_page() {
		objEnquiryLoginPage.verifyEnquiryLoginPageTitle();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 26-July-2019
	 */
	@Then("^Login to Enquiry Using Following Credentials :")
	public void user_enters_username_and_password(DataTable credentials) {
		List<Map<String, String>> data1 = credentials.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("USERNAME");
			if (!testData.equals(""))
				objEnquiryLoginPage.setUserNameInEnquiryLoginPage(testData);
			testData = data.get("PASSWORD");
			if (!testData.equals(""))
				objEnquiryLoginPage.setPasswordInEnquiryLoginPage(testData);
		}
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 26-July-2019
	 */
	@Then("Click on Login button Enquiry Login Page")
	public void click_on_login_button() {
		objEnquiryLoginPage.clickLoginButtonOnEnquiryLoginPage();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 26-July-2019
	 */
	@Then("Verify common error message on Enquiry login Page as {string}")
	public void verify_login_error_message(String string) {
		objEnquiryLoginPage.verifyEnquiryErrorLoginMessage(string);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Verify successful login message on enquiry module: {string}")
	public void verify_enquiry_successful_login(String string) {
		objEnquiryLoginPage.verifySuccessfulLoginMessageOnEnquiryHomepage(string);
	}

	//
	// //////////////////////////////////////////////////////////////
	// /////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////
	// //////////////////////////////////////////////////////////////////////
	// //////////////////////////////////////////////////////////////
	//

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 30-July-2019
	 */
	@When("Click on {string} on homepage")
	public void click_on_order_commercial_report(String string) {
		objEnquiryLoginPage.clickOnOrderCommercial(string);
	}

	/**
	 * @author : Nikhil Agarwal
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Verify Successful Login Message on Enquiry Homepage")
	public void verifySuccessfulLoginMessageOnEnquiryHomepage() {
		objEnquiryOrderFormPage.verifySuccessfulLoginMessageOnEnquiryHomepage();
	}

	/**
	 * @author : Nikhil Agarwal
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Fill Products details in Order Form")
	public void fill_Products_details_in_Order_Form(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("PRODUCT-LABEL-NAME");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.selectProductsRadioButtonsInOrderForm(testData);
			testData = data.get("CIR-SUB-OPTION");
			// if (!testData.equals(""))

		}
	}

	/**
	 * @author : Nikhil Agarwal
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Fill Search Parameters in Order Form")
	public void fill_Search_Parameters_in_Order_Form(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("COMPANY-NAME");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.setCompanyNameInSearchParameterSection(testData);
			testData = data.get("TYPE-OF-ENTITY");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.selectTypeOfEntityInSearchParameterSection(testData);
			testData = data.get("CLASS-OF-ACTIVITY");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.setClassOfActivityInSearchParameterSection(testData);
			testData = data.get("DATE-OF-REGISTRATION");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.setDateOfRegistrationInSearchParameterSection(testData);
			testData = data.get("PAN");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.setPANInSearchParameterSection(testData);
			testData = data.get("REGISTERED-OFFICE-ADDRESS");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.setRegisteredOfficeAddressInSearchParameterSection(testData);
			testData = data.get("STATE-UT");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.selectStateUTInSearchParameterSection(testData);
			testData = data.get("CITY");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.selectCityInSearchParameterSection(testData);
			testData = data.get("PINCODE");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.setPinCodeOfficeAddressInSearchParameterSection(testData);
		}
	}

	/**
	 * @author : Nikhil Agarwal
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Fill Application Details in Order Form")
	public void fill_Application_Details_in_Order_Form(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("ENQUIRY-PURPOSE");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.selectEnquiryPurposeInApplicationDetailsSection(testData);
			testData = data.get("MEMBER-REFERENCE-NUMBER");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.setMemberReferenceNumberInApplicationDetailsSection(testData);
			testData = data.get("LOAN-AMOUNT-APPLIED");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.setLoanAmountAppliedInApplicationDetailsSection(testData);
			testData = data.get("ENQUIRY-TYPE");
			if (!testData.equals(""))
				objEnquiryOrderFormPage.selectEnquiryTypeInApplicationDetailsSection(testData);
		}
	}

	/**
	 * @author : Nikhil Agarwal
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Click Order Commercial Report Link Enquiry Home Page")
	public void clickOrderCommercialReportLinkEnquiryHomePage() {
		objEnquiryOrderFormPage.clickOrderCommercialReportLink();
	}

	/**
	 * @author : Nikhil Agarwal
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Click Search button on Order Form Page")
	public void clickSearchButtonOnOrderFormPage() {
		objEnquiryOrderFormPage.clickSearchButtonOnOrderFormPage();
	}

	/**
	 * @author : Nikhil Agarwal
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Click on {string} tab and {string} on Credit Information Report")
	public void ClickOnSpecificTabHeader(String header, String tabName) {
		By locator = By.xpath("//ul[@id='tabHeader']//li/a[text()='" + header + "']");
		objPojo.getObjUtilities().logReporter("Click Specific Tab Header Credit Information Report", header,
				objPojo.getObjWrapperFunctions().click(locator));
		if (!tabName.equals("")) {
			By locator2 = By
					.xpath("//div[@class='marginBottomFive']//ul[@role='tablist']//li/a[text()='" + tabName + "']");
			objPojo.getObjUtilities().logReporter("Click Specific Sub Tab Credit Information Report", header,
					objPojo.getObjWrapperFunctions().click(locator2));
		}
	}

	/**
	 * @author : Nikhil Agarwal
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Verify Cibil Rank Error Message Displayed as {string}")
	public void verifyCibilRankErrorMessageDisplayedAs(String error) {
		testData = objCommercialCreditInformationReportPage.getCibilRankErrorMessageCreditInformationPage();
		objPojo.getObjUtilities().logReporter("Verify Cibil Rank Error Message", error, testData,
				testData.trim().equals(error));
	}

	/**
	 * @author : Nikhil Agarwal
	 * @Date of Creation : 29-July-2019
	 */
	@Then("Verify TransUnion Cibil Rank Records Displayed as {string} on index {string}	TransUnion CIBIL Rank Page")
	public void Verify_TransUnion_Cibil_Rank_Records_Displayed(String string, String string2) {
		objTransUnionCIBILRankPage.verifyRecordsDisplayedInTransUnionCibilRankPage(string2, string);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Verify Whether Disclaimer message is not present on the enquiry loginpage")
	public void verify_disclaimer_message_not_present_on_login_page() {
		objEnquiryLoginPage.checkWhetherDisclaimerMessageIsNotPresent();
	}

	// replace these methods
	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 26-July-2019
	 * @Updated on : 06- August-2019
	 */
	@Then("Click on enquiry logout button on enquiry homepage")
	public void click_on_logout_button() {
		objEnquiryLoginPage.clickEnquiryLogoutButton();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 30-July-2019
	 * @Updated on : 06- August-2019
	 */
	@When("Click on {string} on enquiry homepage")
	public void click_on_specific_tab_on_enquiry_homepage(String string) {
		objEnquiryLoginPage.clickOnSpecificTabOnEnquiryHomepage(string);
	}
}
