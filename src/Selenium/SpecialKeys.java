package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpecialKeys {
	
	public static void main(String[] args)
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com ");
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Email"))));
	
	WebElement txtUserName = driver.findElement(By.id("Email"));
	Actions act = new Actions(driver);
      act	 .moveToElement(txtUserName)
	 .click()
	 .keyDown(txtUserName, Keys.SHIFT)
	 .sendKeys(txtUserName, "hello")
	 .keyUp(txtUserName, Keys.SHIFT)
	 .doubleClick(txtUserName)
	 .contextClick().build().perform();}


}
