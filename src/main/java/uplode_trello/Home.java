package uplode_trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	WebDriver driver;
	
	By txt=By.xpath("/html/body/div[3]/div/section/div/form/div[1]/label/input");
	By create= By.xpath("//*[@id=\"header\"]/div[2]/div/div[2]/button");
	By createB = By.xpath("/html/body/div[3]/div/section/div/nav/ul/li[1]/button");
	By createB2= By.xpath("/html/body/div[3]/div/section/div/form/button");
	
	
	
	
	public Home (WebDriver driver){
		this.driver=driver;
		
		
	}
	public void NewBorder(String txt1) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(create).click();;
		Thread.sleep(5000);
		driver.findElement(createB).click();
		Thread.sleep(5000);
		driver.findElement(txt).sendKeys(txt1);
		Thread.sleep(5000);
		driver.findElement(createB2).click();
		Thread.sleep(5000);
		
	}
	}