package assignmentNumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//launch Netflix
			driver.get("https://www.netflix.com/in/Login");
			Thread.sleep(4000);
			//identify the email or phone text box
			driver.findElement(By.id("id_userLoginId")).sendKeys("abcd@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("id_password")).sendKeys("abcd@123");
			Thread.sleep(2000);
			driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
			
		}
}
