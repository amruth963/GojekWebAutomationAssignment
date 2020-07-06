package com.ordersummarypage.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.common.utils.PageConstants;
import com.pages.HomePage;
import com.pages.OrderSummaryPage;

public class VerifyCustomerDetailsInOrderSummaryTest extends BrowserUtils{

	private HomePage homePage = new HomePage();
	private OrderSummaryPage orderSummaryPage = new OrderSummaryPage();

	@Test
	public void verifyCustomerNameInOrderSummary() {
		homePage.launchUrl();
		AssertJUnit.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		AssertJUnit.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		orderSummaryPage.clickOnShippingDetailsTab();
		if(orderSummaryPage.getShippingDetailsValue().contains(PageConstants.USERNAME)) {
			System.out.println("User name "+PageConstants.USERNAME+" is displayed");
		}else {
			AssertJUnit.fail("User name "+PageConstants.USERNAME+" is not displayed");
		}
	}	

	@Test
	public void verifyCustomerEmailInOrderSummary() {
		homePage.launchUrl();
		AssertJUnit.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		AssertJUnit.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		orderSummaryPage.clickOnShippingDetailsTab();
		if(orderSummaryPage.getShippingDetailsValue().contains(PageConstants.EMAIL)) {
			System.out.println("User email "+PageConstants.EMAIL+" is displayed");
		}else {
			AssertJUnit.fail("User email "+PageConstants.EMAIL+" is not displayed");
		}
	}	

	@Test
	public void verifyCustomerPhoneNoInOrderSummary() {
		homePage.launchUrl();
		AssertJUnit.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		AssertJUnit.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		orderSummaryPage.clickOnShippingDetailsTab();
		if(orderSummaryPage.getShippingDetailsValue().contains(PageConstants.PHONENO)) {
			System.out.println("User phone no "+PageConstants.PHONENO+" is displayed");
		}else {
			AssertJUnit.fail("User phone no "+PageConstants.PHONENO+" is not displayed");
		}
	}	

	@Test
	public void verifyCustomerAddressInOrderSummary() {
		homePage.launchUrl();
		AssertJUnit.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		AssertJUnit.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		orderSummaryPage.clickOnShippingDetailsTab();
		if(orderSummaryPage.getShippingDetailsValue().contains(PageConstants.ADDRESS)) {
			System.out.println("User phone no "+PageConstants.ADDRESS+" is displayed");
		}else {
			AssertJUnit.fail("User phone no "+PageConstants.ADDRESS+" is not displayed");
		}
	}	

}
