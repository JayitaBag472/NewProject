package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDown {
	
	ChromeDriver dr = new ChromeDriver();
	
	@BeforeTest()
	
	public void beforetest(){
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
	}
	
	@Test
	public void test(){
		
		Select sel = new Select( dr.findElement(By.id("Carlist")));
		sel.selectByVisibleText("Audi");
		
		
	}
	
	@AfterTest
	
	public void aftertest(){
		
		dr.quit();
	}

}
