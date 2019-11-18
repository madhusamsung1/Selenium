package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuitSample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\browsersDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.quit();
	}

}
