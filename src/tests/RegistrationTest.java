package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MessagesPage;
import pages.RegistrationPage;

public class RegistrationTest extends BasicTest {

	@Test(priority = 0, description = "Cancel Registration at Step 1")
	public void RegistrationCancelStepOne() throws InterruptedException {

		// Cancel Registration at Step 1

		this.driver.navigate().to(baseURL + "/dialysis/register");
		this.driver.manage().window().maximize();

		RegistrationPage rp = new RegistrationPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);

		rp.cancelRegistration();

		Thread.sleep(25000);

		Assert.assertTrue(mp.getMainPageMsg().contains("Find & book your holiday dialysis anywhere"),
				"[ERROR] Did not cancel registration!");

	}

	@Test(priority = 1, description = "Returns to previous step")
	public void RegistrationBackButton() throws InterruptedException {

		// Go back to Step 1

		this.driver.navigate().to(baseURL + "/dialysis/register");
		this.driver.manage().window().maximize();

		RegistrationPage rp = new RegistrationPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);

		rp.goBack();

		Thread.sleep(2500);

		Assert.assertTrue(mp.getStep1Message().contains("Register"), "[ERROR] Did not go one step back!");

	}

	@Test(priority = 2, description = "Cancels Registration at Step 2")
	public void RegistrationCancelStepTwo() throws InterruptedException {

		// Cancel Registration at Step 2

		this.driver.navigate().to(baseURL + "/dialysis/register");
		this.driver.manage().window().maximize();

		RegistrationPage rp = new RegistrationPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);

		rp.setRegistrationInfo("Mr", "Dummy", "User", "05/11/1980", "email@email.com", "password123", "45", "123456",
				"Myself");

		rp.cancelRegistration();

		Thread.sleep(2500);

		Assert.assertTrue(mp.getMainPageMsg().contains("Find & book your holiday dialysis anywhere"),
				"[ERROR] Did not cancel registration!");

	}

	@Test(priority = 3, description = "Completes Step 1")
	public void RegistrationTestStep1() throws InterruptedException {

		this.driver.navigate().to(baseURL + "/dialysis/register");
		this.driver.manage().window().maximize();

		RegistrationPage rp = new RegistrationPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);

		rp.setRegistrationInfo("Ms", "Dummy", "User", "01/01/1980", "dummyemail1@email.com", "password123", "381",
				"123456789", "Both");

		Thread.sleep(2500);

		rp.register();

		Assert.assertTrue(mp.getNextStepMsg().contains("Step 2"), "[ERROR] Did not go to the next step!");

	}

	@Test(priority = 4, description = "Register Myself")
	public void RegistrationBookingForMyself() throws InterruptedException {

		// Step 1 registration

		this.driver.navigate().to(baseURL + "/dialysis/register");
		this.driver.manage().window().maximize();

		RegistrationPage rp = new RegistrationPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);

		// Booking
		rp.setRegistrationInfo("Ms", "Dummy", "User", "01/01/1980", "dummyemailmyself@email.com", "password123", "381",
				"123456789", "Myself");

		Thread.sleep(1000);

		rp.bookingForMyself(false, true, true, true, true, "Home Clinic", "New York", "123", "56789", "no", true);

		Thread.sleep(2000);

		Assert.assertTrue(mp.getRegisterMessage().contains("Sucess")); // spelling error

	}

	@Test(priority = 5, description = "Register Someone Else")
	public void RegistrationBookingForSomeoneElse() throws InterruptedException {

		// Step 1 registration

		this.driver.navigate().to(baseURL + "/dialysis/register");
		this.driver.manage().window().maximize();

		RegistrationPage rp = new RegistrationPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);

		// Booking
		rp.setRegistrationInfo("Ms", "Dummy", "User", "01/01/1980", "dummyemailsomeone@email.com", "password123", "381",
				"123456789", "Someone else");

		Thread.sleep(1000);

		rp.bookingForSomeoneElse("Mrs", "Dummy", "Patient", "16/06/1965", "patient@email.com", "123", "123456", true,
				true, false, true, false, "Home Clinic", "LA", "123", "123456", "yes", true);

		Thread.sleep(2000);

		rp.register();

		Assert.assertTrue(mp.getRegisterMessage().contains("Sucess")); // spelling error

	}

	@Test(priority = 6, description = "Register Both")
	public void RegistrationBookingForBoth() throws InterruptedException {

		// Step 1 registration

		this.driver.navigate().to(baseURL + "/dialysis/register");
		this.driver.manage().window().maximize();

		RegistrationPage rp = new RegistrationPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);

		// Booking
		rp.setRegistrationInfo("Ms", "Dummy", "User", "01/01/1980", "dummyemailboth@email.com", "password123", "381",
				"123456789", "Both");

		Thread.sleep(1000);

		rp.bookingForBoth(true, true, true, false, false, "Home Clinic", "New York", "123", "123456789", "Mr", "Dummy",
				"Patient", "15/12/2000", "patient@email.com", "123", "123456", true, false, false, false, false,
				"Home Clinic Patient", "LA", "45", "123456789", "yes", true);

		Thread.sleep(2000);

		rp.register();

		Assert.assertTrue(mp.getRegisterMessage().contains("Sucess")); // spelling error

	}

}