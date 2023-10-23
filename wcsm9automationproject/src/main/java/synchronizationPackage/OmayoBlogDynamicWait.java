package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoBlogDynamicWait {
				public static void main(String[] args) {
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://omayo.blogspot.com/");
					driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
					driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
					 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(40));
					 WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']")));
					 ele.click();
					 
				}

}
