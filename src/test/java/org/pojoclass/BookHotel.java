package org.pojoclass;


import org.Baseclass.Baseclass01;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Baseclass01
{
	
    public BookHotel() {
	

  PageFactory.initElements(driver, this);
}
   @FindBy(id="first_name")private WebElement firstname;
   @FindBy(id="last_name")private WebElement lastname;
   @FindBy(id="address")private WebElement address;
   @FindBy(id="cc_num")private WebElement ccdetails;
   @FindBy(id="cc_type")private WebElement cctype;
   @FindBy(id="cc_exp_month")private WebElement ccexp;
   @FindBy(id="cc_exp_year")private WebElement ccexpyear;
   @FindBy(id="cc_cvv")private WebElement cvv;
   @FindBy(id="book_now")private WebElement booknow;
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcdetails() {
	return ccdetails;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getCcexp() {
	return ccexp;
}
public WebElement getCcexpyear() {
	return ccexpyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBooknow() {
	return booknow;
}
  
   

   
   

   
}
