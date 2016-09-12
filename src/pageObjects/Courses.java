package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Courses
{


public static WebElement pcourses(WebDriver driver)
{

List<WebElement> col = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/div[1]/div[3]/div/div/div/a[2]"));
for(int c=0;c<col.size();c=c+1)
{
	
System.out.println(col.get(c).getText());

Actions act = new Actions(driver);

	 act.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
	 
	 col.get(c).click();
   
   act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

String WindowHandl = driver.getWindowHandle();
driver.switchTo().window(WindowHandl);
/* 
WebElement elementr = driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div/div/h4"));
elementr.click();
System.out.println(elementr.getText());

List<WebElement> coursee = driver.findElements(By.xpath("html/body/div[3]/div/div/div[1]/div/div/h4"));

for(int e=0; e<2;e++)
{
	
System.out.println(coursee.get(e).getText());	
coursee.get(e).click();
*/

driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[1]/div[2]/h4/a/span")).click();
driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[2]/div[2]/h4/span")).click();


List<WebElement> course = driver.findElements(By.xpath("html/body/div[3]/div/div/div[1]/div/div[2]"));
for(int s=0; s<course.size(); s=s+1)
{
	
	System.out.println(course.get(s).getText());
	course.get(s).click();
	
List<WebElement> coursesub = driver.findElements(By.xpath("html/body/div[3]/div/div/div[1]/div/div/ol/li"));
for(int g=0; g<coursesub.size(); g=g+1)
{
	System.out.println(coursesub.get(g).getText());
	 Actions acttt = new Actions(driver);
	   
   	 acttt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
   	 
   	 coursesub.get(g).click();
        
        acttt.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
    
        String windowHan = driver.getWindowHandle();

        
        driver.switchTo().window(windowHan);
         
	

  List<WebElement> colleges = driver.findElements(By.xpath(".//*[@id='result-container']/li/div/a/h2"));

    	 for(int i=0; i<colleges.size(); i=i+1)	  
		 {
    		 
    	
    System.out.println(colleges.get(i).getText());
    		 
   	 Actions actt = new Actions(driver);
   
   	 actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
   	 
   	 colleges.get(i).click();
        
        actt.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
    
        String windowHandlee = driver.getWindowHandle();
 
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
   // 	 driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/div[2]/div[2]/h4/span")).click();

		 }

driver.switchTo().window(WindowHandl);

}

}



return null;	
}
}