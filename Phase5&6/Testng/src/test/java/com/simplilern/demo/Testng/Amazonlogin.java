package com.simplilern.demo.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Amazonlogin {
	 
		WebDriver driver;
		SoftAssert soft= new SoftAssert();
  @Test
  public void f() {
	  String driver_path = "D:\\phase5 driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver = new ChromeDriver();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods = "f")
	public void TryFacebook() {
		
		driver.get("https://www.Amazon.com");
		driver.findElement(By.xpath("/html/body")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	@Test(dependsOnMethods ="TryFacebook" )
	public void login() {
		
		driver.findElement(By.id("email")).sendKeys("Vinod@gmail.com");
		
		driver.findElement(By.name("login")).click();
		
		soft.assertAll();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
  
