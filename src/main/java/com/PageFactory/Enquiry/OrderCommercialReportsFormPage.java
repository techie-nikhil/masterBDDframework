package com.PageFactory.Enquiry;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generics.Pojo;

public class OrderCommercialReportsFormPage {

	// Checkbox
	private By chkCibilRank = By.xpath("//span//img[@id='helpIconHead']//following::input[2]");
	private By chkCibilMSMERank = By.xpath("//span//img[@id='helpIconHead']//following::input[3]");
	private By chkCibilEmergingCorporateRank = By.xpath("//span//img[@id='helpIconHead']//following::input[4]");

	// Inputs
	private By inpCompanyName = By.xpath("//input[@name='companyName']");
	private By inpClassOfActivity = By.xpath("//input[contains(@class,'form-control typeEntry')]");
	private By inpCompanyPanNumber = By.xpath("//input[@name='pan']");
	private By inpCompanyCinNumber = By.xpath("//input[@name='cin']");
	private By inpCompanyCrnNumber = By.xpath("//input[@name='crn']");
	private By inpCompanyTinNumber = By.xpath("//input[@name='tin']");
	private By inpCompanyRegisteredOfficeAddress = By.xpath("//input[@name='regAddressTxt1']");
	private By inpPincode = By.xpath("//input[@name='pincode']");
	private By inpStatecodeOne = By
			.xpath("//label[contains(text(),'Registered Office Address ')]//following::input[4]");
	private By inpStatecodeTwo = By
			.xpath("//label[contains(text(),'Registered Office Address ')]//following::input[7]");
	private By inpContactNumberOne = By
			.xpath("//label[contains(text(),'Registered Office Address ')]//following::input[5]");
	private By inpContactNumberTwo = By
			.xpath("//label[contains(text(),'Registered Office Address ')]//following::input[8]");
	private By inpIndividualName = By.xpath(
			"//h4[contains(text(),'Proprietors/ Directors/ Partners/ Trustees Personal Details ')]//following::input[1]");
	private By inpPersonalDetailsPAN = By.xpath(
			"//h4[contains(text(),'Proprietors/ Directors/ Partners/ Trustees Personal Details ')]//following::input[3]");
	private By inpPersonalDetailsUID = By.xpath("//label[contains(text(),'UID:')]//following::input[1]");
	private By inpPersonalDetailsVoterId = By.xpath("//label[contains(text(),'Voter ID:')]//following::input[1]");
	private By inpPersonalDetailsPassportNumber = By
			.xpath("//label[contains(text(),'Passport Number:')]//following::input[1]");
	private By inpPersonalDetailsDrivingLicenceId = By
			.xpath("//label[contains(text(),'Driving Licence ID:')]//following::input[1]");
	private By inpPersonalDetailsDINnumber = By.xpath("//label[contains(text(),'DIN:')]//following::input[1]");
	private By inpPersonalDetailsResidensialAddress = By
			.xpath("//label[contains(text(),'Residence Address ')]//following::input[1]");
	private By inpPersonalDetailsPincode = By
			.xpath("//label[contains(text(),'Residence Address ')]//following::input[2]");
	private By inpPersonalDetailsStatecodeOne = By
			.xpath("//label[contains(text(),'Residence Address ')]//following::input[4]");
	private By inpPersonalDetailsStatecodeTwo = By
			.xpath("//label[contains(text(),'Residence Address ')]//following::input[7]");
	private By inpPersonalDetailsContactNumberOne = By
			.xpath("//label[contains(text(),'Residence Address ')]//following::input[5]");
	private By inpPersonalDetailsContactNumberTwo = By
			.xpath("//label[contains(text(),'Residence Address ')]//following::input[8]");
	private By inpMemberReferenceNumber = By
			.xpath("//label[contains(text(),'Member Reference Number ')]//following::input[1]");
	private By inpLoanAmountApplied = By
			.xpath("//label[contains(text(),'Loan Amount Applied(₹) ')]//following::input[1]");
	private By inpCompanyDateOfRegistration = By.xpath("//datetime[@name='dateOfRegistration']//input");
	private By inpPersonalDetailsDOB = By
			.xpath("//div[@id='q-datepicker_3']//input[contains(@class,'form-control dateText')]");

