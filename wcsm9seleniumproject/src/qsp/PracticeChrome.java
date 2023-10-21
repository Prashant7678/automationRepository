package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeChrome {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Chrome is Launched");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.close();
		
		System.out.println("Chrome is closed");
	}

}
