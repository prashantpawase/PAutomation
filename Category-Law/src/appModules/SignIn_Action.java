package appModules;

import org.openqa.selenium.WebDriver;


import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.Constant;

 

 
    public class SignIn_Action
    {
 
		public static void Execute(WebDriver driver) throws Exception
		{
 
			
 
			Home_Page.lnk_MyAccount(driver).click();
 
			LogIn_Page.txtbx_UserName(driver).sendKeys(Constant.Username);
 
			LogIn_Page.txtbx_Password(driver).sendKeys(Constant.Password);
 
			LogIn_Page.btn_LogIn(driver).click();
			
		
 
        }
 
}