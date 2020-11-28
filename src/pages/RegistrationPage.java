package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasicPage {

	public RegistrationPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	public WebElement getCancelButton() {
		return this.driver.findElement(By.xpath("//*/bnm-header-navigation/button"));
	}

	public WebElement getTitle() {
		return this.driver.findElement(By.xpath("//select[@name='title']"));
	}

	public WebElement getPatientTitle() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[1]/label/bnm-select/select"));
	}

	public WebElement getFirstName() {
		return this.driver.findElement(By.xpath("//input[@name='firstName']"));
	}

	public WebElement getPatientFirstName() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[2]/div[1]/label/input"));
	}

	public WebElement getLastName() {
		return this.driver.findElement(By.xpath("//input[@name='lastName']"));
	}

	public WebElement getPatientLastName() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[2]/div[2]/label/input"));
	}

	public WebElement getBirthDate() {
		return this.driver.findElement(By.xpath("//input[@name='birthdate']"));
	}

	public WebElement getPatientBirthDate() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[3]/label/input"));
	}

	public WebElement getEmail() {
		return this.driver.findElement(By.xpath("//input[@name='email']"));
	}

	public WebElement getPatientEmail() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[4]/label/input"));
	}

	public WebElement getPassword() {
		return this.driver.findElement(By.xpath("//input[@type='password']"));
	}

	public WebElement getCountryCode() {
		return this.driver.findElement(By.xpath("//input[@type='tel']"));
	}

	public WebElement getPatientCountryCode() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[5]/div[1]/label/bnm-country-code-input/bnm-padded-input/input"));
	}

	public WebElement getPhone() {
		return this.driver.findElement(By.xpath("//input[@name='phoneNumber']"));
	}

	public WebElement getPatientPhone() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[5]/div[2]/label/input"));
	}

	public WebElement getBookingForMyself() {
		return this.driver.findElement(By.xpath("//*/fieldset/div[1]/div[1]/label/bnm-radio"));
	}

	public WebElement getBookingForSomeoneElse() {
		return this.driver.findElement(By.xpath("//*/fieldset/div[1]/div[2]/label/bnm-radio"));
	}

	public WebElement getBookingForBoth() {
		return this.driver.findElement(By.xpath("//*/fieldset/div[1]/div[3]/label/bnm-radio"));
	}

	public WebElement getNextButton() {
		return this.driver.findElement(
				By.xpath("/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/div/button"));
	}

	public WebElement getMsEhicYesButton() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-yourself/div/div[1]/fieldset/div[1]/div[1]/label/bnm-radio/input"));
	}

	public WebElement getMsEhicNoButton() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-yourself/div/div[1]/fieldset/div[1]/div[2]/label/bnm-radio/input"));
	}

	public WebElement getSeEhicYesButton() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[6]/fieldset/div[1]/div[1]/label/bnm-radio/span"));
	}

	public WebElement getSeEhicNoButton() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[6]/fieldset/div[1]/div[2]/label/bnm-radio/span"));
	}

	public WebElement getSpecialReqYesButton() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-yourself/div/div[2]/fieldset/div[1]/div[1]/label/bnm-radio/input"));
	}

	public WebElement getSpecialReqNoButton() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-yourself/div/div[2]/fieldset/div[1]/div[2]/label/bnm-radio/input"));
	}

	public WebElement getSpecialReqPatientYesButton() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[7]/fieldset/div[1]/div[1]/label/bnm-radio/span"));
	}

	public WebElement getSpecialReqPatientNoButton() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[7]/fieldset/div[1]/div[2]/label/bnm-radio/span"));
	}

	public WebElement getHivCheck() {
		return this.driver.findElement(By.xpath("//*/fieldset/div/div[1]/label/bnm-checkbox/span"));
	}

	public WebElement getHepBCheck() {
		return this.driver.findElement(By.xpath("//*/fieldset/div/div[2]/label/bnm-checkbox/span"));
	}

	public WebElement getHepCCheck() {
		return this.driver.findElement(By.xpath("//*/fieldset/div/div[3]/label/bnm-checkbox/span"));
	}

	public WebElement getHomeClinic() {
		return this.driver.findElement(By.xpath("//input[@formcontrolname='homeClinicName']"));
	}

	public WebElement getHomeClinicCity() {
		return this.driver.findElement(By.xpath("//input[@formcontrolname='homeClinicLocation']")); // fine
	}

