package com.common.utils;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserUtils {

	public static WebDriver driver;
	public ConfigReader configReader = new ConfigReader();
	private boolean flag = true;
	private static final Logger LOGGER = Logger.getLogger(Class.class.getName());

	@BeforeTest
	public void launchBrowser() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty(configReader.getStaticProperty("ChromeKey"), configReader.getStaticProperty("ChromeValue"));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}


	public WebElement webDriverWait(By locators) {
		WebElement ele = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
			wait.until(ExpectedConditions.presenceOfElementLocated(locators));
			ele = driver.findElement(locators);
		} catch (Exception e) {
			Assert.fail("Unable to find element " + locators + " due to" + e.getMessage());
		}
		return ele;
	}

	public boolean isWebElementDisplayed(By locators) {
		try {
			WebElement ele = webDriverWait(locators);
			if (ele.isDisplayed()) {
				LOGGER.info("WebElement " + ele + " is displayed on the webpage");
			} else {
				LOGGER.info("WebElement " + ele + " is not displayed on the webpage");
			}
			return flag;
		} catch (Exception e) {
			Assert.fail("Unable to find element " + locators + " due to" + e.getMessage());
			flag = false;
			return flag;
		}
	}

	public boolean clickOnElement(By locator) {
		try {
			WebElement ele = webDriverWait(locator);
			isWebElementDisplayed(locator);
			ele.click();
			LOGGER.info("Successfully clicked on " + locator + " element");
			return flag;
		} catch (Exception e) {
			Assert.fail("Unable to click on " + locator + " element due to: " + e.getMessage());
			flag = false;
			return flag;
		}
	}

	public String sendKeysOnTxtField(By locator, String keysToSend) {
		try {
			WebElement ele = webDriverWait(locator);
			isWebElementDisplayed(locator);
			ele.clear();
			ele.sendKeys(keysToSend);
		}catch (Exception e) {
			Assert.fail("Unable to send keys on " + locator + " element due to: " + e.getMessage());
		}
		return keysToSend;
	}

	public String getText(By locator) {
		String text = null;
		try {
			WebElement ele = webDriverWait(locator);
			isWebElementDisplayed(locator);
			text = ele.getText();
		} catch (Exception e) {
			Assert.fail("WebElement is not displayed with given " + locator + " due to " + e.getMessage());
		}
		return text;
	}

	public String getAttribute(By locator, String attributeName) {
		String attributeValue = null;
		try {
			WebElement ele = webDriverWait(locator);
			if (ele.isDisplayed()) {
				attributeValue = ele.getAttribute(attributeName);
			}
		} catch (Exception e) {
			Assert.fail("Unable to get attibute with given " + locator + " and " + attributeName + " due to :" + e.getMessage());
		}
		return attributeValue;
	}

	public boolean clickOnElementUsingJavaScriptExecutor(By locator) {
		try {
			WebElement ele = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
			return flag;
		} catch (Exception e) {
			Assert.fail("Unable to click on " + locator + " element due to: " + e.getMessage());
			flag = false;
			return flag;
		}

	}

	public void switchiFrameOne() {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("snap-midtrans");
		}catch (Exception e) {
			Assert.fail("Unable to switch to iframe due to " + e.getMessage());
		}
	}

	public void switchiFrameTwo() {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(0);
		}catch (Exception e) {
			Assert.fail("Unable to switch to iframe due to " + e.getMessage());
		}
	}



}
