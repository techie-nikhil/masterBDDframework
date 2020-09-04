package com.PageFactory.Enquiry;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class EnquiryLoginPage {

	// Labels
	private By lblEnquiryLoginTitle = By.xpath("//span[@id='moduleName'][normalize-space()='Enquiry']");
	private By lblEnquirySuccessfulLoginMessage = By.xpath("//h5[contains(text() ,'Welcome')]");
	private By lblEnquiryTopErrorMessage = By
			.xpath("//section[@id='loginDetails']//div[contains(@class,'alert-danger')]");
	private By lbldisclaimerAlert = By.xpath("//span[@class='displayAlert']");
	// Input Fields
	private By inpEnquiryUserName = By.name("loginId");
	private By inpEnquiryPassword = By.name("passwd");

	// Buttons
	private By btnEnquiryLoginButton = By.name("login");
	private By btnEnquiryLogoutButton = By.xpath("//div//a[contains(text(),' Logout')]");
	private String testData;
	private Pojo objPojo;

	public EnquiryLoginPage(Pojo Pojo) {
		objPojo = Pojo;
	}

	public void verifyEnquiryLoginPageTitle() {
		String title = objPojo.getObjWrapperFunctions().getText(lblEnquiryLoginTitle, "text");
		objPojo.getObjUtilities().logReporter("Verify Enquiry Login Page Title", "Enquiry", title,
				"Enquiry".equals(title));
	}

	public void setUserNameInEnquiryLoginPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set User Name in Enquiry Login Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpEnquiryUserName, testData));
	}

	public void setPasswordInEnquiryLoginPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Password in Enquiry Login Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpEnquiryPassword, testData));
	}

	public void clickLoginButtonOnEnquiryLoginPage() {
		objPojo.getObjUtilities().logReporter("Click Login Button in Enquiry Login Page",
				objPojo.getObjWrapperFunctions().click(btnEnquiryLoginButton));
	}

	public void verifySuccessfulLoginMessageOnEnquiryHomepage(String message) {
		testData = objPojo.getObjWrapperFunctions().getText(lblEnquirySuccessfulLoginMessage, "message");
		objPojo.getObjUtilities().logReporter("Successful Login Message", message, testData, testData.equals(message));
	}

	public void clickEnquiryLogoutButton() {
		objPojo.getObjUtilities().logReporter("Click on enquiry logout button",
				objPojo.getObjWrapperFunctions().click(btnEnquiryLogoutButton));
	}

	public void verifyEnquiryErrorLoginMessage(String message) {
		testData = objPojo.getObjWrapperFunctions().getText(lblEnquiryTopErrorMessage, "message");
		objPojo.getObjUtilities().logReporter("Login Error message", message, testData, testData.equals(message));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 30-July-2019
	 */
	public void clickOnOrderCommercial(String testData) {
		By locator = By.xpath("//a[contains(text(),'" + testData + "')]");
		objPojo.getObjUtilities().logReporter("Click on the following tab:", testData,
				objPojo.getObjWrapperFunctions().click(locator));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 31-July-2019
	 */
	public void checkWhetherDisclaimerMessageIsNotPresent() {
		objPojo.getObjUtilities().logReporter("Verify whether disclaimer message is not present on the login page",
				!objPojo.getObjWrapperFunctions().checkElementDisplayed(lbldisclaimerAlert));
	}

	/**
	 * @author : Shwetha Talapanty
	 * @Date of Creation : 30-July-2019
	 * @Updated on : 06- August-2019
	 */
	public void clickOnSpecificTabOnEnquiryHomepage(String testData) {
		By locator = By.xpath("//a[contains(text(),'" + testData + "')]");
		objPojo.getObjUtilities().logReporter("Click on the following tab on enquiry homepage", testData,
				objPojo.getObjWrapperFunctions().click(locator));
	}
}
