package com.pages;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.common.utils.BrowserUtils;
import com.pageobjects.HomePageObjects;

public class HomePage extends BrowserUtils{

	private static final Logger LOGGER = Logger.getLogger(Class.class.getName());
	private boolean flag = true;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean launchUrl() {
		try {
			driver.get(configReader.getStaticProperty("url"));
			LOGGER.info(configReader.getStaticProperty("url") +" URL launched successfully");
			return flag;
		} catch (Exception e) {
			LOGGER.info("Unable to launch "+configReader.getStaticProperty("url")+" URL " + e.getMessage());
			flag = false;
			return flag;
		}
	}

	public String verifyPillowTitle() {
		String pillowTitle = null;
		try {
			webDriverWait(HomePageObjects.MIDTRANSPILLOWTITLE);
			isWebElementDisplayed(HomePageObjects.MIDTRANSPILLOWTITLE);
			pillowTitle = getText(HomePageObjects.MIDTRANSPILLOWTITLE);
		}catch(Exception e) {
			LOGGER.info("Unable to get Midtrans pillow text due to: "+e.getMessage());
		}
		return pillowTitle;
	}

	public boolean clickOnBuyNowBtn() {
		try {
			webDriverWait(HomePageObjects.BUYNOWBTN);
			isWebElementDisplayed(HomePageObjects.BUYNOWBTN);
			clickOnElement(HomePageObjects.BUYNOWBTN);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to click on Buy Now button due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public boolean enterName(String enterName) {
		try {	
			webDriverWait(HomePageObjects.NAMETXTFIELD);
			isWebElementDisplayed(HomePageObjects.NAMETXTFIELD);
			sendKeysOnTxtField(HomePageObjects.NAMETXTFIELD, enterName);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to send keys on "+HomePageObjects.NAMETXTFIELD+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public String getNameTxtFieldValue(String attributeName) {
		String name = null;
		try {
			webDriverWait(HomePageObjects.NAMETXTFIELD);
			isWebElementDisplayed(HomePageObjects.NAMETXTFIELD);
			name = getAttribute(HomePageObjects.NAMETXTFIELD, attributeName);
		}catch (Exception e) {
			LOGGER.info("Unable to get attribute value due to "+e.getMessage());
		}
		return name;
	}

	public boolean enterEmail(String enterName) {
		try {	
			webDriverWait(HomePageObjects.EMAILTXTFIELD);
			isWebElementDisplayed(HomePageObjects.EMAILTXTFIELD);
			sendKeysOnTxtField(HomePageObjects.EMAILTXTFIELD, enterName);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to send keys on "+HomePageObjects.EMAILTXTFIELD+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public String getEmailTxtFieldValue(String attributeName) {
		String name = null;
		try {
			webDriverWait(HomePageObjects.EMAILTXTFIELD);
			isWebElementDisplayed(HomePageObjects.EMAILTXTFIELD);
			name = getAttribute(HomePageObjects.EMAILTXTFIELD, attributeName);
		}catch (Exception e) {
			LOGGER.info("Unable to get attribute value due to "+e.getMessage());
		}
		return name;
	}

	public boolean enterPhoneNo(String enterPhoneNo) {
		try {	
			webDriverWait(HomePageObjects.PHONENOTXTFIELD);
			isWebElementDisplayed(HomePageObjects.PHONENOTXTFIELD);
			sendKeysOnTxtField(HomePageObjects.PHONENOTXTFIELD, enterPhoneNo);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to send keys on "+HomePageObjects.PHONENOTXTFIELD+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public String getPhoneNoTxtFieldValue(String attributeName) {
		String name = null;
		try {
			webDriverWait(HomePageObjects.PHONENOTXTFIELD);
			isWebElementDisplayed(HomePageObjects.PHONENOTXTFIELD);
			name = getAttribute(HomePageObjects.PHONENOTXTFIELD, attributeName);
		}catch (Exception e) {
			LOGGER.info("Unable to get attribute value due to "+e.getMessage());
		}
		return name;
	}


	public boolean enterCity(String enterCity) {
		try {	
			webDriverWait(HomePageObjects.CITYTXTFIELD);
			isWebElementDisplayed(HomePageObjects.CITYTXTFIELD);
			sendKeysOnTxtField(HomePageObjects.CITYTXTFIELD, enterCity);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to send keys on "+HomePageObjects.CITYTXTFIELD+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public String getCityTxtFieldValue(String attributeName) {
		String name = null;
		try {
			webDriverWait(HomePageObjects.CITYTXTFIELD);
			isWebElementDisplayed(HomePageObjects.CITYTXTFIELD);
			name = getAttribute(HomePageObjects.CITYTXTFIELD, attributeName);
		}catch (Exception e) {
			LOGGER.info("Unable to get attribute value due to "+e.getMessage());
		}
		return name;
	}

	public boolean enterAddress(String enterAddress) {
		try {	
			webDriverWait(HomePageObjects.ADDRESSTXTFIELD);
			isWebElementDisplayed(HomePageObjects.ADDRESSTXTFIELD);
			sendKeysOnTxtField(HomePageObjects.ADDRESSTXTFIELD, enterAddress);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to send keys on "+HomePageObjects.ADDRESSTXTFIELD+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public String getAddressTxtFieldValue(String attributeName) {
		String name = null;
		try {
			webDriverWait(HomePageObjects.ADDRESSTXTFIELD);
			isWebElementDisplayed(HomePageObjects.ADDRESSTXTFIELD);
			name = getAttribute(HomePageObjects.ADDRESSTXTFIELD, attributeName);
		}catch (Exception e) {
			LOGGER.info("Unable to get attribute value due to "+e.getMessage());
		}
		return name;
	}

	public boolean enterPostalCode(String enterPostalCode) {
		try {	
			webDriverWait(HomePageObjects.POSTALCODETXTFIELD);
			isWebElementDisplayed(HomePageObjects.POSTALCODETXTFIELD);
			sendKeysOnTxtField(HomePageObjects.POSTALCODETXTFIELD, enterPostalCode);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to send keys on "+HomePageObjects.POSTALCODETXTFIELD+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public String getPostalCodeTxtFieldValue(String attributeName) {
		String name = null;
		try {
			webDriverWait(HomePageObjects.POSTALCODETXTFIELD);
			isWebElementDisplayed(HomePageObjects.POSTALCODETXTFIELD);
			name = getAttribute(HomePageObjects.POSTALCODETXTFIELD, attributeName);
		}catch (Exception e) {
			LOGGER.info("Unable to get attribute value due to "+e.getMessage());
		}
		return name;
	}

	public boolean clickOnCheckOutBtn() {
		try {
			webDriverWait(HomePageObjects.CHECKOUTBTN);
			isWebElementDisplayed(HomePageObjects.CHECKOUTBTN);
			clickOnElement(HomePageObjects.CHECKOUTBTN);
			return flag;
		}catch (Exception e) {
			LOGGER.info("Unable to click on "+HomePageObjects.CHECKOUTBTN+" due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

	public boolean enterCustomerDetailsAndClickOnCheckoutBtn(String name, String email, String phoneno, String city, String address, String postalCode) {
		try {
			enterName(name);
			enterEmail(email);
			enterPhoneNo(phoneno);
			enterCity(city);
			enterAddress(address);
			enterPostalCode(postalCode);
			clickOnCheckOutBtn();
			return flag;
		}catch (Exception e) {
			LOGGER.info("Error due to "+e.getMessage());
			flag = false;
			return flag;
		}
	}

}
