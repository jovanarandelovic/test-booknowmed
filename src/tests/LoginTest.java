package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.MessagesPage;

public class LoginTest extends BasicTest {

	@Test(priority = 0, description = "Redirection links and buttons test")
	public void LinksTest() throws InterruptedException {

		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver, wait, js);

		// Close Login window

		lp.navigateToLoginPage();
		lp.closeLogin();
		Thread.sleep(2000);
		sa.assertTrue(this.driver.getCurrentUrl().contentEquals(baseURL + "/dialysis"),
				"[ERROR] Did not close the Login window!");

		// Click Register

		lp.navigateToLoginPage();
		lp.register();
		Thread.sleep(2000);
		sa.assertTrue(this.driver.getCurrentUrl().contentEquals(baseURL + "/dialysis/register"),
				"[ERROR] Did not redirect to the Regitration page!");

		// Click Forgot password?

		lp.navigateToLoginPage();
		lp.forgotPassowrd();
		Thread.sleep(2000);
		sa.assertTrue(this.driver.getCurrentUrl().contentEquals(baseURL + "/dialysis/reset-password"),
				"[ERROR] Did not redirect to the Reset password page!");

		// Click Terms

		lp.navigateToLoginPage();

		String parent = driver.getWindowHandle();

		lp.viewTerms();

		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
			}
		}
		Thread.sleep(2000);
		sa.assertTrue(this.driver.getCurrentUrl().contentEquals(baseURL + "/terms-and-condition;type=patients"),
				"[ERROR] Did not redirect to the Terms and Conditions page!");

		// Click Privacy Policy

		lp.navigateToLoginPage();

		parent = driver.getWindowHandle();

		lp.viewPrivacyPolicy();

		s = driver.getWindowHandles();
		I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
			}
		}

		Thread.sleep(2000);
		sa.assertTrue(this.driver.getCurrentUrl().contentEquals(baseURL + "/privacy-policy"),
				"[ERROR] Did not redirect to the Privacy Policy page!");

		sa.assertAll();
	}

	@Test(priority = 1, description = "Login with empty fields test")
	public void EmptyFiledsLogin() throws InterruptedException {
		LoginPage lp = new LoginPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);

		lp.login("", "password123", true);

		Assert.assertTrue(mp.getEmailMessage().contains("Email is required."),
				"[ERROR] You logged in without an email!");

		lp.login("lolebe2628@tdcryo.com", "", false);

		Assert.assertTrue(mp.getPasswordMessage().contains("Password is required."),
				"[ERROR] You logged in withpout a password!");

	}

	@Test(priority = 2, description = "Invalid and valid test cases")
	public void loginTest() throws IOException, InterruptedException {

		SoftAssert sa = new SoftAssert();
		File file = new File("data/login_form.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		LoginPage lp = new LoginPage(driver, wait, js);
		MessagesPage mp = new MessagesPage(driver, wait, js);

		for (int i = 1; i <= sheet.getLastRowNum() - 2; i++) {
			XSSFRow row = sheet.getRow(i);
			String email = row.getCell(0).getStringCellValue();
			String password = row.getCell(1).getStringCellValue();
			boolean rememberMe = row.getCell(2).getBooleanCellValue();
			String message = row.getCell(3).getStringCellValue();

			Thread.sleep(1500);

			lp.login(email, password, rememberMe);
			Thread.sleep(1500);

			if (i == 1) {
				sa.assertTrue(mp.getNotVerifiedMessage().contains(message),
						"[ERROR] You logged with an unverified email!");
			} else if (i == 2) {
				sa.assertTrue(mp.getInvalidCombo().contains(message), "[ERROR] You logged in with a wrong password!");

			} else if (i == 3) {
				sa.assertTrue(mp.getLoggedInMessage().contains(message),
						"[ERROR] You didn't log in with valid credentials!");
			}

		}

		sa.assertAll();
		fis.close();
		wb.close();
	}
}
