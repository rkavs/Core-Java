package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:\\Users\\Saurav Saha\\eclipse-workspace\\JavaTrainingSession\\src\\SeleniumSessions\\config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");

		System.out.println(url);

		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();// maximize window
			driver.manage().deleteAllCookies();// delete all cookies
		}
		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();// maximize window
			driver.manage().deleteAllCookies();// delete all cookies
		}
		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\internetexplorerdriver.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();// maximize window
			driver.manage().deleteAllCookies();// delete all cookies
		}
		
		Thread.sleep(2000);

		driver.get(url);
		driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys(prop.getProperty("lastName"));

	}

}
