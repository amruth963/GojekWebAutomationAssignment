package com.creditcardpage.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.common.utils.ConfigReader;
import com.common.utils.PageConstants;
import com.pages.CreditCardPage;
import com.pages.HomePage;
import com.pages.OrderSummaryPage;

public class EnterInvalidCardDetailsTest extends BrowserUtils{

	private HomePage homePage = new HomePage();
	private OrderSummaryPage orderSummaryPage = new OrderSummaryPage();
	private CreditCardPage creditCardPage = new CreditCardPage();
	private ConfigReader configReader = new ConfigReader();

	@Test(description = "Verify Transaction failure message on entering invalid card details")
	public void enterInValidCardDetailsTransactionFailedMsg() {
		homePage.launchUrl();
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		orderSummaryPage.clickOnContinueBtn();
		orderSummaryPage.selectCreditCardPaymentOption();
		creditCardPage.enterCardNumber(configReader.getStaticProperty("invalidcardnumber"));
		creditCardPage.enterExpiryDate(configReader.getStaticProperty("validExpiryDate"));
		creditCardPage.enterCVV(configReader.getStaticProperty("validcvv"));
		creditCardPage.clickOnPayNowBtn();
		creditCardPage.enterOTP(configReader.getStaticProperty("otp"));
		creditCardPage.clickOnOkBtn();
		switchiFrameOne();
		Assert.assertEquals(creditCardPage.getTransactionFailureMsg(), PageConstants.TRANSACTIONFAILUREMSG);
	}


	@Test(description = "Verify Transaction failure message reaseon on entering invalid card details")
	public void enterInValidCardDetailsTransactionFailedMsgReason() {
		homePage.launchUrl();
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		orderSummaryPage.clickOnContinueBtn();
		orderSummaryPage.selectCreditCardPaymentOption();
		creditCardPage.enterCardNumber(configReader.getStaticProperty("invalidcardnumber"));
		creditCardPage.enterExpiryDate(configReader.getStaticProperty("validExpiryDate"));
		creditCardPage.enterCVV(configReader.getStaticProperty("validcvv"));
		creditCardPage.clickOnPayNowBtn();
		creditCardPage.enterOTP(configReader.getStaticProperty("otp"));
		creditCardPage.clickOnOkBtn();
		switchiFrameOne();
		Assert.assertEquals(creditCardPage.getTransactionFailureMsgReason(), PageConstants.TRANSACTIONFAILUREREASON);
	}



}
