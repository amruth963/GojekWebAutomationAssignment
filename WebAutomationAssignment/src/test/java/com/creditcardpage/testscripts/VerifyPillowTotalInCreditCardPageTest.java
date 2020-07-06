package com.creditcardpage.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.common.utils.PageConstants;
import com.pages.CreditCardPage;
import com.pages.HomePage;
import com.pages.OrderSummaryPage;

public class VerifyPillowTotalInCreditCardPageTest extends BrowserUtils{

	private HomePage homePage = new HomePage();
	private OrderSummaryPage orderSummaryPage = new OrderSummaryPage();
	private CreditCardPage creditCardPage = new CreditCardPage();

	@Test(description = "Verify pillow total between Order Summary and Credit Card page")
	public void verifyPillowTotalInCreditCardPage() {
		homePage.launchUrl();
		AssertJUnit.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		AssertJUnit.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		String totalPriceInOrderSummaryPage = orderSummaryPage.verifyPillowTotalOnOrderSummaryPage();
		orderSummaryPage.clickOnContinueBtn();
		orderSummaryPage.selectCreditCardPaymentOption();
		String totalPriceInCreditCardPage = creditCardPage.verifyTotalAmountInCreditCardPage();
		AssertJUnit.assertEquals(totalPriceInCreditCardPage, totalPriceInOrderSummaryPage);
	}

}
