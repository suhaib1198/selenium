package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAddrees {
	WebDriver driver;
	WebElement assBtn;
	public NewAddrees(WebDriver driver) {
		this.driver = driver;
		this.assBtn=assBtn;
	}
	
	public void newAss() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div/a")).click();
		Thread.sleep(2000);
	}

	
	

}
