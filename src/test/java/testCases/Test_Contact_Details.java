package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Contact_PageObjects;

public class Test_Contact_Details extends CommonFunctions {

	@Test
	public void checkContactButton() {
		PageFactory.initElements(driver, Contact_PageObjects.class);

		Contact_PageObjects.contactButton.click();

		String actualMessege = Contact_PageObjects.checkAddress.getText();

		Assert.assertEquals(actualMessege,
				"***Expected Text***");
		driver.navigate().back();

	}
}
