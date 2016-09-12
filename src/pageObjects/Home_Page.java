package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page 

{

	private static WebElement element = null;
	
	public static WebElement lnk_MyAccount(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("html/body/header/div/div/div[2]/a"));
		
		return element;
		
	}
	
	public static WebElement lnk_Logout(WebDriver driver)
	{
		driver.findElement(By.xpath("html/body/header/div/div/div[3]/div[1]/a/span")).click();
		element = driver.findElement(By.xpath("html/body/header/div/div/div[3]/div[1]/ul/li[4]/a"));
		
		return element;
	}
	
	
	
}
