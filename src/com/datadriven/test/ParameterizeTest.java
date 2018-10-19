package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {

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
		
		//Data Driven Approach (Parameterization) -- used to create data driven framework : 
		//driving the data from excel files

		// get test data from excel
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\Saurav Saha\\eclipse-workspace\\JavaTrainingSession\\src\\com\\testdata\\DataDriveTest.xlsx");
		int rowCount = reader.getRowCount("RegTestData");

		// Parameterization
		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {

			System.out.println("**********");

			String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
			System.out.println(firstName);

			String lastName = reader.getCellData("RegTestData", "lastname", rowNum);
			System.out.println(lastName);

			String address1 = reader.getCellData("RegTestData", "address1", rowNum);
			System.out.println(address1);

			String address2 = reader.getCellData("RegTestData", "address2", rowNum);
			System.out.println(address2);

			String city = reader.getCellData("RegTestData", "city", rowNum);
			System.out.println(city);

			String state = reader.getCellData("RegTestData", "state", rowNum);
			System.out.println(state);

			String zipCode = reader.getCellData("RegTestData", "zipcode", rowNum);
			System.out.println(zipCode);

			String emailAddress = reader.getCellData("RegTestData", "emailaddress", rowNum);
			System.out.println(emailAddress);

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

	}

}
