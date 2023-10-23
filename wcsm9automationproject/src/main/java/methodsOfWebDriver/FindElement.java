package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("bike");
	Thread.sleep(2000);
	//identify all the suggestions of bike
	driver.findElement(By.xpath("//div[@class='wM6W7d']"));
	//read all the suggestions of bike by using for loop
	Thread.sleep(2000);
	//for(int i=0: i<bikeoptions.get(i))
	
}
}
