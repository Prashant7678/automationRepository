package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStackSynchronize {
	public static void main(String[] args) {
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	 	driver.get("https://www.shoppersstack.com/");
	 	driver.findElement(By.id("loginBtn")).click();
	 	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prashant7678@hotmail.com");
	 	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("LordBalaji@1");
	 	driver.findElement(By.xpath("//span[text()='Login']")).click();
	 	//apply explicit wait
	 	// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 	//WebElement ele =wait.until(ExpectedConditions.elementToBeClickable(By.id("check")));
	 	//ele.click();
	 	
	}

}
