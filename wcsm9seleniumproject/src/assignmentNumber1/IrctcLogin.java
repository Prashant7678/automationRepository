package assignmentNumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcLogin {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']")).sendKeys("PUNE JN - PUNE (PUNE)");
	    driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']")).sendKeys("TIRUPATI - TPTY (TIRUPATI)");
	    driver.findElement(By.xpath("//a[text()='25']")).click();
	    driver.findElement(By.xpath("//button[text()='Search']")).click();
	}
}
