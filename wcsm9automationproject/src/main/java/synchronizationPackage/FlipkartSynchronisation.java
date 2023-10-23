package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSynchronisation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		driver.findElement(By.xpath("//a[@title='Cart']")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9822123456");
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
			
	}
	

}
