package com.pages;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.common.utils.BrowserUtils;
import com.pageobjects.OrderSummaryPageObjects;

public class OrderSummaryPage extends BrowserUtils{


	private static final Logger LOGGER = Logger.getLogger(Class.class.getName());
	private boolean flag = true;

	public OrderSummaryPage() {
		PageFactory.initElements(driver, this);
	}


	public String verifyPillowTotalOnOrderSummaryPage() {
		String totalAmount = null;
		try {
			webDriverWait(OrderSummaryPageObjects.TOTOALAMOUNT);
			isWebElementDisplayed(OrderSummaryPageObjects.TOTOALAMOUNT);
			totalAmount = getText(OrderSummaryPageObjects.TOTOALAMOUNT);
		}catch (Exception e) {
			LOGGER.info("Unable to get total amount from " +OrderSummaryPageObjects.TOTOALAMOUNT+" locator due to: "+e.getMessage());
		}
		return totalAmount;
	}

	public String verifyPillowNameInOrderSummaryPage() {
		String pillowName = null;
		try {
			webDriverWait(OrderSummaryPageObjects.PILLOWNAME);
			isWebElementDisplayed(OrderSummaryPageObjects.PILLOWNAME);
			pillowName = getText(OrderSummaryPageObjects.PILLOWNAME);
		}catch (Exception e) {
			LOGGER.info("Unable to get pillow name from " +OrderSummaryPageObjects.PILLOWNAME+" locator due to: "+e.getMessage());
		}
		return pillowName;
	}

	public boolean clickOnShippingDetailsTab() {
		try {
			webDriverWait(OrderSummaryPageObjects.SHIPPINGDETAILSTAB);
			isWebElementDisplayed(OrderSummaryPageObjects.SHIPPINGDETAILSTAB);
			clickOnElement(OrderSummaryPageObjects.SHIPPINGDETAILSTAB);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to click on "+OrderSummaryPageObjects.SHIPPINGDETAILSTAB+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public boolean clickOnContinueBtn() {
		try {
			clickOnElementUsingJavaScriptExecutor(OrderSummaryPageObjects.CONTINUEBTN);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to click on "+OrderSummaryPageObjects.CONTINUEBTN+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public String getShippingDetailsValue() {
		String shippingDetailsValue = null;
		try {
			webDriverWait(OrderSummaryPageObjects.SHIPPINGDETAILSSECTION);
			isWebElementDisplayed(OrderSummaryPageObjects.SHIPPINGDETAILSSECTION);
			shippingDetailsValue = getText(OrderSummaryPageObjects.SHIPPINGDETAILSSECTION);
		}catch (Exception e) {
			LOGGER.info("Unable to get text name from " +OrderSummaryPageObjects.SHIPPINGDETAILSSECTION+" locator due to: "+e.getMessage());
		}
		return shippingDetailsValue;
	}

	public boolean selectCreditCardPaymentOption() {
		try {
			webDriverWait(OrderSummaryPageObjects.CREDITCARDPAYMENTOPTION);
			isWebElementDisplayed(OrderSummaryPageObjects.CREDITCARDPAYMENTOPTION);
			clickOnElement(OrderSummaryPageObjects.CREDITCARDPAYMENTOPTION);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to click on "+OrderSummaryPageObjects.CREDITCARDPAYMENTOPTION+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}




}
