package uplode_trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogTrello {
	WebDriver driver;
	By passwordTxtBox = By.id("password");
	By emailTxtBox = By.name("user");
	By signBtn = By.id("login");
	By click = By.xpath("//*[@id=\"login-submit\"]/span");
	
	
	public LogTrello (WebDriver driver){
		this.driver=driver;
	}
	public void login(String txt,String pass) throws InterruptedException {
		
		driver.findElement(emailTxtBox).sendKeys(txt);;
		Thread.sleep(2000);
		driver.findElement(signBtn).click();;
		Thread.sleep(2000);
		driver.findElement(passwordTxtBox).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(click).click();
		Thread.sleep(2000);
	}
	}