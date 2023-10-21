package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeFirefoxBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Firefox opened");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.close();
		
		System.out.println("Firefox closed");
	}

}
