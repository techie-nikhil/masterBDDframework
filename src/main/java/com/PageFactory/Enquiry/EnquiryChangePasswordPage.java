package com.PageFactory.Enquiry;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class EnquiryChangePasswordPage {

	// Links
	private By lnkEnquiryChangePassword = By.xpath("//a[contains(text(),'Change Password')]");

	// Input Fields
	private By inpEnquiryCurrentPassword = By.xpath("//input[@name='oldPassword']");
	private By inpEnquiryNewPassword = By.xpath("//input[@name='newPassword']");
	private By inpEnquiryConfirmPassword = By.xpath("//input[@name='cnfPassword']");

	// Buttons
	private By btnEnquiryChange = By.xpath("//button[contains(text(), 'Change')]");
	private By btnEnquiryReset = By.xpath("//button[contains(text(), 'Reset')]");
	private By btnEnquiryLogout = By.xpath("//button[contains(text(), 'Logout')]");

	// labels
	private By lblEnquiryCommonErrorMessage = By.xpath("//div[contains(@class,'alert-danger')]");
	private By lblEnquiryDisclaimerMessage = By
			.xpath("//label[contains(text(),'Password should be of at least 8 characters')]");
	private Pojo objPojo;

	public EnquiryChangePasswordPage(Pojo pojo) {
		objPojo = pojo;
	}

	public void setEnquiryCurrentPasswordInChangePasswordPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Current Password In Change Password Page", text,
				objPojo.getObjWrapperFunctions().setText(inpEnquiryCurrentPassword, text));
	}

	public void setEnquiryNewPasswordInChangePasswordPage(String text) {
		objPojo.getObjUtilities().logReporter("Set New Password In Change Password Page", text,
				objPojo.getObjWrapperFunctions().setText(inpEnquiryNewPassword, text));
	}

	public void setEnquiryConfirmPasswordInChangePasswordPage(String text) {
		objPojo.getObjUtilities().logReporter("Set Confirm Password In Change Password Page", text,
				objPojo.getObjWrapperFunctions().setText(inpEnquiryConfirmPassword, text));
	}

	public void clickChangeButtonInEnquiryChangePasswordPage() {
		objPojo.getObjUtilities().logReporter("Click Change Button In Change Password Page",
				objPojo.getObjWrapperFunctions().click(btnEnquiryChange));
	}

	public void clickResetButtonInEnquiryChangePasswordPage() {
		objPojo.getObjUtilities().logReporter("Click Reset Button In Change Password Page",
				objPojo.getObjWrapperFunctions().click(btnEnquiryReset));
	}

	public void clickLogoutButtonInEnquiryChangePasswordPage() {
		objPojo.getObjUtilities().logReporter("Click Reset Button In Change Password Page",
				objPojo.getObjWrapperFunctions().click(btnEnquiryLogout));
	}

	public void clickEnquiryChangePasswordLinkInLoginPage() {
		objPojo.getObjUtilities().logReporter("Click Cahnge Password Link In login Page",
				objPojo.getObjWrapperFunctions().click(lnkEnquiryChangePassword));
	}

	public String getErrorMessageForSpecificFieldOnEnquiryChangePasswordPage(String fieldName) {
		return objPojo.getObjWrapperFunctions()
				.getText(By.xpath("//label[text()='" + fieldName + " ']//following-sibling::field-error/div"), "text");
	}

	public String getCommonErrorMessageOnEnquiryChangePasswordPage() {
		return objPojo.getObjWrapperFunctions().getText(lblEnquiryCommonErrorMessage, "text");
	}

	public void verifyDisclaimerMessageOnEnquiryChangePasswordpage() {
		String testData = objPojo.getObjWrapperFunctions().getText(lblEnquiryDisclaimerMessage, "text");
		objPojo.getObjUtilities().logReporter("Fetch discailmer message on change password page : " + testData,
				!testData.equals(""));
	}
}