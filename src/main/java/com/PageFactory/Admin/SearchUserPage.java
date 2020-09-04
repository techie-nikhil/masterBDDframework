package com.PageFactory.Admin;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class SearchUserPage {
	// Input
	private By inpUserID = By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid']");
	private By inpCity = By
			.xpath("//input[@class='form-control typeEntry typeahead-input ng-untouched ng-pristine ng-valid']");
	// Checkbox
	private By chckboxAll = By.xpath("//input[@value='all']");
	private By chckboxLocked = By.xpath("//input[@value='locked']");
	private By chckboxUnLocked = By.xpath("//input[@value='unlocked']");
	private By chckboxDisabled = By.xpath("//input[@value='disabled']");
	private By chckboxEnabled = By.xpath("//input[@value='enabled']");
	private By chckboxUserEntry = By.xpath("//td//input[contains(@class,'ng-untouched') and @type='checkbox']");
	// Buttons
	private By btnSearch = By.xpath("//button[contains(text() ,'Search')]");
	private By btnEditUser = By.xpath("//span/i[@class='fa fa-lg fa-pencil']");
	private By btnViewUser = By.xpath("//i[contains(@class,'eye')]");
	private By btnUpdate = By.xpath("//button[contains(text(),'Update')]");
	private By btnStatusChangeConfirmation = By.xpath("//button[contains(text(),'YES')]");
	private By btnExcelExport = By.xpath("//i[@title='Export as Excel']");
	private By btnCsvExport = By.xpath("//i[@title='Export as CSV']");
	// Dropdowns
	private By drpStatusToBeChanged = By.xpath("//select[@id='selectBox']");
	private By chckboxAllUserId = By.xpath("//th//input[contains(@class,'ng-untouched') and @type='checkbox']");
	// Labels
	private By lblUserEntryColour = By.xpath("//tr[@class='blurBack']");
	private By lblLockedUnlockedResult = By.xpath("//table[@id='attrsetsearch']//tbody//tr[1]//td[13]");
	private By lblEnabledDisabledResult = By.xpath("//table[@id='attrsetsearch']//tbody//tr[1]//td[14]");
	private Pojo objPojo;
	private String testData;

	public SearchUserPage(Pojo pojo) {
		objPojo = pojo;
	}

	public void setUserCodeInSearchUserPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set User Code in User Search Field", testData,
				objPojo.getObjWrapperFunctions().setText(inpUserID, testData));
	}

	public void clickSearchButtonOnUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click User Search Button",
				objPojo.getObjWrapperFunctions().click(btnSearch));
	}

	public void verifyRuntimeDataInUserIdResultTable(String testData) {
		testData = testData + objPojo.getObjUtilities().dpString("RuntimeCreatedUser");
		objPojo.getObjUtilities().logReporter("Verify Table Displayed with details as :", testData,
				objPojo.getObjWrapperFunctions().checkElementDisplayed(
						By.xpath("//table[@id='attrsetsearch']//td[text()='" + testData + "']")));
	}

	public void verifyStatusResultTable(String testData) {
		By locator = By.xpath("//table[@id='attrsetsearch']//td[text()='" + testData + "']");
		objPojo.getObjUtilities().logReporter("Verify status for Field : " + testData,
				objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
	}

	public void clickonAllUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on All User Search Page",
				objPojo.getObjWrapperFunctions().click(chckboxAll));
	}

	public void clickonLockedUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on Locked User Search Page",
				objPojo.getObjWrapperFunctions().click(chckboxLocked));
	}

	public void clickonDisabledUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on Disabled User Search Page",
				objPojo.getObjWrapperFunctions().click(chckboxDisabled));
	}

	public void clickonUnlockedUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on Unlocked User Search Page",
				objPojo.getObjWrapperFunctions().click(chckboxUnLocked));
	}

	public void clickonEnabledUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on Enabled User Search Page",
				objPojo.getObjWrapperFunctions().click(chckboxEnabled));
	}

	public String getErrorMessageForSpecificField(String fieldName) {
		return objPojo.getObjWrapperFunctions()
				.getText(By.xpath("//label[text()='" + fieldName + "']//following-sibling::field-error/div"), "text");
	}

	public void verifyRuntimeDataInResultTable(String testData) {
		objPojo.getObjUtilities().logReporter("Verify Table Displayed with details as :", testData,
				objPojo.getObjWrapperFunctions().checkElementDisplayed(
						By.xpath("//table[@id='attrsetsearch']//td[text()='" + testData + "']")));
	}

	public void setCityInUserSearchPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set City in User Search Field", testData,
				objPojo.getObjWrapperFunctions().setText(inpCity, testData));
	}

	public void clickUpdateIconOnUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on update user on user search page",
				objPojo.getObjWrapperFunctions().click(btnEditUser));
	}

	public void verifyFirstNameResultTable(String testData) {
		testData = objPojo.getObjUtilities().dpString("RuntimeCreatedFirstName");
		By locator = By.xpath("//table[@id='attrsetsearch']//td[text()='" + testData + "']");
		objPojo.getObjUtilities().logReporter("Verify firstname for Field : " + testData,
				objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
	}

	public void verifyLastNameResultTable(String testData) {
		By locator = By.xpath("//table[@id='attrsetsearch']//td[text()='" + testData + "']");
		objPojo.getObjUtilities().logReporter("Verify firstname for Field : " + testData,
				objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
	}

	public void clickViewIconOnUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on view user on user search page",
				objPojo.getObjWrapperFunctions().click(btnViewUser));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Updated By : Shwetha on 18-07-2019
	 */
	public void verifyNameResultTable(String testData) {
		By locator = By.xpath("//table[@id='attrsetsearch']//td[text()='" + testData + "']");
		objPojo.getObjUtilities().logReporter("Verify name for Field : " + testData,
				objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
	}

	public void checkOnUserEntryDisplayedOnUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Check on user entry checkbox on user search page",
				objPojo.getObjWrapperFunctions().click(chckboxUserEntry));
	}

	public void selectStatusToBeChangedOnUserSearchPage(String text) {
		objPojo.getObjUtilities().logReporter("Select status to be changed on user search Page", text,
				objPojo.getObjWrapperFunctions().selectDropDownOption(drpStatusToBeChanged, text, "text"));
	}

	public void clickUpdateButtonOnUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on update button on user search page",
				objPojo.getObjWrapperFunctions().click(btnUpdate));
	}

	public void clickConfirmStatusOnUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on confirm status on user search page",
				objPojo.getObjWrapperFunctions().click(btnStatusChangeConfirmation));
	}

	public void clickExportExcelOnUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on Export Excel user search page",
				objPojo.getObjWrapperFunctions().click(btnExcelExport));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Updated By : Shwetha on 26-07-2019
	 */

	public void checkOnMainCheckboxForAllUserIdsOnUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Check on main checkbox for all user ids on user search page",
				objPojo.getObjWrapperFunctions().click(chckboxAllUserId));
	}

	public void verifyColorForUserEntryOnUserSearchPage(String testData, String colour) {
		testData = objPojo.getObjWrapperFunctions().getAttribute(lblUserEntryColour, "class");
		objPojo.getObjUtilities().logReporter("Verify color for disabled user entry on user search page ", colour,
				testData, testData.trim().equals(colour.trim()));
	}

	public void clickExportCsvOnUserSearchPage() {
		objPojo.getObjUtilities().logReporter("Click on CSV Excel on user search page",
				objPojo.getObjWrapperFunctions().click(btnCsvExport));
	}

	/**
	 * @author : Vikash Thakur
	 * @Created Date :05-08-2019
	 */
	public void verifyLockedUnlockedStatusOnUserSearchResultPage(String testData1) {
		testData = objPojo.getObjWrapperFunctions().getText(lblLockedUnlockedResult, "text");
		objPojo.getObjUtilities().logReporter("verify Locked/Unlocked Status On User Search Result Page", testData,
				testData1, testData.trim().equals(testData1));
	}

	/**
	 * @author : Vikash Thakur
	 * @Created Date :05-08-2019
	 */
	public void verifyEnabledDisabledStatusOnUserSearchResultPage(String testData1) {
		testData = objPojo.getObjWrapperFunctions().getText(lblEnabledDisabledResult, "text");
		objPojo.getObjUtilities().logReporter("verify Enabled/Disabled Status On User Search Result Page", testData,
				testData1, testData.trim().equals(testData1));
	}

}
