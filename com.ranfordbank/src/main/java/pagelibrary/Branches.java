package pagelibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Branches extends Base
{
	public static WebElement New_Branch()
	  {
		return driver.findElement(getElement("NewBranch"));
	  }
	public static WebElement Country_Dropdown()
	  {
		return driver.findElement(getElement("Country"));
	  }
	public static WebElement State_Dropdown()
	  {
		return driver.findElement(getElement("States"));
	  }
	public static WebElement City_Dropdown()
	  {
		return driver.findElement(getElement("City"));
	  }
	public static WebElement Search_button()
	  {
		return driver.findElement(getElement("Search"));
	  }
	public static WebElement Clear_button()
	  {
		return driver.findElement(getElement("Clear"));
	  }
	public static WebElement Branch_Id()
	  {
		return driver.findElement(getElement("BranchId"));
	  }
	public static WebElement Branch_Name()
	  {
		return driver.findElement(getElement("BranchName"));
	  }
	public static WebElement Branch_Address()
	  {
		return driver.findElement(getElement("Address"));
	  }
	public static WebElement Branch_Area()
	  {
		return driver.findElement(getElement("Area"));
	  }
	public static WebElement Branch_City()
	  {
		return driver.findElement(getElement("BranchCity"));
	  }
	public static WebElement Branch_State()
	  {
		return driver.findElement(getElement("BranchState"));
	  }
	public static WebElement Branch_Edit()
	  {
		return driver.findElement(getElement("Edit"));
	  }
	public static WebElement Branch_Delete()
	  {
		return driver.findElement(getElement("Delete"));
	  }
	
	
	
}
