package pagelibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Roles extends Base
{
  
  public static WebElement New_Role()
  { 
    return driver.findElement(getElement("NewRole"));	  
  }
  
  public static WebElement Role_Id() 
  {
	return driver.findElement(getElement("Roleid"));  
  }
  
  public static WebElement Role_Name()
  {
	 return driver.findElement(getElement("Rolename")); 
  }
	
  public static WebElement Role_Des()
  {
	 return driver.findElement(getElement("Roledes")); 
  }

  public static WebElement Role_Edit()
  {
	  return driver.findElement(getElement("RoleEdit"));
  }
  
  public static WebElement Role_Delete()
  {
	  return driver.findElement(getElement("RoleDelete"));
  }










}
