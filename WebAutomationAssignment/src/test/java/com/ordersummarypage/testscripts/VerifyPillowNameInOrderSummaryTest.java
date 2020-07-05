package com.ordersummarypage.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.common.utils.PageConstants;
import com.pages.HomePage;
import com.pages.OrderSummaryPage;

public class VerifyPillowNameInOrderSummaryTest extends BrowserUtils{

	private HomePage homePage = new HomePage();
	private OrderSummaryPage orderSummaryPage = new OrderSummaryPage();

	@Test
	public void verifyPillowNameInOrderSummary() {
		homePage.launchUrl();
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		String pillowTitleInHomePage = homePage.verifyPillowTitle();
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrame();
		String pillowTitleInOrderSummaryPage = orderSummaryPage.verifyPillowNameInOrderSummaryPage();
		Assert.assertEquals(pillowTitleInOrderSummaryPage, pillowTitleInHomePage);
	}

}
