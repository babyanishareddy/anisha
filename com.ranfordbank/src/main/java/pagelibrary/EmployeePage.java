package pagelibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class EmployeePage extends Base
{

	public static WebElement Employee()
	  {
		return driver.findElement(getElement("Employee"));
	  }
 
	public static WebElement New_Employee()
	  {
		return driver.findElement(getElement("NewEmployee"));
	  }
	public static WebElement Employee_Id()
	  {
		return driver.findElement(getElement("Employee_Id"));
	  }
    public static WebElement Employee_Name()
	  {
		return driver.findElement(getElement("EmployeeName"));
	  }

    public static WebElement Emp_Password()
	  {
		return driver.findElement(getElement("EmpPassword"));
	  }
    
    public static WebElement Emp_RoleName()
	  {
		return driver.findElement(getElement("EmproleName"));
	  }
    
    public static WebElement Emp_BranchNam()
	  {
		return driver.findElement(getElement("EmpBranchNam"));
	  }
  
    public static WebElement Emp_Edit()
	  {
		return driver.findElement(getElement("EmpEdit"));
	  }
    public static WebElement Emp_Del()
	  {
		return driver.findElement(getElement("EmpDel"));
	  }

  
   





}
