package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasicPage {

	public LoginPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	protected WebElement getCloseButton() {
		return this.driver.findElement(By.xpath("//a[@aria-label='Close modal']"));
	}

	public WebElement getEmail() {
		return this.driver.findElement(By.xpath("//input[@type = 'email']"));
	}
	
	protected WebElement getRememberMe() {
		return this.driver.findElement(By.xpath("//bnm-checkbox[@formcontrolname='rememberMe']"));
	}

	public WebElement getPassword() {
		return this.driver.findElement(By.xpath("//input[@type='password']"));
	}

	protected WebElement getRegister() {
		return this.driver.findElement(By.xpath("//a[@href='/dialysis/register']"));
	}

	protected WebElement getForgotPassword() {
		return this.driver.findElement(By.xpath("//a[@href='/dialysis/reset-password']"));
	}

	protected WebElement getTerms() {
		return this.driver.findElement(By.xpath("//a[@href='/terms-and-condition;type=patients']"));
	}

	protected WebElement getPrivacyPolicy() {
		return this.driver.findElement(By.xpath("//a[@href='/privacy-policy']"));
	}
	
	public WebElement getLogIn() {
		return this.driver.findElement(By.xpath("//button[@type='submit']"));
	}

	public void closeLogin() {
		this.getCloseButton().click();
	}

	public void register() {
		this.getRegister().click();
	}

	public void forgotPassowrd() {
		this.getForgotPassword().click();
	}

	public void viewTerms() {
		this.getTerms().click();
	}

	public void viewPrivacyPolicy() {
		this.getPrivacyPolicy().click();
	}

	public void navigateToLoginPage() {
		this.driver.navigate().to("https://bnm.neopixdev.com/dialysis/login");
		this.driver.manage().window().maximize();

	}

	public void setEmail(String email) {
		this.getEmail().clear();
		this.getEmail().sendKeys(email);
	}
}
}