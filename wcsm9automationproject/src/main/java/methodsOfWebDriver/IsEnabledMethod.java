package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		//identify the login button
		driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();
		WebElement loginButtonElement=driver.findElement(By.className(null));
		//verify login button id disabled or not
		boolean status=loginButtonElement.isEnabled();
		System.out.println(status);
	}

}
