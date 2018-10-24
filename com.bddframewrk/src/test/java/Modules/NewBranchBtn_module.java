package Modules;

import pageobject.Branches;

public class NewBranchBtn_module 
{
  public static void NewBranch()
  {
	  if(Branches.NewBranch.isDisplayed())
	  {
		Branches.NewBranch.click();
	  }
  }
}
