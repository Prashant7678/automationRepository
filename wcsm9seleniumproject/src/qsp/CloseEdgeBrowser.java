package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseEdgeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		
		System.out.println("Edge is Launced");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.close();
		
		System.out.println("Edge is closed");
	}

}
