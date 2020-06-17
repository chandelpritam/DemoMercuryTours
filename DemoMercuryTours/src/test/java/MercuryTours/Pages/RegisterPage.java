package MercuryTours.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void fillContactInformation(String firstName, String lastName, String phoneNo, String email)
			throws InterruptedException {
		driver.findElement(By.name("firstName")).sendKeys(firstName);
		Thread.sleep(2000);

		driver.findElement(By.name("lastName")).sendKeys(lastName);
		Thread.sleep(2000);

		driver.findElement(By.name("phone")).sendKeys(phoneNo);
		Thread.sleep(2000);

		driver.findElement(By.name("userName")).sendKeys(email);
		Thread.sleep(2000);
	}

	public void mailingInformation(String address, String city, String state, String pincode, String country)
			throws InterruptedException {
		driver.findElement(By.name("address1")).sendKeys(address);
		Thread.sleep(2000);

		driver.findElement(By.name("city")).sendKeys(city);
		Thread.sleep(2000);

		driver.findElement(By.name("state")).sendKeys(state);
		Thread.sleep(2000);

		driver.findElement(By.name("postalCode")).sendKeys(pincode);
		Thread.sleep(2000);

		WebElement selectCountry = driver.findElement(By.name("country"));
		Select dropdown = new Select(selectCountry);
		dropdown.selectByVisibleText(country);
	}

	public void fillUserInformation(String email, String password, String confirmPassword) throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(email);
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
		Thread.sleep(2000);
	}

	public void submitInformation() {
		driver.findElement(By.name("register")).click();

	}
}
