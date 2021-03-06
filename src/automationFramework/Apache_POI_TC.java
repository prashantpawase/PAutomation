//PRASHANT PAWASE
//Category Law
package automationFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.commands.GetAlert;

import pageObjects.*;

import utility.Constant;


import appModules.SignIn_Action;

public class Apache_POI_TC
{

	private static WebDriver driver = null;

public static void main(String[] args) throws Exception 
{

driver = new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get(Constant.URL);

SignIn_Action.Execute(driver);

Thread.sleep(1000);



System.out.println("\033[32mLogin Successfully\033[0m");

Thread.sleep(1000);

WebElement Law = driver.findElement(By.xpath(".//*[@id='explore']/a[4]/div/h3"));

Law.click();
Thread.sleep(1000);

try
{
 Colleges.pcolleges(driver).click();
 Thread.sleep(2000);
}
catch(Exception e)
{
	System.out.println("");
}
try
{
	Course.pcourse(driver).click();
    Thread.sleep(1000);

}
catch(Exception e)
{
	System.out.println("");
}


Home_Page.lnk_Logout(driver).click(); 

System.out.println("\033[32mLogout Successfull\033[0m");

driver.quit();


}
}



