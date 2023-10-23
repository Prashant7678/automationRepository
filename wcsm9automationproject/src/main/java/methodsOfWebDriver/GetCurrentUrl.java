package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			Thread.sleep(4000);
			String urlOfLoginPage = driver.getCurrentUrl();
			System.out.println(urlOfLoginPage);
			String pageSource = driver.getPageSource();
			System.out.println(pageSource);
			driver.close();
		}
}

