package com.testscripts;

import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.pages.HomePage;

public class VerifyPillowTitleTest extends BrowserUtils{

	private HomePage homePage = new HomePage();

	@Test(description = "Verify that 'Midtrans Pillow' title is displayed in home page")
	public void verifyPillowTitle() {
		homePage.launchXoxodayUrl();
	}

}
