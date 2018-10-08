package execution;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Excel.Excel_class;

public class TestExecution extends Repository
 {

@Test(priority=1)
    public void verify_login() {
	   login();
	    }
 
  @Parameters({"browser"})
 @Test(priority=0)
   public void verify_launch(String browser) {
	   launch(browser);
	    }
 
 
 @Test(priority=2)
   public void verify_branchclick() {
	 branches();
        }

 /*@Test(priority=3,dataProvider="Branches")
   public void verify_NewBranch(String bname,String add1, String add2,String add3,String barea1, String zipcode, String bcontry, String bstate1, String bcity1){
	 New_Branch(bname,add1,add2,add3,barea1,zipcode,bcontry,bstate1,bcity1);
	    }
// 2D array for row and columns
 @DataProvider(name="Branches")
 public Object[][] verify_excel()
 {
  return excelcontent("RanfordBranches.xls","Sheet1");
 }*/

 @Test(priority=4)
 public void verify_branchsearch() {
	 branch_search();
       }

 @Test(priority=5)
 public void verify_Role() {
	 Roles();
 }
 
 @Test(priority=6)
 public void verify_NewRole() {
	 New_Role();
 }
 
 @Test(priority=7)
 public void verify_Employee() {
	EmployeePage();
 }
 
 @Test(priority=9)
 public void verify_NewEmployee() {       
	 New_Employee();
 }
 
 @Test(priority=10)
 public void verify_WebTable() {
	 Web_Table();
 }
 @Test(priority=3)
 public void verify_excel()
 {
	 Excel_class.excelconnection("RanfordBranches.xls", "Sheet1");
	 Excel_class.outputexcelconnection("RanfordBranches.xls", "output.xls", "Sheet1");
	 int c=Excel_class.ccount();
	 for(int r=1;r<Excel_class.rcount();r++)
	{
		
		 New_Branch(Excel_class.readdata(0, r), Excel_class.readdata(1, r), Excel_class.readdata(2, r), Excel_class.readdata(3, r), Excel_class.readdata(4, r), Excel_class.readdata(5, r), Excel_class.readdata(6, r), Excel_class.readdata(7, r), Excel_class.readdata(8, r));
		 
		 
		 String text=driver.switchTo().alert().getText();
		 driver.switchTo().alert().dismiss();
		 if(text.contains("already Exists"))
		 {
			 Excel_class.writedata(c++, r, text);
			 c--;
		 }
		 else if(text.contains("created successfully"))
		 {
			 Excel_class.writedata(c++, r, text);
			 c--;
		 }
		 else
		 {
			 Excel_class.writedata(c++, r, "n/a");
			 c--;
		 }
	 }
	 Excel_class.saveworkbook();
 }
 
 }



