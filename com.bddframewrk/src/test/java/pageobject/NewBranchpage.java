package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewBranchpage 
{
	@FindBy(id="txtbName")
    public static WebElement Branchname;

	@FindBy(xpath="//*[@name='txtAdd1']")
    public static WebElement Add1;
    
    @FindBy(xpath="//*[@name='Txtadd2']")
    public static WebElement Add2;
    
    @FindBy(xpath="//*[@name='txtadd3']")
    public static WebElement Add3;
    
    @FindBy(xpath="//*[@name='txtArea']")
    public static WebElement BranchArea1;
    
    @FindBy(xpath="//*[@name='txtZip']")
    public static WebElement zipcode;
    
    @FindBy(xpath="//*[@name='lst_counrtyU']")
    public static WebElement Branchcountry;
    
    @FindBy(xpath="//*[@name='lst_stateI']")
    public static WebElement BranchState1;
    
    @FindBy(xpath="//*[@name='lst_cityI']")
    public static WebElement BranchCity1;
    
    @FindBy(xpath="//*[@name='btn_insert']")
    public static WebElement Submit;
    
    @FindBy(xpath="//*[@name='Btn_Reset']")
    public static WebElement Reset;
    
    @FindBy(xpath="//*[@name='Btn_cancel']")
    public static WebElement cancel;
    
    
}
