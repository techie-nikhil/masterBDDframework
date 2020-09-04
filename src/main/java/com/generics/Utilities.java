package com.generics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.qameta.allure.Attachment;

/**
 * @ScriptName : Utilities
 * @Description : This class contains utilities function
 * @Author : Nikhil Kumar Agarwal - AQM Technologies
 */
public class Utilities {
	private Pojo objPojo;

	public Utilities(Pojo pojo) {
		this.objPojo = pojo;
	}

	/**
	 * @Method : logReporter
	 * @Description : Reporter method
	 * @param :
	 *            Step - Step description, resultLog - result log pass/fail
	 *            (true/false), includeMobile - result for mobile(true/false)
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	// @Step("{0}")

	public void logReporter(String step, boolean resultLog) {
		String strLog = step;
		this.addAssertTakeScreenShot(step, strLog, "", "", "", resultLog);
	}

	/**
	 * @Method : logReporter
	 * @Description : Reporter method
	 * @param :
	 *            Step - Step description, inputValue - Input value, resultLog -
	 *            result log pass/fail (true/false), includeMobile - result for
	 *            mobile(true/false)
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	// @Step("{0} - {1}")
	public void logReporter(String step, String inputValue, boolean resultLog) {
		String strLog = step + " || Input Value : " + inputValue;
		this.addAssertTakeScreenShot(step, strLog, inputValue, "", "", resultLog);
	}

	/**
	 * @Method : logReporter
	 * @Description : Reporter method
	 * @param :
	 *            Step - Step description, expectedValue - verification point
	 *            expected value, actualValue - verification point actual value,
	 *            resultLog - result log pass/fail (true/false), includeMobile -
	 *            result for mobile(true/false)
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	// @Step("{0} - {1} - {2}")
	public void logReporter(String step, String expectedValue, String actualValue, boolean resultLog) {
		String strLog = step + " || Expected Result : " + expectedValue + " || Actual Result : " + actualValue;
		this.addAssertTakeScreenShot(step, strLog, "", expectedValue, actualValue, resultLog);
	}

	/**
	 * @Method : addAssertTakeScreenShot
	 * @Description :
	 * @param :
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	public void addAssertTakeScreenShot(String step, String strLog, String inputValue, String expectedValue,
			String actualValue, boolean resultLog) {
		System.out.println(objPojo.getTestCaseID() + "--> " + strLog);
		Logger logger = Logger.getLogger(Utilities.class);
		if (resultLog) {
			Reporter.log("Step Description--> " + strLog);
			logger.info("Step Description--> " + objPojo.getTestCaseID() + "-->" + strLog);
			Assert.assertTrue(true, "Step Description--> " + objPojo.getTestCaseID() + strLog);
		} else {
			String fileName = getDateInSpecifiedFormat("dd_MMM_yyyy_HH_mm_ss") + "_TCID_" + objPojo.getTestCaseID()
					+ ".png";
			String fileWithPath = Pojo.reportPath + "/custom-reports/surefire-reports/ScreenShot/"
					+ fileName;
			Reporter.log("Step Description--> " + strLog);
			logger.error("Step Description--> " + objPojo.getTestCaseID() + "-->" + strLog);
			logger.error("Failure URl :-------------> " + objPojo.getTestCaseID() + "-->"
					+ objPojo.getDriver().getCurrentUrl());
			System.out.println("URl :-------------> " + objPojo.getDriver().getCurrentUrl());
			this.takeScreenShot(objPojo.getDriver(), fileWithPath);
			objPojo.setTestFailedStep(step);
			Assert.assertTrue(false, "Step Description--> " + strLog);
		}
	}

	/**
	 * @Method : takeScreenShot
	 * @Description : Take Screen shot for given web driver.
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 * 
	 */
	public boolean takeScreenShot(WebDriver webDriver, String fileWithPath) {
		TakesScreenshot scrShot = ((TakesScreenshot) webDriver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(fileWithPath);
		try {
			FileUtils.moveFile(srcFile, destFile);
			this.fileToByte(destFile);
			return true;
		} catch (IOException iOException) {
			iOException.printStackTrace();
			return false;

		}
	}

	/**
	 * @Method : getDateInSpecifiedFormat
	 * @Description : This method takes parameter of your required DateFormat Type
	 *              Like: dd-mm-YYYY DD.MM.YYYY and in return it will give you
	 *              today's date in specified date format
	 * @param :
	 *            dateFormat like : dd-MM-YYYY
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 **/
	public String getDateInSpecifiedFormat(String dateFormat) {
		String current_date = "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		current_date = formatter.format(today);
		return current_date;
	}

	/**
	 * @Method : fileToByte
	 * @Description : Converts image file to byte array for allure.
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 * @throws :
	 *             IOException
	 */
	@Attachment(value = "Screenshot", type = "image/png")
	public byte[] fileToByte(File file) throws IOException {
		if (file != null)
			return Files.readAllBytes(Paths.get(file.getPath()));
		else
			return new byte[0];
	}

	/**
	 * Generate random string
	 * 
	 * @return String random string value
	 */
	public String getRandomString(int lenght) {
		String allowedChars = "abcdefghiklmnopqrstuvwxyz";
		String randomstring = "";
		for (int i = 0; i < lenght; i++) {
			int rnum = (int) Math.floor(Math.random() * allowedChars.length());
			randomstring += allowedChars.substring(rnum, rnum + 1);
		}
		return randomstring.toUpperCase();
	}

	/**
	 * Generate random string with numbers
	 * 
	 * @return String random string value
	 */
	public String getRandomNumbers(int length) {
		String allowedChars = "1234567890";
		String randomstring = "";
		for (int i = 0; i < length; i++) {
			int rnum = (int) Math.floor(Math.random() * allowedChars.length());
			randomstring += allowedChars.substring(rnum, rnum + 1);
		}
		return randomstring;
	}

	/**
	 * Generate random string with numbers
	 * 
	 * @return String random string value
	 */
	public String getRandomNumbers(String generator) {
		int length = Integer.parseInt(generator.toLowerCase().replace("dynamic", ""));
		String allowedChars = "1234567890";
		String randomstring = "";
		for (int i = 0; i < length; i++) {
			int rnum = (int) Math.floor(Math.random() * allowedChars.length());
			randomstring += allowedChars.substring(rnum, rnum + 1);
		}
		return randomstring;
	}

	/**
	 * @author Nikhil Kumar Agarwal - AQM Technologies
	 * @Description : Use Below Method to get Random Number for Specific Range
	 */
	public int getRandomNumbersWithinRange(int minimumLimt, int maximumLimit) {
		try {
			Random rand = new Random();
			return rand.nextInt((maximumLimit - minimumLimt) + 1) + minimumLimt;
		} catch (Exception exception) {
			objPojo.setCustomException("Developer Side Issue");
			exception.printStackTrace();
			return 0;
		}
	}

	/**
	 * 
	 * NOTE : If you want future date : Pass No of Future day 's value as positive
	 * int i.e. 5 If you want Back date : Pass No of Future day 's value as Negative
	 * . i.e. -5
	 * 
	 * @Method : getFutureDateInSpecifiedFormat
	 * 
	 * @Description : This method takes parameter of your required DateFormat Type
	 * Like: dd-mm-YYYY OR DD.MM.YYYY and in return it will give you Future date in
	 * specified date format
	 * 
	 * @param1 : dateFormat like : dd-MM-YYYY
	 * 
	 * @param2 : No Of Future Day from now
	 * 
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 * 
	 * i.e. : if you call getFutureDateInSpecifiedFormat("DD-MM-YYYY",5) then it
	 * will return future date (current date + next 5 days)
	 * 
	 * NOTE : If you want future date : Pass No of Future day 's value as positive
	 * int i.e. 5 If you want Back date : Pass No of Future day 's value as Negative
	 * . i.e. -5
	 * 
	 */
	public String getFutureOrBackDateInSpecifiedFormat(String dateFormat, int NoOfFutureDay) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, NoOfFutureDay);
		String futureDate = new SimpleDateFormat(dateFormat).format(c.getTime()).toString();
		return futureDate;
	}

	/**
	 * @Method: dpString
	 * @Description: this method returns data from the the previously loaded
	 *               datapool
	 * @param columnHeader
	 *            - excel file header column name
	 * @return - value for corresponding header
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	public String dpString(String columnHeader) {
		try {
			if (objPojo.getObjHashTable().get(columnHeader) == null)
				return "";
			else {
				return objPojo.getObjHashTable().get(columnHeader).trim();
			}
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

	/**
	 * @Method: dpInteger
	 * @Description: this method returns data from the the previously loaded
	 *               datapool
	 * @param columnHeader
	 *            - excel file header column name
	 * @return - value for corresponding header
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 * 
	 */
	public Integer dpInteger(String columnHeader) {
		try {
			if (objPojo.getObjHashTable().get(columnHeader) == null)
				return 0;
			else {
				String value = objPojo.getObjHashTable().get(columnHeader).trim();
				StringTokenizer strTokenizer = new StringTokenizer(value, ".");
				value = strTokenizer.nextToken();
				return Integer.parseInt(value);
			}
		} catch (NoSuchElementException exception) {
			return 0;
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

	/**
	 * @Method: setDataPool
	 * @Description: this method returns data from the the previously loaded
	 *               setDataPool
	 * @param columnHeader
	 *            - excel file header column name
	 * @return - value for corresponding header
	 * @Author : Nikhil Kumar Agarwal - AQM Technologies
	 */
	public void setDataPool(String Key, String value) {
		try {
			objPojo.getObjHashTable().put(Key, value);
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 30-July-2019
	 * @return - ramdom values with alpha numeric values with special characters
	 */

	public String getRandomNumbers1(String generator) {
		int length = Integer.parseInt(generator.toLowerCase().replace("dynamic", ""));
		String allowedChars = "abcdefghijklmnopqrstuvxyz@#*$1234567890";
		String randomstring = "";
		for (int i = 0; i < length; i++) {
			int rnum = (int) Math.floor(Math.random() * allowedChars.length());
			randomstring += allowedChars.substring(rnum, rnum + 1);
		}
		return randomstring;
	}

	/**
	 * @author : Vikash Thakur
	 * @Date of Creation : 30-July-2019
	 * @return - ramdom values with alpha numeric values with special characters
	 */

	public String getRandomNumbers11(String generator) {
		int length = Integer.parseInt(generator.toLowerCase().replace("dynamic", ""));
		String allowedChars = "abcdefghijklmnopqrstuvxyz@#*$1234567890";
		String randomstring = "";
		for (int i = 0; i < length; i++) {
			int rnum = (int) Math.floor(Math.random() * allowedChars.length());
			randomstring += allowedChars.substring(rnum, rnum + 1);
		}
		return randomstring;
	}
}
