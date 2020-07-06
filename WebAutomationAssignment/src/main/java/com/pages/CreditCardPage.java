package com.pages;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.common.utils.BrowserUtils;
import com.pageobjects.CreditCardPageObjects;
import com.pageobjects.HomePageObjects;

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

	public boolean enterCardNumber(String cardNumber) {
		try {
			webDriverWait(CreditCardPageObjects.CARDNUMBERTXTFIELD);
			isWebElementDisplayed(CreditCardPageObjects.CARDNUMBERTXTFIELD);
			clickOnElementUsingJavaScriptExecutor(CreditCardPageObjects.CARDNUMBERTXTFIELD);
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
			clickOnElementUsingJavaScriptExecutor(CreditCardPageObjects.EXPIRYDATETXTFIELD);
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
			clickOnElementUsingJavaScriptExecutor(CreditCardPageObjects.CVVTXTFIELD);
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
			clickOnElementUsingJavaScriptExecutor(CreditCardPageObjects.PAYNOWBTN);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to click on "+CreditCardPageObjects.PAYNOWBTN+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public boolean enterOTP(String otp) {
		try {
			switchiFrameTwo();
			Thread.sleep(4000);
			isWebElementDisplayed(CreditCardPageObjects.OTPTXTFIELD);
			clickOnElementUsingJavaScriptExecutor(CreditCardPageObjects.OTPTXTFIELD);
			sendKeysOnTxtField(CreditCardPageObjects.OTPTXTFIELD, otp);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to click on "+CreditCardPageObjects.OTPTXTFIELD+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public boolean clickOnOkBtn() {
		try {
			webDriverWait(CreditCardPageObjects.OKBTN);
			isWebElementDisplayed(CreditCardPageObjects.OKBTN);
			clickOnElementUsingJavaScriptExecutor(CreditCardPageObjects.OKBTN);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to send keys on "+CreditCardPageObjects.OKBTN+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public String getTransactionSuccessMsg() {
		String transactionSuccessMsg = null;
		try {
			driver.switchTo().defaultContent();
			webDriverWait(HomePageObjects.PURCHASESUCCESSMSG);
			isWebElementDisplayed(HomePageObjects.PURCHASESUCCESSMSG);
			transactionSuccessMsg = getText(HomePageObjects.PURCHASESUCCESSMSG);
		}catch (Exception e) {
			LOGGER.info("Unable to get text on purchase success due to "+e.getMessage());
		}
		return transactionSuccessMsg;
	}

	public String getTransactionFailureMsg() {
		String transactionFailureMsg = null;
		try {
			webDriverWait(CreditCardPageObjects.TRANSACTIONFAILUREMSG);
			isWebElementDisplayed(CreditCardPageObjects.TRANSACTIONFAILUREMSG);
			transactionFailureMsg = getText(CreditCardPageObjects.TRANSACTIONFAILUREMSG);
		}catch (Exception e) {
			LOGGER.info("Unable to get text on purchase failure due to "+e.getMessage());
		}
		return transactionFailureMsg;
	}

	public String getTransactionFailureMsgReason() {
		String transactionFailureMsg = null;
		try {
			webDriverWait(CreditCardPageObjects.TRANSACTIONFAILUREREASON);
			isWebElementDisplayed(CreditCardPageObjects.TRANSACTIONFAILUREREASON);
			transactionFailureMsg = getText(CreditCardPageObjects.TRANSACTIONFAILUREREASON);
		}catch (Exception e) {
			LOGGER.info("Unable to get text on purchase failure due to "+e.getMessage());
		}
		return transactionFailureMsg;
	}





}
