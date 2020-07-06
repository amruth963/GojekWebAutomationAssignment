package com.ordersummarypage.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
		AssertJUnit.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		String totalPriceInHomePage = homePage.getText(HomePageObjects.TOTALAMOUNTONHOMESCREEN);
		AssertJUnit.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		String totalPriceInOrderSummaryPage = orderSummaryPage.verifyPillowTotalOnOrderSummaryPage();
		AssertJUnit.assertEquals(totalPriceInOrderSummaryPage,totalPriceInHomePage);
		orderSummaryPage.clickOnContinueBtn();
	}

}
