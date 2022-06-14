package org.adactian;

import org.Baseclass.Baseclass01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclass.BookHotel;
import org.pojoclass.OrederID;
import org.pojoclass.Pojoclass;
import org.pojoclass.SearchHotelpojo;
import org.pojoclass.SelectHotel;

import io.cucumber.java.en.*;

public class TagStepDef extends Baseclass01 {
	 public static Baseclass01 b;
	
	@Given("User Launch the Webbrowser and hit the Url")
	public void user_Launch_the_Webbrowser_and_hit_the_Url() 
	{
	b = new Baseclass01();
		b.getdriver();
		b.loadurl("http://adactinhotelapp.com/");
		b.tomaximize();
		
	}

	@Then("User verify the the Adactin webpage Should be Displayed")
	public void user_verify_the_the_Adactin_webpage_Should_be_Displayed() 
	{
		System.out.println("Home page Should Be Displayed");
	}

	@When("User Enter The Valid UserName And Valid PassWordAnd User Click The login Button")
	public void user_Enter_The_Valid_UserName_And_Valid_PassWordAnd_User_Click_The_login_Button() 
	{
		Pojoclass p = new Pojoclass();
		WebElement username = p.getUsername();
		b.sendkeys(username, "RVAravindh");
		WebElement password = p.getPassword();
		b.sendkeys(password, "@12345");
		WebElement loginbutton = p.getLoginbutton();
		b.click(loginbutton);
		
		
	}

	@Then("User Verify the Login Feature As should Be open Succesfully")
	public void user_Verify_the_Login_Feature_As_should_Be_open_Succesfully() 
	{
		System.out.println("Login page is Should Be Displayed");
	}

	@Given("User Verify the Search page Should Be Displayed")
	public void user_Verify_the_Search_page_Should_Be_Displayed()
	{
		System.out.println("Search page should be displayed");
	}

	@Given("User Enter the 	All the Details With In the text Box and Select the Drop Down Fields")
	public void user_Enter_the_All_the_Details_With_In_the_text_Box_and_Select_the_Drop_Down_Fields()
	{
		SearchHotelpojo s = new SearchHotelpojo();
		WebElement location = s.getLocation();
		b.selectoptionbyindex(location, 2);
		WebElement hotles = s.getHotles();
		b.selectoptionbyindex(hotles, 2);
		WebElement roomtype = s.getRoomtype();
		b.selectoptionbyindex(roomtype, 2);
		WebElement roomnos = s.getRoomnos();
		b.selectoptionbyindex(roomnos, 1);
		WebElement adults = s.getAdults();
		b.selectoptionbyindex(adults, 1);
		WebElement children = s.getChildren();
		b.selectoptionbyindex(children, 1);
	}

	@Given("User Click the Search Button")
	public void user_Click_the_Search_Button() 
	{
		SearchHotelpojo s = new SearchHotelpojo();
		WebElement submit = s.getSubmit();
		b.click(submit);
	}
	
	

	@Then("User verify the while click the Search Button the page should Be Move to Next page")
	public void user_verify_the_while_click_the_Search_Button_the_page_should_Be_Move_to_Next_page()
	{
		System.out.println("Search Button Works properly");
	}

	@Given("User Select the Hotel And Click the Hotel By using Radiobutton")
	public void user_Select_the_Hotel_And_Click_the_Hotel_By_using_Radiobutton()
	{
		SelectHotel s = new SelectHotel();
		WebElement selectradio = s.getSelectradio();
		b.click(selectradio);
		
	}

	@Given("User click the Continue Button")
	public void user_click_the_Continue_Button()
	{
		SelectHotel s = new SelectHotel();
		WebElement continuee = s.getContinuee();
		b.click(continuee);
	}

	@Given("User Enter the Datas In the Given Text Box as Well As Drop Down Fields")
	public void user_Enter_the_Datas_In_the_Given_Text_Box_as_Well_As_Drop_Down_Fields() 
	{
		BookHotel p = new BookHotel();
		WebElement firstname = p.getFirstname();
		b.sendkeys(firstname, "Suresh kumar");
		WebElement lastname = p.getLastname();
		b.sendkeys(lastname, "K");
		WebElement address = p.getAddress();
		b.sendkeys(address, "Pollachi");
		WebElement ccdetails = p.getCcdetails();
		b.sendkeys(ccdetails, "1234567891234567");
		WebElement cctype = p.getCctype();
		b.selectoptionbyindex(cctype, 1);
		WebElement ccexp = p.getCcexp();
		b.selectoptionbyindex(ccexp, 4);
		WebElement ccexpyear = p.getCcexpyear();
		b.selectoptionbyindex(ccexpyear, 3);
	    WebElement cvv = p.getCvv();
		b.sendkeys(cvv, "1322");
		
	}

	@Given("User click the Booknow  Button As Well As Verify the cancel Button Should Be Displayed")
	public void user_click_the_Booknow_Button_As_Well_As_Verify_the_cancel_Button_Should_Be_Displayed() 
	{
		BookHotel p = new BookHotel();
		WebElement booknow = p.getBooknow();
		b.click(booknow);
		System.out.println("cancel button should be displayed");
	}
	@Then("User Verify the Book Hotel page Is Displayed")
	public void user_Verify_the_Book_Hotel_page_Is_Displayed() 
	{
		System.out.println("Book hotel page is displayed ");
	}

	@Given("User Can See the Order Id and Other Details")
	public void user_Can_See_the_Order_Id_and_Other_Details() throws InterruptedException
	{
		Thread.sleep(5000);
		OrederID o = new OrederID();
		WebElement ordernum = o.getOrdernum();
		String getattribute = b.getattribute(ordernum);
		System.out.println(getattribute);
		System.out.println("user can see the order id");
	}

	@Then("User verify the Logout Button Should Be displayed")
	public void user_verify_the_Logout_Button_Should_Be_displayed() 
	{
		System.out.println("Logout button should be displayed");
	}

	@Then("user verify the My liternery Button as well as Search hotel Button is Displayed in the below the details")
	public void user_verify_the_My_liternery_Button_as_well_as_Search_hotel_Button_is_Displayed_in_the_below_the_details()
	{
		System.out.println("liternery and Search hote should be displayed");
	}

	@Then("User click the Logout Button")
	public void user_click_the_Logout_Button() {
	}

	@Then("User verify the logout Was Succesfully")
	public void user_verify_the_logout_Was_Succesfully() 
	{
		
		
		System.out.println("Log out succesfully");
		
	}
	@Given("User click the Log out")
	public void user_click_the_Log_out() 
	{
		WebElement findElement = driver.findElement(By.id("logout"));
		findElement.click();
	}


}
