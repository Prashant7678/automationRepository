package methodsOfWebDriver;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://omayo.blogspot.com/");
			Thread.sleep(4000);
			String parentHandle = driver.getWindowHandle();
			System.out.println("address of parent browser or window" +parentHandle);
			Thread.sleep(4000);
			driver.findElement(By.partialLinkText("Open a popup window")).click();
			
			Set<String>allHandles = driver.getWindowHandles();
			
		
		}
	


}
