package com.pageobjects;

import org.openqa.selenium.By;

public class OrderSummaryPageObjects {

	public static By TOTOALAMOUNT = By.xpath("//td[@class='table-amount text-body']");
	public static By PILLOWNAME = By.xpath("//span[@class='item-name']");
	public static By SHIPPINGDETAILSTAB = By.xpath("//span[contains(text(),'shipping details')]");
	public static By SHIPPINGDETAILSSECTION = By.xpath("//div[@class='content-text-block']");
	public static By CONTINUEBTN = By.xpath("//div[@class='sprite btn-main-next']");
	public static By CREDITCARDPAYMENTOPTION = By.xpath("//*[@id=\"payment-list\"]/div[1]/a");

}
