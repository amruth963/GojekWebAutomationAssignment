package com.pageobjects;

import org.openqa.selenium.By;

public class CreditCardPageObjects {

	public static By TOTALAMOUNTINPAYMENTPAGE = By.xpath("//span[@class='text-amount-amount']");
	public static By CARDNUMBERTXTFIELD = By.name("cardnumber");
	public static By EXPIRYDATETXTFIELD = By.xpath("//input[@type='tel' and @placeholder='MM / YY']");
	public static By CVVTXTFIELD = By.xpath("//input[@type='tel' and @ inputmode ='numeric']");
	public static By PAYNOWBTN = By.xpath("//span[contains(text(),'Pay Now')]");
	public static By ISSUINGBANKPAGE = By.xpath("//h1[contains(text(),'Issuing Bank')]");
	public static By OTPTXTFIELD = By.xpath("//input[@type='password' and @placeholder='112233']");
	public static By OKBTN = By.xpath("//button[@class='btn btn-sm btn-success']");
//	public static By TRANSACTIONSUCCESSMSG= By.xpath("//div[@class='text-success text-bold']");
	public static By TRANSACTIONFAILUREMSG = By.xpath("//div[@class='text-failed text-bold']");
	public static By TRANSACTIONFAILUREREASON = By.xpath("//div[@class='text-failed']");


}
