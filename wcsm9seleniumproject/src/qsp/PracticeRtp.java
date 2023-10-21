package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeRtp {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Browser Name");
		
		String browserValue = sc.next();
		if (browserValue.equalsIgnoreCase("Chrome")) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.manage().window().minimize();
			driver.close();
		}
			else if (browserValue.equalsIgnoreCase("Firefox")) {
				
			}
	}
}
	


