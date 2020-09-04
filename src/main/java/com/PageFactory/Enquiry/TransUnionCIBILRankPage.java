package com.PageFactory.Enquiry;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class TransUnionCIBILRankPage {
	private Pojo objPojo;

	public TransUnionCIBILRankPage(Pojo pojo) {
		objPojo = pojo;
	}

	public void verifyRecordsDisplayedInTransUnionCibilRankPage(String indexNumber, String string2) {
		By locator = By.xpath(
				"//td[normalize-space()='TransUnion CIBIL Rank']//parent::tr//following-sibling::tr//td[contains(@class,'Value')]["
						+ indexNumber + "]//span[text()='" + string2 + "']");
		objPojo.getObjUtilities().logReporter("Verify TransUnion Cibil Rank Records Displayed on index " + indexNumber,
				string2, objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
	}
}
