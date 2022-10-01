import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import uplode_trello.AddCard;
import uplode_trello.Home;
import uplode_trello.LogTrello;

public class TestPassword {
	static WebDriver driver;
	LogTrello l;
	FileReader file ;
	Properties prop;
	@BeforeSuite
	public void before() throws FileNotFoundException {
	
	driver = OpenBrowsers.openBrowser("chrome");
	driver.get("https://trello.com/login");
	driver.manage().window().maximize();
	l=new LogTrello(driver);
    file =new FileReader("user.proparoties");
	prop=new Properties();
	
	}
	
	@Test
	public void login() throws InterruptedException, IOException {
	
	
	
}
	@Test
	public void test22() throws IOException, InterruptedException {
	prop.load(file);
	String us=prop.getProperty("user");
	String pass= prop.getProperty("password");
	l.login(us, pass);	
	}
	@AfterSuite
	public void after() {
		driver.quit();
	}
}