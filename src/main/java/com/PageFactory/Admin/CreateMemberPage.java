package com.PageFactory.Admin;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import com.generics.Pojo;

public class CreateMemberPage {

	// input
	private By inpMemberCode = By.xpath("//input[@id='memberCode']");
	private By inpName = By.xpath("//input[@id='memberName']");
	private By inpShortName = By.xpath("//input[@id='shortname']");
	private By inpAddress1 = By.xpath("//input[@id='addLine1']");
	private By inpAddress2 = By.xpath("//input[@id='addLine2']");
	private By inpPinCode = By.xpath("//input[@id='pincode']");
	private By inpTelephone = By.xpath("//input[@id='telephone']");
	private By inpFaxNumber = By.xpath("//input[@id='fax']");
	private By inpContactName = By.xpath("//input[@id='contactName']");
	private By inpEmailID = By.xpath("//input[@id='email']");
	// dropdown
	private By drpMemberKOB = By.xpath("//select[@id='memberKob']");
	private By drpMemberGrouping = By.xpath("//select[@id='memberGrouping']");
	private By drpAddOns = By.xpath("//select[@id='addOns']");
	private By drpMemberStatus = By.xpath("//select[@id='memberStatus']");
	private By drpState = By.xpath("//select[@id='state']");
	private By drpCity = By.xpath("//select[@id='city']");
	// button
	private By btnSave = By.xpath("//button[contains(text() ,'Save')]");
	private By btnReset = By.xpath("//button[contains(text() ,'Reset')]");
	private By btnConfirmOk = By.xpath("//button[@id='createAttrSet']");
	private By btnAddAnother = By.id("modifyAttrSet");
	// Labels
	private By lblSuccessMessage = By.xpath("//div[@id='confAlertModal']//p");
	private By lblMemberTitle = By.xpath("//h3[contains(text(),'Add new member')]");
	private By lblCommonErrorMessage = By.xpath("//div[contains(@class,'alert-danger')]");
	// Checkbox
	private By chkCERSubscribe = By.xpath("//input[@ng-reflect-name='subscribe1']");
	private String testData;
	private Pojo objPojo;

	public CreateMemberPage(Pojo pojo) {
		objPojo = pojo;
	}

