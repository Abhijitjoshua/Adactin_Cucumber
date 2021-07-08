package com.adactin.stepdefinition;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.pom.Login_Page;
import com.adactin.property.File_reader_Manager;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends Base_Class {
	
	public static WebDriver driver = Runner.driver;
	
	//Login_Page lp = new Login_Page(driver);
	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Before
	public void beforeHooks(Scenario scenario) {
		String status = scenario.getStatus();
        System.out.println("Scenario status" + status);
	}
	@After
	public void afterHooks(Scenario scenario) throws Throwable {
		if (scenario.isFailed()) {
			screenshot("C:\\Users\\Abhijit Joshua\\eclipse-workspace\\Adactin_Project\\ScreenShot\\img.png");
		}
		System.out.println("Exit from the page");

	}
	
	
	@Given("^User launches the url of adactin application$")
	public void user_launches_the_url_of_adactin_application() throws Throwable {
	    String url = File_reader_Manager.getInstance().getInstanceCR().getUrl();
	    getUrl(url);
	}

	@When("^User enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
	    //inputOfElement(lp.getUsername(), arg1);
		inputOfElement(pom.getInstanceLogin().getUsername(), "vinovicky");
	}

	@When("^User enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
	    //inputOfElement(lp.getpassword(), arg1);
		inputOfElement(pom.getInstanceLogin().getpassword(), "Jan@2020");
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
	    //clickOnElement(lp.getLogin_btn());
		clickOnElement(pom.getInstanceLogin().getLogin_btn());
	}
    
	@Then("User validate log in button$")
	public void user_validate_login_button() throws Throwable{
	}
	
	
}
