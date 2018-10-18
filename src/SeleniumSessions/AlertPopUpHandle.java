package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("proceed")).click();// click on go btn

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct alert msg");
		} else {
			System.out.println("in-correct alert msg");
		}

		alert.accept(); // clicks on ok button
		// alert.dismiss();//clicks on cancel button

	}

}
