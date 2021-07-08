package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.pom.SelectHotel_Page;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectHotel_Stepdefinition extends Base_Class{
	
	public static WebDriver driver = Runner.driver;
	
	SelectHotel_Page sp = new SelectHotel_Page(driver);
	
	@When("^User click on radio button$")
	public void user_click_on_radio_button() throws Throwable {
	    clickOnElement(sp.getRadio());
	}

	@Then("^User validate continue button$")
	public void user_validate_continue_button() throws Throwable {
	    clickOnElement(sp.getSubmit());
	}
	}
