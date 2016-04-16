package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.amd64.*;

import junit.framework.Assert;

// This is as rudimentary program created for 
// automation navigation of the "http://www.uptake.com" website.

public class TestUptake {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String driverName = "Firefox";
		String homePage = "http://www.uptake.com";
		
		WebDriver driver = HomePage(driverName, homePage);
		ApproachPage(driver);
		driver.quit();
	}
	
	
	// Class HomePage - is the class used to navigate the home web page "http://www.uptake.com".
	private static WebDriver HomePage(String driverName, String homePage) throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement link;
		WebDriver driver = new FirefoxDriver();
		driver.get(homePage);
		System.out.println("Navigated to HomePage");
		link = driver.findElement(By.linkText("Approach"));
		Thread.sleep(1000);
		link.click();
		System.out.println("HomePage-Approach-Click");
		return driver;
	}

	// Class ApproachPage - is the class used to navigate the Approach web page "http://www.uptake.com/approach".
	private static WebDriver ApproachPage(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(500);
		System.out.println("Navigating Approach Page");
	
		Thread.sleep(500);
		
		if(driver.getPageSource().contains("How we build our products"))
		{
			System.out.println("Confirmation - On Approach Page");
		}
		else
		{
			System.out.println("TEXT NOT TOUND");
		}
		Thread.sleep(1000);
		
		return driver;
	}

}
