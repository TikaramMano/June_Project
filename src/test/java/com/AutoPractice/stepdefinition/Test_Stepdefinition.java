package com.AutoPractice.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.AutoPractice.runner.Test_runner;
import com.BaseClass.com.BaseClass_Selenium;
import com.aPractice.helper.File_Reader_Manager;
import com.aPractice.helper.Project_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Stepdefinition extends BaseClass_Selenium {

	public static WebDriver driver = Test_runner.driver;

	Project_Object_Manager obj = new Project_Object_Manager(driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
        String url = File_Reader_Manager.get_Instance().get_InstanceCR().get_Url();
		getUrl(url);

	}

	@When("^user Enter the Username in the Input Field$")
	public void user_Enter_the_Username_in_the_Input_Field() throws Throwable {
  
		implicitWait();
		inputValues(obj.get_Instance_Login().getEmail(), "christianRonaldo@gmail.com");
	}

	@When("^user Enter the Password in the Input Field$")
	public void user_Enter_the_Password_in_the_Input_Field() throws Throwable {
		inputValues(obj.get_Instance_Login().getPass(), "8241700@tika");
	}

	@Then("^User click on Sigin Button And Navigate to My Account$")
	public void user_click_on_Sigin_Button_And_Navigate_to_My_Account() throws Throwable {
		clickOnButton(obj.get_Instance_Login().getLogin());
	}

	@When("^user Mouseover on Dreeses$")
	public void user_Mouseover_on_Dreeses() throws Throwable {
		mouseOver(obj.get_Instance_Account().getDress());
	}

	@Then("^user clicK On Evening Dresses And Navigate to Evening Dress$")
	public void user_clicK_On_Evening_Dresses_And_Navigate_to_Evening_Dress() throws Throwable {

		clickOnButton(obj.get_Instance_Account().getEveDress());

	}

	@When("^mouseOver On The Dress$")
	public void mouseover_On_The_Dress() throws Throwable {

		mouseOver(obj.get_Instance_EveDress().getOverDress());
	}

	@When("^click On The QuickView Button$")
	public void click_On_The_QuickView_Button() throws Throwable {

		clickOnButton(obj.get_Instance_EveDress().getQuickView());
		frameIndex(0);
	}

	@When("^user Pass The Number Of Quantity$")
	public void user_Pass_The_Number_Of_Quantity() throws Throwable {

		clear(obj.get_Instance_EveDress().getClearQty());
		inputValues(obj.get_Instance_EveDress().getQty(), "2");
	}

	@When("^user Select The Size$")
	public void user_Select_The_Size() throws Throwable {
		dropDown(obj.get_Instance_EveDress().getSelectSize(), "value", "1");
	}

	@When("^user Selct The Color Of The Dress$")
	public void user_Selct_The_Color_Of_The_Dress() throws Throwable {

		clickOnButton(obj.get_Instance_EveDress().getColour());
	}

	@Then("^user click and Addtocart$")
	public void user_click_and_Addtocart() throws Throwable {
		
		clickOnButton(obj.get_Instance_EveDress().getAddToCart());
	}

}
