package LearningMaven.PracticeMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Maven2Test {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys("Harvard Business School, Boston, MA 02163, United States");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"searchbox-searchbutton\"]")).click();
	  Thread.sleep(5000);
	  String s1 = driver.findElement(By.xpath("//span[contains(text(),'Harvard Business School')]")).getText();
	  Assert.assertEquals("Harvard Business School", s1);
	  System.out.println("Header is: "+s1);
	  Thread.sleep(3000);
	  String s2 = driver.findElement(By.xpath("//*[@id=\"pane\"]/div/div[1]/div/div/div[9]/div[4]/button/div[1]/div[2]/div[1]")).getText();
	  Assert.assertEquals("+1 617-495-6000", s2);
	  System.out.println("Phone number is: "+s2);
	  Thread.sleep(3000);
	  String s3 = driver.findElement(By.xpath("//body/div[@id='app-container']/div[@id='content-container']/div[@id='pane']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]")).getText();
	  Assert.assertEquals("4.6", s3);
	  System.out.println("Rating is: "+s3);
	  
  }
  @BeforeClass
  public void beforeClass() {
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/maps/");
		
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
