package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefoxBrowser {
      
	public static void main(String[] args) throws InterruptedException {
		//to launch firefox browser we need to create obj of firefox
		
          WebDriver driver=new FirefoxDriver();
          
          System.out.println("Firefox is Launced");
          
          driver.manage().window().maximize();
          
          //to close fire 
          
          Thread.sleep(2000);
          
          driver.close();
          
          System.out.println("Firefox is closed");
	}
}
