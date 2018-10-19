package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {

		// get test data from excel
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\Saurav Saha\\eclipse-workspace\\JavaTrainingSession\\src\\com\\testdata\\DataDriveTest.xlsx");
		String firstName = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstName);

		String lastName = reader.getCellData("RegTestData", "lastname", 2);
		System.out.println(lastName);

		String address1 = reader.getCellData("RegTestData", "address1", 2);
		System.out.println(address1);

		String address2 = reader.getCellData("RegTestData", "address2", 2);
		System.out.println(address2);

		String city = reader.getCellData("RegTestData", "city", 2);
		System.out.println(city);

		String state = reader.getCellData("RegTestData", "state", 2);
		System.out.println(state);

		String zipCode = reader.getCellData("RegTestData", "zipcode", 2);
		System.out.println(zipCode);

		String emailAddress = reader.getCellData("RegTestData", "emailaddress", 2);
		System.out.println(emailAddress);

		// webdriver code:
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys(lastName);
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys(address1);
		driver.findElement(By.xpath("//*[@name='address2']")).sendKeys(address2);

		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.cssSelector("*[name='state']")).sendKeys(state);
		driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys(zipCode);
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(emailAddress);

	}

}
