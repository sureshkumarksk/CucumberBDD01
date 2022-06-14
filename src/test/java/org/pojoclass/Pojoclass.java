package org.pojoclass;


import org.Baseclass.Baseclass01;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends Baseclass01
{
	public Pojoclass() {
	
	
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")private WebElement user;
	@FindBy(id="password")private WebElement pass;
	@FindBy(id="login")private WebElement btnlogin;
	public WebElement getUsername() {
		return user;
	}
	public WebElement getPassword() {
		return pass;
	}
	public WebElement getLoginbutton() {
		return btnlogin;
	}
	
	
	
		
    
}
