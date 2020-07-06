package com.ordersummarypage.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.common.utils.PageConstants;
import com.pageobjects.HomePageObjects;
import com.pages.HomePage;
import com.pages.OrderSummaryPage;

public class VerifyPillowTotalInOrderSummaryTest extends BrowserUtils{

	private HomePage homePage = new HomePage();
	private OrderSummaryPage orderSummaryPage = new OrderSummaryPage();

	@Test(description = "Verify pillow totakl between Home Page and Order Summary Page")
	public void verifyPillowTotalInOrderSummary() {
		homePage.launchUrl();
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		String totalPriceInHomePage = homePage.getText(HomePageObjects.TOTALAMOUNTONHOMESCREEN);
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		String totalPriceInOrderSummaryPage = orderSummaryPage.verifyPillowTotalOnOrderSummaryPage();
		Assert.assertEquals(totalPriceInOrderSummaryPage,totalPriceInHomePage);
		orderSummaryPage.clickOnContinueBtn();
	}

}
