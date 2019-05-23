package com.google.qa;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BatchDemo2 {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void setup()throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
			driver=new ChromeDriver();
		
	}
	
	@Test
	public void testBrowser() {
		driver.get("http://demo.guru99.com/V4/");
		//Find user name
				driver.findElement(By.name("uid")).sendKeys("guru99");
			//Find password
		driver.findElement(By.name("password")).sendKeys("guru99");
				
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}


}
