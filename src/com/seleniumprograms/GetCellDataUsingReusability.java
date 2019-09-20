package com.seleniumprograms;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.Reusable.Reusable;

public class GetCellDataUsingReusability {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		
		//Reusable.getCellData("C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Test_Data_New.xlsx","Sheet1", 1, 1);
	Reusable.WritedataintoCell("C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Test_Data_New.xlsx","Sheet1",1,3,"Testing");
//		Reusable.WritedataintoCell(file, Sheet_name, rownum, cellnum, cellvalue);
	}

}
