import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {
	
	public static void main(String args[]){
		
		FirefoxDriver dr = new FirefoxDriver();
		
		dr.manage().window().maximize();
		dr.get("https://paytm.com/");
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		dr.switchTo().frame("GTM-PTT2P2");
		
		
		
	}

}
