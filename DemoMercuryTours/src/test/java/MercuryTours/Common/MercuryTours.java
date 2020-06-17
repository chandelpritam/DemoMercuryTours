package MercuryTours.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {
	public static WebDriver launchApp() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Workspace\\LearnWellSelenium\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Settings.url);
		driver.manage().window().maximize();
		return driver;
	}

	public static void close(WebDriver driver) {
		driver.close();
	}

	public static void quit(WebDriver driver) {
		driver.quit();
	}
}
