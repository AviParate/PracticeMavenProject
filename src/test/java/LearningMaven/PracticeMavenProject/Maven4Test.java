package LearningMaven.PracticeMavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Maven4Test {
	
	WebDriver driver;
	
  @Test
  public void f4() throws InterruptedException {
	    Actions action = new Actions(driver);
		WebElement w1 = driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a"));
		action.moveToElement(w1).build().perform();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement w2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/div/div[1]/div/div[1]/ul/li[1]/a")));
		action.moveToElement(w2).click().build().perform();

  }
  
  @Test
  public void set() {
	 System.out.println("Testing git commands");
  }
  
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	  	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.nseindia.com/");
	
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
