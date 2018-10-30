package SeleniumSessions;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ManojVasalaCalendar {

	@Test
	public void selectDate() throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your depart year (YYYY format)");
		int required_year = Integer.parseInt(sc.nextLine());
		System.out.println("Enter your depart month (January,February,March,April,May,June,July and August)");
		String required_month = sc.nextLine();
		System.out.println("Enter your depart date");
		String required_date = sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// String str=System.getProperty("user.dir");
		// System.out.println(str);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		String text = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]")).getText();

		System.out.println("date picker :" + text);

		String str2[] = text.split(" ");
		int year = Integer.parseInt(str2[1].trim());
		System.out.println("default year is :" + year);

		WebElement next = driver.findElement(By.xpath("(//*[contains(text(),'Next')])[2]"));
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();

		Thread.sleep(2000);
		while (year < required_year) {

			wait.until(ExpectedConditions
					.elementToBeClickable(driver.findElement(By.xpath("(//*[contains(text(),'Next')])[2]")))).click();
			text = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]")).getText();
			str2 = text.split(" ");
			System.out.println("testing :" + str2[1]);
			year = Integer.parseInt(str2[1].trim());
			System.out.println("while loop page displayed month :" + str2[0]);
			System.out.println("while loop year " + year);
			str2[0] = str2[0].trim();

		}
		while (!(str2[0].equals(required_month))) {
			wait.until(ExpectedConditions
					.elementToBeClickable(driver.findElement(By.xpath("(//*[contains(text(),'Next')])[2]")))).click();
			text = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]")).getText();
			str2 = text.split(" ");
			System.out.println("testing :" + str2[1]);
			System.out.println("while loop page displayed month :" + str2[0]);
			System.out.println("while loop year " + year);
		}

		// dynmic custom
		// xpath=.//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr/td/a[text()='1']
		driver.findElement(
				By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr/td/a[text()='" + required_date + "']"))
				.click();
		Thread.sleep(2000);
		// driver.quit();

	}
}