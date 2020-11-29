package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessagesPage extends BasicPage {

	public MessagesPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	public String getNextStepMsg() {
		return this.driver.findElement(By.xpath("//bnm-header-center/h1")).getText();
	}
	
	public String getMainPageMsg() {
		return this.driver.findElement(By.xpath("/html/body/app-root/ng-component/section[1]/div/h1")).getText();
	}
	
	public String getStep1Message() {
		return this.driver.findElement(By.xpath("//bnm-account-info/h1")).getText();
	}
	
	public String getRegisterMessage() {
		return this.driver.findElement(By.xpath("//bnm-paper/h1")).getText();
	}
	
	public String getNotVerifiedMessage() {
		return this.driver.findElement(By.xpath("//form/div[4]")).getText();
	}
	
	public String getPasswordMessage() {
		return this.driver.findElement(By.xpath("//form/div[2]/div/bnm-validation")).getText();
	}
	
	public String getEmailMessage() {
		return this.driver.findElement(By.xpath("//form/div[1]/div/bnm-validation")).getText();
	}

}
