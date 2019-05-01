package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	ChromeDriver dr;
	
	@Given("^Open Application url in browser$")
	
	
	public void openBrowser(){
		 dr = new ChromeDriver();
		
		dr.get("https://www.google.com/");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-web-security");
		options.addArguments("--start-maximized");	
		
		
		System.out.println("open browser");
	}
	
	@When("^^User enters \"([^\"]*)\" inserachbox$$")
public void enterkeyword(String key){
		
		dr.findElement(By.name("q")).click();
		
		dr.findElement(By.name("q")).sendKeys(key);
		
		System.out.println("enterkeyword");
	}
	
	
	@And("^Hit enter key$")
public void hitEnterKey(){
		
		dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("hitEnterKey");
	}
	
	@Then("^User should get relevent products$")
public void verifyProducts(){
		
		System.out.println("verifyProducts");
	}
}