//clinic country code only abs path
	public WebElement getClinicCountryCode() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-yourself/div/div[4]/div[3]/div[1]/label/bnm-country-code-input/bnm-padded-input/input"));

	}

	public WebElement getPatientClinicCountryCode() {

		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[9]/div[3]/div[1]/label/bnm-country-code-input/bnm-padded-input/input"));
	}

	public WebElement getClinicPhone() {
		return this.driver.findElement(By.xpath("//input[@name='homeClinicPhoneNumber']"));
	}

	public WebElement getNewsletterCheck() {
		return this.driver.findElement(By.xpath("//bnm-checkbox[@formcontrolname='wantsNewsletter']"));
	}

	public WebElement getTermsCheck() {
		return this.driver.findElement(By.xpath("//input[@name='agree']"));
	}

	public WebElement getBackButton() {
		return this.driver.findElement(
				By.xpath("/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/div/button[1]"));
	}

	public WebElement getRegisterButton() {
		return this.driver.findElement(
				By.xpath("/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/div/button[2]"));
	}

	public void goBack() {
		js.executeScript("arguments[0].click();", getBackButton());
	}

	public void cancelRegistration() {
		this.getCancelButton().click();
	}

	public void setRegistrationInfo(String title, String firstName, String lastName, String birthDate, String email,
			String password, String countryCode, String phone, String bookingFor) throws InterruptedException {

		Select select = new Select(this.getTitle());
		Thread.sleep(1000);
		select.selectByVisibleText(title);

		this.getFirstName().clear();
		this.getFirstName().sendKeys(firstName);
		this.getLastName().clear();
		this.getLastName().sendKeys(lastName);
		this.getBirthDate().clear();
		this.getBirthDate().sendKeys(birthDate);
		this.getEmail().clear();
		this.getEmail().sendKeys(email);
		this.getPassword().clear();
		this.getPassword().sendKeys(password);
		this.getCountryCode().clear();
		this.getCountryCode().sendKeys(countryCode);
		this.getPhone().clear();
		this.getPhone().sendKeys(phone);
		if (bookingFor.equals("Myself")) {
			js.executeScript("arguments[0].click();", this.getBookingForMyself());
		} else if (bookingFor.equals("Someone else")) {
			js.executeScript("arguments[0].click();", this.getBookingForSomeoneElse());
		} else {
			js.executeScript("arguments[0].click();", this.getBookingForBoth());

		}

		js.executeScript("arguments[0].click();", this.getNextButton());

	}

	public void bookingForMyself(boolean ehic, boolean specialReq, boolean hiv, boolean hepB, boolean hepC,
			String homeClinicName, String homeClinicCity, String homeClinicCountryCode, String homeClinicPhone,
			String newsletter, boolean terms) throws InterruptedException {
		if (ehic) {
			js.executeScript("arguments[0].click();", this.getMsEhicYesButton());
		} else {
			js.executeScript("arguments[0].click();", this.getMsEhicNoButton());
		}

		if (specialReq) {
			js.executeScript("arguments[0].click();", this.getSpecialReqYesButton());
			if (hiv && hepB && hepC) {
				js.executeScript("arguments[0].click();", this.getHivCheck());
				js.executeScript("arguments[0].click();", this.getHepBCheck());
				js.executeScript("arguments[0].click();", this.getHepCCheck());
			} else if (hiv && hepB) {
				js.executeScript("arguments[0].click();", this.getHivCheck());
				js.executeScript("arguments[0].click();", this.getHepBCheck());
			} else if (hiv && hepC) {
				js.executeScript("arguments[0].click();", this.getHivCheck());
				js.executeScript("arguments[0].click();", this.getHepCCheck());
			} else if (hepB && hepC) {
				js.executeScript("arguments[0].click();", this.getHepBCheck());
				js.executeScript("arguments[0].click();", this.getHepCCheck());
			} else if (hiv) {
				js.executeScript("arguments[0].click();", this.getHivCheck());
			} else if (hepB) {
				js.executeScript("arguments[0].click();", this.getHepBCheck());
			} else if (hepC) {
				js.executeScript("arguments[0].click();", this.getHepCCheck());
			}
		} else {
			js.executeScript("arguments[0].click();", this.getSpecialReqNoButton());

		}

		Thread.sleep(1500);
		this.getHomeClinic().clear();
		this.getHomeClinic().sendKeys(homeClinicName);
		Thread.sleep(1500);

		this.getHomeClinicCity().clear();
		this.getHomeClinicCity().sendKeys(homeClinicCity);
		Thread.sleep(1500);

		this.getClinicCountryCode().clear();
		this.getClinicCountryCode().sendKeys(homeClinicCountryCode);
		Thread.sleep(1500);
		this.getClinicPhone().sendKeys(homeClinicPhone);

		if (newsletter.equals("Yes")) {
			js.executeScript("arguments[0].click();", this.getNewsletterCheck());
		}

		if (terms) {
			js.executeScript("arguments[0].click();", this.getTermsCheck());
		}

		js.executeScript("arguments[0].click();", this.getRegisterButton());

		Thread.sleep(2500);

	}

	public void bookingForSomeoneElse(String patientTitle, String patientFirstName, String patientLastName,
			String patientBirthDate, String patientEmail, String patientCountryCode, String patientPhone,
			boolean patientEhic, boolean patientSpecialReq, boolean patientHiv, boolean patientHepB,
			boolean patientHepC, String patientHomeClinicName, String patientHomeClinicCity,
			String patientHomeClinicCountryCode, String patientHomeClinicPhone, String newsletter, boolean terms)
			throws InterruptedException {

		Select select = new Select(this.getPatientTitle());
		Thread.sleep(1000);
		select.selectByVisibleText(patientTitle);

		this.getPatientFirstName().clear();
		this.getPatientFirstName().sendKeys(patientFirstName);
		this.getPatientLastName().clear();
		this.getPatientLastName().sendKeys(patientLastName);
		this.getPatientBirthDate().clear();
		this.getPatientBirthDate().sendKeys(patientBirthDate);
		this.getPatientEmail().clear();
		this.getPatientEmail().sendKeys(patientEmail);
		this.getPatientCountryCode().clear();
		this.getPatientCountryCode().sendKeys(patientCountryCode);
		this.getPatientPhone().clear();
		this.getPatientPhone().sendKeys(patientPhone);

		if (patientEhic) {
			js.executeScript("arguments[0].click();", this.getSeEhicYesButton());
		} else {
			js.executeScript("arguments[0].click();", this.getSeEhicNoButton());
		}

		if (patientSpecialReq) {
			js.executeScript("arguments[0].click();", this.getSpecialReqPatientYesButton());
			if (patientHiv && patientHepB && patientHepC) {
				js.executeScript("arguments[0].click();", this.getHivCheck());
				js.executeScript("arguments[0].click();", this.getHepBCheck());
				js.executeScript("arguments[0].click();", this.getHepCCheck());
			} else if (patientHiv && patientHepB) {
				js.executeScript("arguments[0].click();", this.getHivCheck());
				js.executeScript("arguments[0].click();", this.getHepBCheck());
			} else if (patientHiv && patientHepC) {
				js.executeScript("arguments[0].click();", this.getHivCheck());
				js.executeScript("arguments[0].click();", this.getHepCCheck());
			} else if (patientHepB && patientHepC) {
				js.executeScript("arguments[0].click();", this.getHepBCheck());
				js.executeScript("arguments[0].click();", this.getHepCCheck());
			} else if (patientHiv) {
				js.executeScript("arguments[0].click();", this.getHivCheck());
			} else if (patientHepB) {
				js.executeScript("arguments[0].click();", this.getHepBCheck());
			} else if (patientHepC) {
				js.executeScript("arguments[0].click();", this.getHepCCheck());
			}
		} else {
			js.executeScript("arguments[0].click();", this.getSpecialReqPatientNoButton());

		}
		Thread.sleep(1500);
		this.getHomeClinic().clear();
		this.getHomeClinic().sendKeys(patientHomeClinicName);
		Thread.sleep(1500);

		this.getHomeClinicCity().clear();
		this.getHomeClinicCity().sendKeys(patientHomeClinicCity);
		Thread.sleep(1500);

		this.getPatientClinicCountryCode().clear();
		this.getPatientClinicCountryCode().sendKeys(patientHomeClinicCountryCode);
		Thread.sleep(1500);
		this.getClinicPhone().sendKeys(patientHomeClinicPhone);

		if (newsletter.equals("Yes")) {
			js.executeScript("arguments[0].click();", this.getNewsletterCheck());
		}

		if (terms) {
			js.executeScript("arguments[0].click();", this.getTermsCheck());
		}
		js.executeScript("arguments[0].click();", this.getRegisterButton());

		Thread.sleep(2500);

	}

	// cannot recycle bookingForSomeoneElse, problems start in hiv, hepB, hepC,
	// clinic name, clinic city when filling in Patient information
	public void bookingForBoth(boolean ehic, boolean specialReq, boolean hiv, boolean hepB, boolean hepC,
			String homeClinicName, String homeClinicCity, String homeClinicCountryCode, String homeClinicPhone,
			String patientTitle, String patientFirstName, String patientLastName, String patientBirthDate,
			String patientEmail, String patientCountryCode, String patientPhone, boolean patientEhic,
			boolean patientSpecialReq, boolean patientHiv, boolean patientHepB, boolean patientHepC,
			String patientHomeClinicName, String patientHomeClinicCity, String patientHomeClinicCountryCode,
			String patientHomeClinicPhone, String newsletter, boolean terms) throws InterruptedException {
		this.bookingForMyself(ehic, specialReq, hiv, hepB, hepC, homeClinicName, homeClinicCity, homeClinicCountryCode,
				homeClinicPhone, newsletter, terms);
		this.bookingForSomeoneElse(patientTitle, patientFirstName, patientLastName, patientBirthDate, patientEmail,
				patientCountryCode, patientPhone, patientEhic, patientSpecialReq, patientHiv, patientHepB, patientHepC,
				patientHomeClinicName, patientHomeClinicCity, patientHomeClinicCountryCode, patientHomeClinicPhone,
				newsletter, terms);
	}
}
