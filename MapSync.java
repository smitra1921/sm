package Quantum;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class MapSync {
	
	@SuppressWarnings("unused")
	@Test
	  public void Login() throws InterruptedException,IOException,NoSuchElementException 
	  
	  {
		
		// launching browser & opening url (please change the chromedriver.exe path to execute in the local machine)  )
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saugata Mitra\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.mapsynq.com");
	    driver.manage().window().maximize();
	    
		
	    // Take screenshot and store as a file format
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	     // now copy the  screenshot to desired location using copyFile //method
	    FileUtils.copyFile(src, new File("C:/screenshots/homepage.png"));
	    
	    Thread.sleep(2000);
	    
	    
	    //  click on Directions tab
	    
	    driver.findElement(By.xpath("//*[@id= 'info_panel']/div[1]/div/a[1]")).click();
	    Thread.sleep(1000);
	    
	    // click on Personal tab 
	    
	    driver.findElement(By.xpath("//*[@id= 'info_panel']/div[1]/div/a[2]")).click();
	    Thread.sleep(1000);
	    
	    
	    //  click on Live tab  
	    
	    driver.findElement(By.xpath("//*[@id= 'info_panel']/div[1]/div/a[3]")).click();
	    Thread.sleep(1000);
	    
	    
		// click on toggle ad to remove & see the incident  
	    
	    driver.findElement(By.id("ad_toggle")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("Incidents0")).click();
	    // screen shot of incident
	    File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:/screenshots/incident.png"));
	    Thread.sleep(1000);
	    
	    
	    // click cameras     //*[@id="c6705"]/a
	    
	    driver.findElement(By.xpath("//*[@id= 'news_menu']/div[1]/label[2]/span/h2")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("c6705")).click();
	    // screen shot of incident
	    File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:/screenshots/camera.png"));
	    Thread.sleep(2000);
	    
	    
	    //  click tolls                     
	    
	    driver.findElement(By.xpath("//*[@id= 'news_menu']/div[1]/label[3]/span/h2")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("e6")).click();
	    Thread.sleep(1000);
	    
	    
	    //  click legend                   
	    
	    driver.findElement(By.xpath("//*[@id= 'div_header']/div[2]/div[6]/a[2]")).click();
	    // screen shot of legend
	    File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:/screenshots/legend.png"));
	    Thread.sleep(1000);
	    
	    
	    
	    // perform title check
	    
	    String s = driver.getTitle();
	     System.out.println("The page Title is : "+s);
	     if(s.equalsIgnoreCase(s)) {
	      System.out.println("Title Matched");
	      }
	    	 else
	    	 System.out.println("Title didn't match");
	     
	    
	    
	    
	    
		

}
           }