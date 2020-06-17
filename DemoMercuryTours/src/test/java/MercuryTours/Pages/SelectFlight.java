package MercuryTours.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlight {
	WebDriver driver;

	public SelectFlight(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void continueButton() {
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	}
}
