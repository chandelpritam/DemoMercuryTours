package MercuryTours.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import MercuryTours.Common.TripType;

public class FlightFinderPage {
	WebDriver driver;

	public FlightFinderPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void flightDetails(TripType type, String passenger)
			throws InterruptedException, InvalidRadioButtonException {

		switch (type) {
		case RoundTrip:
			driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
			break;
		case OneWay:
			driver.findElement(By.xpath("//input[@value='oneway']")).click();
			break;
		default:
			throw new InvalidRadioButtonException();
		}

		WebElement selectPassenger = driver.findElement(By.xpath("//select[@name='passCount']"));
		Select dropDown1 = new Select(selectPassenger);
		dropDown1.selectByValue(passenger);
		Thread.sleep(3000);
	}

	public void departingDetails(String departingFrom, String departingOnMonth, String departingOnDate)
			throws InterruptedException {

		WebElement selectDepartingFrom = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select dropwown2 = new Select(selectDepartingFrom);
		dropwown2.selectByVisibleText(departingFrom);
		Thread.sleep(3000);

		WebElement selectDepartingOnMonth = driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select dropdown3 = new Select(selectDepartingOnMonth);
		dropdown3.selectByVisibleText(departingOnMonth);
		Thread.sleep(3000);

		WebElement selectDepartingOnDate = driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select dropdown4 = new Select(selectDepartingOnDate);
		dropdown4.selectByVisibleText(departingOnDate);
		Thread.sleep(3000);
	}

	public void arrivingDetails(String arrivingIn, String returningMonth, String returningDate)
			throws InterruptedException {
		WebElement selectArrivingIn = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select dropdown5 = new Select(selectArrivingIn);
		dropdown5.selectByVisibleText(arrivingIn);
		Thread.sleep(3000);

		WebElement selectReturningMonth = driver.findElement(By.xpath("//select[@name='toMonth']"));
		Select dropdown6 = new Select(selectReturningMonth);
		dropdown6.selectByVisibleText(returningMonth);
		Thread.sleep(3000);

		WebElement selectReturningDate = driver.findElement(By.xpath("//select[@name='toDay']"));
		Select dropdown7 = new Select(selectReturningDate);
		dropdown7.selectByValue(returningDate);
		Thread.sleep(3000);
	}

	public void serviceType(ServiceType type, String airLine) throws InterruptedException, InvalidRadioButtonException {
		switch (type) {
		case EconomiClass:
			driver.findElement(By.xpath("//input[@value='Coach']")).click();

		case BussinessClass:
			driver.findElement(By.xpath("//input[@value='Business']")).click();

		case FirstClass:
			driver.findElement(By.xpath("//input[@value='First']")).click();

		}
		WebElement selectAirline = driver.findElement(By.xpath("//select[@name='airline']"));
		Select dropdown8 = new Select(selectAirline);
		dropdown8.selectByVisibleText(airLine);
	}

	public void continueButton() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		Thread.sleep(5000);
	}

}
