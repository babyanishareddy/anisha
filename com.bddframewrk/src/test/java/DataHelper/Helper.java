package DataHelper;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;





public class Helper 
{
   public static List<HashMap<String, String>>  data(String filename, String sheetname) 
   {
	   List<HashMap<String, String>> mydata=new ArrayList<HashMap<String, String>>();
	   try {
		 // poi class dont support file so fileinputstream   
		FileInputStream fis=new FileInputStream(filename);
		
		Workbook wb=new HSSFWorkbook(fis);
		   
		   Sheet sh=wb.getSheet(sheetname);
		   
		   Row headerrow=sh.getRow(0);
		   
		 for(int r=1;r<sh.getPhysicalNumberOfRows();r++)
		 {
		Row currentrow=sh.getRow(r);
		HashMap<String,String> map=new HashMap<String, String>();
		
		for(int c=0;c<currentrow.getPhysicalNumberOfCells();c++)
		{
			Cell currentcell=currentrow.getCell(c);
			
			switch(currentcell.getCellType())
			{
			case Cell.CELL_TYPE_STRING:
				map.put(headerrow.getCell(c).getStringCellValue(),currentcell.getStringCellValue());
				
			}
			
		}
		mydata.add(map);
		 }	 
		   
		 fis.close();  
		   
		   
	} catch (Exception e) {
		//(print-enter , stack-description , trace-location) in console 
		e.printStackTrace();
	}
	return mydata;
	   
   }
}