	// Dropwdowns
	private By drpTypeOfEntity = By.xpath("//select[@name='entityType']");
	private By drpState = By.xpath("//select[@name='state']");
	private By drpCity = By.xpath("//select[@name='city']");
	private By drpContactTypeOne = By
			.xpath("//label[contains(text(),'Registered Office Address ')]//following::select[3]");
	private By drpContactTypeTwo = By
			.xpath("//label[contains(text(),'Registered Office Address ')]//following::select[4]");
	private By drpGender = By.xpath("//label[contains(text(),'Registered Office Address ')]//following::select[5]");
	private By drpRelationshipType = By.xpath("//select[@name='relationshipType']");
	private By drpPersonalDetailsState = By
			.xpath("//label[contains(text(),'Residence Address ')]//following::select[1]");
	private By drpPersonalDetailsCity = By
			.xpath("//label[contains(text(),'Residence Address ')]//following::select[2]");
	private By drpPersonalDetailsContactTypeOne = By
			.xpath("//label[contains(text(),'Residence Address ')]//following::select[3]");
	private By drpPersonalDetailsContactTypeTwo = By
			.xpath("//label[contains(text(),'Residence Address ')]//following::select[4]");
	private By drpPersonalDetailsEnquiryPurpose = By.xpath("//select[@name='enquiryPurpose']");
	private By drpPersonalDetailsEnquiryType = By.xpath("//select[@name='enquiryType']");
	private By drpSaveReportAs = By.xpath("//select[contains(@class,'saveAsSelect')]");
	// Buttons
	private By btnSearch = By.xpath("//button[contains(text(),'Search')]");
	private By btnReset = By.xpath("//button[contains(text(),'Reset')]");
	private By btnSave = By.xpath("//img[@id='documentIcon']");
	private By btnDownload = By.xpath("//img[@id='download']");
	private String testData;
	private Pojo objPojo;
	private By lblCIRWorkOrderNumber = By
			.xpath("//tbody//tr//td[starts-with(text(),'Report Order Number:')]//following::td[1]");
	private By lbliSCANWorkOrderNumber = By
			.xpath("//div//span[contains(text(),'REPORT ORDER NO:')]//following-sibling::span[1]");
	private By lblEnquiryCommonErrorMsg = By.xpath("//div[contains(@class,'alert alert-danger')]");

	public OrderCommercialReportsFormPage(Pojo Pojo) {
		objPojo = Pojo;
	}

	public void checkProductCheckboxOnOrderCommercialReports(String testData) {
		By locator = By.xpath("//div[contains(text(),'" + testData + "')]//input[@name='product']");
		objPojo.getObjUtilities().logReporter("Select product on order commercial report:", testData,
				objPojo.getObjWrapperFunctions().click(locator));
	}

	public void checkCibilRankOnOrderCommercialReports() {
		objPojo.getObjUtilities().logReporter("Select cibil rank on order commercial report",
				objPojo.getObjWrapperFunctions().click(chkCibilRank));
	}

	public void checkCibilMsmeRankOnOrderCommercialReports() {
		objPojo.getObjUtilities().logReporter("Select cibil MSME rank on order commercial report",
				objPojo.getObjWrapperFunctions().click(chkCibilMSMERank));
	}

	public void checkCibilEmergingCorporateRankOnOrderCommercialReports() {
		objPojo.getObjUtilities().logReporter("Select cibil emerging corporate rank on order commercial report",
				objPojo.getObjWrapperFunctions().click(chkCibilEmergingCorporateRank));
	}

	public void clickOnSearchButtonOnOrderCommercialReports() {
		objPojo.getObjUtilities().logReporter("Click on search button on order commercial report",
				objPojo.getObjWrapperFunctions().click(btnSearch));
	}

	public void clickOnResetButtonOnOrderCommercialReports() {
		objPojo.getObjUtilities().logReporter("Click on reset button on order commercial report",
				objPojo.getObjWrapperFunctions().click(btnReset));
	}

