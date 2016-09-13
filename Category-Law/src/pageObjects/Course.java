package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Course
{

	
public static WebElement pcourse(WebDriver driver) throws InterruptedException 
{
	
	List<WebElement> coli = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/div[1]/div[3]/div/div/div/a[2]"));
	
	for(int i=0;i<coli.size();i=i+1)
	{
		
		System.out.println(coli.get(i).getText());
	
		
		Actions acti = new Actions(driver);
        acti.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
        
        coli.get(i).click();
        
        acti.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
        
        String WindowHandlei = driver.getWindowHandle();
        
        driver.switchTo().window(WindowHandlei);
        
        driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]")).click();
        
     
        
       List<WebElement> cola = driver.findElements(By.xpath("html/body/div[3]/div/div/div[1]/div/div/h4/a"));
    
        for(int a=0;a<cola.size();a=a+1)
        {
        	System.out.println(cola.get(a).getText());

        	cola.get(a).click();
            
        }
    
     
        	
        	List<WebElement> colk = driver.findElements(By.xpath("html/body/div[3]/div/div/div[1]/div/div/ol/li"));	
        	
        	for(int k=0;k<colk.size();k=k+1)
        	{
        		
        		System.out.println(colk.get(k).getText());
        		
        		Actions actk = new Actions(driver);
        		actk.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
   
        		colk.get(k).click();
        		
        		actk.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
        		
        	    String WindowHandlek = driver.getWindowHandle();
        		driver.switchTo().window(WindowHandlek);
        	
        		
        		
        	List<WebElement> colleges = driver.findElements(By.xpath(".//*[@id='result-container']/li/div/a/h2"));

           	 for(int l=0; l<colleges.size(); l=l+1)	  
       		 {
           		 
           	
           System.out.println(colleges.get(l).getText());
           		 
          	 Actions actt = new Actions(driver);
          
          	 actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
          	 
          	 colleges.get(l).click();
               
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
               	WebElement elementt = driver.findElement(By.xpath("html/body/div[1]/ol/li[3]"));
               	elementt.click();
               	System.out.println(elementt.getText());
                  
               	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
                   driver.switchTo().defaultContent();
               
            
               System.out.println("--------------------xxxxxxxxxxxx-----------------");
               	
               }
           
        		}
             driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
             driver.switchTo().defaultContent();
        	}
        	

  
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");     
      
	}
	
	
	
	return null;
	
}
}
