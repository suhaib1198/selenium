package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Address {
	WebDriver driver;
	WebElement assBtn;

public Address (WebDriver driver){
	this.driver=driver;
	this.assBtn=assBtn;
	
}
public void ass() throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]")).click();
	Thread.sleep(2000);
}

public void getNum() {
	List<WebElement> rows = driver.findElements(By.xpath("/html/body/div/table/tbody/tr"));

	System.out.println(rows.size());
}

}
