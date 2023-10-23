package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
			public static void main(String[] args) throws InterruptedException {
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://omayo.blogspot.com/");
				Thread.sleep(4000);
				//take the address of current window or browser
				//parent browser(the browser has control)
				String parenthandle=driver.getWindowHandle();
				System.out.println(parenthandle);
				driver.close();
				
			}
}
