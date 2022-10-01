


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import uplode_trello.AddCard;
import uplode_trello.Home;
import uplode_trello.LogTrello;

public class testLoginTrello {
	static WebDriver driver;
	LogTrello l;
	Home h;
	AddCard add;
	
	
	@BeforeSuite
	public void before() {
	
	driver = OpenBrowsers.openBrowser("chrome");
	driver.get("https://trello.com/login");
	driver.manage().window().maximize();
	l=new LogTrello(driver);
	h=new Home(driver);
	add=new AddCard(driver);
	}
	
	@Test
	public void login() throws InterruptedException {
	
	l.login("suhaibbase9@gmail.com", "Su1234567");
	
	
}
	@Test(dependsOnMethods = { "login" })
	public void click() throws InterruptedException {
		h.NewBorder("suhaib");
	}
	@Test (dependsOnMethods = { "click" })
	public void addtest() throws InterruptedException {
		add.addCard("title","description");
	}
	@AfterSuite
	public void after() {
		driver.quit();
	}
}