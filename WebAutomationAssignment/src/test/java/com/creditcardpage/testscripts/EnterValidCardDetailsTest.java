package com.creditcardpage.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.common.utils.ConfigReader;
import com.common.utils.PageConstants;
import com.pages.CreditCardPage;
import com.pages.HomePage;
import com.pages.OrderSummaryPage;

public class EnterValidCardDetailsTest extends BrowserUtils{

	private HomePage homePage = new HomePage();
	private OrderSummaryPage orderSummaryPage = new OrderSummaryPage();
	private CreditCardPage creditCardPage = new CreditCardPage();
	private ConfigReader configReader = new ConfigReader();

	@Test(description = "Verify Transaction success message on entering valid card details")
	public void enterValidCardDetails() {
		homePage.launchUrl();
		AssertJUnit.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		AssertJUnit.assertEquals(homePage.clickOnBuyNowBtn(), true);
		homePage.enterCustomerDetailsAndClickOnCheckoutBtn(PageConstants.USERNAME, PageConstants.EMAIL, PageConstants.PHONENO, PageConstants.CITY, PageConstants.ADDRESS, PageConstants.POSTALCODE);
		switchiFrameOne();
		orderSummaryPage.clickOnContinueBtn();
		orderSummaryPage.selectCreditCardPaymentOption();
		creditCardPage.enterCardNumber(configReader.getStaticProperty("validcardnumber"));
		creditCardPage.enterExpiryDate(configReader.getStaticProperty("validExpiryDate"));
		creditCardPage.enterCVV(configReader.getStaticProperty("validcvv"));
		creditCardPage.clickOnPayNowBtn();
		creditCardPage.enterOTP(configReader.getStaticProperty("otp"));
		creditCardPage.clickOnOkBtn();
		AssertJUnit.assertEquals(creditCardPage.getTransactionSuccessMsg(), PageConstants.PURCHASESUCCESSMSG);
	}


}
