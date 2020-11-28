package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessagesPage extends BasicPage {

	public MessagesPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super(driver, wait, js);
	}

	public String getNextStepMsg() {
		return this.driver.findElement(By.xpath("//*/bnm-header-center/h1")).getText();
	}
	
	public String getMainPageMsg() {
		return this.driver.findElement(By.xpath("/html/body/app-root/ng-component/section[1]/div/h1")).getText();
	}
}
