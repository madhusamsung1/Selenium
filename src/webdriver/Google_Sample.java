package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Sample {
 
	  public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhu\\Desktop\\Selenium\\Workspace\\Selenium_Automation\\browsersDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			driver.manage().window().maximize();
			
			//click on gmail link
			
			driver.findElement(By.linkText("Gmail")).click();
			
			driver.quit();
			
	}
}
