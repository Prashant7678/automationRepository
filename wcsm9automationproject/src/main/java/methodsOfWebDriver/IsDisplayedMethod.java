package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	//verify the log out link in home page of actiTime.
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-tejq6r72/login.do");
		//identify user text box and pass Admin.
		driver.findElement(By.name("username")).sendKeys("admin");
		//identify password text box and pass manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identfiy login button and click
		driver.findElement(By.id("loginButton")).click();
		//identify log out link for verify
		WebElement logoutLinkElement =driver.findElement(By.partialLinkText("Logout"));
		//check for logoutlinkELement is displayed or not
		boolean status = logoutLinkElement.isDisplayed();
		System.out.println(status);
	}

}
