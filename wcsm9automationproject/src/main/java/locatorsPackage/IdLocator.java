package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	
		public static void main(String[] args) throws InterruptedException {
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("file:///C:/Users/prash/OneDrive/Desktop/wcsm9html/SimpleLoginPage.html");
			 Thread.sleep(4000);
			 //identify username TB by using Id
			 driver.findElement(By.id("i1")).sendKeys("admin");
			 //identify passwordTB by using id
			 Thread.sleep(4000);
			 driver.findElement(By.id("i2")).sendKeys("manager");
				 	
		}

}
