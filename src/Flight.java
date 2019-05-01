
	

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Flight {
		
		ChromeOptions op =null;
		ChromeDriver dr = null;
		Properties p = null;

		@BeforeClass
		
		public void openBroser() throws IOException{
			op = new  ChromeOptions();
			op.addArguments("disable-infobars");
			dr=new ChromeDriver(op);
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			dr.get("http://newtours.demoaut.com/");
			
			p = new Properties();
			FileInputStream in= new FileInputStream("C:\\Users\\ejaybag\\Desktop\\Day1\\src\\ObjectReprositry\\OR.properties");
			p.load(in);
		}
		
		@BeforeMethod	
		public void login(){
			
			System.out.println(p.getProperty("username"));
			dr.findElement(By.xpath(p.getProperty("username"))).sendKeys("andy456");
			dr.findElement(By.xpath(p.getProperty("password"))).sendKeys("andy456");
			dr.findElement(By.xpath(p.getProperty("signIn"))).click();
			
			if(dr.findElement(By.xpath(p.getProperty("signIn"))).isDisplayed()){
				
				System.out.println("successfully sign in");
				
			}
			
			else{
				System.out.println("sign in not done");
			}
			
		}
		
		@Test
		
		public void bookFlight(){
			dr.findElement(By.xpath(p.getProperty("type"))).click();
		    Select sel = new Select(dr.findElement(By.xpath(p.getProperty("passengers"))));
		    sel.selectByIndex(2);
			sel = new Select(dr.findElement(By.xpath(p.getProperty("departingfrom"))));
			sel.selectByVisibleText("London");
			sel= new Select(dr.findElement(By.xpath(p.getProperty("OnMonth"))));
			sel.selectByVisibleText("January");
			sel= new Select(dr.findElement(By.xpath(p.getProperty("OnDay"))));
			sel.selectByVisibleText("26");
			sel= new Select(dr.findElement(By.xpath(p.getProperty("arrivingIn"))));
			sel.selectByVisibleText("Paris");
			sel= new Select(dr.findElement(By.xpath(p.getProperty("ReturningMonth"))));
			sel.selectByVisibleText("February");
			sel= new Select(dr.findElement(By.xpath(p.getProperty("ReturningDate"))));
			sel.selectByVisibleText("12");
			
			dr.findElement(By.xpath(p.getProperty("ServiceClass"))).click();
			
			sel= new Select(dr.findElement(By.xpath(p.getProperty("Airline"))));
			sel.selectByIndex(1);
			
			dr.findElement(By.xpath(p.getProperty("continue"))).click();
			
			dr.findElement(By.xpath(p.getProperty("continue2"))).click();
			
			dr.findElement(By.xpath(p.getProperty("FirstName"))).sendKeys("Jayita");
			
			dr.findElement(By.xpath(p.getProperty("LastName"))).sendKeys("Bag");
			
			dr.findElement(By.xpath(p.getProperty("CreditNumber"))).sendKeys("12345");
			
			dr.findElement(By.xpath(p.getProperty("securePurchase"))).click();
			
			
			if(dr.findElement(By.xpath(p.getProperty("confirmtion"))).isDisplayed())
	{
		System.out.println("Pass");
		}
	else{
	   System.out.println("Fail");
		}
		}
		
		@AfterMethod
		public void logOut()
		{
			dr.findElement(By.xpath(p.getProperty("signOff"))).click();
			if(dr.findElement(By.xpath(p.getProperty("signOn"))).isDisplayed())
			{
				System.out.println("Successfully Logout");
			}else
			{
				System.out.println("Logout failed");
			}
		}
		
		
		@AfterClass
		public void closeBrowser()
		{
			dr.close();
		}
			
			
		}
		
		






