package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
			public static int getRowCount(String path, String Sheet)
{
  int rc =0;

	try
	   { 
                FileInputStream fis=new FileInputStream("E:\\Banking1\\Centralized Entitlements\\data\\input.xlsx");
                Workbook wb= WorkbookFactory.create(fis);
	        rc=wb.getSheet(Sheet).getLastRowNum();	
	    }
	
	catch(Exception e)

	{
	}
	return rc;
}

public static String getCellValue(String path, String Sheet,int r, int c)
{
  String v="";

	try
	   { 
                FileInputStream fis=new FileInputStream("E:\\Banking1\\Centralized Entitlements\\data\\input.xlsx");
                Workbook wb= WorkbookFactory.create(fis);
	         v=wb.getSheet(Sheet).getRow(r).getCell(c).toString();
	    }
	
	catch(Exception e)

	{
	}
	return v;
}

}



