package com.homepage.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.common.utils.ConfigReader;
import com.common.utils.PageConstants;
import com.pages.HomePage;

public class EnterCustomerDetailsTest extends BrowserUtils{

	private HomePage homePage = new HomePage();
	private ConfigReader configReader = new ConfigReader();

	@Test(description = "Verify customer name on name text field")
	public void enterCustomerNameOnShoppingCartPage() {
		homePage.launchUrl();
		AssertJUnit.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		AssertJUnit.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterName(configReader.getStaticProperty("name"));
		AssertJUnit.assertEquals(homePage.getNameTxtFieldValue("value"), PageConstants.USERNAME);
	}

	@Test(description = "Verify customer email on email text field")
	public void enterCustomerEmailOnShoppingCartPage() {
		enterCustomerNameOnShoppingCartPage();
		homePage.enterEmail(configReader.getStaticProperty("email"));
		AssertJUnit.assertEquals(homePage.getEmailTxtFieldValue("value"), PageConstants.EMAIL);
	}

	@Test(description = "Verify customer phone no on phone no text field")
	public void enterCustomerPhoneNoOnShoppingCartPage() {
		enterCustomerEmailOnShoppingCartPage();
		homePage.enterPhoneNo(configReader.getStaticProperty("phoneno"));
		AssertJUnit.assertEquals(homePage.getPhoneNoTxtFieldValue("value"), PageConstants.PHONENO);
	}

	@Test(description = "Verify customer city on city text field")
	public void enterCityOnShoppingCartPage() {
		enterCustomerPhoneNoOnShoppingCartPage();
		homePage.enterCity(configReader.getStaticProperty("city"));
		AssertJUnit.assertEquals(homePage.getCityTxtFieldValue("value"), PageConstants.CITY);
	}

	@Test(description = "Verify customer address on address text field")
	public void enterAddressOnShoppingCartPage() {
		enterCityOnShoppingCartPage();
		homePage.enterAddress(configReader.getStaticProperty("address"));
		AssertJUnit.assertEquals(homePage.getAddressTxtFieldValue("value"), PageConstants.ADDRESS);
	}

	@Test(description = "Verify customer postal code on postal code text field")
	public void enterPostalCodeOnShoppingCartPage() {
		enterAddressOnShoppingCartPage();
		homePage.enterPostalCode(configReader.getStaticProperty("postal_code"));
		AssertJUnit.assertEquals(homePage.getPostalCodeTxtFieldValue("value"), PageConstants.POSTALCODE);
	}

}
