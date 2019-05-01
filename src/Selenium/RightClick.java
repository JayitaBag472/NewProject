package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
public class RightClick {
 
 @Test
 public void textInCaps() throws InterruptedException{
                //Instantiating the WebDriver interface.
 
ChromeDriver driver = new ChromeDriver();
                //Open the required URL
 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
                //To maximize the browser
 driver.manage().window().maximize();
                //Create an object 'action' of an Actions class
 Actions action = new Actions(driver);

                //Wait for the element. Used Explicit wait
                WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".context-menu-one"))); 
                WebElement rightClickElement=driver.findElement(By.cssSelector(".context-menu-one"));
                //contextClick() method to do right click on the element
                action.contextClick(rightClickElement).build().perform();
               action.doubleClick(rightClickElement).build().perform();
 }
}
