package pageObjects;



import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Articles 
{

	
	
	public static void main(String args[]) throws InterruptedException
	
	{
		WebDriver driver = new FirefoxDriver();
		
		//************** Navigate to Website and click on category 
		
		driver.navigate().to("http://www.edunuts.com");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='explore']/a[1]/div/h3")).click();
		Thread.sleep(1000);
		
		//**************  Category page - Click on More Articles
		
		WebElement element1 = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[1]/div[5]/div[1]/h3/a[2]"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
		
		element1.click();
		act.keyUp(Keys.CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
		
		String WindowHandle = driver.getWindowHandle();
		driver.switchTo().window(WindowHandle);
		
		
		//************************** Click on pages eg- 1,2
		
		List<WebElement> pn = driver.findElements(By.xpath("html/body/div[3]/div/div[2]/div/div/div/div/ul/li/a"));
			for(int i=0;i<pn.size();i=i+1)
				{
				
					System.out.println(pn.get(i).getText());
					pn.get(i).getText();
					//	pn.get(i).click();
			
					Actions acty = new Actions(driver);
					acty.keyDown(Keys.CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
					pn.get(i).click();
					acty.keyUp(Keys.CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
			
			
		//************************** Click on View 
			
		
		  List<WebElement> vw = driver.findElements(By.xpath("html/body/div[3]/div/div[2]/div/div/div/div/div/a"));
				for(int j=0;j<vw.size();j=j+1)
					{
				
						System.out.println(vw.get(j).getText());
				
						WebElement element = vw.get(j);
						String url = element.getAttribute("href");
						verifyLinkUrl(url);
				
						Actions actt = new Actions(driver);
						actt.keyDown(Keys.CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
						vw.get(j).click();
						actt.keyUp(Keys.CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
			
				
						driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
				
					}
					driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
			 
					}
		}
		
	
	   //****************************** Check response code of URL
	
		public static void verifyLinkUrl(String linkUrl)
		
			{
				try
					{
						URL url = new URL(linkUrl);
						HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
						httpURLConnect.setConnectTimeout(5000);
						httpURLConnect.connect();
		
						if(httpURLConnect.getResponseCode()==200)
							{
								System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage());
							}
						if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
							{
								System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
							}
			
			
					}
					catch(Exception e)
					{
						System.out.println("");
					}
			}
		
		
				
		}
		
	
	

