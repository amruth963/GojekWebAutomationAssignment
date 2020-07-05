package com.pages;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.common.utils.BrowserUtils;
import com.pageobjects.CreditCardPageObjects;

public class CreditCardPage extends BrowserUtils {

	private static final Logger LOGGER = Logger.getLogger(Class.class.getName());
	private boolean flag = true;

	public CreditCardPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyTotalAmountInCreditCardPage() {
		String totalAmount =  null;
		try {
			webDriverWait(CreditCardPageObjects.TOTALAMOUNTINPAYMENTPAGE);
			isWebElementDisplayed(CreditCardPageObjects.TOTALAMOUNTINPAYMENTPAGE);
			totalAmount = getText(CreditCardPageObjects.TOTALAMOUNTINPAYMENTPAGE);
		}catch (Exception e) {
			LOGGER.info("Unable to get total amount due to "+e.getMessage());
		}
		return totalAmount;
	}

	public String verifyEmailInCreditCardPage() {
		String email = null;
		try {
			webDriverWait(CreditCardPageObjects.EMAILINCREDITCARDPAGE);
			isWebElementDisplayed(CreditCardPageObjects.EMAILINCREDITCARDPAGE);
			email = getAttribute(CreditCardPageObjects.EMAILINCREDITCARDPAGE, "placeholder");
		}catch (Exception e) {
			LOGGER.info("Unable to get email due to "+e.getMessage());
		}
		return email;
	}

	public String verifyPhoneNoCreditCardPage() {
		String phoneNo = null;
		try {
			webDriverWait(CreditCardPageObjects.PHONENOINCREDITCARDPAGE);
			isWebElementDisplayed(CreditCardPageObjects.PHONENOINCREDITCARDPAGE);
			phoneNo = getAttribute(CreditCardPageObjects.PHONENOINCREDITCARDPAGE, "placeholder");
		}catch (Exception e) {
			LOGGER.info("Unable to get phone no due to "+e.getMessage());
		}
		return phoneNo;
	}

	public boolean enterValidCardNumber(String cardNumber) {
		try {
			webDriverWait(CreditCardPageObjects.CARDNUMBERTXTFIELD);
			isWebElementDisplayed(CreditCardPageObjects.CARDNUMBERTXTFIELD);
			sendKeysOnTxtField(CreditCardPageObjects.CARDNUMBERTXTFIELD, cardNumber);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to send keys on "+CreditCardPageObjects.CARDNUMBERTXTFIELD+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public boolean enterExpiryDate(String expiryDate) {
		try {
			webDriverWait(CreditCardPageObjects.EXPIRYDATETXTFIELD);
			isWebElementDisplayed(CreditCardPageObjects.EXPIRYDATETXTFIELD);
			sendKeysOnTxtField(CreditCardPageObjects.EXPIRYDATETXTFIELD, expiryDate);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to send keys on "+CreditCardPageObjects.EXPIRYDATETXTFIELD+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public boolean enterCVV(String cvv) {
		try {
			webDriverWait(CreditCardPageObjects.CVVTXTFIELD);
			isWebElementDisplayed(CreditCardPageObjects.CVVTXTFIELD);
			sendKeysOnTxtField(CreditCardPageObjects.CVVTXTFIELD, cvv);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to send keys on "+CreditCardPageObjects.CVVTXTFIELD+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public boolean clickOnPayNowBtn() {
		try {
			webDriverWait(CreditCardPageObjects.PAYNOWBTN);
			isWebElementDisplayed(CreditCardPageObjects.PAYNOWBTN);
			clickOnElement(CreditCardPageObjects.PAYNOWBTN);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to click on "+CreditCardPageObjects.PAYNOWBTN+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}



}
