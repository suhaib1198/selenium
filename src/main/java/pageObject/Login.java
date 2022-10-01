package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login {
	WebDriver driver;
	WebElement passwordTxtBox;
	WebElement emailTxtBox;
	WebElement signBtn;

public Login (WebDriver driver){
	this.driver=driver;
	this.signBtn=signBtn;
	this.emailTxtBox=emailTxtBox;
	this.passwordTxtBox=passwordTxtBox;
}
public void login(String txt,String pass) throws InterruptedException {
	
	driver.findElement(By.name("session[email]")).sendKeys(txt);
	driver.findElement(By.name("session[password]")).sendKeys(pass);
	driver.findElement(By.name("commit")).click();
	Thread.sleep(2000);
}
}