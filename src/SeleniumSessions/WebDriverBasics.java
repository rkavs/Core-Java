package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// 1. FF browser:
		// geckodriver- is a class

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver(); // FF driver is a class implementing
		// WD Interface\

		// driver.get("http://www.google.com");

		// 2. chrome browser:

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		String title = driver.getTitle();
		System.out.println(title);

		// validation point
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");
		}

		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		driver.quit();// quit the browser

	}

}
