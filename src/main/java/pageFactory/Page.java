package pageFactory;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class Page {
	// Input
	private By inpSearchInput = By.xpath("//input[@title='Search']");
	private By btnGoogleSearch = By.xpath("(//input[@value='Google Search'])[2]");
	private By hdrFacebookHomePage = By.xpath("//a[@title='Go to Facebook home']");
	private By inpUserName = By.xpath("//input[@type='email']");
	private By btnSignIn = By.xpath("//div[@id='identifierSignIn']");
	private Pojo objPojo;

	public Page(Pojo pojo) {
		objPojo = pojo;
	}

	public void setInputSearchFieldInGoogleHomePage(String value) {
		objPojo.getObjUtilities().logReporter("Set Input Search field in Google Home Page", value,
				objPojo.getObjWrapperFunctions().setText(inpSearchInput, value));
	}

	public void clickGoogleSearchButton() {
		objPojo.getObjUtilities().logReporter("Click Google Search Button",
				objPojo.getObjWrapperFunctions().click(btnGoogleSearch));
	}

	public void clickSpecificLinkGoogleHomePage(String linkName) {
		objPojo.getObjUtilities().logReporter("Click Specific Link",
				objPojo.getObjWrapperFunctions().click(By.xpath("//a[text()='" + linkName + "']")));
	}

	public void verifyFacebookPageDisplayedh() {
		objPojo.getObjUtilities().logReporter("Verify Facebook Page Displayed",
				objPojo.getObjWrapperFunctions().checkElementDisplayed(hdrFacebookHomePage));
	}

	public void clickSpecificSearchResultGoogleSearchPage(String linkName) {
		objPojo.getObjUtilities().logReporter("Click Specific SearchReslt Record", linkName, objPojo
				.getObjWrapperFunctions().click(By.xpath("//div[@id='search']//a//h3[text()='" + linkName + "']")));
	}

	public void setUserNameGmailLoginPage(String value) {
		objPojo.getObjUtilities().logReporter("Set Input Search field in Google Home Page", value,
				objPojo.getObjWrapperFunctions().setText(inpUserName, value));
	}

	public void clickSignInbutton() {
		objPojo.getObjUtilities().logReporter("Click Sign In Button",
				objPojo.getObjWrapperFunctions().click(btnSignIn));
	}
}
