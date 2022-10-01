import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageObject.Address;
import pageObject.Login;
import pageObject.NewAddrees;

public class testLogin {
	WebDriver driver;
	Login l;
	Address a;
	NewAddrees na;
	
	@BeforeSuite
	public void before() {
		driver = OpenBrowsers.openBrowser("chrome");
	driver.get("http://a.testaddressbook.com/sign_in");
	driver.manage().window().maximize();
	l=new Login(driver);
	a=new Address(driver);
	na=new NewAddrees(driver);
	}
	@Test
	public void logout() throws InterruptedException {
	
	l.login("111@test.com", "1234");
	a.ass();
	a.getNum();
	na.newAss();

	
	try {
		driver.switchTo().alert().accept();
	}catch (Exception e) {
	}
	
}
	@AfterSuite
	public void after() {
		//driver.quit();
	}
}
