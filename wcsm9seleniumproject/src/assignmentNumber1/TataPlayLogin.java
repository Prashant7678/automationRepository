package assignmentNumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TataPlayLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.tataplay.com/my-account/login?dest=/my-account");
		 Thread.sleep(4000);
		 //identify username TB by using Id
		 driver.findElement(By.id("subId-reg-mob")).sendKeys("1230456789");
		 //identify passwordTB by using id
		 Thread.sleep(4000);
		 driver.findElement(By.tagName("Button")).click();
		 //driver.findElement(By.id("i0118")).sendKeys("abcd@123");
		 //Thread.sleep(4000);
		 //driver.findElement(By.id("idSIButton9")).click();
	}

}