	public String verifyFollowingDetailsInReport(String fieldName) {
		By locator = By.xpath("//tbody//tr//td[starts-with(text(),'" + fieldName + "')]//following::td[1]");
		return objPojo.getObjWrapperFunctions().getText(locator, "text");

	}

	public void clickOnSaveReport() {
		objPojo.getObjUtilities().logReporter("Click on save report on Generated Report Page",
				objPojo.getObjWrapperFunctions().click(btnSave));
	}

	public void clickOnDownloadReport() {
		objPojo.getObjUtilities().logReporter("Click on download report on Generated Report Page",
				objPojo.getObjWrapperFunctions().click(btnDownload));
	}

	public void selectSavereportAsFormat(String testData) {
		objPojo.getObjUtilities().logReporter("Select format to save report on Generated Report Page", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpSaveReportAs, testData, "text"));
	}

	public void verifyCIRWorkOrderNumber() {
		String testData = objPojo.getObjWrapperFunctions().getText(lblCIRWorkOrderNumber, "text");
		objPojo.getObjUtilities().logReporter("Fetch work order number for CIR report : " + testData,
				!testData.equals(""));
	}

	public void verifyISCANWorkOrderNumber() {
		String testData = objPojo.getObjWrapperFunctions().getText(lbliSCANWorkOrderNumber, "text");
		objPojo.getObjUtilities().logReporter("Fetch work order number for iSCAN report : " + testData,
				!testData.equals(""));
	}

	private int getTableForReportPreparedForYourBankHeadIndexOnIscanReport(String arg0) {
		By locator = By.xpath("//div[@id='bankRptArea']//table/thead//td");
		List<WebElement> listElement = objPojo.getDriver().findElements(locator);
		for (Iterator iterator = listElement.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			if (webElement.getText().startsWith(arg0))
				return listElement.indexOf(webElement) + 1;
		}
		return 0;
	}

	public void getTableTextForReportPreparedForYourBankOnIscanReport(String columnHeaderToSearch,
			String textToVerify) {
		By locator = By.xpath("//div[@id='bankRptArea']//table/tbody//td["
				+ getTableForReportPreparedForYourBankHeadIndexOnIscanReport(columnHeaderToSearch) + "]");
		testData = objPojo.getObjWrapperFunctions().getAttribute(locator, "textContent");
		objPojo.getObjUtilities().logReporter(
				"Verify password expire message on user update page : " + columnHeaderToSearch, textToVerify, testData,
				testData.trim().equals(textToVerify.trim()));
	}

	public void setClassOfActivityOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set class of activity on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setBootStrapInputText(inpClassOfActivity, testData));
	}

	public void setCompanyNameOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set company name on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpCompanyName, testData));

	}

	public void selectTypeOfEntityOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select type of entity on order commercial report", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpTypeOfEntity, testData, "text"));
	}

	public void setDateOfRegistrationOnOrderCommercialReports(String testData) {
		 objPojo.getObjUtilities().logReporter("Set date of registration on order commercial report", testData,
		objPojo.getObjWrapperFunctions().setText(inpCompanyDateOfRegistration, testData));
	}

	public void setPanNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set PAN number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpCompanyPanNumber, testData));
	}

	public void setCinNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set CIN number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpCompanyCinNumber, testData));
	}

	public void setCrnNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set CRN number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpCompanyCrnNumber, testData));
	}

	public void setTinNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set TIN number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpCompanyTinNumber, testData));
	}

	public void setRegisteredOfficeAddressOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set registered office address on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpCompanyRegisteredOfficeAddress, testData));
	}

	public void selectRegisteredStateOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select registered state on order commercial report", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpState, testData, "text"));
	}

	public void selectRegisteredCityOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select registered city on order commercial report", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpCity, testData, "text"));
	}

	public void setRegisteredPincodeOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set registered pincode on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPincode, testData));
	}

	public void selectContactTypeOneOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select contact type for contact one on order commercial report",
				testData, objPojo.getObjWrapperFunctions().selectDropDownOption(drpContactTypeOne, testData, "text"));
	}

	public void selectContactTypeTwoOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select contact type for contact two on order commercial report",
				testData, objPojo.getObjWrapperFunctions().selectDropDownOption(drpContactTypeTwo, testData, "text"));
	}

	public void setSTDCodeOneOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set STD code for contact one on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpStatecodeOne, testData));
	}

	public void setSTDCodeTwoOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set STD code for contact two on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpStatecodeTwo, testData));
	}

	public void setContactNumberOneOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set first contact number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpContactNumberOne, testData));
	}

	public void setContactNumberTwoOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set second contact number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpContactNumberTwo, testData));
	}

	public void setIndividualNameOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set individual name on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpIndividualName, testData));
	}

	public void setDOBOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set date of birth on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsDOB, testData));
	}

	public void selectGenderOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select gender on order commercial report", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpGender, testData, "text"));
	}

	public void selectRelationTypeOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select relation type on order commercial report", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpRelationshipType, testData, "text"));
	}

	public void setPersonalPANNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal PAN number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsPAN, testData));
	}

	public void setPersonalUIDNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal UID number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsUID, testData));
	}

	public void setPersonalVoterIdNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal voter id number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsVoterId, testData));
	}

	public void setPersonalPassportNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal passport number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsPassportNumber, testData));
	}

	public void setPersonalDrivingLicenceNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal driving licence number on order commercial report",
				testData, objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsDrivingLicenceId, testData));
	}

	public void setPersonalDINNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal DIN number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsDINnumber, testData));
	}

	public void setResidentialAddressOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal residential address on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsResidensialAddress, testData));
	}

	public void selectPersonalStateOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select personal state on order commercial report", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpPersonalDetailsState, testData, "text"));
	}

	public void selectPersonalCityOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select personal city on order commercial report", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpPersonalDetailsCity, testData, "text"));
	}

	public void setPersonalPincodeOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal pincode on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsPincode, testData));
	}

	public void selectPersonalContactTypeOneOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select personal contact type for contact one on order commercial report",
				testData, objPojo.getObjWrapperFunctions().selectDropDownOption(drpPersonalDetailsContactTypeOne,
						testData, "text"));
	}

	public void selectPersonalContactTypeTwoOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select personal contact type for contact two on order commercial report",
				testData, objPojo.getObjWrapperFunctions().selectDropDownOption(drpPersonalDetailsContactTypeTwo,
						testData, "text"));
	}

	public void setPersonalSTDCodeOneOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal STD code for contact one on order commercial report",
				testData, objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsStatecodeOne, testData));
	}

	public void setPersonalSTDCodeTwoOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal STD code for contact two on order commercial report",
				testData, objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsStatecodeTwo, testData));
	}

	public void setPersonalContactNumberOneOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal first contact number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsContactNumberOne, testData));
	}

	public void setPersonalContactNumberTwoOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set personal second contact number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpPersonalDetailsContactNumberTwo, testData));
	}

	public void selectEnquiryPurposeOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select enquiry purpose on order commercial report", testData, objPojo
				.getObjWrapperFunctions().selectDropDownOption(drpPersonalDetailsEnquiryPurpose, testData, "text"));
	}

	public void selectEnquiryTypeOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Select enquiry type on order commercial report", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpPersonalDetailsEnquiryType, testData, "text"));
	}

	public void setMemberReferenceNumberOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set member reference number on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpMemberReferenceNumber, testData));
	}

	public void setLoanAmountOnOrderCommercialReports(String testData) {
		objPojo.getObjUtilities().logReporter("Set loan amount on order commercial report", testData,
				objPojo.getObjWrapperFunctions().setText(inpLoanAmountApplied, testData));
	}

	public String getCommonErrorMessageOnEnquiryOrderCommercialForm() {
		return objPojo.getObjWrapperFunctions().getText(lblEnquiryCommonErrorMsg, "text");
	}

	public String verifyIndividualFieldErrorMessageInEnquiryOrderCommercialForm(String testData) {
		By locator = By.xpath(
				"//label[starts-with(normalize-space(),'" + testData + "')]//following-sibling::field-error/div");
		return objPojo.getObjWrapperFunctions().getText(locator, "text");

	}
}
