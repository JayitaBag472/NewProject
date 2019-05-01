package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GetAllText {
	

		ChromeDriver dr = new ChromeDriver();
		
		@BeforeTest
		public void beforeTest(){
			
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			dr.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
			
			
		}
		
		@AfterTest
		public void aftertest(){
			dr.close();
		}
		
		@org.testng.annotations.Test
		
		public void test(){
			
			List<WebElement> txtfields = dr.findElements(By.xpath("//input[@type='text' or @type='password']"));
			  for(int i=0;i<txtfields.size();i++){
				  txtfields.get(i).sendKeys("Text"+(i+1));
			  }
		

}
}
