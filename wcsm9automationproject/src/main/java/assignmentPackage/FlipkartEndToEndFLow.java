package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndToEndFLow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("laptops");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao']")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i7']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		
}
}
