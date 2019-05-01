import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classname {
	

	ChromeDriver dr = new ChromeDriver();
	
	@BeforeTest
	public void Beforetest(){
		
	
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dr.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		
	}
	
	@AfterTest
	public void Aftertest(){
		dr.quit();

}
	@Test
	public void test(){
		
		String str=dr.findElement(By.className("date-header")).getText();
		System.out.println(str);
		 for (int i = 0; i<=30; i++)
		  {
		   WebElement  btn = dr.findElement(By.id("submitButton"));//Locating element by id
		   if (btn.isEnabled()) 
		   {
		    //if webelement's attribute found enabled then this code will be executed.
		    System.out.print("\nCongr8s... Button is enabled and webdriver is clicking on it now");

		   //Locating button by id and then clicking on it.
		    dr.findElement(By.id("submitButton")).click(); 
		    i=20;
		    
		   }
		   else
		   {
		    //if webelement's attribute found disabled then this code will be executed.
		    System.out.print("\nSorry but Button is disabled right now..");
		   }
		   try {
		    Thread.sleep(500);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }

		
	}
}}
