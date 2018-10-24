package Modules;

import pageobject.Adminpage;

public class Branches_module 

{
  public static void branches()
  {
	  if(Adminpage.BranchesBTN.isDisplayed())
	  {
		 Adminpage.BranchesBTN.click();
	  }
  }
}
