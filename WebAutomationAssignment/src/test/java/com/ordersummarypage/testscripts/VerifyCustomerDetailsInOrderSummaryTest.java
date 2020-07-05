package com.ordersummarypage.testscripts;

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
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrame();
		orderSummaryPage.clickOnShippingDetailsTab();
		if(orderSummaryPage.getShippingDetailsValue().contains(PageConstants.USERNAME)) {
			System.out.println("User name "+PageConstants.USERNAME+" is displayed");
		}else {
			Assert.fail("User name "+PageConstants.USERNAME+" is not displayed");
		}
	}	

	@Test
	public void verifyCustomerEmailInOrderSummary() {
		homePage.launchUrl();
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrame();
		orderSummaryPage.clickOnShippingDetailsTab();
		if(orderSummaryPage.getShippingDetailsValue().contains(PageConstants.EMAIL)) {
			System.out.println("User email "+PageConstants.EMAIL+" is displayed");
		}else {
			Assert.fail("User email "+PageConstants.EMAIL+" is not displayed");
		}
	}	

	@Test
	public void verifyCustomerPhoneNoInOrderSummary() {
		homePage.launchUrl();
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrame();
		orderSummaryPage.clickOnShippingDetailsTab();
		if(orderSummaryPage.getShippingDetailsValue().contains(PageConstants.PHONENO)) {
			System.out.println("User phone no "+PageConstants.PHONENO+" is displayed");
		}else {
			Assert.fail("User phone no "+PageConstants.PHONENO+" is not displayed");
		}
	}	

	@Test
	public void verifyCustomerAddressInOrderSummary() {
		homePage.launchUrl();
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrame();
		orderSummaryPage.clickOnShippingDetailsTab();
		if(orderSummaryPage.getShippingDetailsValue().contains(PageConstants.ADDRESS)) {
			System.out.println("User phone no "+PageConstants.ADDRESS+" is displayed");
		}else {
			Assert.fail("User phone no "+PageConstants.ADDRESS+" is not displayed");
		}
	}	

}
