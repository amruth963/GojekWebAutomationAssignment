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

	public boolean launchXoxodayUrl() {
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


}
