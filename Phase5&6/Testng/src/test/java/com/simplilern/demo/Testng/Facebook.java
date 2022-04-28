package com.simplilern.demo.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {
  
	WebDriver driver=null;
	
	@Test
	public void welcome() {
		
		System.out.println("Welcome to FaceBook Automation Test");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before Method");
		
		String driver_path = "D:\\phase5 driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("Nikunj@gmail.com");
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After Method");
		driver.close();
		driver=null;
		
	}
}