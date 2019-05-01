package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SubmitMethod {
	ChromeDriver dr = new ChromeDriver();
	
	@BeforeTest
	
	public void beforeTest(){
	
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	dr.get("http://only-testing-blog.blogspot.in/2014/05/form.html"); 
	
	}
	
	@AfterTest
	public void afterTest(){
		dr.quit();
	}
	
	@org.testng.annotations.Test
	public void Test(){
		 dr.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("MyFName");
		   dr.findElement(By.xpath("//input[@name='LastName']")).sendKeys("MyLName");
		   dr.findElement(By.xpath("//input[@name='EmailID']")).sendKeys("My Email ID");
		   dr.findElement(By.xpath("//input[@name='MobNo']")).sendKeys("My Mob No.");
		   dr.findElement(By.xpath("//input[@name='Company']")).sendKeys("My Comp Name");
		   //To submit form.
		   //You can use any other Input field's(First Name, Last Name etc.) xpath too In bellow given syntax.
		   dr.findElement(By.xpath("//input[@name='Company']")).submit();
		   String alrt = dr.switchTo().alert().getText();
		   dr.switchTo().alert().accept();
		  System.out.println(alrt);
		  WebDriverWait wait = new WebDriverWait(dr,20);
		
		
	}
}
