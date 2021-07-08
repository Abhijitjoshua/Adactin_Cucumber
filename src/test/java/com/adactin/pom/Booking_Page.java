package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(name="hotels")
    private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(name="room_nos")
	private WebElement room_no;
	
	@FindBy(name="datepick_in")
	private WebElement clear_checkin_date;
	
	@FindBy(id="datepick_in")
	private WebElement enter_checkin_date;
	
	@FindBy(id="datepick_out")
	private WebElement clear_checkout_date;
	
	@FindBy(id="datepick_out")
	private WebElement enter_checkout_date;
	
	@FindBy(name="adult_room")
	private WebElement adult_room;
	
	@FindBy(name="child_room")
	private WebElement child_room;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	
	public Booking_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotel() {
		return hotel;
	}
	
	public WebElement getRoomtype() {
		return roomtype;
	}
	
	public WebElement getRoom_no() {
		return room_no;
	}
	
	public WebElement getClear_checkin_date() {
		return clear_checkin_date;
	}
	
	public WebElement getEnter_checkin_date() {
		return enter_checkin_date;
	}
	
	public WebElement getClear_checkout_date() {
		return clear_checkout_date;
	}
	
	public WebElement getEnter_checkout_date() {
		return enter_checkout_date;
	}
	
	public WebElement getAdult_room() {
		return adult_room;
	}
	
	public WebElement getChild_room() {
		return child_room;
	}
	
	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
