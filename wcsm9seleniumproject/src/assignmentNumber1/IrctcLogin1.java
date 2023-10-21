package assignmentNumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcLogin1 {
	public static void main(String[] args) throws InterruptedException {
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(4000);
		driver.findElements(By.xpath("//a[contains(@class,'fa fa-window-close pull-right loginCloseBtn ng-tns-c19-13)]"));
		
		
		
	}

}
