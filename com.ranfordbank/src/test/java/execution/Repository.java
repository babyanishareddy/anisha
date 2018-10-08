package execution;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Excel.Excel_class;
import TestBase.Base;
import Utility.Library;
import Utility.Validation;
import pagelibrary.Admin;
import pagelibrary.Branches;
import pagelibrary.EmployeePage;
import pagelibrary.Generic;
import pagelibrary.LoginPage;
import pagelibrary.NewBranch;
import pagelibrary.NewEmployee;
import pagelibrary.NewRole;
import pagelibrary.Roles;
import webtable.Table;

public class Repository extends Base
{
	
	public static ExtentReports report;
	public static ExtentTest test;
	//extent reports stored in folder in the project starts with .
	//BeforeSuite runs at the 1st before all Tests in this script
	@BeforeSuite
	public void extentreport()
	{
		report=new ExtentReports(".\\Extentreport\\report.html",true);
		  
	}
	//Before runs before test and after suite in this script
	@BeforeMethod
	public void beforemethod(Method method)
	{
		test=report.startTest((this.getClass().getSimpleName()+"::"+method.getName()));
       //name
		test.assignAuthor("name");
	   //type of test	
		test.assignCategory("Regression");
	}
	//Runs after test and before suite 
	@AfterSuite
	public void aftersuite()
	{
		report.flush();//save the file
	}
	
	public void login()
	{
		LoginPage.Username_editbox().sendKeys(getconfig("username"));
		LoginPage.Password_editbox().sendKeys(getconfig("password"));
		LoginPage.Login_button().click();
		if (Validation.IsTextPresent("This module allows"))
		{
		  //report in testng
		   Reporter.log("Login Test passed");
		  //report in Extent report
		   test.log(LogStatus.PASS, "Login Test is passed");
		}		
		else
		{
			//report in testng
			Reporter.log("Login Test failed");
			//report in Extent reports
			test.log(LogStatus.FAIL, "login test is failed" +test.addScreenCapture(Library.screen("login")));
			//screenshot saved in Screen folder in same project
			Library.screen("login");
		}
			
			
	}
	public void launch(String brow)
	{
		
		if(brow.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
		}
		else if(brow.equalsIgnoreCase("chrome"))
		{
			System.setProperty(getconfig("chromedriver"),getconfig("chromedriverpath"));
		  		
			driver=new ChromeDriver();
		}

    	
	//driver=new FirefoxDriver();
	driver.get("http://srssprojects.in/home.aspx");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(Validation.isTitlePresent("KEXIM BANK"))
	{
		//Report in TestNG report
		Reporter.log("Launch Test is passed");
		//Report in extent reports
		test.log(LogStatus.PASS, "Launch Test is passed");
	}
	else
	{
		//Report in testng
		Reporter.log("Launch Test is failed");
		//Report in extent reports
		test.log(LogStatus.FAIL, "Launch test is failed" +test.addScreenCapture(Library.screen("launch")));
	    //screenshot in screen folder by testng
		Library.screen("launch");
		
	}
	}
	
	public void branches()

	{
	Admin.Branches_button().click();
	 if(Validation.IsTextPresent("Branch Details"))
	  {
		//Report in testng
		Reporter.log("branchesbtn clicked passed");
		//report in extent report
		test.log(LogStatus.PASS, "branchesbtn clicked passed");
	  }
	 else
	 {
		 //report in testng
		 Reporter.log("branchesbtn clicked failed");
		 //report in extent reports
		 test.log(LogStatus.FAIL, "branchesbtn clicked failed");
		 Library.screen("launch");
	 }
	}

	public void New_Branch(String bname, String add1, String add2, String add3, String barea1, String zipcode, String bcontry, String bstate1, String bcity1)
    {
		Branches.New_Branch().click();
    	NewBranch.Branch_Name1().sendKeys(bname);
    	NewBranch.Branch_Address1().sendKeys(add1);
    	NewBranch.Branch_Address2().sendKeys(add2);
    	NewBranch.Branch_Address3().sendKeys(add3);
    	NewBranch.Branch_Area1().sendKeys(barea1);
    	NewBranch.Zip_Code().sendKeys(zipcode);
    	Generic.dropdownhandle(NewBranch.Branch_Country()).selectByVisibleText(bcontry);
    	Generic.dropdownhandle(NewBranch.Branch_State1()).selectByVisibleText(bstate1);
    	Generic.dropdownhandle(NewBranch.Branch_City1()).selectByVisibleText(bcity1);
    	NewBranch.Submit().click();
    	
    	/*if(Validation.IsAlertPresent("already exist"))
    	{
    	  Reporter.log("NewBranch creation passed");	
    	  test.log(LogStatus.PASS, "NewBranch creation passed");
    	  
    	}
    	else
    	{
    	  Reporter.log("NewBranch creation failed");
    	  test.log(LogStatus.FAIL, "NewBranch creation failed");
    	  Library.screen("NewBranch");
    	}*/
    	
    }
	

