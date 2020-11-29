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

	protected WebElement getCancelButton() {
		return this.driver.findElement(By.xpath("//bnm-header-navigation/button"));
	}

	protected WebElement getTitle() {
		return this.driver.findElement(By.xpath("//select[@name='title']"));
	}

	protected WebElement getPatientTitle() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[1]/label/bnm-select/select"));
	}			

	protected WebElement getFirstName() {
		return this.driver.findElement(By.xpath("//input[@name='firstName']"));
	}

	protected WebElement getPatientFirstName() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[2]/div[1]/label/input"));
	}

	protected WebElement getLastName() {
		return this.driver.findElement(By.xpath("//input[@name='lastName']"));
	}

	protected WebElement getPatientLastName() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[2]/div[2]/label/input"));
	}

	protected WebElement getBirthDate() {
		return this.driver.findElement(By.xpath("//input[@name='birthdate']"));
	}

	protected WebElement getPatientBirthDate() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[3]/label/input"));
	}

	protected WebElement getEmail() {
		return this.driver.findElement(By.xpath("//input[@name='email']"));
	}

	protected WebElement getPatientEmail() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[4]/label/input"));
	}

	protected WebElement getPassword() {
		return this.driver.findElement(By.xpath("//input[@type='password']"));
	}

	protected WebElement getCountryCode() {
		return this.driver.findElement(By.xpath("//input[@type='tel']"));
	}

//	only abs path
	protected WebElement getPatientCountryCode() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[5]/div[1]/label/bnm-country-code-input/bnm-padded-input/input"));
	}

	protected WebElement getPhone() {
		return this.driver.findElement(By.xpath("//input[@name='phoneNumber']"));
	}

//	only abs path
	protected WebElement getPatientPhone() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[5]/div[2]/label/input"));
	}

	protected WebElement getBookingForMyself() {
		return this.driver.findElement(By.xpath("//fieldset/div[1]/div[1]/label/bnm-radio"));
	}

	protected WebElement getBookingForSomeoneElse() {
		return this.driver.findElement(By.xpath("//fieldset/div[1]/div[2]/label/bnm-radio"));
	}

	protected WebElement getBookingForBoth() {
		return this.driver.findElement(By.xpath("//fieldset/div[1]/div[3]/label/bnm-radio"));
	}

	protected WebElement getNextButton() {
		return this.driver.findElement(
				By.xpath("/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/div/button"));
	}

	protected WebElement getEhicYes() {
		return this.driver.findElement(By.xpath("//fieldset/div[1]/div[1]/label/bnm-radio"));
	}

	protected WebElement getEhicPatientYes() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[6]/fieldset/div[1]/div[1]/label/bnm-radio"));
	}

	protected WebElement getEhicNo() {
		return this.driver.findElement(By.xpath("//*/label/bnm-radio[@name='isEhicHolder']/input[@value='false']"));
	}

	protected WebElement getEhicPatientNo() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[6]/fieldset/div[1]/div[2]/label/bnm-radio"));
	}

	protected WebElement getSpecialReqYes() {
		return this.driver.findElement(By.xpath("//*[@name='isSpecialHolder']/input[@value='true']"));
	}

	protected WebElement getSpecialReqNo() {
		return this.driver.findElement(By.xpath("//*[@name='isSpecialHolder']/input[@value='false']"));
	}

	protected WebElement getHiv() {
		return this.driver.findElement(By.xpath("//bnm-checkbox[@formcontrolname='isHivPositive']"));
	}

	protected WebElement getHepB() {
		return this.driver.findElement(By.xpath("//bnm-checkbox[@formcontrolname='isHbvPositive']"));
	}

	protected WebElement getHepC() {
		return this.driver.findElement(By.xpath("//bnm-checkbox[@formcontrolname='isHcvPositive']"));
	}

	protected WebElement getHomeClinic() {
		return this.driver.findElement(By.xpath("//input[@formcontrolname='homeClinicName']"));
	}

	protected WebElement getHomeClinicCity() {
		return this.driver.findElement(By.xpath("//input[@formcontrolname='homeClinicLocation']")); // fine
	}

//clinic country code only abs path
	protected WebElement getClinicCountryCode() {
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-yourself/div/div[4]/div[3]/div[1]/label/bnm-country-code-input/bnm-padded-input/input"));

	}

