package assignmentNumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.meesho.com/auth?redirect=https%3A%2F%2Fwww.meesho.com%2F&source=profile&entry=header&screen=HP");
		 Thread.sleep(4000);
		 //identify username TB by using Id
		 driver.findElement(By.tagName("input")).sendKeys("1234567890");
		 //identify passwordTB by using id
		
	}

}
