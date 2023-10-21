package assignmentNumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotmailLogin {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=16&ct=1694834571&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fcobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26nlp%3d1%26deeplink%3dowa%252f%26RpsCsrfState%3d511a580d-f332-58c8-d5a8-1a0e866ca1db&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c");
			 Thread.sleep(4000);
			 //identify username TB by using Id
			 driver.findElement(By.id("i0116")).sendKeys("abcd@hotmail.com");
			 //identify passwordTB by using id
			 Thread.sleep(4000);
			 driver.findElement(By.id("idSIButton9")).click();
			 driver.findElement(By.id("i0118")).sendKeys("abcd@123");
			 Thread.sleep(4000);
			 driver.findElement(By.id("idSIButton9")).click();
		
		}
}
