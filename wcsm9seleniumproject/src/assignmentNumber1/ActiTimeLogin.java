package assignmentNumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://laptop-tejq6r72/login.do");
		 Thread.sleep(4000);
		 //identify username TB by using Id
		 driver.findElement(By.tagName("input")).sendKeys("admin");
		 //identify passwordTB by using id
		 Thread.sleep(4000);
		 driver.findElement(By.tagName("input")).sendKeys("manager");
			 	
	}

}
