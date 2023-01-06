package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class RegistrationTest extends Base {
	public WebDriver driver;
	@Test
	public void registrationTest() throws IOException, InterruptedException {
		System.out.println("RegistrationTest");
		 driver = initializeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		Thread.sleep(2000);
		driver.close();
	}

}
