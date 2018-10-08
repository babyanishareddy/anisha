package pagelibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewEmployee extends Base
{

	 public static WebElement Employer_Name()
	  {
		return driver.findElement(getElement("EmployerName"));
	  }
 
    public static WebElement Emp_LoginPass()
	  {
		return driver.findElement(getElement("EmpLoginPass"));
	  }

   public static WebElement Emp_Role()
	  {
		return driver.findElement(getElement("EmpRole"));
	  }

   public static WebElement Emp_Branch()
	  {
		return driver.findElement(getElement("EmpBranch"));
	  }

   public static WebElement Emp_Submit()
	  {
		return driver.findElement(getElement("EmpSubmit"));
	  }

   public static WebElement Emp_Reset()
	  {
		return driver.findElement(getElement("EmpReset"));
	  }

   public static WebElement Emp_Cancel()
	  {
		return driver.findElement(getElement("EmpCancel"));
	  }

	
	
	
	
	
}
