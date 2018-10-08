package pagelibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewRole extends Base
{
  public static WebElement New_RoleName() 
  {
  return driver.findElement(getElement("NewRoleName"));
  }
  
  public static WebElement New_RoleDesc() 
  {
  return driver.findElement(getElement("NewRoleDesc"));
  }
  
  public static WebElement Role_Type() 
  {
  return driver.findElement(getElement("RoleType"));
  }
  
  public static WebElement Role_Submit()
  {
	  return driver.findElement(getElement("RoleSubmit"));
  }
  
  public static WebElement Role_Reset()
  {
	  return driver.findElement(getElement("RoleReset"));
  }
  public static WebElement Role_Cancel()
  {
	  return driver.findElement(getElement("RoleCancel"));
  }
  
  
}
