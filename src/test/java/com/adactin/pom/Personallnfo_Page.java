package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personallnfo_Page {
	
	public static WebDriver driver;
	
	@FindBy(id= "first_name")
	private WebElement Firstname;
	
	@FindBy(id="last_name")
	private WebElement Lastname;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement CC_number;
	
	@FindBy(id="cc_type")
	private WebElement CC_type;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv_no;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	public Personallnfo_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
   
	public WebElement getFirstname() {
	     return Firstname;	
	}
	
	public WebElement getLastname() {
		return Lastname;
	}
	
	public WebElement getAddress() {
		return Address;
	}
	
	public WebElement getCC_number() {
		return CC_number;
	}
	
	public WebElement getCC_type() {
		return CC_type;
	}
	
	public WebElement getExpmonth() {
		return expmonth;
	}
	
	public WebElement getExpyear() {
		return expyear;
	}
	
	public WebElement getCvv_no() {
		return cvv_no;
	}
	
	public WebElement getBooknow() {
		return booknow;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

































