package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// 4.linkTest:only fir links
		driver.findElement(By.linkText("REGISTER")).click();

		// 1.xpath: --2
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Tom");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Peter");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("12 , new street");

		// 2. id :--1

		driver.findElement(By.id("userName")).sendKeys("abc.xyz@def.com");

		// 3. name :--3

		driver.findElement(By.name("city")).sendKeys("Chicago");

		// 5.partiallinkText: not useful
		// driver.findElement(By.partialLinkText("Destin")).click();

		// 6. CSSSelector:--2

		driver.findElement(By.cssSelector("*[name='state']")).sendKeys("Illinois");

		// 7. class name:not useful --4

		// Completing the rest of the form fields:
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("TUNISIA");

		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("def");
		driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("def");
		driver.findElement(By.name("register")).click();

		// driver.quit();

	}

}