	public void branch_search()
    {
    	Generic.dropdownhandle(Branches.Country_Dropdown()).selectByVisibleText("INDIA");
    	Generic.dp_handle(Branches.State_Dropdown(),"Karnataka");
    	Generic.dropdownhandle(Branches.City_Dropdown()).selectByVisibleText("BANGLORE");
    	Branches.Search_button().click();
    	
    	if(Validation.IsTextPresent("already exist"))
    	{
    		//report in testng
    		Reporter.log("branch search passed");
    		//report in extent report
    		test.log(LogStatus.PASS, "branch search passed");
    	}
    	else 
    	{
    	 //report in testng
    		Reporter.log("Branch search failed");
    	 //report in extent reports
    		test.log(LogStatus.FAIL, "Branch search failed");
    		Library.screen("launch");
    	}
    	
    }

	
	public void Roles()
	{
	   Admin.Roles_button().click();	
	   
	   if(Validation.IsTextPresent("Roles Details")) 
	   {
		 //report in testng
		  Reporter.log("Rolesbtn clicked passed");
		  //report in extent report
		  test.log(LogStatus.PASS, "Rolesbtn clicked passed");
	   }
	   else
	   {
		   //report in testng
		   Reporter.log("Rolesbtn click failed");
		   //report in extent report
		   test.log(LogStatus.FAIL, "Rolesbtn click failed");
	   }
	}
	public void New_Role() 
	{
      Roles.New_Role().click();
      NewRole.New_RoleName().sendKeys("ABCD");
      NewRole.New_RoleDesc().sendKeys("abcdefgh");
      Generic.dropdownhandle(NewRole.Role_Type()).selectByVisibleText("C");
      NewRole.Role_Submit().click();
      
      if(Validation.IsAlertPresent("Created Successfully"))
  	{
  	  Reporter.log("NewRole Creation passed");
  	test.log(LogStatus.PASS, "NewRole creation failed");
	  
  	}
  	else
  	{
  	  Reporter.log("NewRole creation failed");
  	test.log(LogStatus.FAIL, "NewRole creation failed");
	  Library.screen("NewRole");
  	}
  	driver.switchTo().alert().dismiss();
	} 
	
	
	public void EmployeePage() 
	{
	   Admin.Employee_button().click();	
	   if(Validation.IsTextPresent("Roles Details")) 
	   {
		 //report in testng
		  Reporter.log("Employeebtn clicked passed");
		  //report in extent report
		  test.log(LogStatus.PASS, "Employeebtn clicked passed");
	   }
	   else
	   {
		   //report in testng
		   Reporter.log("Employee click failed");
		   //report in extent report
		   test.log(LogStatus.FAIL, "Employeebtn click failed");
	   }
	}
	
	public void New_Employee()
	{
	  EmployeePage.New_Employee().click();
	  NewEmployee.Employer_Name().sendKeys("ABCD");
	  NewEmployee.Emp_LoginPass().sendKeys("abcdef");
	  Generic.dropdownhandle(NewEmployee.Emp_Role()).selectByVisibleText("manager");
	  Generic.dropdownhandle(NewEmployee.Emp_Branch()).selectByVisibleText("1");
	  NewEmployee.Emp_Submit().click();
	
	  if(Validation.IsAlertPresent("Employee Details"))
	  	{
          Reporter.log("NewEmployee Creation passed");
	  	  test.log(LogStatus.PASS, "NewEmployee creation failed");
  	  
	  	}
	  	else
	  	{
	  	  Reporter.log("NewEmployee Creation failed");
	  	  test.log(LogStatus.FAIL, "NewEmployee creation failed");
  	      Library.screen("NewEmployee");
	  	}
	   driver.switchTo().alert().dismiss();
		} 
	
	
  public Object[][] excelcontent(String fname,String sname)
  {
	  Excel_class.excelconnection(fname,sname);
	  int rc=Excel_class.rcount();
	  int cc=Excel_class.ccount();
	  
	  String[][] data=new String[rc-1][cc];
	  
	  for(int r=1;r<rc;r++)
	  {
		  for(int c=0;c<cc;c++)
		  {
			  data[r-1][c]=Excel_class.readdata(c,r);
		  }
	  }
	  return data;
	  
  }
  
  public static void Web_Table()
  {
   Admin.Branches_button().click();
   Generic.dropdownhandle(Branches.Country_Dropdown()).selectByVisibleText("INDIA");
   Generic.dropdownhandle(Branches.State_Dropdown()).selectByVisibleText("Karnataka");
   Generic.dp_handle(Branches.City_Dropdown(), "BANGLORE");
   Branches.Search_button().click();
   Table.tablehandle("edit", "1592");
   
  }
	
  
	
	
}


