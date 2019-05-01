package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class LoadPageJavaScriptExecutor {
	
	ChromeDriver dr = null;
	
	@BeforeTest
	public void beforetest(){
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");
		
	}
	
	@AfterTest
	public void aftertest(){
		dr.quit();
	}
	
	@Test
	public void test(){
		checkPageIsReady();
		 dr.findElement(By.xpath("//input[@id='1']")).click();
		  dr.findElement(By.xpath("//input[@id='plus']")).click();
		  dr.findElement(By.xpath("//input[@id='5']")).click();
		  dr.findElement(By.xpath("//input[@id='equals']")).click();
	}

	public  void checkPageIsReady() {
	
		JavascriptExecutor js = (JavascriptExecutor)dr;
		if (js.executeScript("return document.readyState").toString().equals("complete")){ 
			   System.out.println("Page Is loaded.");
			   
			   
			  } 
		
		  for (int i=0; i<25; i++){ 
			   try {
			    Thread.sleep(1000);
			    }catch (InterruptedException e) {} 
			   //To check page ready state.
			   if (js.executeScript("return document.readyState").toString().equals("complete")){ 
			    break; 

			   }   
		  }
		 }
		}