//only abs path
	protected WebElement getPatientClinicCountryCode() {

		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-booking-someone/div/div[9]/div[3]/div[1]/label/bnm-country-code-input/bnm-padded-input/input"));
	}

	protected WebElement getClinicPhone() {
		return this.driver.findElement(By.xpath("//input[@name='homeClinicPhoneNumber']"));
	}

	protected WebElement getNewsletterCheck() {
		return this.driver.findElement(By.xpath("//bnm-checkbox[@formcontrolname='wantsNewsletter']"));
	}

	protected WebElement getTermsCheck() {
		return this.driver.findElement(By.xpath("//input[@name='agree']"));
	}

	protected WebElement getBackButton() {
		return this.driver.findElement(
				By.xpath("/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/div/button[1]"));
	}

	protected WebElement getRegisterButton() {
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

	public void isSecialReq(boolean specialReq, boolean hiv, boolean hepB, boolean hepC) {
		if (specialReq) {
			js.executeScript("arguments[0].click();", this.getSpecialReqYes());
			if (hiv && hepB && hepC) {
				js.executeScript("arguments[0].click();", this.getHiv());
				js.executeScript("arguments[0].click();", this.getHepB());
				js.executeScript("arguments[0].click();", this.getHepC());
			} else if (hiv && hepB) {
				js.executeScript("arguments[0].click();", this.getHiv());
				js.executeScript("arguments[0].click();", this.getHepB());
			} else if (hiv && hepC) {
				js.executeScript("arguments[0].click();", this.getHiv());
				js.executeScript("arguments[0].click();", this.getHepC());
			} else if (hepB && hepC) {
				js.executeScript("arguments[0].click();", this.getHepB());
				js.executeScript("arguments[0].click();", this.getHepC());
			} else if (hiv) {
				js.executeScript("arguments[0].click();", this.getHiv());
			} else if (hepB) {
				js.executeScript("arguments[0].click();", this.getHepB());
			} else if (hepC) {
				js.executeScript("arguments[0].click();", this.getHepC());
			}
		} else {
			js.executeScript("arguments[0].click();", this.getSpecialReqNo());

		}
	}

	public void bookingForMyself(boolean ehic, boolean specialReq, boolean hiv, boolean hepB, boolean hepC,
			String homeClinicName, String homeClinicCity, String homeClinicCountryCode, String homeClinicPhone,
			String newsletter, boolean terms) throws InterruptedException {
		if (ehic) {
			js.executeScript("arguments[0].click();", this.getEhicYes());
		} else {
			js.executeScript("arguments[0].click();", this.getEhicNo());
		}

		Thread.sleep(1500);

		this.isSecialReq(specialReq, hiv, hepB, hepC);

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

		Thread.sleep(2500);

	}

	public void bookingForSomeoneElse(String patientTitle, String patientFirstName, String patientLastName,
			String patientBirthDate, String patientEmail, String patientCountryCode, String patientPhone,
			boolean patientEhic, boolean specialReq, boolean hiv, boolean hepB, boolean hepC,
			String patientHomeClinicName, String patientHomeClinicCity, String patientHomeClinicCountryCode,
			String patientHomeClinicPhone, String newsletter, boolean terms) throws InterruptedException {

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
		
		Thread.sleep(1000);

		if (patientEhic) {
			js.executeScript("arguments[0].click();", this.getEhicPatientYes());
		} else {
			js.executeScript("arguments[0].click();", this.getEhicPatientNo());
		}

		Thread.sleep(1500);

		this.isSecialReq(specialReq, hiv, hepB, hepC);

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

		Thread.sleep(2500);

	}

	// cannot recycle bookingForMyself() and bookingForSomeoneElse() methods properly
	// this part needs modification
	public void bookingForBoth(boolean ehic, boolean specialReq, boolean hiv, boolean hepB, boolean hepC,
			String homeClinicName, String homeClinicCity, String homeClinicCountryCode, String homeClinicPhone,
			String patientTitle, String patientFirstName, String patientLastName, String patientBirthDate,
			String patientEmail, String patientCountryCode, String patientPhone, boolean patientEhic,
			boolean patientSpecialReq, boolean patientHiv, boolean patientHepB, boolean patientHepC,
			String patientHomeClinicName, String patientHomeClinicCity, String patientHomeClinicCountryCode,
			String patientHomeClinicPhone, String newsletter, boolean terms) throws InterruptedException {
		this.bookingForMyself(ehic, specialReq, hiv, hepB, hepC, homeClinicName, homeClinicCity, homeClinicCountryCode,
				homeClinicPhone, newsletter, terms);
		
		Thread.sleep(2500);
	
		js.executeScript("arguments[0].click();", this.getNextButton());
		
		Thread.sleep(2500);

		this.bookingForSomeoneElse(patientTitle, patientFirstName, patientLastName, patientBirthDate, patientEmail,
				patientCountryCode, patientPhone, patientEhic, patientSpecialReq, patientHiv, patientHepB, patientHepC,
				patientHomeClinicName, patientHomeClinicCity, patientHomeClinicCountryCode, patientHomeClinicPhone,
				newsletter, terms);
	}

	public void register() {
		js.executeScript("arguments[0].click();", this.getRegisterButton());
	}
}
