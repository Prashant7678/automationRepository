package assignmentNumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
		//handle notification pop in Chrome Browser
		
		ChromeOptions co  = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		
		Thread.sleep(4000);
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Select Departure City']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("input[placeholder='Select Arrival City']")).sendKeys("Munich");
		driver.findElement(By.cssSelector("input[placeholder='Departure']")).sendKeys("21");
		driver.findElement(By.cssSelector("input[placeholder='Return']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Select Passengers and Class ']")).click();
		driver.findElement(By.id("book-flight-widget")).click();
		
	}
}