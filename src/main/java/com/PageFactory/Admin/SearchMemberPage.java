package com.PageFactory.Admin;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class SearchMemberPage {
	// Inputs
	private By inpMemberCodeSearch = By.id("memberId");
	private By inpMemberNameSearch = By.id("memberName");
	private By inpMemberShortNameSearch = By.id("shortname");
	private By inpEditShortName = By.xpath("//form[@name='maintainMemberForm']//input[@id='shortname']");
	private By inpEditName = By.xpath("//form[@name='maintainMemberForm']//input[@id='memberName']");

	// Buttons
	private By btnSearchMember = By.xpath("//button[text()='Search']");
	private By btnViewclose = By.xpath("//div[@id='dashboardBtns']//button[contains(text(), 'Close')]");
	private By btnAleartOk = By.xpath("//div[@class='blrTxt']//button[@id='createAttrSet']");
	private By btnUpdationOk = By.xpath("//div[@id='dlgBtns']//button[@id='createAttrSet']");
	private By btnPopUpSave = By.xpath(
			"//fieldset[@id='maintainUserFormFields']//div[@id='dashboardBtns']/button[normalize-space()='Save']");
	private By btnMemberView = By.xpath("//i[@title='View Member']");
	private By btnMemberEdit = By.xpath("//i[@title='Edit Member']");
	private By btnReset = By.xpath("//button[text()='Reset']");
	private By btnResetViewModifyPopUp = By.xpath("//div[@id='viewModifyMember']//button[text()='Reset']");

	// Labels
	private By lblCommonErrorMessage = By.xpath("//div[@class='alert alert-danger alert-tufont']");
	private By lblSearchmemberTitle = By.xpath("//h3[contains(text(),'Member Search Criteria')]");
	private By lblResultMembercode = By.xpath("//table[@id='attrsetsearch']//tbody//tr//td[4]");
	private By lblResultMemberName = By.xpath("//table[@id='attrsetsearch']//tbody//tr//td[5]");

	// Dropdowns
	private By drpMemberAccessStatusSearch = By.id("memberStatus");
	private Pojo objPojo;
	private String testData;

	public SearchMemberPage(Pojo pojo) {
		objPojo = pojo;
	}

	public void setMemberCodeInSearchMemberPage(String testData) {
		testData = testData + objPojo.getObjUtilities().dpString("RuntimeCreatedMember");
		objPojo.getObjUtilities().logReporter("Set Member Code in Member Search Field", testData,
				objPojo.getObjWrapperFunctions().setText(inpMemberCodeSearch, testData));
	}

	public void clickSearchButtonOnMemberSearchPage() {
		objPojo.getObjUtilities().logReporter("Click Member Search Button",
				objPojo.getObjWrapperFunctions().click(btnSearchMember));
	}

	public void verifySpecificDataInResultTable(String string) {
		objPojo.getObjUtilities().logReporter("Verify Table Displayed with details as :", string,
				objPojo.getObjWrapperFunctions()
						.checkElementDisplayed(By.xpath("//table[@id='attrsetsearch']//td[text()='" + string + "']")));
	}

	public void verifyRuntimeDataInResultTable(String testData) {
		objPojo.getObjUtilities().logReporter("Verify Table Displayed with details as :", testData,
				objPojo.getObjWrapperFunctions().checkElementDisplayed(
						By.xpath("//table[@id='attrsetsearch']//td[text()='" + testData + "']")));
	}

	// Created By : Vikash on 09-July-2019
	public void setMemberNameInSearchMemberPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set MemberName in Search Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpMemberNameSearch, testData));
	}

	public void setMemberShortNameInSearchMemberPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Short Name in Search Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpMemberShortNameSearch, testData));
	}

	public void setMemberAccessStatusInSearchMemberPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Member Access Status in Search Member Page", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpMemberAccessStatusSearch, testData));
	}

	public void clickSearchMemberPageEditbutton() {
		objPojo.getObjUtilities().logReporter("Click Search Member  in Search Member Page",
				objPojo.getObjWrapperFunctions().click(btnMemberEdit));
	}

	public void clickSearchMemberPageViewbutton() {
		objPojo.getObjUtilities().logReporter("Click View button in Search Member Page",
				objPojo.getObjWrapperFunctions().click(btnMemberView));
	}

	public void clickSearchMemberPageResetbutton() {
		objPojo.getObjUtilities().logReporter("Click on Reset button Search Member Page",
				objPojo.getObjWrapperFunctions().click(btnReset));
	}

	public void clickonSearchMemberPagePopUpSavebutton() {
		objPojo.getObjUtilities().logReporter("Click popup Save in Search Member Page",
				objPojo.getObjWrapperFunctions().click(btnPopUpSave));
	}

	public void clickonSearchMemberPageUpdationPopupbbutton() {
		objPojo.getObjUtilities().logReporter("Click Updation Popup  in Search Member Page",
				objPojo.getObjWrapperFunctions().click(btnUpdationOk));
	}

	public void clickonSearchMemberPageSuccessfullyUpdatedAleartOkbutton() {
		objPojo.getObjUtilities().logReporter("Click Update Alert Popup in Search Member Page",
				objPojo.getObjWrapperFunctions().click(btnAleartOk));
	}

	public void verifyMemberCodeSearchMemberPage(String option) {
		testData = objPojo.getObjWrapperFunctions().getText(lblResultMembercode, "text");
		objPojo.getObjUtilities().logReporter("Verify Member code In Search Member Page", option, testData,
				testData.equals(option));
	}

	public void verifyMemberNameSearchMemberPage(String option) {
		testData = objPojo.getObjWrapperFunctions().getText(lblResultMemberName, "text");
		objPojo.getObjUtilities().logReporter("Verify Member Name In Search Member Page", option, testData,
				testData.equals(option));
	}

	public void verifySearchMemberPageTitle() {
		String title = objPojo.getObjWrapperFunctions().getText(lblSearchmemberTitle, "Text");
		objPojo.getObjUtilities().logReporter("Verify Search Member Page Title", "Member Search Criteria", title,
				"Member Search Criteria".equals(title));
	}

	public void setNameInSearchMemberEditpopupPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Name in Search Member Edit Popup Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpEditName, testData));
	}

	public void verifyEditPopUpMemberNameSearchMemberPage(String option) {
		testData = objPojo.getObjWrapperFunctions().getText(inpEditName, "value");
		objPojo.getObjUtilities().logReporter("Verify Edit Member name In Search Member Page", option, testData,
				testData.equals(option));
	}

	public void verifyEditPopUpMemberShortNameSearchMemberPage(String option) {
		testData = objPojo.getObjWrapperFunctions().getText(inpEditShortName, "value");
		objPojo.getObjUtilities().logReporter("Verify Edit Member Short Name In Search Member Page", option, testData,
				testData.equals(option));
	}

	public void clickonSearchMemberPageViewPopUpClosebutton() {
		objPojo.getObjUtilities().logReporter("Click view Popup close button in Search Member Page",
				objPojo.getObjWrapperFunctions().click(btnViewclose));
	}

	public String getCommonErrorMessageOnSearchMemberPage() {
		return objPojo.getObjWrapperFunctions().getText(lblCommonErrorMessage, "text");
	}

	// Created By Nikhil on 25-July-2019
	public void clickResetButtonOnViewModifyMemberPopUp() {
		objPojo.getObjUtilities().logReporter("Click Reset Button On View / Modify Member PopUp",
				objPojo.getObjWrapperFunctions().click(btnResetViewModifyPopUp));
	}
}
