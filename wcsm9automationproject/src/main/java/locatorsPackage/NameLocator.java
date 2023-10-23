package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
			public static void main(String[] args) throws InterruptedException {
				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/prash/OneDrive/Desktop/wcsm9html/RadioButton.html");
				Thread.sleep(4000);
				//identify D redio button by using name locator
				driver.findElement(By.name("name4")).click();
				//identify A radio button by using name locator
				Thread.sleep(4000);
				driver.findElement(By.name("name1")).click();
				Thread.sleep(4000);
				
						}
}
