package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertion {
	
	SoftAssert s_asset = new SoftAssert();
	
	ChromeDriver dr = null;
	String ActualText = "";
	
	@BeforeTest
	public void beforeTest(){
		
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
	}
	
	/*@Test
	public void hard_assert_test(){
		
		ActualText =dr.findElement(By.xpath("//h2/span")).getText();
		
		Assert.assertEquals(ActualText, "Tuesday, 01 January 2014", "1st assert failed.");
		System.out.println("Hard assert---> 1st Assertion ");
		
		Assert.assertEquals(ActualText, "Tuesday, 28 January 2014", "1st assert failed.");
		System.out.println("Hard assert---> 2nd  Assertion ");
		
		dr.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
	   String alert_Text = dr.switchTo().alert().getText();
	    dr.switchTo().alert().accept();
	    
	    Assert.assertEquals(alert_Text, "Hi.. is alert message!", "Alert Is InCorrect");
	    System.out.println("Hard Assertion -> 1st alert assertion executed.");
	    
	    Assert.assertEquals(alert_Text, "Hi.. is alert message!", "Alert Is InCorrect");
	    System.out.println("Hard Assertion -> 2nd alert assertion executed.");
	    	
	    
		
	}*/
	
	@Test
	public void soft_assertion(){
		 
		   ActualText =dr.findElement(By.xpath("//h2/span")).getText();
			
		   s_asset.assertEquals(ActualText, "Tuesday, 01 January 2014", "1st assert failed.");
			System.out.println("Hard assert---> 1st Assertion ");
			
			s_asset.assertEquals(ActualText, "Tuesday, 28 January 2014", "1st assert failed.");
			System.out.println("Hard assert---> 2nd  Assertion ");
			
			dr.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		   String alert_Text = dr.switchTo().alert().getText();
		    dr.switchTo().alert().accept();
		    
		    s_asset.assertEquals(alert_Text, "Hi.. is alert message!", "Alert Is InCorrect");
		    System.out.println("Hard Assertion -> 1st alert assertion executed.");
		    
		    s_asset.assertEquals(alert_Text, "Hi.. is alert message!", "Alert Is InCorrect");
		    System.out.println("Hard Assertion -> 2nd alert assertion executed.");
	}
	
	
	@AfterTest
	  public void wait_and_click(){
	   WebDriverWait wait = new WebDriverWait(dr, 15);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='submitButton']")));
	   dr.findElement(By.xpath("//input[@id='submitButton']")).click();
	  }  
	  
	  @AfterClass  
	  public void Closebrowser(){ 
	   dr.quit();   
	  }

	}

	
	

