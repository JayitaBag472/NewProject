package SeleniumGrid;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumHub {
	
  public static void main(String args[]) throws IOException{
	  

		DesiredCapabilities cap = DesiredCapabilities.chrome();		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-web-security");
		options.addArguments("--start-maximized");	
		
	   cap.setCapability(ChromeOptions.CAPABILITY, options);
	   WebDriver dr = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		
	   dr.get("https://www.google.com");
//Cucumber - http://cucumber.github.com/cucumber-eclipse/update-site
//Hub: java -jar C:\Users\AB46772\Downloads\selenium-server-standalone-3.11.0.jar -role hub	   
//Node: java -Dwebdriver.chrome.driver="D:\Driver\chromedriver.exe"  -jar C:\Users\jb47847\Downloads\selenium-server-standalone-3.11.0.jar -role node -hub http://192.168.0.105:4444/grid/register -port 5566 
		    
  }

}
