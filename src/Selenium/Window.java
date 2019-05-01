package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) {
		 
ChromeDriver  driver = new ChromeDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL

        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
        
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        
        driver.findElement(By.id("button1")).click();
        
        Set<String> winds = driver.getWindowHandles();
        
        for(String str : winds){
        	System.out.println(str);
        	driver.switchTo().window(parent);
        }


}
}
