package SeleniumSessions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.json.JsonParser.ParseException;

public class DummyCalendar {

	public static void main(String[] args) throws InterruptedException, ParseException, java.text.ParseException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies

		driver.get("https://www.spicejet.com/");

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement departDate = driver
				.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']/following-sibling::button"));

		Thread.sleep(2000);

		// Different Date Formats: Java SimpleDateFormat Class
		// Date Format with MM/dd/yyyy : 04/13/2015
		// Date Format with dd-M-yyyy hh:mm:ss : 13-4-2015 10:59:26
		// Date Format with dd MMMM yyyy : 13 April 2015
		// Date Format with dd MMMM yyyy zzzz : 13 April 2015 India Standard Time
		// Date Format with E, dd MMM yyyy HH:mm:ss z : Mon, 13 Apr 2015 22:59:26 IST

		String userEnteredDate = "08/31/2019"; // MM/dd/yyyy

		String dateFormatRequired = conversionDates("MM/dd/yyyy", "dd/MMMM/yyyy", userEnteredDate);

		System.out.println("dateFormatRequired is--> " + dateFormatRequired);

		String dateArr[] = dateFormatRequired.split("/");

		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']/following-sibling::button")).click();

		Thread.sleep(2000);

		while (!driver.findElement(By.xpath(
				"//div[@id='ui-datepicker-div']//*[@class='ui-datepicker-month']"))
				.getText().contains(month)) {
			//Thread.sleep(1000);

			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		}

		List<WebElement> list = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getText().equalsIgnoreCase(day)) {
				Thread.sleep(1000);

				list.get(i).click();
				break;

			}
		}

	}

	public static String conversionDates(String inputPattern, String outputPattern, String givenDate)
			throws ParseException, java.text.ParseException {
		SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);

		SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);

		Date date = null;

		String requiredDate = null;

		date = inputFormat.parse(givenDate);

		requiredDate = outputFormat.format(date);

		return requiredDate;
	}

}
