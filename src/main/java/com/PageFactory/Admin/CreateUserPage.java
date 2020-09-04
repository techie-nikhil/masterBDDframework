package com.PageFactory.Admin;

import java.util.ArrayList;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class CreateUserPage {
	// Labels
	private By lbSuccessMessage = By.xpath("//p[@id='success']");
	private By lbSuccessfulUserUpdationMsg = By.xpath("//div//p[@id='success']");
	private By lbBlankPageErrorMsg = By.xpath("//div[contains(@class,'alert-danger')]");
	private By lbPasswordExpireUserUpdateMsg = By.xpath("//p[contains(@class,'passExpInfo')]");
	// Dropdowns
	private By drpMemberKob = By.name("kob");
	private By drpMemberBase = By.name("base");
	private By drpMemberCode = By.xpath("//select[@name='code']");
	private By drpState = By.name("state");
	private By drpCity = By.name("city");
	private By drpProductSubscription = By.id("roles");

	// Inputs
	private By inpFirstName = By.xpath("//input[@id='firstName']");
	private By inpLastName = By.xpath("//input[@id='lastName']");
	private By inpUserId = By.xpath("//input[@id='userid']");
	private By inpAddress1 = By.xpath("//input[@id='addressLine1']");
	private By inpAddress2 = By.xpath("//input[@id='addressLine2']");
	private By inpPincode = By.xpath("//input[@id='postalCode']");
	private By inpEmailAddress = By.xpath("//input[@id='mail']");
	private By inpTelephone = By.xpath("//input[@id='telephoneNumber']");
	private By inpFaxNumber = By.xpath("//input[@id='fax']");
	private By inpPassword = By.xpath("//input[@id='userPassword']");

	// Checkbox
	private By chkLock = By.xpath("//input[@name='locked']");
	private By chkDisable = By.xpath("//input[@name='enabled']");
	private By chkForceToChange = By.xpath("//input[@name='pwdReset']");
	private By chkArchivedUserUpdate = By.xpath("//input[@name='archived']");

	// Buttons
	private By btnGeneratePassword = By.xpath("//button[contains(text(),'Generate Password')]");
	private By btnSave = By.xpath("//button[contains(text() ,'Save')]");
	private By btnReset = By.xpath("//button[contains(text() ,'Reset')]");
	private By btnConfirmOk = By.xpath("//button[@id='createAttrSet']");
	private By btnCreateAnother = By.xpath("//button[@id='modifyAttrSet']");
	private By btnUserUpdationConfirmOk = By
			.xpath("//button[@class='focusButton btn btn-secondary btn-lg shadow-secondary']");
	private By btnCanceluserUpdate = By.xpath("//button[@class='btn btn-primary btn-lg shadow']");
	private By btnCloseUserUpdate = By.xpath("//div[@id='viewModify']//button[@class='close'][@data-dismiss='modal']");

	private By btnResetUpdateUserPage = By.xpath("//button[contains(text() ,'Save')]//following::button[1]");
	private Pojo objPojo;

	public CreateUserPage(Pojo pojo) {
		objPojo = pojo;
	}

	public void selectMemberKOBInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Select Member KOB in User Creation Page", text,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpMemberKob, text, "text"));
	}

	public void selectMemberBaseInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Select Member Base in User Creation Page", text,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpMemberBase, text, "text"));
	}

	public void selectMemberCodeInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Select Member Code in User Creation Page", text,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpMemberCode, text, "text"));
	}

	public void setFirstNameInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Set First Name in User Creation Page", text,
				objPojo.getObjWrapperFunctions().setText(inpFirstName, text));
	}

	public void setLastNameInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Last Name in User Creation Page", text,
				objPojo.getObjWrapperFunctions().setText(inpLastName, text));
	}

	public void selectUserLockCheckBox() {
		objPojo.getObjUtilities().logReporter("Select User Lock Checkbox",
				objPojo.getObjWrapperFunctions().selectCheckBox(chkLock, true));
	}

	public void deselectUserLockCheckBox() {
		objPojo.getObjUtilities().logReporter("Deselect User Lock Checkbox",
				objPojo.getObjWrapperFunctions().selectCheckBox(chkLock, false));
	}

	public void selectUserDisableCheckBox() {
		objPojo.getObjUtilities().logReporter("Select User Disable Checkbox",
				objPojo.getObjWrapperFunctions().selectCheckBox(chkDisable, true));
	}

	public void deselectUserDisableCheckBox() {
		objPojo.getObjUtilities().logReporter("Deselect User Disable Checkbox",
				objPojo.getObjWrapperFunctions().selectCheckBox(chkDisable, false));
	}

	public void selectUserForceToChangeCheckBox() {
		objPojo.getObjUtilities().logReporter("Select Force to Change Checkbox",
				objPojo.getObjWrapperFunctions().selectCheckBox(chkForceToChange, true));
	}

	public void deselectUserForceToChangeCheckBox() {
		objPojo.getObjUtilities().logReporter("Deselect Force to Change Checkbox",
				objPojo.getObjWrapperFunctions().selectCheckBox(chkForceToChange, false));
	}

	public void setAddress1InUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Address 1 in User Creation Page", text,
				objPojo.getObjWrapperFunctions().setText(inpAddress1, text));
	}

	public void setAddress2InUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Address 2 in User Creation Page", text,
				objPojo.getObjWrapperFunctions().setText(inpAddress2, text));
	}

	public void selectStateUTInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Select State/UT in User Creation Page", text,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpState, text, "text"));
	}

	public void selectCityInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Select City in User Creation Page", text,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpCity, text, "text"));
	}

	public void setPinCodeInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Pin Code in User Creation Page", text,
				objPojo.getObjWrapperFunctions().setText(inpPincode, text));
	}

	public void setEmailInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Email in User Creation Page", text,
				objPojo.getObjWrapperFunctions().setText(inpEmailAddress, text));
	}

	public void setTelephoneInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Telephone in User Creation Page", text,
				objPojo.getObjWrapperFunctions().setText(inpTelephone, text));
	}

	public void setFaxNumberInUserCreationPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Fax Number in User Creation Page", text,
				objPojo.getObjWrapperFunctions().setText(inpFaxNumber, text));
	}

	public void clickGeneratePasswordButtonUserCreationPage() {
		objPojo.getObjUtilities().logReporter("Click Generate Password button in User Creation Page",
				objPojo.getObjWrapperFunctions().click(btnGeneratePassword));
	}

	public void clickSaveButtonOnUserCreationPage() {
		objPojo.getObjUtilities().logReporter("Click Save Button on User Creation Page",
				objPojo.getObjWrapperFunctions().click(btnSave));
	}

	public void clickResetButtonOnUserCreationPage() {
		objPojo.getObjUtilities().logReporter("Click Reset Button on User Creation Page",
				objPojo.getObjWrapperFunctions().click(btnReset));
	}

	public void selectProductSubscriptionInUserCreationPage(String option) {
		objPojo.getObjUtilities().logReporter("Select Product Subscription in User Creation Page", option,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpProductSubscription, option, "text"));
	}

	public void clickOKButtonOnUserCreationPageConfirmPopUp() {
		objPojo.getObjUtilities().logReporter("Click Ok Button on User Creation Page Confirm PopUp",
				objPojo.getObjWrapperFunctions().click(btnConfirmOk));
	}

	public void clickOKButtonOnUserCreationPageSuccessPopUp() {
		objPojo.getObjUtilities().logReporter("Click Ok Button on User Creation Page Success PopUp",
				objPojo.getObjWrapperFunctions().click(btnConfirmOk));
	}

	public String getCommonErrorInUserCreationPage() {
		return objPojo.getObjWrapperFunctions().getText(lbBlankPageErrorMsg, "text");
	}

	public String getErrorMessageForSpecificField(String fieldName) {
		By locator = By.xpath(
				"//label[starts-with(normalize-space(),'" + fieldName + "')]//following-sibling::field-error/div");
		return objPojo.getObjWrapperFunctions().getText(locator, "text");
	}

	public String getUserCreationSuccessPopUpMessage() {
		objPojo.getObjWrapperFunctions().checkElementDisplayed(lbSuccessMessage);
		return objPojo.getObjWrapperFunctions().getText(lbSuccessMessage, "text");
	}

	public void clickCreateAnotheruserButtonSuccessPopUpUserCreationPageConfirmPopUp() {
		objPojo.getObjUtilities().logReporter("Click Create another User Button on Success Popup",
				objPojo.getObjWrapperFunctions().click(btnCreateAnother));
	}

	public void setUserCodeInUserCreationPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set User Code in Create User Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpUserId, testData));
	}

	public String getCommonErrorMessageOnUserCreationPage() {
		return objPojo.getObjWrapperFunctions().getText(lbBlankPageErrorMsg, "text");
	}

	public String getErrorMessageForSpecificUserField(String fieldName) {
		By locator = By.xpath(
				"//label[starts-with(normalize-space(),'" + fieldName + "')]//following-sibling::field-error/div");
		return objPojo.getObjWrapperFunctions().getText(locator, "text");
	}

	public void verifyCreatedUserCodeAndCapture() {
		String RuntimeUserName = objPojo.getObjWrapperFunctions().getText(lbSuccessMessage, "text").split("-")[0];
		objPojo.getObjUtilities().logReporter("Verify Created User Name : " + RuntimeUserName,
				!RuntimeUserName.equals(""));
		objPojo.getObjUtilities().setDataPool("RuntimeUserName", RuntimeUserName);
	}

	public void clickCreateAnotherUserButton() {
		objPojo.getObjUtilities().logReporter("Click Create Another User Button",
				objPojo.getObjWrapperFunctions().click(btnCreateAnother));
	}

	public void verifyArchivedCheckbox(String testData) {
		By locator = By.xpath("//div[contains(text(),'" + testData + "')]");
		objPojo.getObjUtilities().logReporter("Verify archived checkbox: " + testData,
				objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
	}

	public String getSuccessfulUserupdationMessage() {
		return objPojo.getObjWrapperFunctions().getText(lbSuccessfulUserUpdationMsg, "text");
	}

	public void clickOKButtonOnUserUpdatePageConfirmPopUp() {
		objPojo.getObjUtilities().logReporter("Click Ok Button on User Update Page Confirm PopUp",
				objPojo.getObjWrapperFunctions().click(btnUserUpdationConfirmOk));
	}

	public void clickOKButtonOnUserUpdatePageSuccessPopUp() {
		objPojo.getObjUtilities().logReporter("Click Ok Button on User Update Page Success PopUp",
				objPojo.getObjWrapperFunctions().click(btnUserUpdationConfirmOk));
	}

	public void clickCancelButtonOnUserUpdatePageConfirmPopUp() {
		objPojo.getObjUtilities().logReporter("Click Cancel Button on User Update Page Confirm PopUp",
				objPojo.getObjWrapperFunctions().click(btnCanceluserUpdate));
	}

	public void clickCloseIconOnUserUpdatePageConfirmPopUp() {
		objPojo.getObjUtilities().logReporter("Click Close icon on User Update Page",
				objPojo.getObjWrapperFunctions().click(btnCloseUserUpdate));
	}

	public String verifyPasswordExpireMessageOnUserUpdatePage() {
		return objPojo.getObjWrapperFunctions().getText(lbPasswordExpireUserUpdateMsg, "text");
	}

	public void selectUserEnabledCheckBox() {
		objPojo.getObjUtilities().logReporter("Select User Enabled Checkbox on User update page",
				objPojo.getObjWrapperFunctions().selectCheckBox(chkDisable, true));
	}

	public String verifyIndividualFieldOnUserUpdatePage(String testData) {
		By locator = By.xpath("//label[contains(text(),'" + testData + "')]//following::input[1]");
		return objPojo.getObjWrapperFunctions().getText(locator, "value");
	}

	public void clickResetButtonOnUserUpdatePage() {
		objPojo.getObjUtilities().logReporter("Click Reset Button on User Update Page",
				objPojo.getObjWrapperFunctions().click(btnResetUpdateUserPage));

	}

	public void clickArchivedChechboxInUserUpdatePage() {
		objPojo.getObjUtilities().logReporter("Select User Archived Checkbox on User update page",
				objPojo.getObjWrapperFunctions().selectCheckBox(chkArchivedUserUpdate, true));
	}

	public String verifyIndividualDropdownFieldOnUserUpdatePage(String testData) {
		By locator = By.xpath("//label[contains(text(),'" + testData + "')]//following::select[1]");
		return objPojo.getObjWrapperFunctions().getSelectedValueFromDropDown(locator);
	}

	public void checkCityDropDownisDisabled() {
		objPojo.getObjUtilities().logReporter("Verify whether city dropdown is disabled",
				!objPojo.getObjWrapperFunctions().checkElementEnabled(drpCity));
	}

	public void checkCityDropDownIsEnabled() {
		objPojo.getObjUtilities().logReporter("Verify whether city dropdown is enabled",
				objPojo.getObjWrapperFunctions().checkElementEnabled(drpCity));
	}

	public void verifyOptionSelectedIsMappedToState(String city) {
		objPojo.getObjUtilities().logReporter("Verify whether city belongs to state selected",
				objPojo.getObjWrapperFunctions().verifyDropdownOptionValues(drpCity, (city)));

	}

	public void checkWhetherCheckboxIsSelected() {
		objPojo.getObjUtilities().logReporter("Verify whether checkbox is selected",
				objPojo.getObjWrapperFunctions().checkElementSelected(chkArchivedUserUpdate));
	}

	public void setEmailSameAsDisabledUserInUserCreationPage(String testData) {
		testData = objPojo.getObjUtilities().dpString("RuntimeCreatedEmail");
		objPojo.getObjUtilities().logReporter("Set Email same as disabled in User Creation Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpEmailAddress, testData));
	}

	/**
	 * @author : vikash thakur
	 * @Date of Creation : 30-July-2019
	 */
	public void verifySelectedValueForProductSubscriptionInUserCreationPage(String option) {
		ArrayList<String> ReturnList = objPojo.getObjWrapperFunctions()
				.getAllSelectedValueFromDropDown(drpProductSubscription);
		objPojo.getObjUtilities().logReporter("Verify Selected value for Member Grouping" + "", option,
				ReturnList.toString(), ReturnList.contains(option));
	}

	public void DeselectProductSubscriptionInUserCreationPage(String option) {
		objPojo.getObjUtilities().logReporter("Deselect Product Subscription in User Creation Page", option,
				objPojo.getObjWrapperFunctions().deSelectDropDownOption(drpProductSubscription, option, "text"));
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

	/**
	 * @author : vikash thakur
	 * @Date of Creation : 01-Aug-2019
	 */
	public void verifyGeneratedPassword() {
		objPojo.getObjWrapperFunctions().waitFor(2);
		String testData = objPojo.getObjWrapperFunctions().getText(inpPassword, "value");
		objPojo.getObjUtilities().logReporter("Verify temp password generated : " + testData, !testData.equals(""));
		objPojo.getObjUtilities().setDataPool("RuntimeCreatedGenratedPassword", testData);
	}

	public void deselectCheckboxForcetochangepasswordinusersearchpage() {
		objPojo.getObjUtilities().logReporter("Click on update user on user search page",
				objPojo.getObjWrapperFunctions().click(chkForceToChange));
	}

}
