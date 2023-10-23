package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
			public static void main(String[] args) {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://laptop-tejq6r72/login.do");
				//identify check box to verify
				
				WebElement checkBoxElement = driver.findElement(By.id("keepLoggedInCheckBox"));
				boolean status=checkBoxElement.isSelected();
				System.out.println(status);
			    driver.findElement(By.id("keepLoggedInCheckBox")).click();
			    boolean status1=checkBoxElement.isSelected();
			    System.out.println(status1);
			
				
				
			}
}
