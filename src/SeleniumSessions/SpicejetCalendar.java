package SeleniumSessions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetCalendar {

	public static void selectDate(WebElement calendar, String year, String monthName, String day, WebDriver driver)
			throws ParseException {

		calendar = driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_view_date1']"));

		calendar.click();

		String currentYear = driver
				.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']"))
				.getText();

		if (!currentYear.equals(year))

		{

			do {

				driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();

			} while (!driver
					.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']"))
					.getText().equals(year));

		}

		System.out.println(currentYear);

		String currentMonth = driver
				.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]"))
				.getText();

		if (!currentMonth.equalsIgnoreCase(monthName))

		{

			do {

				driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();

			} while (!driver
					.findElement(
							By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]"))
					.getText().trim().equalsIgnoreCase(monthName));

		}

		int javaMonthInt = SpicejetCalendar.getMonthJavaInt(monthName);

		System.out.println(monthName);

		// Find dates of desired month only

		List<WebElement> allDateOfDesiredMonth = driver.findElements(By.xpath(
				"//div[@class='ui-datepicker-group ui-datepicker-group-first']//table/tbody[1]//td[(@class=' ' or @class=' ui-datepicker-week-end ' ) and @data-month='"
						+ javaMonthInt + "']"));

		for (WebElement d : allDateOfDesiredMonth)

		{

			if (d.getText().trim().equals(day))

			{

				d.click();

				break;

			}

		}

	}

	public static int getMonthJavaInt(String monthName) throws ParseException

	{

		// Code to get java month number

		Date date = new SimpleDateFormat("MMMM").parse(monthName);

		Calendar cal = Calendar.getInstance();

		cal.setTime(date);

		return cal.get(Calendar.MONTH);

	}

	public static void main(String[] args) throws ParseException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.spicejet.com/");

		WebElement departCal = driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_view_date1']"));

		SpicejetCalendar.selectDate(departCal, "2019", "August", "31", driver);

	}

}
