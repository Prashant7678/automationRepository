package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	
	public static void main(String[] args) throws InterruptedException {
		//Launch the chrome browser
		 WebDriver driver = new ChromeDriver();
		 //maximize the chrome browser
		 driver.manage().window().maximize();
		 //launch the webapplication
		 driver.get("https://www.flipkart.com");
		 //stop the execution of script for 4 sec
		 Thread.sleep(4000);
		 //close the browser
		  String Title = driver.getTitle();
		 System.out.println(Title);
		 driver.close();
		 
	}

}
