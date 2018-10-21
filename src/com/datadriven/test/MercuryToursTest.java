package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class MercuryToursTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("REGISTER")).click();

	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider="getTestData")
	public void mercuryTourRegPageTest(String firstName, String lastName, String address1, String address2, String city,
			String state, String zipCode, String emailAddress) {

		// enter data:
		driver.findElement(By.xpath("//*[@name='firstName']")).clear();
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys(firstName);

		driver.findElement(By.xpath("//*[@name='lastName']")).clear();
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys(lastName);

		driver.findElement(By.xpath("//*[@name='address1']")).clear();
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys(address1);

		driver.findElement(By.xpath("//*[@name='address2']")).clear();
		driver.findElement(By.xpath("//*[@name='address2']")).sendKeys(address2);

		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys(city);

		driver.findElement(By.cssSelector("*[name='state']")).clear();
		driver.findElement(By.cssSelector("*[name='state']")).sendKeys(state);

		driver.findElement(By.xpath("//*[@name='postalCode']")).clear();
		driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys(zipCode);

		driver.findElement(By.xpath("//*[@name='email']")).clear();
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(emailAddress);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
