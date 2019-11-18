package webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_Tirupati {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/madhubharti/Desktop/Selenium/Workspace/Selenium_Automation/browserDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://hdpp.ttdsevaonline.com/Registration/VolunteerRegistration");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("Name")).sendKeys("Madhu");
		driver.findElement(By.name("SurName")).sendKeys("Bharti");
		
		WebElement radio2 = driver.findElement(By.id("genFemale"));
		radio2.click();
		
		 //TakeScreenshot
        //path
        String path = "/Users/madhubharti/Desktop/Selenium/Workspace/Selenium_Automation/Screenshots";
        
        //take screenshot
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        //move to folder
        FileHandler.copy(src, new File(path+"MyTest1.PNG"));
        
		
		new Select(driver.findElement(By.id("Occupation"))).selectByVisibleText("Student");
		new Select(driver.findElement(By.name("EducationCategory"))).selectByVisibleText("Graduation and above");

		driver.findElement(By.id("EducationDetail")).sendKeys("Bachelor's");
		driver.findElement(By.id("Address1")).sendKeys("Postmaster, Post Office CHITTOOR");
		driver.findElement(By.id("Address2")).sendKeys("(HEAD OFFICE)");
		
		new Select(driver.findElement(By.id("StateList"))).selectByVisibleText("Andhra Pradesh");
		
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("DistrictsList"))).selectByVisibleText("Chittoor");

		driver.findElement(By.id("Mandal")).sendKeys("Krish");
		
		driver.findElement(By.name("PinNum")).sendKeys("517001");
		driver.findElement(By.id("txtMobileNum")).sendKeys("1213234409");
		driver.findElement(By.id("Email")).sendKeys("madhusamsung1@gmail.com");
		driver.findElement(By.id("txtProofNum")).sendKeys("232435465711");
		

		WebElement radio = driver.findElement(By.id("ExpFlagYes"));
		radio.click();

		Thread.sleep(3000);
		 new Select(driver.findElement(By.name("ExperienceCategory"))).selectByVisibleText("Bhajan Troupes");
		
        WebElement checkbox = driver.findElement(By.id("IsDeclareHindu"));
        checkbox.click();
        
        
        //TakeScreenshot
        //path
        String path1 = "/Users/madhubharti/Desktop/Selenium/Workspace/Selenium_Automation/Screenshots";
        
        //take screeshot
        File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        //move to folder
        FileHandler.copy(src1, new File(path1+"MyTest.PNG"));
        
        
        WebElement submit = driver.findElement(By.id("btnSubmit"));
		submit.submit();
		driver.quit();
        


		
	}

}
