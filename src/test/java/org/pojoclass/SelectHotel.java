package org.pojoclass;


import org.Baseclass.Baseclass01;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel  extends Baseclass01
{
	public SelectHotel() {

		PageFactory.initElements(driver, this);
}
	  @FindBy(id="radiobutton_0")private WebElement selectradio;
	  @FindBy(id="continue")private WebElement continuee;
	public WebElement getSelectradio() {
		return selectradio;
	}
	public WebElement getContinuee() {
		return continuee;
	}
	  
}
