package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2 {
//	Test Case
//	Open chrome browser
//	Go to “http://demo.guru99.com/test/newtours/”
//	Click on Register Link
//
//	Fill out just
//	First Name:	
//	Last Name:	
//	Phone:	
//	Email:	
//	And Click Submit 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// driver.findElement(By.linkText("REGISTER")).click();

		// Doing it in 2 steps
		WebElement element = driver.findElement(By.linkText("REGISTER"));
		element.click();

		driver.findElement(By.name("firstName")).sendKeys("Serhat");
		driver.findElement(By.name("lastName")).sendKeys("Ucal");
		driver.findElement(By.name("phone")).sendKeys("123-456-7890");
		driver.findElement(By.id("userName")).sendKeys("serhat@neotech.com");
		Thread.sleep(2000);

		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);

		driver.quit();
	}
}
