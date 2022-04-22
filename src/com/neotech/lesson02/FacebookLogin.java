package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// typing email into text box
		driver.findElement(By.id("email")).sendKeys("neotech@gmail.com");

		// typing the password
		driver.findElement(By.name("pass")).sendKeys("NeotechAcademy@123");
		
		// driver.findElement(By.id("u_0_h_cF")).click();
		// It will not find because the id changes everytime

		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}
