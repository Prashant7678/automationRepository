package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//to launch chrome browser we need to create obj of chromeDriver();
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome is Launced");
		
		driver.manage().window().maximize();
		
		//to close chrome browser we need to use close method();
		
		Thread.sleep(2000); //to Provide delay we use thread class and sleep method
		driver.close();
		System.out.println("Chrome is closed");
	}
}
