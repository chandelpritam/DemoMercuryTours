package MercuryTours.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookFlight {
	WebDriver driver;

	public BookFlight(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void passengerData(String firstName, String lastName, String meal) {
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys(lastName);

		WebElement selectMeal = driver.findElement(By.xpath("//select[@name='pass.0.meal']"));
		Select dropdown = new Select(selectMeal);
		dropdown.selectByVisibleText(meal);
	}

	public void creditCardData(String creditType, String number, String expirationDate, String expirationYear) {
		WebElement creditCardType = driver.findElement(By.xpath("//select[@name='creditCard']"));
		Select dropdown1 = new Select(creditCardType);
		dropdown1.selectByVisibleText(creditType);

		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys(number);

		WebElement creditCardExpirationDate = driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"));
		Select dropdown2 = new Select(creditCardExpirationDate);
		dropdown2.selectByValue(expirationDate);

		WebElement creditCardExpirationYear = driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"));
		Select dropdown3 = new Select(creditCardExpirationYear);
		dropdown3.selectByValue(expirationYear);
	}

	public void creditCardInfo(String firstName, String middleName, String lastName) {
		driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys(middleName);
		driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys(lastName);
	}

	public void ticketLessTravel(boolean checked) {
		WebElement ticketLessTravel = driver
				.findElement(By.xpath("//font[contains(text(),'Ticketless')]/preceding-sibling::input"));
		if (checked) {
			if (!ticketLessTravel.isSelected()) {
				ticketLessTravel.click();
			}
		} else {
			if (ticketLessTravel.isSelected()) {
				ticketLessTravel.click();
			}
		}
	}

	public void billingAddress(String address, String city, String postalCode) {
		driver.findElement(By.xpath("//input[@name='billAddress1']")).clear();
		driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@name='delCity']")).clear();
		driver.findElement(By.xpath("//input[@name='delCity']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name='delZip']")).clear();
		driver.findElement(By.xpath("//input[@name='delZip']")).sendKeys(postalCode);
	}

	public void stateAndCountryInfo(String state, String country) {
		driver.findElement(By.xpath("//input[@name='delState']")).clear();
		driver.findElement(By.xpath("//input[@name='delState']")).sendKeys(state);

		WebElement selectCountry = driver.findElement(By.xpath("//select[@name='delCountry']"));
		Select dropdown4 = new Select(selectCountry);
		dropdown4.selectByVisibleText(country);
	}
}
