package com.AutoPractice.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.com.BaseClass_Selenium;
import com.aPractice.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//AutoPractice//feature",
glue="com.AutoPractice.stepdefinition",
monochrome=true)


public class Test_runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_UP() throws Throwable {

		String browser = File_Reader_Manager.get_Instance().get_InstanceCR().get_browser();
		driver = BaseClass_Selenium.browserLaunch(browser);
	}
	@AfterClass
	public static void tear_Down() {

		//driver.close();
		
	}

}
