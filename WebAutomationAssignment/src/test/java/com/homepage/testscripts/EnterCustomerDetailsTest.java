package com.homepage.testscripts;

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
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterName(configReader.getStaticProperty("name"));
		Assert.assertEquals(homePage.getNameTxtFieldValue("value"), PageConstants.USERNAME);
	}

	@Test(description = "Verify customer email on email text field")
	public void enterCustomerEmailOnShoppingCartPage() {
		enterCustomerNameOnShoppingCartPage();
		homePage.enterEmail(configReader.getStaticProperty("email"));
		Assert.assertEquals(homePage.getEmailTxtFieldValue("value"), PageConstants.EMAIL);
	}

	@Test(description = "Verify customer phone no on phone no text field")
	public void enterCustomerPhoneNoOnShoppingCartPage() {
		enterCustomerEmailOnShoppingCartPage();
		homePage.enterPhoneNo(configReader.getStaticProperty("phoneno"));
		Assert.assertEquals(homePage.getPhoneNoTxtFieldValue("value"), PageConstants.PHONENO);
	}

	@Test(description = "Verify customer city on city text field")
	public void enterCityOnShoppingCartPage() {
		enterCustomerPhoneNoOnShoppingCartPage();
		homePage.enterCity(configReader.getStaticProperty("city"));
		Assert.assertEquals(homePage.getCityTxtFieldValue("value"), PageConstants.CITY);
	}

	@Test(description = "Verify customer address on address text field")
	public void enterAddressOnShoppingCartPage() {
		enterCityOnShoppingCartPage();
		homePage.enterAddress(configReader.getStaticProperty("address"));
		Assert.assertEquals(homePage.getAddressTxtFieldValue("value"), PageConstants.ADDRESS);
	}

	@Test(description = "Verify customer postal code on postal code text field")
	public void enterPostalCodeOnShoppingCartPage() {
		enterAddressOnShoppingCartPage();
		homePage.enterPostalCode(configReader.getStaticProperty("postal_code"));
		Assert.assertEquals(homePage.getPostalCodeTxtFieldValue("value"), PageConstants.POSTALCODE);
	}

}
