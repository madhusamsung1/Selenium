package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {
	public static void main(String[] args) {
		//Invoke the chrome browser
		//type URL
		//type usernsme and pass
		//click login button
		
		
		//launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", "/Users/madhubharti/Desktop/Selenium/Workspace/Selenium_Automation/browserDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		//For Open URL
		
		driver.get("https://www.facebook.com/");
		
		//to maximaze the window
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("Testing@bvnbvm.com");
		driver.findElement(By.name("pass")).sendKeys("scscc");
	
		
		//click on login button
		
		driver.findElement(By.id("loginbutton")).click();
	}

}
