package com.PageFactory.Admin;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class ChangePasswordAndValidationPage {
	// Links
	private By lnkChangePassword = By.xpath("//span[contains(text(),'Change Password')]");

	// Input Fields
	private By inpCurrentPassword = By.xpath("//input[@name='oldPassword']");
	private By inpNewPassword = By.xpath("//input[@name='newPassword']");
	private By inpConfirmPassword = By.xpath("//input[@name='cnfPassword']");

	// Buttons
	private By btnChange = By.xpath("//button[contains(text(), 'Change')]");
	private By btnReset = By.xpath("//button[contains(text(), 'Reset')]");
	private By btnLogout = By.xpath("//button[contains(text(), 'Logout')]");
	private By btnLogoutHomePage = By.xpath("//span[contains(text(),' Logout')]");
	private By lblCommonErrorMessage = By.xpath("//div[contains(@class,'alert-danger')]");
	private Pojo objPojo;

	public ChangePasswordAndValidationPage(Pojo pojo) {
		objPojo = pojo;
	}

	public void setCurrentPasswordInChangePasswordPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Current Password In Change Password Page", text,
				objPojo.getObjWrapperFunctions().setText(inpCurrentPassword, text));
	}

	public void setNewPasswordInChangePasswordPage(String text) {
		objPojo.getObjUtilities().logReporter("Set New Password In Change Password Page", text,
				objPojo.getObjWrapperFunctions().setText(inpNewPassword, text));
	}

	public void setConfirmPasswordInChangePasswordPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Confirm Password In Change Password Page", text,
				objPojo.getObjWrapperFunctions().setText(inpConfirmPassword, text));
	}

	public void clickChangeButtonInChangePasswordPage() {
		objPojo.getObjUtilities().logReporter("Click Change Button In Change Password Page",
				objPojo.getObjWrapperFunctions().click(btnChange));
	}

	public void clickResetButtonInChangePasswordPage() {
		objPojo.getObjUtilities().logReporter("Click Reset Button In Change Password Page",
				objPojo.getObjWrapperFunctions().click(btnReset));
	}

	public void clickLogoutButtonInChangePasswordPage() {
		objPojo.getObjUtilities().logReporter("Click Reset Button In Change Password Page",
				objPojo.getObjWrapperFunctions().click(btnLogout));
	}

	public void clickChangePasswordLinkInLoginPage() {
		objPojo.getObjUtilities().logReporter("Click Cahnge Password Link In login Page",
				objPojo.getObjWrapperFunctions().click(lnkChangePassword));
	}

	public String getErrorMessageForSpecificField(String fieldName) {
		return objPojo.getObjWrapperFunctions()
				.getText(By.xpath("//label[text()='" + fieldName + " ']//following-sibling::field-error/div"), "text");
	}
	
	public void clickLogoutButtonInHomepage() {
		objPojo.getObjUtilities().logReporter("Click Logout Button In Homepage",
				objPojo.getObjWrapperFunctions().click(btnLogoutHomePage));
	}

	public String getCommonErrorMessageOnChangePasswordPage() {
		return objPojo.getObjWrapperFunctions().getText(lblCommonErrorMessage, "text");
	}
}