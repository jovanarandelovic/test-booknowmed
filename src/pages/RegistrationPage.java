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
		return this.driver.findElement(By.xpath(
				"/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/bnm-account-info/div/div[1]/label/bnm-select/select"));
	}

	public WebElement getFirstName() {
		return this.driver.findElement(By.xpath("//input[@name='firstName']"));
	}

	public WebElement getLastName() {
		return this.driver.findElement(By.xpath("//input[@name='lastName']"));
	}

	public WebElement getBirthDate() {
		return this.driver.findElement(By.xpath("//input[@name='birthdate']"));
	}

	public WebElement getEmail() {
		return this.driver.findElement(By.xpath("//input[@name='email']"));
	}

	public WebElement getPassword() {
		return this.driver.findElement(By.xpath("//input[@type='password']"));
	}

	public WebElement getCountryCode() {
		return this.driver.findElement(By.xpath("//input[@type='tel']"));
	}

	public WebElement getPhone() {
		return this.driver.findElement(By.xpath("//input[@name='phoneNumber']"));
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

	public WebElement getEHICYesButton() {
		return this.driver.findElement(By.xpath("//*/fieldset/div[1]/div[1]/label/bnm-radio/input"));
	}

	public WebElement getEHICNoButton() {
		return this.driver.findElement(By.xpath("//*/fieldset/div[1]/div[2]/label/bnm-radio/input"));
	}

	public WebElement getSpecialReqYesButton() {
		return this.driver.findElement(By.xpath("//*/fieldset/div[1]/div[1]/label/bnm-radio/input"));
	}

	public WebElement getSpecialReqNoButton() {
		return this.driver.findElement(By.xpath("//*/fieldset/div[1]/div[2]/label/bnm-radio/input"));
	}

	public WebElement getHivCheck() {
		return this.driver.findElement(By.xpath("//*/fieldset/div/div[1]/label/bnm-checkbox"));
	}

	public WebElement getHepBCheck() {
		return this.driver.findElement(By.xpath("//*/fieldset/div/div[2]/label/bnm-checkbox"));
	}

	public WebElement getHepCCheck() {
		return this.driver.findElement(By.xpath("//*/fieldset/div/div[3]/label/bnm-checkbox"));
	}

	public WebElement getHomeClinic() {
		return this.driver.findElement(By.xpath("/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-paper/form/*/div/*/div[1]/label/input"));
	}

	public WebElement getHomeClinicCity() {
		return this.driver.findElement(By.xpath("//input[@name='homeClinicLocation']"));
	}

	public WebElement getClinicCountryCode() {
		return this.driver.findElement(By.xpath("//input[@formcontrolname='homeClinicPhoneCountryCode']"));
	}

	public WebElement getClinicPhone() {
		return this.driver.findElement(By.xpath("//input[@name='homeClinicPhoneNumber']"));
	}

	public WebElement getNewsletterCheck() {
		return this.driver.findElement(By.xpath("//input[@name='wantsNewsletter']"));
	}

	public WebElement getTermsCheck() {
		return this.driver.findElement(By.xpath("//input[@name='agree']"));
	}

	public WebElement getBackButton() {
		return this.driver.findElement(By.xpath("//*/bnm-paper/form/div/button[1]]"));
	}

	public WebElement getRegisterButton() {
		return this.driver.findElement(By.xpath("//*/bnm-paper/form/div/button[2]"));
	}

	public String getMsg() {
		return this.driver.findElement(By.xpath("//*/bnm-paper/form/*/h1")).getText();
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

	public void setBooking(String patientTitle, String patientFirstName, String patientLastName, String patientBirthDate, String patientEmail,
			String patientCountryCode, String patientPhone, boolean EHIC, boolean specialReq, boolean hiv, boolean hepB, boolean hepC,
			String homeClinicName, String homeClinicCity, String homeClinicCountryCode, String HomeClinicPhone, boolean newsletter, boolean terms) throws InterruptedException {
//		
//		if (this.getMsg().contains("Booking for someone else")) {
//			Select select = new Select(this.getTitle());
//			Thread.sleep(1000);
//			select.selectByVisibleText(patientTitle);
//			this.getFirstName().clear();
//			this.getFirstName().sendKeys(patientFirstName);
//			this.getLastName().clear();
//			this.getLastName().sendKeys(patientLastName);
//			this.getBirthDate().clear();
//			this.getBirthDate().sendKeys(patientBirthDate);
//			this.getEmail().clear();
//			this.getEmail().sendKeys(patientEmail);
//			this.getCountryCode().clear();
//			this.getCountryCode().sendKeys(patientCountryCode);
//			this.getPhone().clear();
//			this.getPhone().sendKeys(patientPhone);
//
//			if (EHIC) {
//				js.executeScript("arguments[0].click();", this.getEHICYesButton());
//			} else {
//				js.executeScript("arguments[0].click();", this.getEHICNoButton());
//			}
//
//			if (specialReq) {
//				js.executeScript("arguments[0].click();", this.getSpecialReqYesButton());
//			} else {
//				js.executeScript("arguments[0].click();", this.getSpecialReqNoButton());
//			}
//			
//			if (hiv && hepB && hepC) {
//				js.executeScript("arguments[0].click();", this.getHivCheck());
//				js.executeScript("arguments[0].click();", this.getHepBCheck());
//				js.executeScript("arguments[0].click();", this.getHepCCheck());
//			} else if (hiv && hepB) {
//				js.executeScript("arguments[0].click();", this.getHivCheck());
//				js.executeScript("arguments[0].click();", this.getHepBCheck());
//			} else if (hiv && hepC) {
//				js.executeScript("arguments[0].click();", this.getHivCheck());
//				js.executeScript("arguments[0].click();", this.getHepCCheck());
//			} else if (hepB && hepC) {
//				js.executeScript("arguments[0].click();", this.getHepBCheck());
//				js.executeScript("arguments[0].click();", this.getHepCCheck());
//			} else if (hiv) {
//				js.executeScript("arguments[0].click();", this.getHivCheck());
//			} else if (hepB) {
//				js.executeScript("arguments[0].click();", this.getHepBCheck());
//			} else if (hepC) {
//				js.executeScript("arguments[0].click();", this.getHepCCheck());
//			}
//			
//			this.getHomeClinic().clear();
//			this.getHomeClinic().sendKeys(homeClinicName);
//			this.getHomeClinicCity().clear();
//			this.getHomeClinicCity().sendKeys(homeClinicCity);
//			this.getClinicCountryCode().clear();
//			this.getClinicCountryCode().sendKeys(homeClinicCountryCode);
//
//			if (newsletter) {
//				js.executeScript("arguments[0].click();", this.getNewsletterCheck());
//			}
//			
//			if (terms) {
//				js.executeScript("arguments[0].click();", this.getTermsCheck());
//			}
//		} else {
			//if (EHIC) {
				js.executeScript("arguments[0].click();", this.getEHICYesButton());
			//	} else {
				js.executeScript("arguments[0].click();", this.getEHICNoButton());
			//	}

//			if (specialReq) {
//				js.executeScript("arguments[0].click();", this.getSpecialReqYesButton());
//				} else {
//				js.executeScript("arguments[0].click();", this.getSpecialReqNoButton());
//				}
//			if (hiv && hepB && hepC) {
//					js.executeScript("arguments[0].click();", this.getHivCheck());
//					js.executeScript("arguments[0].click();", this.getHepBCheck());
//					js.executeScript("arguments[0].click();", this.getHepCCheck());
//				} else if (hiv && hepB) {
//					js.executeScript("arguments[0].click();", this.getHivCheck());
//					js.executeScript("arguments[0].click();", this.getHepBCheck());
//				} else if (hiv && hepC) {
//					js.executeScript("arguments[0].click();", this.getHivCheck());
//					js.executeScript("arguments[0].click();", this.getHepCCheck());
//				} else if (hepB && hepC) {
//					js.executeScript("arguments[0].click();", this.getHepBCheck());
//					js.executeScript("arguments[0].click();", this.getHepCCheck());
//				} else if (hiv) {
//					js.executeScript("arguments[0].click();", this.getHivCheck());
//				} else if (hepB) {
//					js.executeScript("arguments[0].click();", this.getHepBCheck());
//
//				} else if (hepC) {
//					js.executeScript("arguments[0].click();", this.getHepCCheck());
//				}
				
			//	this.getHomeClinic().clear();
				this.getHomeClinic().sendKeys(homeClinicName);
			//	this.getHomeClinicCity().clear();
				this.getHomeClinicCity().sendKeys(homeClinicCity);
			//	this.getClinicCountryCode().clear();
				this.getClinicCountryCode().sendKeys(homeClinicCountryCode);

				if (newsletter) {
					js.executeScript("arguments[0].click();", this.getNewsletterCheck());
				}
				
				if (terms) {
					js.executeScript("arguments[0].click();", this.getTermsCheck());
				}
				
				this.getSpecialReqNoButton().click();
			}
		
	
	public void testBooking() {
		js.executeScript("arguments[0].click();", this.getEHICYesButton());
	//	js.executeScript("arguments[0].click();", this.getEHICNoButton());

	}
	}

