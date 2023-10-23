package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStackSync {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");

	
				
	}
   public static WebElement explicitWait(WebDriver driver,long sec,WebElement ele)
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
	   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
	   return element;
   }
}
