package Selenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirefoxProfile {
	
	FirefoxDriver dr = null;
	
	@BeforeTest
	public void beforetest(){
		
		ProfilesIni firProfiles = new ProfilesIni();
		  //Get access of newly created profile WebDriver_Profile.
		  org.openqa.selenium.firefox.FirefoxProfile wbdrverprofile = firProfiles.getProfile("WebDriver_Profile");
		  //Pass wbdrverprofile parameter to FirefoxDriver.
		  
		  dr = new FirefoxDriver((Capabilities) wbdrverprofile);  
		 }
		 
	@Test
	 public void OpenURL(){
	  dr.get("http://only-testing-blog.blogspot.in/2014/05/login.html");  
	 }
	 
	 @AfterTest
	 public void CloseBrowser() {
	  dr.quit();  
	 }
	
}