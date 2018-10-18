package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropBoxHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies

		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		driver.findElement(By.xpath("//input[@value='Java']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@value='Java']")).click();

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//input"));

		System.out.println(list.size());

		// for (int i = 0; i < list.size(); i++) {
		//
		// if (list.get(i).getText().contains("Java")) {
		//
		// list.get(i).click();
		// break;
		// }
		//
		// }

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getText());

			if (!list.get(i).isSelected()) {

				list.get(i).click();
			}

		}

	}

}
