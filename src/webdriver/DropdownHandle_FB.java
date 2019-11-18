package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle_FB {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\browsersDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		
		//driver.findElement(By.id("u_0_2")).click();
		
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Jan");
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("1");
		new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("2018");
		
		WebElement radio = driver.findElement(By.id("u_0_9"));
		radio.click();
		

		
	}

}
