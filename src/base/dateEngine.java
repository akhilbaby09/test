package base;

import java.io.IOException;


import org.testng.annotations.Test;

import datahandler.ReadfromExcel;
import testcase.Search;

public class dateEngine extends Confbase{

	
	ReadfromExcel Read = new ReadfromExcel();
    Search s= new Search();
    
   
    public void testing () throws IOException, InterruptedException{
    	
       int rows = Read.getrowno("DataEngine");
   	System.out.println(rows);
    
    	for (int iRow=1;iRow<=rows;iRow++)
    		
    	{
    		Thread.sleep(2000);
    		String sActionKeyword =	Read.getStringCellValue("DataEngine", iRow, 2);
    	
    		if(sActionKeyword.equals("BIBO")){
    			    s.BIBO();
    			}
    		else if(sActionKeyword.equals("second")){
    			s.second();}
    		else if(sActionKeyword.equals("third")){
    			s.third();}
    		}
    	}
    }
