package com.PageFactory.Enquiry;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class EnquiryOrderFormPage {
	private Pojo objPojo;
	// Labels
	private By lblEnquirySuccessfulLoginMessage = By.xpath("//h5[contains(text() ,'Welcome')]");
	// Links
	private By lnkOrderCommercialReport = By.xpath("//nav[@id='mainNav']//a[text()='Order Commercial Reports ']");
	// Inputs
	private By inpCompanyName = By.name("companyName");
	private By inpClassOfActivity = By.xpath("//input[@placeholder='Type an Activity']");
	private By inpDateOfRegistration = By.xpath("//datetime[@name='dateOfRegistration']//input");
	private By inpPAN = By.name("pan");
	private By inpRegisteredOfficeAddress = By.name("regAddressTxt1");
	private By inpPinCode = By.name("pincode");
	private By inpMemberReferenceNumber = By.name("refNumber");
	private By inpLoadAmountApplied = By.name("loanAmount");
	// Dropdowns
	private By drpTypeOfEntity = By.name("entityType");
	private By drpStateUT = By.name("state");
	private By drpCity = By.name("city");
	private By drpEnquiryPurpose = By.name("enquiryPurpose");
	private By drpEnquiryType = By.name("enquiryType");
	// Buttons
	private By btnSearch = By.xpath("//button[text()='Search']");

	public EnquiryOrderFormPage(Pojo Pojo) {
		objPojo = Pojo;
	}

	// Nikhil on 29-07-2019
	public void verifySuccessfulLoginMessageOnEnquiryHomepage() {
		objPojo.getObjUtilities().logReporter(
				"Verify User logged using message : "
						+ objPojo.getObjWrapperFunctions().getText(lblEnquirySuccessfulLoginMessage, "text"),
				objPojo.getObjWrapperFunctions().checkElementDisplayed(lblEnquirySuccessfulLoginMessage));
	}

	// Nikhil on 29-07-2019
	public void clickOrderCommercialReportLink() {
		objPojo.getObjUtilities().logReporter("Click Order Commercial Report Link",
				objPojo.getObjWrapperFunctions().click(lnkOrderCommercialReport));
	}

	// Nikhil on 29-07-2019
	public void clickSearchButtonOnOrderFormPage() {
		objPojo.getObjUtilities().logReporter("Click Search Button on Order Form Page",
				objPojo.getObjWrapperFunctions().click(btnSearch));
	}

	// Nikhil on 29-07-2019
	public void selectProductsRadioButtonsInOrderForm(String label) {
		By locator = By.xpath("//div[text()=' " + label + " ']/input");
		objPojo.getObjUtilities().logReporter("Select specific radio button on Order Form", label,
				objPojo.getObjWrapperFunctions().selectRadioButton(locator, true));
	}

	// Nikhil on 29-07-2019
	public void setCompanyNameInSearchParameterSection(String name) {
		objPojo.getObjUtilities().logReporter("Set Company Name in Search Parameter Section", name,
				objPojo.getObjWrapperFunctions().setText(inpCompanyName, name));
	}

	// Nikhil on 29-07-2019
	public void setDateOfRegistrationInSearchParameterSection(String name) {
		objPojo.getObjUtilities().logReporter("Set Date of Registration in Search Parameter Section", name,
				objPojo.getObjWrapperFunctions().setText(inpDateOfRegistration, name));
	}

	// Nikhil on 29-07-2019
	public void setPANInSearchParameterSection(String name) {
		objPojo.getObjUtilities().logReporter("Set PAN in Search Parameter Section", name,
				objPojo.getObjWrapperFunctions().setText(inpPAN, name));
	}

	// Nikhil on 29-07-2019
	public void setRegisteredOfficeAddressInSearchParameterSection(String name) {
		objPojo.getObjUtilities().logReporter("Set Registered Office Address in Search Parameter Section", name,
				objPojo.getObjWrapperFunctions().setText(inpRegisteredOfficeAddress, name));
	}

	// Nikhil on 29-07-2019
	public void setPinCodeOfficeAddressInSearchParameterSection(String name) {
		objPojo.getObjUtilities().logReporter("Set Pin-code in Search Parameter Section", name,
				objPojo.getObjWrapperFunctions().setText(inpPinCode, name));
	}

	// Nikhil on 29-07-2019
	public void setClassOfActivityInSearchParameterSection(String name) {
		objPojo.getObjUtilities().logReporter("Set Class of Activity in Search Parameter Section", name,
				objPojo.getObjWrapperFunctions().setBootStrapInputText(inpClassOfActivity, name));
	}

	// Nikhil on 29-07-2019
	public void selectTypeOfEntityInSearchParameterSection(String name) {
		objPojo.getObjUtilities().logReporter("Select Type of Entity in Search Parameter Section", name,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpTypeOfEntity, name, "text"));
	}

	// Nikhil on 29-07-2019
	public void selectStateUTInSearchParameterSection(String name) {
		objPojo.getObjUtilities().logReporter("Select State UT in Search Parameter Section", name,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpStateUT, name, "text"));
	}

	// Nikhil on 29-07-2019
	public void selectCityInSearchParameterSection(String name) {
		objPojo.getObjUtilities().logReporter("Select City in Search Parameter Section", name,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpCity, name, "text"));
	}

	// Nikhil on 29-07-2019
	public void selectEnquiryPurposeInApplicationDetailsSection(String name) {
		objPojo.getObjUtilities().logReporter("Select Enquiry Purpose in Application Details Section", name,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpEnquiryPurpose, name, "text"));
	}

	public void selectEnquiryTypeInApplicationDetailsSection(String name) {
		objPojo.getObjUtilities().logReporter("Select Enquiry Type in Application Details Section", name,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpEnquiryType, name, "text"));
	}

	// Nikhil on 29-07-2019
	public void setMemberReferenceNumberInApplicationDetailsSection(String name) {
		objPojo.getObjUtilities().logReporter("Set Member Reference Number in Application Details Section", name,
				objPojo.getObjWrapperFunctions().setText(inpMemberReferenceNumber, name));
	}

	// Nikhil on 29-07-2019
	public void setLoanAmountAppliedInApplicationDetailsSection(String name) {
		objPojo.getObjUtilities().logReporter("Set Loan Amount Applied in Application Details Section", name,
				objPojo.getObjWrapperFunctions().setText(inpLoadAmountApplied, name));
	}

}
