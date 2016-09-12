package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LogIn_Page 
{

	private static WebElement element = null;
	
	public static WebElement txtbx_UserName(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='form-login']/div/div[1]/div/div/input"));
		 
        return element;

        }

    public static WebElement txtbx_Password(WebDriver driver)
    {

        element = driver.findElement(By.xpath(".//*[@id='form-login']/div/div[2]/div/div/input"));

        return element;

        }

    public static WebElement btn_LogIn(WebDriver driver)
    {

        element = driver.findElement(By.xpath(".//*[@id='form-login']/div/div[3]/div[2]/button"));
        
        return element;

        }
    

    
  
}

