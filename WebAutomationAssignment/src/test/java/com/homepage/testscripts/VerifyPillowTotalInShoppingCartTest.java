package com.homepage.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.utils.BrowserUtils;
import com.pageobjects.HomePageObjects;
import com.pages.HomePage;

public class VerifyPillowTotalInShoppingCartTest extends BrowserUtils{

	private HomePage homePage = new HomePage();

	@Test(description = "Verify pillow price between home and shopping cart screen")
	public void verifyPillowTotalInShoppingCart() {
		homePage.launchUrl();
		String totalPriceInHomePage = homePage.getText(HomePageObjects.TOTALAMOUNTONHOMESCREEN);
		homePage.clickOnBuyNowBtn();
		String totalPriceInCartPage = homePage.getText(HomePageObjects.TOTALAMOUNTONCART);
		Assert.assertEquals(totalPriceInCartPage, totalPriceInHomePage);
	}

}
