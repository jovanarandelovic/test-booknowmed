package tests;

import org.testng.annotations.Test;

public class RegistrationTest extends BasicTest {


	@Test
	public void registrationTest() {
		this.driver.navigate().to("https://bnm.neopixdev.com/dialysis/register");

	}
}