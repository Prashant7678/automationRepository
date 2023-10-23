package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	
public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://omayo.blogspot.com/");
		 Thread.sleep(4000);
		 driver.findElement(By.partialLinkText("Open a popup window")).click();
		 Thread.sleep(4000);
		 driver.close();
		 driver.quit();
		 
}

}
