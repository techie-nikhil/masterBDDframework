package com.stepDefinition.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import com.generics.BaseTest;
import com.generics.Pojo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonConfigurationStepDefination {
	private Pojo objPojo;
	private String testData;

	// Constructor
	public CommonConfigurationStepDefination(BaseTest pojo) {
		objPojo = pojo.initializeWebEnvironment();
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 19-July-2019
	 */
	@When("Navigate To Specific Portal : {string}")
	public void navigate_To_Specific_Portal(String string) {
		objPojo.getObjWrapperFunctions().loadBaseURL(string);
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 19-July-2019
	 */
	@After
	public void tearDown(Scenario scenario) {
		((BaseTest) objPojo).tearDownWebEnvironment(scenario);
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 19-July-2019
	 */
	@Before
	public void initializeScenario(Scenario scenario) {
		objPojo.setTestCaseID(scenario.getName());
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Verify Latest Downloaded File Name as {string}")
	public void verify_Latest_Downloaded_File_Name_as(String string) {
		String testData = objPojo.getObjWrapperFunctions().getLatestDownloadedFileName();
		objPojo.getObjUtilities().logReporter("Verify Latest Downloaded File Name", string, testData,
				testData.contains(string));
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Click {string} button for {string} PopUp")
	public void click_button_for_Confirmation_PopUp(String string, String string2) {
		By locator = By.xpath("//p[contains(text(),'" + string2
				+ "')]/ancestor::div[@id='confAlertModal']//button[text()='" + string + "']");
		objPojo.getObjUtilities().logReporter("Click " + string + " Button on " + string2,
				objPojo.getObjWrapperFunctions().click(locator));
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Verify {string} button Displayed for {string} PopUp")
	public void Verify_button_Displayed_for_Confirmation_PopUp(String string, String string2) {
		By locator = By.xpath("//p[contains(text(),'" + string2
				+ "')]/ancestor::div[@id='confAlertModal']//button[text()='" + string + "']");
		objPojo.getObjUtilities().logReporter("Verify " + string + " Button Displayed on " + string2,
				objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Read {string} Workbook")
	public void Read_WorkBook(String string) {
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\AllDocs\\" + string;
		try {
			objPojo.setDataValidator((XSSFWorkbook) WorkbookFactory.create(new FileInputStream(filePath)));
			objPojo.getObjUtilities().logReporter("Read Specific Excel File : ", string, true);
		} catch (IOException e) {
			e.printStackTrace();
			objPojo.getObjUtilities().logReporter("Read Specific Excel File : ", string, false);
		}
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Set Runtime Data {string} in Row No {string} and Column No {string} for Sheet {string}")
	public void Set_Runtime_Data_in_Row_No_and_Column_No_for_Sheet(String string, String string1, String string2,
			String string3) {
		testData = objPojo.getObjUtilities().dpString(string);
		objPojo.getObjUtilities().logReporter(
				"Set value in Row No " + string1 + " and Column No " + string2 + " in Sheet " + string3, testData,
				objPojo.getObjWrapperFunctions().setValidatorSheetData(testData, string3, string1, string2));
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Set {string} in Row No {string} and Column No {string} for Sheet {string}")
	public void Set_in_Row_No_and_Column_No_for_Sheet(String string, String string1, String string2, String string3) {
		if (string.contains("dynamic")) {
			string = string.replace("dynamic", objPojo.getObjUtilities()
					.getRandomNumbers(Integer.parseInt("" + string.split("dynamic")[1].charAt(0))));
		}
		objPojo.getObjUtilities().logReporter(
				"Set value in Row No " + string1 + " and Column No " + string2 + " in Sheet " + string3, string,
				objPojo.getObjWrapperFunctions().setValidatorSheetData(string, string3, string1, string2));
	}

	/**
	 * @author : Nikhil Kumar Agarwal
	 * @Date of Creation : 09-July-2019
	 */
	@Then("Save {string} Workbook")
	public void Save_Workbook(String string) {
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\AllDocs\\" + string;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filePath);
			objPojo.getDataValidator().write(fileOutputStream);
			fileOutputStream.flush();
			fileOutputStream.close();
			objPojo.getObjUtilities().logReporter("Save Specific Excel File : ", filePath, true);
		} catch (Exception ex) {
			ex.printStackTrace();
			objPojo.getObjUtilities().logReporter("Save Specific Excel File : ", filePath, false);
		}
	}
}
