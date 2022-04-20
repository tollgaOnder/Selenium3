package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxDriver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");

		WebDriver dr = new FirefoxDriver(); // This will open firefox browser

		dr.get("https://www.facebook.com/"); // This will navigate to facebook.com

		String actualURL = dr.getCurrentUrl(); // The url of the website
		String expectedURL = "https://www.facebook.com/";

		if (actualURL.equalsIgnoreCase(expectedURL)) {
			// return the title of the web application
			System.out.println("Title = " + dr.getTitle());
		} else {
			System.out.println("The url is wrong!!!");
		}

		Thread.sleep(2000); // Wait for 2 seconds

		dr.close(); // This will terminate/close the browser

	}
}
