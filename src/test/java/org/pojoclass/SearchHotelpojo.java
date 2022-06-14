package org.pojoclass;


import org.Baseclass.Baseclass01;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelpojo extends Baseclass01
{
	 public SearchHotelpojo() {
	
	
	
       PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")private WebElement location11;
	@FindBy(id="hotels")private WebElement hotles;
	@FindBy(id="room_type")private WebElement roomtype;
	@FindBy(id="room_nos")private WebElement roomnos;
	@FindBy(id="datepick_in	")private WebElement checkin;
	@FindBy(id="datepick_out")private WebElement checkout;
	@FindBy(id="adult_room")private WebElement adults;
	@FindBy(id="child_room")private WebElement children;
	@FindBy(id="Submit")private WebElement submit;
	public WebElement getLocation() {
		return location11;
	}
	public WebElement getHotles() {
		return hotles;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	

}
