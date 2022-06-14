package org.pojoclass;



import org.Baseclass.Baseclass01;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class StepDefAdactian extends Baseclass01  {

	Baseclass01 b = new Baseclass01();
	WebElement element;
	
@Given("User launch the Browser And enter into the Adactian Web application")
public void user_launch_the_Browser_And_enter_into_the_Adactian_Web_application() 
{
	b.getdriver();
	b.loadurl("http://adactinhotelapp.com/");
	b.tomaximize();
	
	
}

@When("User enter the Valid Username and Valid Password")
public void user_enter_the_Valid_Username_and_Valid_Password() 
{
	Pojoclass n = new Pojoclass();
WebElement username = n.getUsername();
b.sendkeys(username, "RVAravindh");
WebElement password = n.getPassword();
b.sendkeys(password, "@12345");


}

@When("User click the Login Button")
public void user_click_the_Login_Button() {
	Pojoclass n = new Pojoclass();
	WebElement loginbutton = n.getLoginbutton();
	b.click(loginbutton);
		
}

@Then("User verify the page should be displayed")
public void user_verify_the_page_should_be_displayed()
{
	System.out.println("Home page should be Displayed");
}

@Then("User enter the search Hotel after enter the all fields and Drop and Down Fields and click the Search buttom")
public void user_enter_the_search_Hotel_after_enter_the_all_fields_and_Drop_and_Down_Fields_and_click_the_Search_buttom()
{ 


	
	SearchHotelpojo s = new SearchHotelpojo();
	WebElement location = s.getLocation();
	b.selectoptionbyindex(location, 1);
	WebElement hotles = s.getHotles();
	b.selectoptionbytext(hotles, "Hotel Sunshine");
	WebElement roomtype = s.getRoomtype();
	b.selectoptionbytext(roomtype, "Deluxe");
	WebElement roomnos = s.getRoomnos();
	b.selectoptionbytext(roomnos, "4 - Four");
	/*WebElement checkin = s.getCheckin();
	b.sendkeys(checkin, "28/05/2022");
	WebElement checkout = s.getCheckout();
	b.sendkeys(checkout, "28/05/2022");*/
	WebElement adults = s.getAdults();
	b.selectoptionbytext(adults, "2 - Two");
	WebElement children = s.getChildren();
	b.selectoptionbytext(children, "1 - One");
	WebElement submit = s.getSubmit();
	b.click(submit);

	
	
	
	
	
}

@Then("User verify select page should be dispalyed")
public void user_verify_select_page_should_be_dispalyed() 
{
	System.out.println("Select page sholud be Displayed");
}

@Then("User select the Hotel and click  the hotel by using Radio button And click the Continue button")
public void user_select_the_Hotel_and_click_the_hotel_by_using_Radio_button_And_click_the_Continue_button() 
{
	SelectHotel s = new SelectHotel();
	WebElement selectradio = s.getSelectradio();
	b.click(selectradio);
	WebElement continuee = s.getContinuee();
	b.click(continuee);
}

@Then("User verify the Book hotel page should be Displayed")
public void user_verify_the_Book_hotel_page_should_be_Displayed() {
	System.out.println("Book Hotel Page Should Be Page Should Be Dispalyed");
}

@Then("User enter the details within the textBox and Card datails and Click the Booknow button")
public void user_enter_the_details_within_the_textBox_and_Card_datails_and_Click_the_Booknow_button() 
{
	BookHotel b =new BookHotel();
	WebElement firstname = b.getFirstname();
	b.sendkeys(firstname, "suresh kumar");
	WebElement lastname = b.getLastname();
	b.sendkeys(lastname, "K");
	WebElement address = b.getAddress();
	b.sendkeys(address, "Pollachi,coimbatore");
	WebElement ccdetails = b.getCcdetails();
	b.sendkeys(ccdetails, "1234567884551555");
	WebElement cctype = b.getCctype();
	b.selectoptionbyindex(cctype, 2);
	WebElement ccexp = b.getCcexp();
	b.selectoptionbyindex(ccexp, 7);
	WebElement ccexpyear = b.getCcexpyear();
	b.selectoptionbyindex(ccexpyear, 5);
	WebElement cvv = b.getCvv();
	b.sendkeys(cvv, "758");
	WebElement booknow = b.getBooknow();
	b.click(booknow);
	
}


@Then("User verify the order id Can be visible in the text Box and get the order Id")
public void user_verify_the_order_id_Can_be_visible_in_the_text_Box_and_get_the_order_Id() throws InterruptedException 
{
	Thread.sleep(5000);
	OrederID o = new OrederID();
	WebElement ordernum = o.getOrdernum();
	String getattribute = b.getattribute(ordernum);
	System.out.println(getattribute);
	
}
@When("User enter the Valid {string} and {string}")
public void user_enter_the_Valid_and(String user, String pass) 
{
	Pojoclass p = new Pojoclass();
	WebElement username = p.getUsername();
	b.sendkeys(username,user );
	WebElement password = p.getPassword();
	b.sendkeys(password, pass);
	WebElement loginbutton = p.getLoginbutton();
	b.click(loginbutton);
}
@Then("User enter the Search Hotel Enter the Below Details location and hotels and Roomtype and rooms and adults and children")
public void user_enter_the_Search_Hotel_Enter_the_Below_Details_location_and_hotels_and_Roomtype_and_rooms_and_adults_and_children() 
{

SearchHotelpojo s = new SearchHotelpojo();
WebElement location = s.getLocation();
b.selectoptionbyindex(location, 2);
WebElement hotles = s.getHotles();
b.selectoptionbyindex(hotles, 3);
WebElement roomtype = s.getRoomtype();
b.selectoptionbyindex(roomtype, 1);
WebElement roomnos = s.getRoomnos();
b.selectoptionbyindex(roomnos, 1);	
WebElement adults = s.getAdults();
b.selectoptionbyindex(adults, 1);
WebElement children = s.getChildren();
b.selectoptionbyindex(children, 1);

}


@Then("User enter the details {string} and{string} and {string}and{string}and ctype and cmonth and cyear and {string}")
public void user_enter_the_details_and_and_and_and_ctype_and_cmonth_and_cyear_and(String f, String l, String address, String cc, String ccv)
{
	BookHotel b = new BookHotel();
	WebElement firstname = b.getFirstname();
	b.sendkeys(firstname, f);
	WebElement lastname = b.getLastname();
	b.sendkeys(lastname, l);
	WebElement address1 = b.getAddress();
	b.sendkeys(address1, address);
	WebElement ccdetails = b.getCcdetails();
	b.sendkeys(ccdetails, cc);
	WebElement cctype = b.getCctype();
	b.selectoptionbyindex(cctype, 2);
	WebElement ccexp = b.getCcexp();
	b.selectoptionbyindex(ccexp, 7);
	WebElement ccexpyear = b.getCcexpyear();
	b.selectoptionbyindex(ccexpyear, 5);
	WebElement cvv = b.getCvv();
	b.sendkeys(cvv,ccv );
	
	
	
	
}
}

