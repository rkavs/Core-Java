package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@Test
	@Parameters({"env","browser", "url", "emailId" })
	public void yahooLoginTest(String env,String browser, String url, String emailId) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies
		driver.get(url);

		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(emailId);
		driver.findElement(By.name("signin")).click();

	}

}
