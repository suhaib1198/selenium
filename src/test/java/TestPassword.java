import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import uplode_trello.AddCard;
import uplode_trello.Home;
import uplode_trello.LogTrello;

public class TestPassword {
	static WebDriver driver;
	LogTrello l;
	
	
	@BeforeSuite
	public void before() {
	
	driver = OpenBrowsers.openBrowser("chrome");
	driver.get("https://trello.com/login");
	driver.manage().window().maximize();
	l=new LogTrello(driver);
	}
	
	@Test
	public void login() throws InterruptedException {
	
	l.login("suhaibbase9@gmail.com", "Su1234567");
	
	
}
	@AfterSuite
	public void after() {
		driver.quit();
	}
}