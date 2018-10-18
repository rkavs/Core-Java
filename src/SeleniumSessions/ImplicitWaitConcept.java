package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies

		driver.get("http://jqueryui.com/droppable/");
		// dynamic wait/Global wait--Thread.sleep is static wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//max waits for 40 secs if loaded earlier then time saved
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//waits fr all 

	}

}
