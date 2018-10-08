package pagelibrary;


import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewBranch extends Base
{
	public static WebElement Branch_Name1()
	  {
		  return driver.findElement(getElement("BranchName1"));
	  }
	public static WebElement Branch_Address1()
	  {
		return driver.findElement(getElement("Address1"));
	  }
	public static WebElement Branch_Address2()
	  {
		return driver.findElement(getElement("Address2"));
	  }
	public static WebElement Branch_Address3()
	  {
		  return driver.findElement(getElement("Address3"));
	  }
	public static WebElement Branch_Area1()
	{
		return driver.findElement(getElement("BranchArea1"));
	}
	public static WebElement Zip_Code()
	{
		return driver.findElement(getElement("Zipcode"));
	}
	public static WebElement Branch_Country()
	{
		return driver.findElement(getElement("BranchCountry"));
	}

	public static WebElement Branch_State1()
	{
		return driver.findElement(getElement("BranchState1"));
	}
	public static WebElement Branch_City1()
	{
		return driver.findElement(getElement("BranchCity1"));
	}
	public static WebElement Submit()
	{
		return driver.findElement(getElement("Submit"));
	}
	public static WebElement Reset()
	{
		return driver.findElement(getElement("Reset"));
	}
	public static WebElement Cancel()
	{
		return driver.findElement(getElement("Cancel"));
	}
	}
