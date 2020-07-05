package com.pageobjects;

import org.openqa.selenium.By;

public class CreditCardPageObjects {

	public static By TOTALAMOUNTINPAYMENTPAGE = By.xpath("//span[@class='text-amount-amount']");
	public static By CARDNUMBERTXTFIELD = By.xpath("//*[contains(text(),'Card number')]");
	public static By EXPIRYDATETXTFIELD = By.xpath("//*[contains(text(),'Expiry date')]");
	public static By CVVTXTFIELD = By.xpath("//*[contains(text(),'CVV')]");
	public static By PAYNOWBTN = By.xpath("//*[@id=\"application\"]/div[1]/a/div[1]/span");
	public static By ISSUINGBANKPAGE = By.xpath("//h1[contains(text(),'Issuing Bank')]");
	public static By PASSWORDTXTFIELD = By.id("PaRes");
	public static By OKBTN = By.xpath("//button[@class='btn btn-sm btn-success']");
	public static By TRANSACTIONSUCCESSMSG= By.xpath("//div[@class='text-success text-bold']");
	public static By TRANSACTIONFAILUREMSG = By.xpath("//div[@class='text-failed text-bold']");
	public static By TRANSACTIONFAILUREREASON = By.xpath("//div[@class='text-failed']");
	

}
