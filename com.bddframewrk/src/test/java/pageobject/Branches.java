package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Branches
{
	@FindBy(xpath="//*[@name='BtnNewBR']")
	public static WebElement NewBranch;

	@FindBy(xpath="//*[text()='BranchId']")
    public static WebElement BranchId;
    
    @FindBy(xpath="//*[text()='BranchName']")
    public static WebElement BranchName;
    
    @FindBy(xpath="//*[text()='Address']")
    public static WebElement Address;
    
    @FindBy(xpath="//*[text()='Area']")
    public static WebElement Area;
    
    @FindBy(xpath="(//*[text()='City'])[1]")
    public static WebElement BranchCity;
    
    @FindBy(xpath="(//*[text()='State'])[1]")
    public static WebElement BranchState;
    
    @FindBy(xpath="//*[text()='Edit']")
    public static WebElement Edit;
    
    @FindBy(xpath="//*[text()='Delete']")
    public static WebElement Delete;
    
	
}
