package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	
	ChromeDriver dr = new ChromeDriver();
	
	
	@BeforeTest
	
	public void beforetest(){
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.navigate().to("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
		
		}
	@Test
	public void test(){
		WebElement dragElementFrom = dr.findElement(By.xpath("//div[@id='dragdiv']"));
		WebElement dropElementTo = dr.findElement(By.xpath("//div[@id='dropdiv']"));
		Actions act = new Actions(dr);
		act.clickAndHold(dragElementFrom).moveToElement(dropElementTo).release(dropElementTo).build().perform();
		
	}
	@AfterTest
	public void aftertest(){
		dr.quit();
	}
	}


