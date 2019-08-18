package smitra_test;

import java.io.IOException;
import org.testng.annotations.Test;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;







public class loginTest {

	public static WebDriver driver; 
	
	
@SuppressWarnings("unused")

@Test (priority=0)   

  public void main()throws IOException,InterruptedException,NoSuchElementException
  {
	  
	
	
	        // launching browser & opening url 		
	  
			System.setProperty("webdriver.chrome.driver", "./src/ChromeDriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("http://www.mapsynq.com");
		    driver.manage().window().maximize();
	    	
	
	
	
		    
		    // Take screenshot 
		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    
		    // Copy the  screenshot to desired location 
		    FileUtils.copyFile(src, new File("./src/screenshots/homepage.png"));
		    
		    Thread.sleep(2000);
		    
		    
		    
		    
		    //  click on Directions tab
		    
		    driver.findElement(By.xpath("//*[@id= 'info_panel']/div[1]/div/a[1]")).click();
		    Thread.sleep(1000);
		    
		    
		    // click on Personal tab 
		    
		    driver.findElement(By.xpath("//*[@id= 'info_panel']/div[1]/div/a[2]")).click();
		    Thread.sleep(1000);
		    
		    
		    //  click on Live tab  
		    
		    driver.findElement(By.xpath("//*[@id= 'info_panel']/div[1]/div/a[3]")).click();
		    Thread.sleep(2000);
		    
		    
		    
		    
		    
			// click on toggle ad to remove & see the incident  
		    
		    driver.findElement(By.id("ad_toggle")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("Incidents0")).click();
		    
		    // screen shot of incident
		    File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src, new File("./src/screenshots/incident1.png"));
		    Thread.sleep(2000);
		    
		    
		    
		    
		    // click cameras    
		    
		    driver.findElement(By.xpath("//*[@id= 'news_menu']/div[1]/label[2]/span/h2")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("c6705")).click();
		    
		    // screen shot of incident
		    File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src, new File("./src/screenshots/incident2.png"));
		    Thread.sleep(2000);
		    
		    
		    
		    
		    //  click tolls                     
		    
		    driver.findElement(By.xpath("//*[@id= 'news_menu']/div[1]/label[3]/span/h2")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("e6")).click();
		    Thread.sleep(2000);
		    
		    
		    
		    
		    //  click legend                   
		    
		    driver.findElement(By.xpath("//*[@id= 'div_header']/div[2]/div[6]/a[2]")).click();
		    // screen shot of legend
		    File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src, new File("./src/screenshots/legend.png"));
		    Thread.sleep(2000);
		    
		    
		    
		    
		    
		    // perform title check
		    
		    String s = driver.getTitle();
		     System.out.println("The page Title is : "+s);
		     if(s.equalsIgnoreCase(s)) {
		      System.out.println("Title Matched");
		      }
		    	 else
		    	 System.out.println("Title didn't match");
		     
		     Thread.sleep(2000);
		     

		     
		     
		     
		     // Closing the browser
		     
		     driver.close();
		     
		     
		     
		     
           }
  
    
  
}
