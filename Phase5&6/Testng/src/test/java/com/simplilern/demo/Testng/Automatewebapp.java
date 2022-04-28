package com.simplilern.demo.Testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	


	public class Automatewebapp {

		public static void main(String[] args){
			
//			For Chrome Browser
			
			System.setProperty("webdriver.chrome.driver", "D:\\phase5 driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://phptravels.net/login");
			driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
			driver.findElement(By.name("password")).sendKeys("demouser");
			driver.findElement(By.cssSelector("button[type='submit']")).click();


		}
	}
