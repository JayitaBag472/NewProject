package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SKiptest {
	
	ChromeDriver dr = null;
	@BeforeTest
	public void beforetest(){
		 dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterTest
	public void aftertest(){
		dr.quit();
	}
	
	@Test
	public void test(){
		System.out.println("In Verify_Title");
	     String titl = dr.getTitle();
	     
	     if(titl.equals("Only Testing: New Test")){
	                //To Skip Test
	      throw new SkipException("Test Check_Checkbox Is Skipped");
	      
	     }else{
	      System.out.println("Check the Checkbox");
	         dr.findElement(By.xpath("//input[@value='Bike']")).click();
	     }
	     System.out.println("After If Else");
	    }   
		
	}
	
		
	

