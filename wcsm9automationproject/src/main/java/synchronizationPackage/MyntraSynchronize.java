package synchronizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyntraSynchronize {
		public static void main(String[] args) throws InterruptedException {
			ChromeOptions co=new ChromeOptions();
			co.addArguments("disable-notifications");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get("https://www.myntra.com/");
			Thread.sleep(50);
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Shoes");
			driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
			String parent= driver.getWindowHandle();
			Set<String> allHandles = driver.getWindowHandles();
			for (String wh:allHandles)
			{if(!parent.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			
		}
			
	}
}
