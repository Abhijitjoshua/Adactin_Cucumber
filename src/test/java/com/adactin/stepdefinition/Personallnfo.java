package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.pom.Personallnfo_Page;
import com.adactin.runner.Runner;

import cucumber.api.java.en.When;

public class Personallnfo extends Base_Class {
	
	public static WebDriver driver = Runner.driver;
	
	Personallnfo_Page pf = new Personallnfo_Page(driver);
	
	@When("^User enters the firstname$")
	public void user_enters_the_firstname() throws Throwable {
		inputOfElement(pf.getFirstname(), "Sanj");
	    
	}

	@When("^User enters the lastname$")
	public void user_enters_the_lastname() throws Throwable {
		inputOfElement(pf.getLastname(), "joshua");
	    
	}

	@When("^User enters the billing address$")
	public void user_enters_the_billing_address() throws Throwable {
	    inputOfElement(pf.getAddress(), "Chennai");
	}

	@When("^User enters the credit card number$")
	public void user_enters_the_credit_card_number() throws Throwable {
	    inputOfElement(pf.getCC_number(), "1236547895421476");
	}

	@When("^User selects credit card type$")
	public void user_selects_credit_card_type() throws Throwable {
	    dropDown(pf.getCC_type(), "byVisibleText", "VISA");
	}

	@When("^User selects credit card expiry month$")
	public void user_selects_credit_card_expiry_month() throws Throwable {
	    dropDown(pf.getExpmonth(), "byValue", "8");
	}

	@When("^User selects credit card expiry year$")
	public void user_selects_credit_card_expiry_year() throws Throwable {
	    dropDown(pf.getExpyear(), "byValue", "2022");
	}

	@When("^User enters CVV number$")
	public void user_enters_CVV_number() throws Throwable {
	    inputOfElement(pf.getCvv_no(), "367");
	}

	@When("^User enters click booknow button$")
	public void user_enters_click_booknow_button() throws Throwable {
	    clickOnElement(pf.getBooknow());
	}

	@When("^User validate booknow button$")
	public void user_validate_booknow_button() throws Throwable {
	    
	}

}
