package com.homepage.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.common.utils.PageConstants;
import com.pages.HomePage;

public class EnterCustomerDetailsAndCheoutOutTest extends BrowserUtils {

	private HomePage homePage = new HomePage();

	@Test(description = "Enter customer details and checout out")
	public void enterCustomerDetailsAndCheckOut() {
		homePage.launchUrl();
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
		boolean flag = homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		Assert.assertEquals(flag, true);
	}

}
