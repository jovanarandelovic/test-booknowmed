package tests;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.MessagesPage;


public class LoginTest extends BasicTest {

	//@Test
//	public void LinksTest() throws InterruptedException {
//
//		SoftAssert sa = new SoftAssert();
//		LoginPage lp = new LoginPage(driver, wait, js);
//
//		// Close Login window
//
//		lp.navigateToLoginPage();
//		lp.closeLogin();
//		Thread.sleep(2000);
//		sa.assertTrue(this.driver.getCurrentUrl().contentEquals(baseURL + "/dialysis"),
//				"[ERROR] Did not close the Login window!");
//
//		// Click Register
//
//		lp.navigateToLoginPage();
//		lp.register();
//		Thread.sleep(2000);
//		sa.assertTrue(this.driver.getCurrentUrl().contentEquals(baseURL + "/dialysis/register"),
//				"[ERROR] Did not redirect to the Regitration page!");
//
//		// Click Forgot password?
//
//		lp.navigateToLoginPage();
//		lp.forgotPassowrd();
//		Thread.sleep(2000);
//		sa.assertTrue(this.driver.getCurrentUrl().contentEquals(baseURL + "/dialysis/reset-password"),
//				"[ERROR] Did not redirect to the Reset password page!");
//
//		// Click Terms
//
//		lp.navigateToLoginPage();
//
//		String parent = driver.getWindowHandle();
//
//		lp.viewTerms();
//
//		Set<String> s = driver.getWindowHandles();
//		Iterator<String> I1 = s.iterator();
//
//		while (I1.hasNext()) {
//
//			String child_window = I1.next();
//
//			if (!parent.equals(child_window)) {
//				driver.switchTo().window(child_window);
//			}
//		}
//		Thread.sleep(2000);
//		sa.assertTrue(this.driver.getCurrentUrl().contentEquals(baseURL + "/terms-and-condition;type=patients"),
//				"[ERROR] Did not redirect to the Terms and Conditions page!");
//
//		// Click Privacy Policy
//
//		lp.navigateToLoginPage();
//
//		parent = driver.getWindowHandle();
//
//		lp.viewPrivacyPolicy();
//
//		s = driver.getWindowHandles();
//		I1 = s.iterator();
//
//		while (I1.hasNext()) {
//
//			String child_window = I1.next();
//
//			if (!parent.equals(child_window)) {
//				driver.switchTo().window(child_window);
//			}
//		}
//		Thread.sleep(2000);
//		sa.assertTrue(this.driver.getCurrentUrl().contentEquals(baseURL + "/privacy-policy"),
//				"[ERROR] Did not redirect to the Privacy Policy page!");
//
//		sa.assertAll();
//	}
	
	@Test(priority=10, description="Login")
	public void loginTest() {
	
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);
		
		lp.navigateToLoginPage();

		lp.getEmail().clear();
		lp.getEmail().sendKeys("dummyemailsomeone@email.com");
		lp.getPassword().clear();
		lp.getPassword().sendKeys("password123");
		lp.getLogIn().click();
		a
		sa.assertTrue(mp.getNotVerifiedMessage().contains("You are trying to log in with an email that hasn't been verified."), "[ERROR] You logged in with unverified email!");
	}
}