	public void setMemberNameInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Name in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpName, testData));
	}

	public void setShortNameInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Short Name in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpShortName, testData));
	}

	public void setMemberCodeInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Member Code in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpMemberCode, testData));
	}

	public void setAddress1InMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Address 1 in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpAddress1, testData));
	}

	public void setAddress2InMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Address 2 in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpAddress2, testData));
	}

	public void setPinCodeInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Pin Code in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpPinCode, testData));
	}

	public void setTelephoneNumberInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Telephone in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpTelephone, testData));
	}

	public void setFaxNumberInMembercreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Fax Number in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpFaxNumber, testData));
	}

	public void setContactNameInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Contact Number in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpContactName, testData));
	}

	public void setEmailIDInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Email Number in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpEmailID, testData));
	}

	public void setMemberKOBInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Member KOB in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpMemberKOB, testData, "text"));
	}

	public void setMemberGroupingInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Member Grouping in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpMemberGrouping, testData, "text"));
	}

	public void setAddOnInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Add Ons in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpAddOns, testData, "text"));
	}

	public void setMemberAccessStatusInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Member Status in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpMemberStatus, testData, "text"));

	}

	public void setStateInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set State in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpState, testData, "text"));
	}

	public void setCityInMemberCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set City in Create Member Page", testData,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpCity, testData, "text"));
	}

	public void clickSaveButtonOnMemberCreationPage() {
		objPojo.getObjUtilities().logReporter("Click Save Button on Member Creation Page",
				objPojo.getObjWrapperFunctions().click(btnSave));
	}

	// public void clickConfirmationPopUpOKButton() {
	// objPojo.getObjUtilities().logReporter("Click Confirmation PopUp OK Button",
	// objPojo.getObjWrapperFunctions().click(btnConfirmOk));
	// }
	//
	// public void clickSuccessPopUpOKButton() {
	// objPojo.getObjUtilities().logReporter("Click Success PopUp OK Button",
	// objPojo.getObjWrapperFunctions().click(btnConfirmOk));
	// }

	public void verifyCreatedMemberCodeAndCapture() {
		String RuntimeUserName = objPojo.getObjWrapperFunctions().getText(lblSuccessMessage, "text").split("-")[0];
		objPojo.getObjUtilities().logReporter("Verify Created User Name : " + RuntimeUserName,
				!RuntimeUserName.equals(""));
		objPojo.getObjUtilities().setDataPool("RuntimeUserName", RuntimeUserName);
	}

	public void verifyMemberCreationPageDisplayed() {
		String MemberTitle1 = objPojo.getObjWrapperFunctions().getText(lblMemberTitle, "text");
		objPojo.getObjUtilities().logReporter("Verify Member Page Title", "Add new member", MemberTitle1,
				"Add new member".equals(MemberTitle1));
	}

	public String getErrorMessageForSpecificField(String fieldName) {
		By locator = By.xpath(
				"//label[starts-with(normalize-space(),'" + fieldName + "')]//following-sibling::field-error/div");
		return objPojo.getObjWrapperFunctions().getText(locator, "text");
	}

	public String getCommonErrorMessageOnMemberCreationPage() {
		return objPojo.getObjWrapperFunctions().getText(lblCommonErrorMessage, "text");
	}

	public void verifySelectedValueForMemberGroupingDropDown(String option) {
		testData = objPojo.getObjWrapperFunctions().getSelectedValueFromDropDown(drpMemberGrouping);
		objPojo.getObjUtilities().logReporter("Verify Selected value for Member Grouping", option, testData,
				testData.equals(option));
	}

	public void verifyValueForAddress1Field(String option) {
		testData = objPojo.getObjWrapperFunctions().getText(inpAddress1, "value");
		objPojo.getObjUtilities().logReporter("Verify value for Address 1", option, testData, testData.equals(option));
	}

	public void verifyValueForAddress2Field(String option) {
		testData = objPojo.getObjWrapperFunctions().getText(inpAddress2, "value");
		objPojo.getObjUtilities().logReporter("Verify value for Address 2", option, testData, testData.equals(option));
	}

	// Created By vikash
	public void clickMemberCreationResetButton() {
		objPojo.getObjUtilities().logReporter("Click Reset Button", objPojo.getObjWrapperFunctions().click(btnReset));
	}

	public void MemberCreationAddAnotherButtononSuccessPopUpButton() {
		objPojo.getObjUtilities().logReporter("Click Add Another Button",
				objPojo.getObjWrapperFunctions().click(btnAddAnother));
	}

	public void verifyAddAnotherMemberCreationPageDisplayed() {
		String AddAnother = objPojo.getObjWrapperFunctions().getText(btnAddAnother, "text");
		objPojo.getObjUtilities().logReporter("Verify Add Another Button on Member Creation", "Add Another", AddAnother,
				"Add Another".equals(AddAnother));
	}

	public void verifySuccessOKMemberCreationPageDisplayed() {
		objPojo.getObjUtilities().logReporter(
				"Verify Ok button Displayed on Success popup in memberCreation Page Title",
				objPojo.getObjWrapperFunctions().checkElementDisplayed(btnConfirmOk));
	}

	public String getConfirmationMessageMemberCreation() {
		return objPojo.getObjWrapperFunctions().getText(lblSuccessMessage, "text");
	}

	public void verifyValueForContactNameField(String option) {
		testData = objPojo.getObjWrapperFunctions().getText(inpContactName, "value");
		objPojo.getObjUtilities().logReporter("Verify value for Contact Name", option, testData,
				testData.equals(option));
	}

	public void verifyValueForEmailIdField(String option) {
		testData = objPojo.getObjWrapperFunctions().getText(inpEmailID, "value");
		objPojo.getObjUtilities().logReporter("Verify value for Contact Name", option, testData,
				testData.equals(option));
	}

	public void verifyValueForDropdownStateField(String option) {
		testData = objPojo.getObjWrapperFunctions().getSelectedValueFromDropDown(drpState);
		objPojo.getObjUtilities().logReporter("Verify value for Contact Name", option, testData,
				testData.equals(option));
	}

	public void verifyValueForDropdownCityField(String option) {
		testData = objPojo.getObjWrapperFunctions().getSelectedValueFromDropDown(drpCity);
		objPojo.getObjUtilities().logReporter("Verify value for Contact Name", option, testData,
				testData.equals(option));
	}

	public void verifyPasswordExpiryMessageOnHomepage() {
		String testData = objPojo.getObjWrapperFunctions()
				.getText(By.xpath("//div[@class='headerNavs']//span[contains(text(),'Password will expire')]"), "text");
		objPojo.getObjUtilities().logReporter("Verify Password Will Expire Error Message as : " + testData,
				!testData.equals(""));
	}

	//// 26-07-2019 Saurabh////
	public void selectAddOnOptionalCheckBox(String testData) {
		By locator = By.xpath("//td[contains(text(),'" + testData + "')]//following::input[1]");
		objPojo.getObjUtilities().logReporter("Select Optional checkbox",
				objPojo.getObjWrapperFunctions().click(locator));
	}

	public void selectAddOnMandatoryCheckBox(String testData) {
		By locator = By.xpath("//td[contains(text(),'" + testData + "')]//following::input[2]");
		objPojo.getObjUtilities().logReporter("Select Mandatory checkbox",
				objPojo.getObjWrapperFunctions().click(locator));
	}

	//// 31-07-2019 Saurabh////
	public void deselectAddOnOptionalCheckBox(String testData) {
		By locator = By.xpath("//td[contains(text(),'" + testData + "')]//following::input[1]");
		objPojo.getObjUtilities().logReporter("Deselect Optional checkbox",
				objPojo.getObjWrapperFunctions().click(locator));
	}

	public void deselectAddOnMandatoryCheckBox(String testData) {
		By locator = By.xpath("//td[contains(text(),'" + testData + "')]//following::input[2]");
		objPojo.getObjUtilities().logReporter("Deselect Mandatory checkbox",
				objPojo.getObjWrapperFunctions().click(locator));
	}

	public void readExcelData(String testData, String RowNumber, String Colno, String FilePath) {
		XSSFWorkbook workbook = null;
		try {
			objPojo.getObjWrapperFunctions().waitFor(2);
			FileInputStream fis = new FileInputStream(objPojo.getDownloadPath() + FilePath);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(Integer.parseInt(RowNumber) - 1);
		Cell cell = row.getCell(Integer.parseInt(Colno) - 1);
		String cellval = cell.getStringCellValue();
		objPojo.getObjUtilities().logReporter("Verify the error message from excel sheet as", testData, cellval,
				testData.trim().equals(cellval));

	}

	/// 05-08-2019 Saurabh////

	public void checkWhetherAddOnCheckboxIsSelected() {
		objPojo.getObjUtilities().logReporter("Verify whether checkbox is selected",
				objPojo.getObjWrapperFunctions().checkElementSelected(chkCERSubscribe));
	}
}
