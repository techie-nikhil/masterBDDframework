package com.stepDefinition.portal.Enquiry;

import java.util.List;
import java.util.Map;

import com.PageFactory.Enquiry.OrderCommercialReportsFormPage;
import com.generics.BaseTest;
import com.generics.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class EnquiryOrderCommercialReportDefinition {

	private Pojo objPojo;
	private OrderCommercialReportsFormPage objEnquiryOrderCommercialReportPage;
	private String testData;
	private String testData2;

	public EnquiryOrderCommercialReportDefinition(BaseTest pojo) {
		objPojo = pojo.initializeWebEnvironment();
		objEnquiryOrderCommercialReportPage = new OrderCommercialReportsFormPage(objPojo);

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
	@Then("Select {string} product on commercial order report")
	public void select_product_on_commercial_order_report(String tsetData) {
		objEnquiryOrderCommercialReportPage.checkProductCheckboxOnOrderCommercialReports(tsetData);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 30-July-2019
	 */
	@Then("Select cibil rank radio button on commercial order report")
	public void select_cibil_rank_on_commercial_order_report() {
		objEnquiryOrderCommercialReportPage.checkCibilRankOnOrderCommercialReports();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 30-July-2019
	 */
	@Then("Select cibil MSME rank radio button on commercial order report")
	public void select_MSME_rank_on_commercial_order_report() {
		objEnquiryOrderCommercialReportPage.checkCibilMsmeRankOnOrderCommercialReports();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 30-July-2019
	 */
	@Then("Select cibil emerging corporate rank radio button on commercial order report")
	public void select_emerging_corporate_rank_on_commercial_order_report() {
		objEnquiryOrderCommercialReportPage.checkCibilEmergingCorporateRankOnOrderCommercialReports();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 30-July-2019
	 */
	@Then("Click on search button on commercial order report")
	public void click_on_search_on_commercial_order_report() {
		objEnquiryOrderCommercialReportPage.clickOnSearchButtonOnOrderCommercialReports();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 30-July-2019
	 */
	@Then("Click on reset button on commercial order report")
	public void click_on_reset_on_commercial_order_report() {
		objEnquiryOrderCommercialReportPage.clickOnResetButtonOnOrderCommercialReports();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Verify the following details")
	public void verify_following_details_in_report(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("FIELDS");
			if (!testData.equals("")) {
				testData2 = objEnquiryOrderCommercialReportPage.verifyFollowingDetailsInReport(testData);
				objPojo.getObjUtilities().logReporter("Verify following details in report: " + testData,
						data.get("VALUE"), testData2, testData2.equals(data.get("VALUE")));
			}
		}
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Click on save as report")
	public void click_on_save_report() {
		objEnquiryOrderCommercialReportPage.clickOnSaveReport();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Click on download option")
	public void click_on_download_report() {
		objEnquiryOrderCommercialReportPage.clickOnDownloadReport();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	@Then("Select download format as {string} option")
	public void click_on_download_format_option(String format) {
		objEnquiryOrderCommercialReportPage.selectSavereportAsFormat(format);
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 30-July-2019
	 * @Updated on: 05-August-2019
	 */
	@Then("Fill the following details for CIR on commercial order reports page")
	public void fill_following_details_in_commercial_order_report(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("COMPANYNAME");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setCompanyNameOnOrderCommercialReports(testData);
			testData = data.get("TYPEOFENTITY");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectTypeOfEntityOnOrderCommercialReports(testData);
			testData = data.get("CLASSOFACTIVITY");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setClassOfActivityOnOrderCommercialReports(testData);
			testData = data.get("DATEOFREGISTRATION");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setDateOfRegistrationOnOrderCommercialReports(testData);
			testData = data.get("PAN");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPanNumberOnOrderCommercialReports(testData);
			testData = data.get("CIN");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setCinNumberOnOrderCommercialReports(testData);
			testData = data.get("CRN");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setCrnNumberOnOrderCommercialReports(testData);
			testData = data.get("TIN");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setTinNumberOnOrderCommercialReports(testData);
			testData = data.get("REGISTEREDOFFICEADDRESS");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setRegisteredOfficeAddressOnOrderCommercialReports(testData);
			testData = data.get("STATE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectRegisteredStateOnOrderCommercialReports(testData);
			testData = data.get("CITY");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectRegisteredCityOnOrderCommercialReports(testData);
			testData = data.get("PINCODE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setRegisteredPincodeOnOrderCommercialReports(testData);
			testData = data.get("CONTACTTYPE1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectContactTypeOneOnOrderCommercialReports(testData);
			testData = data.get("STDCODE1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setSTDCodeOneOnOrderCommercialReports(testData);
			testData = data.get("CONTACTNUMBER1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setContactNumberOneOnOrderCommercialReports(testData);
			testData = data.get("CONTACTTYPE2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectContactTypeTwoOnOrderCommercialReports(testData);
			testData = data.get("STDCODE2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setSTDCodeTwoOnOrderCommercialReports(testData);
			testData = data.get("CONTACTNUMBER2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setContactNumberTwoOnOrderCommercialReports(testData);
			testData = data.get("INDIVIDUALNAME");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setIndividualNameOnOrderCommercialReports(testData);
			testData = data.get("DOB");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setDOBOnOrderCommercialReports(testData);
			testData = data.get("GENDER");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectGenderOnOrderCommercialReports(testData);
			testData = data.get("RELATIONSHIPTYPE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectRelationTypeOnOrderCommercialReports(testData);
			testData = data.get("PERSONALPAN");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalPANNumberOnOrderCommercialReports(testData);
			testData = data.get("PERSONALUID");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalUIDNumberOnOrderCommercialReports(testData);
			testData = data.get("PERSONALVOTERID");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalVoterIdNumberOnOrderCommercialReports(testData);
			testData = data.get("PERSONALPASSPORTNUMBER");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalPassportNumberOnOrderCommercialReports(testData);
			testData = data.get("PERSONALDRIVINGLICENCE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalDrivingLicenceNumberOnOrderCommercialReports(testData);
			testData = data.get("PERSONALDINNUMBER");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalDINNumberOnOrderCommercialReports(testData);
			testData = data.get("RESIDENTIALADDRESS");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setResidentialAddressOnOrderCommercialReports(testData);
			testData = data.get("RESIDENTIALSTATE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectPersonalStateOnOrderCommercialReports(testData);
			testData = data.get("RESIDENTIALCITY");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectPersonalCityOnOrderCommercialReports(testData);
			testData = data.get("RESIDENTIALPINCODE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalPincodeOnOrderCommercialReports(testData);
			testData = data.get("PERSONALCONTACTTYPE1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectPersonalContactTypeOneOnOrderCommercialReports(testData);
			testData = data.get("PERSONALSTDCODE1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalSTDCodeOneOnOrderCommercialReports(testData);
			testData = data.get("PERSONALCONTACTNUMBER1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalContactNumberOneOnOrderCommercialReports(testData);
			testData = data.get("PERSONALCONTACTTYPE2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectPersonalContactTypeTwoOnOrderCommercialReports(testData);
			testData = data.get("PERSONALSTDCODE2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalSTDCodeTwoOnOrderCommercialReports(testData);
			testData = data.get("PERSONALCONTACTNUMBER2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalContactNumberTwoOnOrderCommercialReports(testData);
			testData = data.get("ENQUIRYPURPOSE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectEnquiryPurposeOnOrderCommercialReports(testData);
			testData = data.get("MEMBERREFERENCENUMBER");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setMemberReferenceNumberOnOrderCommercialReports(testData);
			testData = data.get("LOANAMOUNT");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setLoanAmountOnOrderCommercialReports(testData);
			testData = data.get("ENQUIRYTYPE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectEnquiryTypeOnOrderCommercialReports(testData);
		}

	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 05-August-2019
	 */
	@Then("Fill the following details for iSCAN on commercial order reports page")
	public void fill_following_details_in_iSCAN_commercial_order_report(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("COMPANYNAME");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setCompanyNameOnOrderCommercialReports(testData);
			testData = data.get("TYPEOFENTITY");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectTypeOfEntityOnOrderCommercialReports(testData);
			testData = data.get("CLASSOFACTIVITY");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setClassOfActivityOnOrderCommercialReports(testData);
			testData = data.get("DATEOFREGISTRATION");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setDateOfRegistrationOnOrderCommercialReports(testData);
			testData = data.get("PAN");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPanNumberOnOrderCommercialReports(testData);
			testData = data.get("CIN");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setCinNumberOnOrderCommercialReports(testData);
			testData = data.get("CRN");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setCrnNumberOnOrderCommercialReports(testData);
			testData = data.get("TIN");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setTinNumberOnOrderCommercialReports(testData);
			testData = data.get("REGISTEREDOFFICEADDRESS");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setRegisteredOfficeAddressOnOrderCommercialReports(testData);
			testData = data.get("STATE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectRegisteredStateOnOrderCommercialReports(testData);
			testData = data.get("CITY");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectRegisteredCityOnOrderCommercialReports(testData);
			testData = data.get("PINCODE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setRegisteredPincodeOnOrderCommercialReports(testData);
			testData = data.get("CONTACTTYPE1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectContactTypeOneOnOrderCommercialReports(testData);
			testData = data.get("STDCODE1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setSTDCodeOneOnOrderCommercialReports(testData);
			testData = data.get("CONTACTNUMBER1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setContactNumberOneOnOrderCommercialReports(testData);
			testData = data.get("CONTACTTYPE2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectContactTypeTwoOnOrderCommercialReports(testData);
			testData = data.get("STDCODE2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setSTDCodeTwoOnOrderCommercialReports(testData);
			testData = data.get("CONTACTNUMBER2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setContactNumberTwoOnOrderCommercialReports(testData);
			testData = data.get("INDIVIDUALNAME");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setIndividualNameOnOrderCommercialReports(testData);
			testData = data.get("DOB");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setDOBOnOrderCommercialReports(testData);
			testData = data.get("GENDER");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectGenderOnOrderCommercialReports(testData);
			testData = data.get("RELATIONSHIPTYPE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectRelationTypeOnOrderCommercialReports(testData);
			testData = data.get("PERSONALPAN");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalPANNumberOnOrderCommercialReports(testData);
			testData = data.get("PERSONALUID");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalUIDNumberOnOrderCommercialReports(testData);
			testData = data.get("PERSONALVOTERID");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalVoterIdNumberOnOrderCommercialReports(testData);
			testData = data.get("PERSONALPASSPORTNUMBER");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalPassportNumberOnOrderCommercialReports(testData);
			testData = data.get("PERSONALDRIVINGLICENCE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalDrivingLicenceNumberOnOrderCommercialReports(testData);
			testData = data.get("PERSONALDINNUMBER");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalDINNumberOnOrderCommercialReports(testData);
			testData = data.get("RESIDENTIALADDRESS");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setResidentialAddressOnOrderCommercialReports(testData);
			testData = data.get("RESIDENTIALSTATE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectPersonalStateOnOrderCommercialReports(testData);
			testData = data.get("RESIDENTIALCITY");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectPersonalCityOnOrderCommercialReports(testData);
			testData = data.get("RESIDENTIALPINCODE");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalPincodeOnOrderCommercialReports(testData);
			testData = data.get("PERSONALCONTACTTYPE1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectPersonalContactTypeOneOnOrderCommercialReports(testData);
			testData = data.get("PERSONALSTDCODE1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalSTDCodeOneOnOrderCommercialReports(testData);
			testData = data.get("PERSONALCONTACTNUMBER1");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalContactNumberOneOnOrderCommercialReports(testData);
			testData = data.get("PERSONALCONTACTTYPE2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.selectPersonalContactTypeTwoOnOrderCommercialReports(testData);
			testData = data.get("PERSONALSTDCODE2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalSTDCodeTwoOnOrderCommercialReports(testData);
			testData = data.get("PERSONALCONTACTNUMBER2");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setPersonalContactNumberTwoOnOrderCommercialReports(testData);
			testData = data.get("MEMBERREFERENCENUMBER");
			if (!testData.equals(""))
				objEnquiryOrderCommercialReportPage.setMemberReferenceNumberOnOrderCommercialReports(testData);

		}

	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 * @Updated on : 05-August-2019
	 */
	@Then("Fetch the work order number on the CIR report")
	public void fetch_work_order_number_for_CIR() {
		objEnquiryOrderCommercialReportPage.verifyCIRWorkOrderNumber();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 05-August-2019
	 */
	@Then("Fetch the work order number on the iSCAN report")
	public void fetch_work_order_number_for_iSCAN() {
		objEnquiryOrderCommercialReportPage.verifyISCANWorkOrderNumber();
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 05-August-2019
	 */
	@Then("Verify the {string} report prepared for your bank on iSCAN report as {string}")
	public void verify_report_for_your_bank_on_iSCAN_report(String columnHeaderToSearch, String textToVerify) {
		objEnquiryOrderCommercialReportPage.getTableTextForReportPreparedForYourBankOnIscanReport(columnHeaderToSearch,
				textToVerify);
	}

	/*****
	 * 
	 * @author : Shwetha Talapanty*
	 * @Date of Creation:06-August-2019
	 */

	@Then("Verify common error message on top of enquiry order commercial form as {string}")
	public void verify_common_error_message_on_top_of_enquiry_order_commercial_form(String textToVerify) {
		testData = objEnquiryOrderCommercialReportPage.getCommonErrorMessageOnEnquiryOrderCommercialForm();
		objPojo.getObjUtilities().logReporter("Verify common error message on enquiry order commercial form",
				textToVerify, testData, testData.trim().equals(textToVerify.trim()));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 06- August-2019
	 */
	@Then("Verify error message for individual fields on order commercial report form")
	public void verify_individual_error_message_of_enquiry_order_commercial_form(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : data1) {
			testData = data.get("FIELDS");
			if (!testData.equals("")) {
				testData2 = objEnquiryOrderCommercialReportPage
						.verifyIndividualFieldErrorMessageInEnquiryOrderCommercialForm(testData);
				objPojo.getObjUtilities().logReporter(
						"Verify individual field error message on enquiry order commercial report form: " + testData,
						data.get("ERRORMESSAGE"), testData2, testData2.equals(data.get("ERRORMESSAGE")));

			}
		}
	}

}