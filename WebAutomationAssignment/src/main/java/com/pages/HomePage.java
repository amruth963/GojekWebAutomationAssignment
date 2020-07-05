package com.pages;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.common.utils.BrowserUtils;
import com.pageobjects.HomePageObjects;

public class HomePage extends BrowserUtils{

	private static final Logger LOGGER = Logger.getLogger(Class.class.getName());

	public HomePage() {
		PageFactory.initElements(driver, this);
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
