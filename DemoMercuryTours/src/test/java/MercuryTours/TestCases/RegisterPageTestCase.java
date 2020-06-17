package MercuryTours.TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import MercuryTours.Common.MercuryTours;
import MercuryTours.Pages.HomePage;

class RegisterPageTestCase {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		MercuryTours.quit(driver);

	}

	@BeforeEach
	void setUp() throws Exception {
		driver = MercuryTours.launchApp();

	}

	@AfterEach
	void tearDown() throws Exception {
		MercuryTours.close(driver);

	}

	@Test
	void RegisterHomePageTestCase() {
		HomePage homePage = new HomePage(driver);
		homePage.ClickRegLink();
		assertEquals("Register: Mercury Tours", driver.getTitle(), "Home Page Title is correct");
	}

}
