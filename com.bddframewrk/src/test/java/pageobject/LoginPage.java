package pageobject;//declaration 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage //module initialization
{

	@FindBy(id="txtuId")
	public static WebElement username;
	
	@FindBy(id="txtPword")
	public static WebElement password;
	
	@FindBy(xpath="//*[@name='login']")
	public static WebElement login;
	
	
	
    
    
    
    
    
    
    
    
    
	
	
}
