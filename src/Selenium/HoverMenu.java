package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class HoverMenu {
	
	ChromeDriver dr = new ChromeDriver();
	
	@BeforeTest
	public void beforetest(){
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("http://only-testing-blog.blogspot.in/p/mouse-hover.html");
	}
	
	@AfterTest
	public void AfterTest(){
		dr.quit();
	}
	
	@org.testng.annotations.Test
	public void Test(){
		Actions act = new Actions(dr);
		WebElement moveonmenu = dr.findElement(By.xpath("//div[@id='menu1']/div"));
		act.moveToElement(moveonmenu).moveToElement(dr.findElement(By.xpath("//div[@id='menu1choices']/a"))).click().perform();
		
		WebDriverWait wait = new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.titleContains("Google"));
		
	}

}
