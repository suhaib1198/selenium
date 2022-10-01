import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestUrl {

		@Test
		public void Testo() throws InterruptedException {
			WebDriver driver = OpenBrowsers.openBrowser("chrome");
			driver.get("https://demo.guru99.com/V1/index.php");
			Thread.sleep(5000);
			driver.manage().window().maximize();

			driver.findElement(By.name("uid")).sendKeys("mngr438269");
			driver.findElement(By.name("password")).sendKeys("zegYzyh");
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(10000);
			String s1=driver.getCurrentUrl();
			String s2=driver.getTitle();
			
			List<WebElement> sex=driver.findElements(By.xpath("/html/body/div[3]/div/ul/li/a"));
			for(int i=2;i<sex.size();i++) {
				WebElement w=driver.findElement(By.xpath("/html/body/div[3]/div/ul/li["+i+"]/a"));
				w.click();
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(w.getText());
				
			}
			
		}
	}