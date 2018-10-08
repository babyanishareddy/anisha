package pagelibrary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic {

	//generic means using 1 or more times ...in class v can use anything
	//dropdownhandle and dp_handle both are same v can use anything
	public static  Select dropdownhandle(WebElement e)
	{
		Select s=new Select(e);
		return s;
	}
	public static Select dp_handle(WebElement e,String exp)
	{
		Select s=new Select(e);
		
		List<WebElement>   options=s.getOptions();
		
		for(WebElement op:options)
		{
			String actualtext=op.getText();
			System.out.println(actualtext);
			if(actualtext.contains(exp))
			{
				s.selectByVisibleText(exp);
				break;
			}
		}
		return s;
	}
}
