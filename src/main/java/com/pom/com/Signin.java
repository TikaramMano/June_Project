package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {

	public static WebDriver driver;

	@FindBy(xpath = "(//input[@data-validate='isEmail'])[2]")
	private WebElement email;

	@FindBy(name = "passwd")
	private WebElement pass;

	@FindBy(id = "SubmitLogin")
	private WebElement login;

	public Signin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);

	}

	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

}
