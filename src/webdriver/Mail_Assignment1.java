package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail_Assignment1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\browsersDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("signup-button")).click();
		
		WebElement radio1 = driver.findElement(By.name("salutation"));
	
		radio1.click();
	
	driver.findElement(By.xpath("/html/body/onereg-app/div/onereg-form/div/div/form/section/section[2]/onereg-progress-meter/onereg-personal-info/fieldset/onereg-form-row[1]/div/div[2]/pos-input/input")).sendKeys("MADHU");
	driver.findElement(By.xpath("/html/body/onereg-app/div/onereg-form/div/div/form/section/section[2]/onereg-progress-meter/onereg-personal-info/fieldset/onereg-form-row[2]/div/div[2]/pos-input/input")).sendKeys("BHARTI");
	
	
	}

	
	
}
