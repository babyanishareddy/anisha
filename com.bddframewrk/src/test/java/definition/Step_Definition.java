package definition;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import DataHelper.Helper;
import Modules.Branches_module;
import Modules.Login_module;
import Modules.NewBranchBtn_module;
import Modules.NewBranch_module;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.Adminpage;
import pageobject.Branches;
import pageobject.LoginPage;
import pageobject.NewBranchpage;

public class Step_Definition
{
	WebDriver driver;
	List<HashMap<String,String>> map;
	
	public Step_Definition()
	{

		//1st run hooks class right driver bcz need to launch the browser and then this driver  
		this.driver=Hooks.driver;
		map=Helper.data("C:\\batch238\\com.bddframewrk\\Excelfiles\\branchdetails.xls", "branchdetails");
	}
	@Given("^launch the site$")
	public void launch_the_site() 
	{
		//Thread.sleep(3000);
		driver.get("http://srssprojects.in/");
	}

	@When("^Enter the userid with \"([^\"]*)\" and password with \"([^\"]*)\" data and click on login btn$")
	public void Enter_the_userid_with_and_password_with_data_and_click_on_login_btn(String user, String pass) throws Throwable 
	{
		PageFactory.initElements(driver, LoginPage.class);
		  Login_module.login_exec(user, pass);    
	}

	@Then("^Branches btn should be displayed and click on branch btn$")
	public void Branches_btn_should_be_displayed_and_click_on_branch_btn() throws Throwable 
	{
		PageFactory.initElements(driver,Adminpage.class); 
		Branches_module.branches(); 
	}

	@Then("^close site$")
	public void close_site() throws Throwable 
	{
		driver.close();    
	}

	@Then("^newbranch btn should be displayed and click newbranch btn$")
	public void newbranch_btn_should_be_displayed_and_click_newbranch_btn() throws Throwable 
	{
		PageFactory.initElements(driver, Branches.class);
		NewBranchBtn_module.NewBranch();    
	}

	@When("^Enter the data for newbranch btn with \"([^\"]*)\" data set$")
	public void Enter_the_data_for_newbranch_btn_with_data_set(String args) throws Throwable 
	{
		PageFactory.initElements(driver, NewBranchpage.class);
		NewBranch_module.Branch_creation(map);
	}

}
