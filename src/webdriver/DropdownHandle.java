package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropdownHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\browsersDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Adampur (AIP)");
		driver.findElement(By.linkText("Adampur (AIP)")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Delhi (DEL)");
		//driver.findElement(By.linkText("Delhi (DEL)")).click();
 
		
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("USD");

	}

}
