package org.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static WebDriver driver;

	@Given("user open the browser And enter the FaceBook url")
	public void user_open_the_browser_And_enter_the_FaceBook_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@When("user enter the valid username and valid password")
	public void user_enter_the_valid_username_and_valid_password() {
		driver.findElement(By.id("email")).sendKeys("9842432727");
		driver.findElement(By.id("pass")).sendKeys("13223202");

	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
	}

	@Then("user verify the home page is dispalyed")
	public void user_verify_the_home_page_is_dispalyed() {
		System.out.println("Home Page Should Be Displayed");

	}
	@When("user enter the valid {string} and valid {string}")
	public void user_enter_the_valid_and_valid(String username, String password) 
	{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

}
