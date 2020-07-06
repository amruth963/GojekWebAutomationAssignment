package com.ordersummarypage.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.common.utils.PageConstants;
import com.pages.HomePage;
import com.pages.OrderSummaryPage;

public class ClickOnContinueBtnAndSelectPaymentMethodTest extends BrowserUtils {


	private HomePage homePage = new HomePage();
	private OrderSummaryPage orderSummaryPage = new OrderSummaryPage();

	@Test(description = "Verify click on continue button and selection of credit card payment option")
	public void clickOnContinueBtnAndSelectCreditCardPayment() {
		homePage.launchUrl();
		AssertJUnit.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		AssertJUnit.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		orderSummaryPage.clickOnContinueBtn();
		orderSummaryPage.selectCreditCardPaymentOption();
	}

}
