package webdriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetTheSystemDate {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/madhubharti/Desktop/Selenium/Workspace/Selenium_Automation/browserDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		Date abc = new Date();
		System.out.println(abc);//output:Sun Nov 17 12:05:25 CST 2019

		DateFormat xyz = new SimpleDateFormat("dd_MMM_yyyy_HH_mm_ss");
		String timestamp = xyz.format(abc);
		System.out.println(timestamp); //17_Nov_2019_12_24_28
		
		//Screenshot
		
		String path = "/Users/madhubharti/Desktop/Selenium/Workspace/Selenium_Automation/Screenshots";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(path+"DateTest.PNG"));
		
	}

}
