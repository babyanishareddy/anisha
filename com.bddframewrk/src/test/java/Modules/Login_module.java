package Modules;

import pageobject.LoginPage;

public class Login_module 
{
  public static void login_exec(String u, String p) 
  {
	  LoginPage.username.sendKeys(u);
	  LoginPage.password.sendKeys(p);
	  LoginPage.login.click();
  }
}
