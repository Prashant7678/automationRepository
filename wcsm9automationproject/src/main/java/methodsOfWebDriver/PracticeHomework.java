package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeHomework {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://outlook.live.com/owa/");
		
		
	}
	
	
}
