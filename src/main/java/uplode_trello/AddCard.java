package uplode_trello;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCard {
	
WebDriver driver ;
By title =By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[1]/div/textarea");
By add =By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[2]/div[1]/input");
By card =By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/a/div[3]/span");
By desc = By.xpath("//*[@id=\"chrome-container\"]/div[3]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div[3]/textarea");
By save =By.xpath("//*[@id=\"chrome-container\"]/div[3]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div[3]/div/input[1]");
By att =By.xpath("//*[@id=\"chrome-container\"]/div[3]/div/div/div/div[5]/div[2]/div/a[4]/span[2]");
By comp =By.xpath("//*[@id=\"chrome-container\"]/div[4]/div/div[2]/div/div/div/ul/li[1]/form/input[3]");
By fil =By.xpath("//*[@id=\"chrome-container\"]/div[3]/div/div/div/div[4]/div[9]/div[2]/div/div/a/span");
public AddCard(WebDriver driver) {
	this.driver = driver;
}
public void addCard(String ti,String de) throws InterruptedException {
	File file =new File("./files/input.csv");
	Thread.sleep(10000);
	driver.findElement(title).sendKeys(ti);
	Thread.sleep(5000);
	driver.findElement(add).click();
	Thread.sleep(5000);
	driver.findElement(card).click();
	Thread.sleep(5000);
	driver.findElement(desc).sendKeys(de);
	Thread.sleep(5000);
	driver.findElement(save).click();
	Thread.sleep(5000);
	driver.findElement(att).click();
	Thread.sleep(5000);
	driver.findElement(comp).sendKeys(file.getAbsolutePath());
	Thread.sleep(5000);
	driver.findElement(fil).click();
	Thread.sleep(5000);
	
	
}



	
}
