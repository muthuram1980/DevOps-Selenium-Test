package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTestMain {
	WebDriver driver;
	@BeforeMethod
	public void launch() {
//		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");    
//		ChromeOptions chromeOptions = new ChromeOptions();    
//    	chromeOptions.addArguments("--headless");    
		driver = new ChromeDriver(); 
		
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	driver.get("http://35.243.225.28:3001");
		
	}
  @Test
  public void loginTest1() throws InterruptedException {
	   driver.findElement(By.name("login")).sendKeys("muthuram");
           driver.findElement(By.name("password")).sendKeys("muthuram");
           driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
           driver.findElement(By.name("click")).click();
//           driver.wait(3000);
           driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
           System.out.println("Test succeeded");
  }
// @AfterMethod
//  public void close() {
//	  driver.close();
//  }
}
