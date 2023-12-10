package Com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	WebDriver driver;
	public void DriverSetting(String url) {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void Automate() {
	
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Pritam");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Bhutia");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("pritam@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("8917558946");
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox2\"]")).click();
	    driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
	    driver.findElement(By.xpath("//a[text()=\"English\"]")).click();
	    WebElement dp1 = driver.findElement(By.xpath("//select[@type=\"text\"]"));
	    Select select = new Select(dp1);
	    select.selectByValue("Adobe InDesign");
	    driver.findElement(By.xpath("//select[@id=\"countries\"]")).click();
	    driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
	    driver.findElement(By.xpath("//li[text()=\"India\"]")).click();
	     JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	    WebElement dp2 = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
	    Select slct = new Select(dp2);
	    slct.selectByValue("1998");
	    WebElement dp3 = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
	    Select slc = new Select(dp3);
	    slc.selectByValue("February");
	    WebElement dp4 = driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
	    Select sl = new Select(dp4);
	    sl.selectByValue("16");
	    driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("Abc@hsj");
	    driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("Abc@hsj");
	    
       
	}

}
