package SeleniumSessions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.json.JsonParser.ParseException;

public class SelectCalnedarByJS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies

		driver.get("https://www.spicejet.com/");

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement date = driver
				.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']/following-sibling::button"));
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']/following-sibling::button")).click();

		Thread.sleep(2000);
		
	    //driver.findElement(By.xpath("//td[@data-month='12' and @data-year='2019']//a[text()='20']")).click();

		String dateVal = "16/11";

		selectDateByJS(driver, date, dateVal);

	}

	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].setAttribute('value','" + dateVal + "');", element);

	}

}
