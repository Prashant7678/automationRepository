package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeEdgeBrowser {
	 
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	
	System.out.println("Edge is Lauched");
	
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	
	driver.close();
	
	System.out.println("Edge is closed");
	

	}

}
