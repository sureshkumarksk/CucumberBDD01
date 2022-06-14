package org.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;
public class Baseclass01

{
	 public static WebDriver driver;

	

	public WebDriver getdriver() {

		WebDriverManager.chromedriver().setup();
		return driver = new ChromeDriver();
	         }
	//2
	public void loadurl(String url) {
		driver.get(url);
		
	         }
	//4to maximize
	  public void tomaximize() {
	driver.manage().window().maximize();
	}

	//3
	public String currenturl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;

	}
	//4
	public WebElement findelementbyid(String attributevalue) {
		
	WebElement element = driver.findElement(By.id(attributevalue));
	return element;

		}
		//5
	public WebElement findelementbyname(String attributevalue) {
		
	WebElement element = driver.findElement(By.name(attributevalue));
	return element;
		
	}
	//6
	public WebElement findelementbyclass(String attributevalue) {
		
	WebElement element = driver.findElement(By.className(attributevalue));
	return element;
	}
	//7
	public WebElement findelementbyxpath(String attributevalue) {
		
	WebElement element = driver.findElement(By.xpath(attributevalue));
	return element;

	}

	//8
	public void type(WebElement element,String data ) {
		
		element.sendKeys(data);	
	}
	//9
	public void click(WebElement element) {
		
		element.click();
	}
	//10
	public String getText(WebElement element) {
		
		String text = element.getText();
		return text;
	}
	//11
	public String getTitel() {

		String title = driver.getTitle();
		return title;
		
	}

	public void sendkeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	//12
	public void selectoptionbytext(WebElement element, String Text) {
		Select select = new Select(element);
		select.selectByVisibleText(Text);
	}
	//13
	public void selectoptionbyindex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	//14
	public void selectoptionbyattribute(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		
	}
	//15
	//inserted value from text
	public String getattribute(WebElement element) {
		
	String string = element.getAttribute("value");
	return string;

	}
	//16
	public void accept() {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	//17
	public void dismiss() {

		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	//18
	public void prompetalertaccept() {
		Alert alert = driver.switchTo().alert();
	    alert.sendKeys("pugaz");
	    alert.accept();
	}
	//19
	public void movetoelement(WebElement element) {
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	//20
	public void dragandrop (WebElement source, WebElement destination ) {
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination).perform();
	}
	//21
	public void rightclick() {
		
		Actions act = new Actions(driver);
		act.contextClick();
		
	}
	//22
	public void keyupandkeydown() {
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.ENTER).perform();
		
	}
	//23
	public void keyup() {

		Actions act = new Actions(driver);
		act.keyUp(Keys.ENTER).perform();
		
	}

	//24
	public void js(String location) throws IOException {
		
		TakesScreenshot js = (TakesScreenshot)driver;
		File source = js.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(source, dest);

	}
	//25
	public void keypress() throws AWTException {

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
	}
	//26
	public void keyrelease() throws AWTException {

		Robot rob = new Robot();
		rob.keyRelease(KeyEvent.VK_UP);

	}
	//27
	public void navigatetoforward() {

		driver.navigate().to("url");
		
	}
	//28
	public void navigateforward() {

		driver.navigate().forward();	
		
	}
	//29
	public void navigatebackward() {
		
		driver.navigate().back();

	}

	//30
	public void navigaterefresh() {
	driver.navigate().refresh();
	}

	//31
	public void quit() {
		driver.quit();
	}
	//32
	public void close() {
		driver.close();
	}
	//33
	public void alertgettext() {
		Alert alert = driver.switchTo().alert();
		alert.getText();
	}
	//35
	public void switchtoframebyindex(int index) {
		driver.switchTo().frame(index);
		
	}
	//36

	public void switchtoframebyid(String id) {
		driver.switchTo().frame(id);
	}
	//37
	public void switchtoparrentwindow() {
		driver.switchTo().parentFrame();
	}
	//38
	public void switchtoframebyname(String name) {
		driver.switchTo().frame(name);
		
	}

	/*public int getnumericcell(String pugaz, int rowno, int cellno) throws IOException {
		File fil = new File("C:\\Users\\GATEWAY\\eclipse-workspace\\Baseclass\\xll\\pugazhbase.xlsx");
		FileInputStream stream = new FileInputStream(fil);	
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(pugaz);
		Row row =sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		double dub = cell.getNumericCellValue();
		BigDecimal dec = BigDecimal.valueOf(dub);
		int intValue = dec.intValue();
		return intValue;

	}

	public String getstringcellvalue(String pugaz, int rowno, int cellno ) throws IOException {

		File fil = new File("C:\\Users\\sures\\eclipse-workspace\\workspace2\\Frame\\Excell\\suresh.xlsx");
		FileInputStream stream = new FileInputStream(fil);	
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(pugaz);
		Row row =sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int Type = cell.getCellType();
		 if (Type==1) 
		 {
			String s1 = cell.getStringCellValue();
		 }
			else if (Type==0)
			{
				if (DateUtil.isCellDateFormatted(cell))
				{
					java.util.Date date = cell.getDateCellValue();
					
					SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yy");
					String format = sf.format(date);
				}
				
		 else  {
			
		
double numericCellValue = cell.getNumericCellValue();
long l = (long)numericCellValue;
String valueOf = String.valueOf(l);
			}
		return pugaz;
		
		 
		}
		return pugaz;
	}

		
	


	public String baseclassdata(String pugaz, int rowno, int cellno ) throws IOException {
		String result = null;
		File fil = new File("C:\\Users\\GATEWAY\\eclipse-workspace\\Baseclass\\xll\\pugazhbase.xlsx");
		FileInputStream stream = new FileInputStream(fil);	
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(pugaz);
		Row row =sheet.getRow(rowno);
		Cell cell = (Cell) row.getCell(cellno);
	/*	CellType type = cell.getCellType();	
		switch(type) {	
		case STRING:
			result = cell.getStringCellValue();
			break;
		case NUMERIC:		
			if(DateUtil.isCellDateFormatted(cell)) {			
				Date value = cell.getDateCellValue();
				SimpleDateFormat date = new SimpleDateFormat("dd/MMM/yy");
				result = date.format(value);
				//System.out.println(string);
			}
			else {
				double d = cell.getNumericCellValue();
				BigDecimal big = BigDecimal.valueOf(d);
				result = big.toString();}
				//System.out.println(str);}
			break;
			default:
			break;
			}*/
		/*return result;
				
		
		}
		
	public void createcellvalue(String pugaz, int rowno, int cellno, String data ) throws IOException {

		File fil = new File("C:\\Users\\GATEWAY\\eclipse-workspace\\Baseclass\\xll\\pugazhbase.xlsx");
		FileInputStream stream = new FileInputStream(fil);	
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(pugaz);
		Row row =sheet.getRow(rowno);
		Cell createCell = (Cell) row.createCell(cellno);
		((org.apache.poi.ss.usermodel.Cell) createCell).setCellValue(data);
		FileOutputStream out = new FileOutputStream(fil);
		book.write(out);*/
		
}

