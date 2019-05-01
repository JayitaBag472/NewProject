package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {
	
	ChromeDriver dr = new ChromeDriver();
	
	@BeforeTest
	public void beforetest(){
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
		
	}
	
	@AfterTest
	public void aftertest(){
		dr.quit();
	}

	@Test
	public void test(){
		
		int Row_count = dr.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]")).size();
		
		System.out.println("Number of rows="+Row_count);
		int Column_count = dr.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td")).size();
		System.out.println("Number of rows="+Column_count);
		
		String part1="//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		for(int r=1;r>=Row_count;r++){
			for(int c=1;c>=Column_count;c++){
				
				String final_xpath = part1+r+part2+c+part3;
				
				String Web_Table = dr.findElement(By.xpath(final_xpath)).getText();
				System.out.println(Web_Table);
			}
		
		}
	}
}
