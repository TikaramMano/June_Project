package com.aPractice.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.com.EveningDress;
import com.pom.com.MyAccount;
import com.pom.com.Signin;

public class Project_Object_Manager {
	
	public static WebDriver driver;
	
	private Signin login;
	private MyAccount account;
	private EveningDress eveDress;
	
	
	public Project_Object_Manager(WebDriver driver2) {

	this.driver= driver2;
	PageFactory.initElements(driver2, this);
	
	}

	public Signin get_Instance_Login() {

		login = new Signin(driver);
		return login;
	}
	
	public MyAccount get_Instance_Account() {
		account = new MyAccount(driver);
		return account;
	}
	
	public EveningDress get_Instance_EveDress() {
		
		eveDress = new EveningDress(driver);
		return eveDress;
	}
	

}
