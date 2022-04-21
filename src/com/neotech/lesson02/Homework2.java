package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
//		HW2: Opening Page on Firefox Browser
//		Open Firefox browser
//		Navigate to “https://www.redfin.com/”
//		Verify that you have navigated to (https://www.redfin.com/)
//		End the Session (close the browser).

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");

		// Open Firefox browser
		WebDriver driver = new FirefoxDriver();

		String url = "https://www.redfin.com/";

		// Navigate to https://www.redfin.com/
		driver.get(url);

		// Gives us the url of the page that we are currently
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(url)) {
			System.out.println("Url is as expected -> " + actualURL);
		} else {
			System.out.println(actualURL + " <- is NOT as expected -> " + url);
		}

		Thread.sleep(500); // Wait for 0.5 seconds

		driver.quit();

	}
}
