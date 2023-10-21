package assignmentNumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartIndependant {
			public static void main(String[] args) throws InterruptedException {
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--disable-notifications");
				WebDriver driver = new ChromeDriver(co);
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//span[@role='button']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
				driver.findElement(By.xpath("//img[@alt='Nothing']")).click();
				driver.findElement(By.xpath("//div[text()='Nothing Phone (1) (White, 256 GB)']/ancestor::a[@class='_1fQZEK']/descendant::div[text()='₹29,499']....Nothing Phone(1)(white,256 GB)")).click();
			}
}
