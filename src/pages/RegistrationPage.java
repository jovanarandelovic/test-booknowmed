package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class RegistrationPage extends BasicPage {

	public RegistrationPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	public WebElement getSignUpBtn() {
		return this.driver.findElement(By.xpath("/html/body/app-root/ng-component/section[1]/bnm-header/bnm-header-public/bnm-header-base/div[2]/bnm-header-navigation/nav/ul/li[3]/a"));
	}
	public WebElement getNotificationMsg() {
		return this.driver.findElement(By.xpath("/html/body/app-root/bnm-patient-register/bnm-layout/div/main/bnm-registration-success/bnm-paper/h1"));
	}
//getDialTreatButton
	public WebElement getFirstName() {
		return this.driver.findElement(By.className("firstName"));
	}
	
	public WebElement getLastName() {
		return this.driver.findElement(By.className("lastName"));
	}
	
	public WebElement getBirthDate() {
		return this.driver.findElement(By.className("birthdate"));
	}
	
	public WebElement getEmail() {
		return this.driver.findElement(By.className("email"));
	}
	
	public WebElement getPassword() {
		return this.driver.findElement(By.className("password"));
	}
	
	public WebElement getCountryCode()  {
		return this.driver.findElement(By.className("phoneCountryCode"));
	}
	
	public WebElement getPhone() {
		return this.driver.findElement(By.className("phoneNumber"));
	}
	
	public void clickSignUp() {
		this.getSignUpBtn().click();
	}
}

