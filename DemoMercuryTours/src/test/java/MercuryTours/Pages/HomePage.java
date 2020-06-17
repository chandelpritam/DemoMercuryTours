package MercuryTours.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void ClickRegLink() {
		driver.findElement(By.linkText("REGISTER")).click();
	}

	public void login(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
}
