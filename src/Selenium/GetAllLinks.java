package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {
	
	public static void main(String[] args) {
		 
		ChromeDriver driver = new ChromeDriver();
 
		driver.get("http://toolsqa.wpengine.com/");
 
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
 
		System.out.println(links.size());
 
		for (int i = 1; i<=links.size(); i=i+1)
 
		{
 
			System.out.println(links.get(i).getText());
 
		}
}
}