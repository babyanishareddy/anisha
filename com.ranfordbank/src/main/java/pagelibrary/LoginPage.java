package pagelibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class LoginPage extends Base
{
  public static WebElement Username_editbox()
  {
	  return driver.findElement(getElement("username"));
	  
  }
  
  public static WebElement Password_editbox()
  {
	  return driver.findElement(getElement("password"));
	  
  }
  public static WebElement Login_button()
  {
	  return driver.findElement(getElement("login"));
	  
  }
  
} 



