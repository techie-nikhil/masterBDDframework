package com.PageFactory.Enquiry;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class CommercialCreditInformationReportPage {
	private Pojo objPojo;
	private By lblCibilRankErrorMessage = By.xpath("//table//tr[@style='color: red']/td");

	public CommercialCreditInformationReportPage(Pojo Pojo) {
		objPojo = Pojo;
	}

	// Nikhil on 29-07-2019
	public String getCibilRankErrorMessageCreditInformationPage() {
		return objPojo.getObjWrapperFunctions().getText(lblCibilRankErrorMessage, "text");
	}

}
