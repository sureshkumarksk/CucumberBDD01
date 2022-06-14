package org.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	public static WebDriver driver;
	
	public void launcbrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	
    }
	public void loadurl(String url) 
	{
      driver.get(url);
	}
	public void maximize()
	{
       driver.manage().window().maximize();
       
	}
public void type(WebElement element,String data ) {
		
		element.sendKeys(data);	
	}
	public String gettext(WebElement element) 
	{
       String text = element.getText();
       System.out.println(text);
       return text;
       
	}
	public boolean currenturl(String s)
	{
		boolean currenturl = driver.getCurrentUrl().contains("");
		 return currenturl;   
	}
	public boolean errormsg(WebElement element,String s1)
	{
		boolean errormsg = element.getText().contains("");
		return errormsg;
	}
	public void quit() 
	{
      driver.quit();
	}
	public void close() 
	{
		driver.close();

	}
	public void select(WebElement element,int index) 
	{
      Select s = new Select(element);
      s.selectByIndex(index);
      
	}
	public void click(WebElement element) 
	{ 
		element.click();

	}
	public void attributevalue(WebElement element,String attributevalue)
	{
		String attribute = element.getAttribute(attributevalue);
		System.out.println(attribute);	
		
	}
	
	
	
	
}
