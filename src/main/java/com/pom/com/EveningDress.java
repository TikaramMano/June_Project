package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningDress {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement overDress;
	
	@FindBy(xpath="//a[@class='quick-view']")
	private WebElement quickView;
	
	//frame switch
	@FindBy(name="qty")
	private WebElement clearQty;
	
	@FindBy(id="quantity_wanted")
	private WebElement qty;
	
	@FindBy(name="group_1")
	private WebElement selectSize;
	
	@FindBy(xpath="//a[@class='color_pick selected']")
	private WebElement colour;
	
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement addToCart;
	
	
	public EveningDress(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
				
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getOverDress() {
		return overDress;
	}

	public WebElement getQuickView() {
		return quickView;
	}

	public WebElement getClearQty() {
		return clearQty;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSelectSize() {
		return selectSize;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	
	
	
	

}
