package tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepagebdd;
import pages.Loginpagebdd;
import pages.Mailboxpagebdd;

public class GmailMethods
{
  public WebDriver driver;
  public Homepagebdd hp;
  public Loginpagebdd lp;
  public Mailboxpagebdd mp;
  public Scenario s;
  public Properties pro;
  
  @Before
  public void method1(Scenario x) throws Exception
    {
     
	  //use scenario object for current scenario
	  this.s=x;
	 
	  //load properties file for current scenario
	  pro=new Properties();
	  FileInputStream fip=new FileInputStream("C:\\batch238\\bddframework\\src\\test\\resources\\gmailbdd\\gmailproperties.properties");
	  pro.load(fip);
	  
	  //open browser for current scenario
	  System.setProperty("webdriver.chrome.driver",pro.getProperty("cdpath"));
	  driver=new ChromeDriver();
	 
	  //create page objects for current scenario
	  hp=new Homepagebdd(driver);
	  lp=new Loginpagebdd(driver);
	  mp=new Mailboxpagebdd(driver);
    }
  
  @Given("^launch gmail site$")
   
  public void method2() throws Exception
  {
   driver.get(pro.getProperty("url"));
   Thread.sleep(2000);
  }
	  
  @Then("^title is \"(.*)\" value$")
   public void method3(String x)
  {
	 String t=driver.getTitle();
	 if(t.equals(x))
	 {
		 s.write("Title test was passed");
	 }
	 else
	 {
		 byte[] src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
         s.embed(src,"Test was failed");	
	 }
  }
  
  @And("^close site$")
  public void method4()
    {
	  driver.close();
    }
  
  @When("^enter userid with \"(.*)\" value$")
  public void method5(String u) throws Exception 
	 {
	  hp.filluid(u);
	  Thread.sleep(2000);
	 }
  
  @And("^click next button$")
  public void method6()  throws Exception
    {
	  hp.clickuidnext();
	  Thread.sleep(2000);
    }
	  
  @Then("^validate userid field with\"(.*)\" criteria$")	  
  public void method7(String c) throws Exception
     {
       if(c.equalsIgnoreCase("valid") && lp.pwd.isDisplayed())
       {
    	   s.write(" valid uid test was passed");
       }
	  
       else if(c.equalsIgnoreCase("blank") && hp.blankuiderr.isDisplayed())
       {
    	 s.write("blank uid test passed") ; 
       }
       
       else if(c.equalsIgnoreCase("invalid") && hp.invaliduiderr.isDisplayed())
       {
    	 s.write("invalid uid test passed");
       }
       else
       {
    	   byte[] b=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
           s.embed(b,"uid test failed");
       }
     }

   @And("^enter password with \"(.*)\" value$")
    public void method8(String p) throws Exception
    {
	  lp.fillpwd(p);
    }
   @And("^click password next button$")
    public void method9()
    {
	 lp.clickpwdnext();
    }
  
   @Then("^validate password with\"(.*)\" criteria$")
    public void method10(String c)
    {
	
	  if(c.equalsIgnoreCase("valid") && mp.comp.isDisplayed()) 
	{
		s.write("valid password test passed");
	}
	
	else if(c.equalsIgnoreCase("blank") && lp.blankpwderr.isDisplayed())
	{
		s.write("blank password test passed");
	}  
  
	else if(c.equalsIgnoreCase("invalid") && lp.invalipwderr.isDisplayed())  
    {
	   s.write("invalid password test passed");	
	}  
  
	else
	{
		byte[] b=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    s.embed(b,"pwd test failed");
	}	
  }
}
  

