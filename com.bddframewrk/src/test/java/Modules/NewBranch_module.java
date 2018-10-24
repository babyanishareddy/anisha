package Modules;

import java.util.HashMap;
import java.util.List;

import pageobject.Generic;
import pageobject.NewBranchpage;

public class NewBranch_module 
{
	 public static void Branch_creation(List<HashMap<String, String>> map)
	 {
		 NewBranchpage.Branchname.sendKeys(map.get(0).get("BranchName1"));
		 NewBranchpage.Add1.sendKeys(map.get(0).get("Address1"));
		 NewBranchpage.Add2.sendKeys(map.get(0).get("Address2"));
		 NewBranchpage.Add3.sendKeys(map.get(0).get("Address3"));
		 NewBranchpage.BranchArea1.sendKeys(map.get(0).get("BranchArea1"));
		 NewBranchpage.zipcode.sendKeys(map.get(0).get("Zipcode"));
		 Generic.dropdownhandle(NewBranchpage.Branchcountry).selectByVisibleText(map.get(0).get("BranchCountry"));
		 Generic.dropdownhandle(NewBranchpage.BranchState1).selectByVisibleText(map.get(0).get("BranchState1"));
		 Generic.dropdownhandle(NewBranchpage.BranchCity1).selectByVisibleText(map.get(0).get("BranchCity1"));
		 NewBranchpage.Submit.click();
	 
	 
	 }
}
