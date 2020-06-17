package MercuryTours.TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import MercuryTours.Common.MercuryTours;

class JunitTestCase {
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

	@DisplayName(value = "Home Page TestCase")
	@Test
	void HomePageTestCase() {
		String exceptedTitle = "Welcome: Mercury Tours";
		String actualResult = driver.getTitle();
		assertEquals(exceptedTitle, actualResult, "HomePage Title is correct");
	}

}
