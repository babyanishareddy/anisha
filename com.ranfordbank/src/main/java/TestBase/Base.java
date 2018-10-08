package TestBase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base
{
public static WebDriver driver;
static Properties p;

public static void loadproperty1()
{
  try 
  {
	File f=new File(".\\src\\main\\java\\configuration\\OR.properties");
	
	FileReader fr=new FileReader(f);
	p=new Properties();
	
	p.load(fr);
      }
  catch(Exception e)
  {
	  e.printStackTrace();
	  
  }
}
  
  
  public static void loadproperty2()
  {
    try 
    {
  	File f=new File(".\\src\\main\\java\\configuration\\config.properties");
  	
  	//reading file
  	FileReader fr=new FileReader(f);
  	
  	//get properties
  	p=new Properties();
  	
  	//load properties
  	p.load(fr);
    }
    catch(Exception e)
    {
  	  e.printStackTrace();
  	  
    }
    }
 public static String getconfig(String key)
 {
	 loadproperty2();
	 String x=p.getProperty(key);
	 return x;
 }
public static By getElement(String key)
  {
	loadproperty1();
	By loc = null;
	  String value=p.getProperty(key);
	  
	  String loctype=value.split(":")[0];
	  String locvalue=value.split(":")[1];

	  switch(loctype)
	  {
	  case "id":
	  loc=By.id(locvalue);
	  break;
	  
	  case "name":
	  loc=By.name(locvalue);
	  break;
	  
	  case "xpath":
	  loc=By.xpath(locvalue);
	  break;
	
	  }
	  return loc;
  }

}
