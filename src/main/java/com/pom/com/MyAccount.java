package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	private WebElement eveDress;
	
	
	public MyAccount(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getEveDress() {
		return eveDress;
	}

	
	
	
	
}
