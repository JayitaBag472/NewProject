package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExpectedAlert {
	
	ChromeDriver dr = new ChromeDriver();
	
	@BeforeTest
	public void beforetest(){
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
	}
	
	
	@AfterTest
	public void aftertest(){
		dr.quit();
	}
	
	
	@Test
	public void test(){
		
		dr.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		Alert al = dr.switchTo().alert();
		String str1=al.getText();
		System.out.println(str1);
		al.accept();
		
	}

}
