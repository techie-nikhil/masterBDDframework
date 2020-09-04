package com.PageFactory.Olm;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class OlmHomepage {
	//Buttons
	private By btnContinue = By.xpath("//button[@id='continue']");
	private By btnCancel = By.xpath("//button[@id='cancel']");
	private By btnViewEntry= By.xpath("//i[@title='View Borrower Details' and contains(@class,'eye')]");
	private By btnEditEntry= By.xpath("//i[@title='Edit Borrower Details' and contains(@class,'pencil')]");
	//Dropdowns
	private By drpSearchBy = By.xpath("//select[@name='searchBy']");

	//Input
	private By inpIdFieldToBeSearchedBy = By.xpath("//input[@name='searchVal']");

	//Checkbox
	private By chkRecordEntry = By.xpath("//th//input[contains(@class,'ng-untouched') and @type='checkbox']");

	private String testData;
	private Pojo objPojo;

	public OlmHomepage(Pojo Pojo) {
		objPojo = Pojo;
	}
/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	public void checkUpdateTypeOnOlmHomepage(String testData) {
		By locator = By.xpath("//label[contains(text(),'" +testData+ "')]//input");
		objPojo.getObjUtilities().logReporter("Choose update type on OLM Home Page:", testData,
				objPojo.getObjWrapperFunctions().click(locator));
	}
	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	public void clickOnContinueButtonOnOlmHomepage() {
		objPojo.getObjUtilities().logReporter("Click on continue button on OLM Home Page", objPojo.getObjWrapperFunctions().click(btnContinue));
	}
	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	public void clickOnCancelButtonOnOlmHomepage() {
		objPojo.getObjUtilities().logReporter("Click on cancel button on OLM Home Page", objPojo.getObjWrapperFunctions().click(btnCancel));
	}
	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	public void fillInputValuesForTheFieldsOnOlmHomepage(String testData) {
		By locator = By.xpath("//form[@method='post']//label[normalize-space()='" +testData+ "']//following-sibling::div/input");
		objPojo.getObjUtilities().logReporter("Fill specific values for input fields on OLM Home Page", testData,
				objPojo.getObjWrapperFunctions().setText(locator, testData));
	}
	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	public void clickOnSpecificActionToBePerformedOnSearchedEntryOlmHomepage(String testData) {
		By locator = By.xpath("//button[normalize-space()='" +testData+ "']");
		objPojo.getObjUtilities().logReporter("Click specific button on OLM Home Page", testData,
				objPojo.getObjWrapperFunctions().setText(locator, testData));
	}
	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	public void clickOnEditIconOnOlmHomepage() {
		objPojo.getObjUtilities().logReporter("Click on edit icon on OLM Home Page", objPojo.getObjWrapperFunctions().click(btnEditEntry));
	}
	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	public void clickOnViewIconOnOlmHomepage() {
		objPojo.getObjUtilities().logReporter("Click on view icon on OLM Home Page", objPojo.getObjWrapperFunctions().click(btnViewEntry));
	}
	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 17-July-2019
	 */
	public void checkRecordEntryOnOlmHomepage(String testData) {
		objPojo.getObjUtilities().logReporter("Select the entry check box on OLM Home Page on which action is to be performed",
				objPojo.getObjWrapperFunctions().selectCheckBox(chkRecordEntry, true));
	}
}
