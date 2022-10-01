package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FirstPage {
	WebDriver driver;
	WebElement searchTxtBox;
	WebElement searchBtn;
	public FirstPage(WebDriver driver) {
		this.driver = driver;
		this.searchBtn = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]"));
		this.searchTxtBox = driver.findElement(By.name("q"));
	}
	
	public void search(String txt) {
		this.searchTxtBox.sendKeys(txt);
		this.searchBtn.click();
		
		
		
		
		
	}
}