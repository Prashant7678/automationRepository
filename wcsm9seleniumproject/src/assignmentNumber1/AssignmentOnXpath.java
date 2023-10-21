package assignmentNumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentOnXpath {
			public static void main(String[] args) throws InterruptedException {
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--disable-notifications");
				WebDriver driver = new ChromeDriver(co);
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				//handle hidden division pop up
				driver.findElement(By.xpath("//span[@role='button']")).click();
				//identify search box and pass mobile as input
				driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
				
			}

}
