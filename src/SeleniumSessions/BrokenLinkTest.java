package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies

		// driver.get("https://www.freecrm.com/");// enter url
		driver.get("https://makemysushi.com/404?");// enter url
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.findElement(By.name("username")).sendKeys("srv321");
		// driver.findElement(By.name("password")).sendKeys("test@123");
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@type='submit']")).click();
		// Thread.sleep(2000);

		// driver.switchTo().frame("mainpanel");

		// links -- //a href<https://www.google.com>
		// images -- //img href <https://www.test.com>

		// 1.get the list of all links and images:500
		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		linksList.addAll(driver.findElements(By.tagName("img")));

		System.out.println("size of full links and images-->" + linksList.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		// 2.iterate linksList :exclude all the links/images - doesnt have any href
		// attribute

		for (int i = 0; i < linksList.size(); i++) {

			System.out.println(linksList.get(i).getAttribute("href"));
			if (linksList.get(i).getAttribute("href") != null
					&& (!linksList.get(i).getAttribute("href").contains("javascript"))) {

				activeLinks.add(linksList.get(i));
			}

		}

		// get the size of active links list:
		System.out.println("size of active links and images-->" + activeLinks.size());

		// 3. check the href url, with httpconnection api:
		// 200 -- ok
		// 404 -- not found
		// 500 -- internal error
		// 400 -- bad request

		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") + "-->" + response);

		}

	}

}
