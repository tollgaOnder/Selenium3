package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.facebook.com/");
		// will NOT store the history
		// wait for the page elements to be loaded

		driver.navigate().to("https://www.amazon.com/");
		// saves the history
		// does NOT wait the page to be fully loaded

		Thread.sleep(1000);

		driver.manage().window().maximize(); // --> makes full screen
		// driver.manage().window().fullscreen(); // --> makes full screen
		Thread.sleep(1000);

		driver.navigate().refresh(); // refresh the page
		Thread.sleep(1000);

		driver.navigate().to("https://github.com/");
		Thread.sleep(1000);

		driver.navigate().back(); // I want to go back to amazon
		Thread.sleep(1000);

		driver.navigate().forward(); // Brings you forward to github page

		Thread.sleep(2000);

		driver.close(); // Closes the current tab (webpage)
		driver.quit(); // Closes all tabs (webpages)
	}

}
