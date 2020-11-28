package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MessagesPage;
import pages.RegistrationPage;

public class RegistrationTest extends BasicTest {
	
//	@Test(priority=0)
//	public void RegistrationCancel1() throws InterruptedException {
//		
//		//Cancel Registration Step 1
//		
//		this.driver.navigate().to(baseURL + "/dialysis/register");
//		this.driver.manage().window().maximize();
//		
//		RegistrationPage rp = new RegistrationPage(driver, wait, js);
//		MessagesPage mp = new MessagesPage(driver, wait, js);
//		
//		rp.cancelRegistration();
//
//		Thread.sleep(25000);
//		
//		Assert.assertTrue(mp.getMainPageMsg().contains("Find & book your holiday dialysis anywhere"), "[ERROR] Did not cancel registration!");
//		
//	}
	
	

//	@Test(priority=5)
//	public void RegistrationTestStep1() throws InterruptedException {
//				
//		this.driver.navigate().to(baseURL + "/dialysis/register");
//		this.driver.manage().window().maximize();
//		
//		RegistrationPage rp = new RegistrationPage(driver, wait, js);
//		MessagesPage mp = new MessagesPage(driver, wait, js);
//		
//		rp.setRegistrationInfo("Ms", "Dummy", "User", "01/01/1980", "hopadek748@58as.com", "password123", "381", "123456789", "Both");
//
//		Thread.sleep(25000);
//		
//		Assert.assertTrue(mp.getNextStepMsg().contains("Step 2"), "[ERROR] Did not go to the next step!");
//		
//	}
	

	@Test(priority=10)
	public void RegistrationTestStep2() throws InterruptedException {
		
		//Step 1 registration
		
		this.driver.navigate().to(baseURL + "/dialysis/register");
		this.driver.manage().window().maximize();
		
		RegistrationPage rp = new RegistrationPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);
		
		rp.setRegistrationInfo("Ms", "Dummy", "User", "01/01/1980", "hopadek748@58as.com", "password123", "381", "123456789", "Myself");

		Thread.sleep(25000);
		
		Assert.assertTrue(mp.getNextStepMsg().contains("Step 2"), "[ERROR] Did not go to the next step!");
		
		Thread.sleep(5000);
	
		// Step 2 Registration
		
		//If booking for yourself leave title, firstname, lastname, birthdate, email, countryCode, phone empty
		
		//rp.setBooking(null, null, null, null, null, null, null, true, false, false, false, false, "Home Clinic", "Nis", "381", "123456789", false, true);
		rp.testBooking();
		
	
	}
}