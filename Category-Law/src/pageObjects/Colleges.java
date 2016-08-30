package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Colleges
{


public static WebElement pcolleges(WebDriver driver)
{

List<WebElement> col = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/div[1]/div[3]/div/div/div/a[1]"));
for(int c=0;c<col.size();c=c+1)
{
	
System.out.println(col.get(c).getText());

Actions act = new Actions(driver);

	 act.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
	 
	 col.get(c).click();
   
     act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

String WindowHandl = driver.getWindowHandle();
driver.switchTo().window(WindowHandl);
 

  List<WebElement> colleges = driver.findElements(By.xpath(".//*[@id='result-container']/li/div/a/h2"));

     for(int i=0; i<colleges.size(); i=i+1)	  
		 
      {
    		 
    	
    	 System.out.println(colleges.get(i).getText());
    		 
    	 Actions actt = new Actions(driver);
   
    	 actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
   	 
    	 colleges.get(i).click();
        
    	 actt.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
    
    	 String windowHandlee = driver.getWindowHandle();

        
        ArrayList tabs = new ArrayList (driver.getWindowHandles());

        
        driver.switchTo().window(windowHandlee);
         
        if(!driver.findElements(By.xpath(".//*[@id='institute-name']")).isEmpty())
        
        {
        	 WebElement prashant = driver.findElement(By.xpath(".//*[@id='institute-name']"));
             System.out.println(prashant.getText());
        	
        	
             driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");

            
             driver.switchTo().defaultContent();
        
     
        System.out.println("--------------------xxxxxxxxxxxx-----------------");
        
    	
        	
        }
        else
        {
            
        	System.out.println("\033[31mElement Not Found\033[0m");
   /*     
        	WebElement elementt = driver.findElement(By.xpath("html/body/div[1]/ol/li[3]"));
        	elementt.click();
        	System.out.println(elementt.getText());
    */       
        	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
            driver.switchTo().defaultContent();
        
     
        System.out.println("--------------------xxxxxxxxxxxx-----------------");
        	
        }
       
		 }
    	 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
         driver.switchTo().defaultContent();
		 }
return null;

}	
}
