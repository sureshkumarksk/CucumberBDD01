package org.pojoclass;


import org.Baseclass.Baseclass01;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrederID extends Baseclass01 {
 public OrederID() {
 
    PageFactory.initElements(driver, this);
	}
	 @FindBy(id="order_no")private WebElement ordernum;
	public WebElement getOrdernum() {
		return ordernum;
	}
	 
}
