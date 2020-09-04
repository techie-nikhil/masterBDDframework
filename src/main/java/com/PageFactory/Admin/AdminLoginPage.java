package com.PageFactory.Admin;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class AdminLoginPage {

	// Labels
	private By lblLoginTitle = By.xpath("//span[@id='moduleName'][normalize-space()='User Admin']");
	private By lblSuccessfulLoginMessage = By.xpath("//h5[contains(text() ,'Welcome')]");
	private By lblTopErrorMessage = By.xpath("//section[@id='loginDetails']//div[contains(@class,'alert-danger')]");
	private By lblCommonErrorMessage = By.xpath("//div[@class='alert alert-danger alert-tufont']");

	// Input Fields
	private By inpUserName = By.name("loginId");
	private By inpPassword = By.name("passwd");

	// Buttons
	private By btnLoginButton = By.name("login");
	private By btnLogoutButton = By.xpath("//span[contains(text(),' Logout')]");

	private String testData;
	private Pojo objPojo;

	public AdminLoginPage(Pojo Pojo) {
		objPojo = Pojo;
	}

	public void verifyLoginPageTitle() {
		String title = objPojo.getObjWrapperFunctions().getText(lblLoginTitle, "text");
		objPojo.getObjUtilities().logReporter("Verify Login Page Title", "User Admin", title,
				"User Admin".equals(title));
	}

	public void setUserNameInAdminLoginPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set User Name in Login Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpUserName, testData));
	}

	public void setPasswordInAdminLoginPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Password in Login Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpPassword, testData));
	}

	public void clickLoginButtonOnAdminLoginPage() {
		objPojo.getObjUtilities().logReporter("Click Login Button in Login Page",
				objPojo.getObjWrapperFunctions().click(btnLoginButton));
	}

	public void verifySuccessfulLoginMessage(String message) {
		testData = objPojo.getObjWrapperFunctions().getText(lblSuccessfulLoginMessage, "message");
		objPojo.getObjUtilities().logReporter("Login message", message, testData, testData.equals(message));
	}

	public void clickLogoutButton() {
		objPojo.getObjUtilities().logReporter("Click on logout Button",
				objPojo.getObjWrapperFunctions().click(btnLogoutButton));
	}

	public void clickLoginButton() {
		objPojo.getObjUtilities().logReporter("Click on login Button",
				objPojo.getObjWrapperFunctions().click(btnLoginButton));
	}

	public void verifyLoginErrorMessage(String message) {
		testData = objPojo.getObjWrapperFunctions().getText(lblSuccessfulLoginMessage, "message");
		objPojo.getObjUtilities().logReporter("Login message", message, testData, testData.equals(message));
	}

	public void verifyErrorLoginMessage(String message) {
		testData = objPojo.getObjWrapperFunctions().getText(lblTopErrorMessage, "message");
		objPojo.getObjUtilities().logReporter("Error message", message, testData, testData.equals(message));
	}

	public void clickAdminLogoutButton() {
		objPojo.getObjUtilities().logReporter("Click on logout Button",
				objPojo.getObjWrapperFunctions().click(btnLogoutButton));
	}

	public void clickAdminLoginButton() {
		objPojo.getObjUtilities().logReporter("Click on login Button",
				objPojo.getObjWrapperFunctions().click(btnLoginButton));
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 30-July-2019
	 */

	public String getCommonErrorMessageOnLoginPage() {
		return objPojo.getObjWrapperFunctions().getText(lblCommonErrorMessage, "text");
	}

}
