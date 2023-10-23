package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/prash/OneDrive/Desktop/wcsm9html/SimpleLoginPage.html");
		Thread.sleep(4000);
		//identify usernameTB and pass input as "admin"
		driver.findElement(By.tagName("input")).sendKeys("admin");
		//identify passwordTB and pass input as "manager"
		Thread.sleep(4000);
		driver.findElement(By.tagName("input")).sendKeys("manager");
		
	}

}
