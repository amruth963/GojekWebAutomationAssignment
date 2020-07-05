package com.pageobjects;

import org.openqa.selenium.By;

public class HomePageObjects {

	public static By MIDTRANSPILLOWTITLE = By.xpath("//div[@class='title']");
	public static By TOTALAMOUNTONHOMESCREEN = By.xpath("//span[contains(text(),'20,000')]");
	public static By BUYNOWBTN = By.xpath("//a[@class='btn buy']");
	public static By SHOPPINGCARTTITLE = By.xpath("//div[@data-reactid=\".0.0.1.0.0\"]");
	public static By TOTALAMOUNTONCART = By.xpath("//td[@class='amount']");
	public static By NAMETXTFIELD = By.xpath("//input[@data-reactid=\".0.0.1.0.3.0.0.0.1.0\"]");
	public static By EMAILTXTFIELD = By.xpath("//input[@data-reactid=\".0.0.1.0.3.0.0.1.1.0\"]");
	public static By PHONENOTXTFIELD = By.xpath("//input[@data-reactid=\".0.0.1.0.3.0.0.2.1.0\"]");
	public static By CITYTXTFIELD = By.xpath("//input[@data-reactid=\".0.0.1.0.3.0.0.3.1.0\"]");
	public static By ADDRESSTXTFIELD = By.xpath("//textarea[@data-reactid=\".0.0.1.0.3.0.0.4.1.0\"]");
	public static By POSTALCODETXTFIELD = By.xpath("//input[@data-reactid=\".0.0.1.0.3.0.0.5.1.0\"]");
	public static By CHECKOUTBTN = By.xpath("//div[@class='cart-checkout']");
	public static By PURCHASESUCCESSMSG = By.xpath("//span[@data-reactid='.0.0.0.2.0.1.0.0:0']");

}
