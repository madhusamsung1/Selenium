package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRechargeSample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\browsersDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUserName")).sendKeys("samsung@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("sdsavsdv");
		
		driver.findElement(By.id("imgbtnSignin")).click();
		
		driver.quit();
	}

	

}
