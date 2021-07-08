package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.Base_Class;
import com.adactin.pom.Booking_Page;
import com.adactin.runner.Runner;

import cucumber.api.java.en.When;

public class BookingStepdefinition extends Base_Class {
	
	public static WebDriver driver = Runner.driver;
	
	Booking_Page bg = new Booking_Page(driver);
	
	@When("^User selects location$")
	public void user_selects_location() throws Throwable {
	 
		 dropDown(bg.getLocation(), "byValue", "Sydney");
	}
	     
	@When("^User selects hotels$")
	public void user_selects_hotels() throws Throwable {
		
		dropDown(bg.getHotel(), "byVisibleText", "Hotel Creek");
	}
	    

	@When("^User selects roomtype$")
	public void user_selects_roomtype() throws Throwable {
	   dropDown(bg.getRoomtype(), "byValue", "Double");    
	}

	@When("^user selects no of rooms$")
	public void user_selects_no_of_rooms() throws Throwable {
	    dropDown(bg.getRoom_no(), "byValue", "2");
	}

	@When("^User clear check in date$")
	public void user_clear_check_in_date() throws Throwable {
	    clearOnElement(bg.getClear_checkin_date());
	}

	@When("^user enter check in date$")
	public void user_enter_check_in_date() throws Throwable {
	    inputOfElement(bg.getEnter_checkin_date(), "08/11/2021");
	}

	@When("^User Clear check out date$")
	public void user_Clear_check_out_date() throws Throwable {
	    clearOnElement(bg.getClear_checkout_date());
	}

	@When("^User enters check out date$")
	public void user_enters_check_out_date() throws Throwable {
	    inputOfElement(bg.getEnter_checkout_date(), "09/11/2021");
	}

	@When("^User selects adults per room$")
	public void user_selects_adults_per_room() throws Throwable {
	    dropDown(bg.getAdult_room(), "byValue", "2");
	}

	@When("^User selects children per room$")
	public void user_selects_children_per_room() throws Throwable {
	    dropDown(bg.getChild_room(), "byValue", "3");
	}

	@When("^user validate search button$")
	public void user_validate_search_button() throws Throwable {
	    clickOnElement(bg.getSearch());
	}
	
	}
