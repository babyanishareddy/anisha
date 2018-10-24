package definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

//Hooks class for running each and every scenario in background
public class Hooks //
{
	public static WebDriver driver;
//Before executes before each and every scenario
@Before	
public static void browser()
{
	System.setProperty("webdriver.chrome.driver","C:\\batch238\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
}
	
//After executes when any scenario fails
@After
public static void screenshot(Scenario s)
{
  if(s.isFailed())
  {
	 try {
		 TakesScreenshot screen=(TakesScreenshot)driver;
		 byte[] bi=screen.getScreenshotAs(OutputType.BYTES);
		 s.embed(bi,"image/png");
	 } catch(WebDriverException e) {
		 e.printStackTrace();
	 }
  } 
	
}
}