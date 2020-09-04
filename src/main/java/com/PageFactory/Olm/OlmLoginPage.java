package com.PageFactory.Olm;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class OlmLoginPage {
	//Labels
	private By lblOlmLoginTitle = By.xpath("//span[@id='applicationName'][normalize-space()='CIBIL OLM']");
	private By lblOlmSuccessfulLoginMessage = By.xpath("//h5[contains(text() ,'Welcome')]");
	private By lblOlmErrorLoginMessage = By.xpath("//div[contains(@class,'alert-danger')]");
	private By lblserviceunavailableError = By.xpath("//div[@class='maintenanceMessage']");
	
	//Input Fields
	private By inpOlmUserName = By.name("loginId");
	//private By inpOlmPassword = By.name("passwd");
////30-07-2019 Saurabh////
	private By inpOlmPassword = By.name("password");

	// Buttons
	private By btnOlmLoginButton = By.name("login");
	private By btnOlmLogoutButton = By.xpath("//span[contains(text(),' Logout')]");

	private String testData;
	private Pojo objPojo;

	public OlmLoginPage(Pojo Pojo) {
		objPojo = Pojo;
	}


	public void verifyOlmLoginPageTitle() {
		String title = objPojo.getObjWrapperFunctions().getText(lblOlmLoginTitle, "text");
		objPojo.getObjUtilities().logReporter("Verify OLM Login Page Title", "CIBIL OLM", title,
				"CIBIL OLM".equals(title));
	}

	public void setUserNameInOlmLoginPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set User Name in OLM Login Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpOlmUserName, testData));
	}

	public void setPasswordInOlmLoginPage(String testData) {
		objPojo.getObjUtilities().logReporter("Set Password in OLM Login Page", testData,
				objPojo.getObjWrapperFunctions().setText(inpOlmPassword, testData));
	}

	public void clickLoginButtonOnOlmLoginPage() {
		objPojo.getObjUtilities().logReporter("Click Login Button in OLM Login Page",
				objPojo.getObjWrapperFunctions().click(btnOlmLoginButton));
	}
	public void verifySuccessfulLoginMessageOnOlmHomepage(String message) {
		testData = objPojo.getObjWrapperFunctions().getText(lblOlmSuccessfulLoginMessage, "message");
		objPojo.getObjUtilities().logReporter("Successful Login Message", message, testData, testData.equals(message));
	}

	public void clickOlmLogoutButton() {
		objPojo.getObjUtilities().logReporter("Click on OLM logout button",
				objPojo.getObjWrapperFunctions().click(btnOlmLogoutButton));
	}

////29-07-2019 Saurabh////

	public void verifyOlmErrorLoginMessageOnOlmHomepage(String message) {
		testData = objPojo.getObjWrapperFunctions().getText(lblOlmErrorLoginMessage, "message");
		objPojo.getObjUtilities().logReporter("Error Login Message", message, testData, testData.equals(message));
	}
	
	/**
	 * @author : vikash thakur
	 * @Date of Creation : 30-July-2019
	 */
	public void verifyserviceunavailableLoginErrorMessageOnOlmHomepage(String message) {
	testData = objPojo.getObjWrapperFunctions().getText(lblserviceunavailableError, "message");
	objPojo.getObjUtilities().logReporter("Error Login Message", message, testData, testData.equals(message));
}

}