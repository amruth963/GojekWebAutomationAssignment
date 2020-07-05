package com.homepage.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.common.utils.PageConstants;
import com.pages.HomePage;

public class VerifyPillowAndClickOnBuyNowBtnTest  extends BrowserUtils {

	private HomePage homePage = new HomePage();

	@Test(description = "Verify 'Midtrans Pillow' and click on BUY NOW BUTTON")
	public void verifyPillowAndClickOnBuyNowBtn() {
		homePage.launchUrl();
		Assert.assertEquals(homePage.verifyPillowTitle(), PageConstants.MIDTRANSPILLOWTITLE);
		Assert.assertEquals(homePage.clickOnBuyNowBtn(), true);
	}

}
