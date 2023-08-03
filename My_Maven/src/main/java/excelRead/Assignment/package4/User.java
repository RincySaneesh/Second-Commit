package excelRead.Assignment.package4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import excelRead.Assignment.package2.SBIMethod;
import excelRead.Assignment.package3.FederalMethod;

public class User 
{
	XSSFSheet sh;
	public User() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Saneesh\\Desktop\\Java Projects\\My_Maven\\src\\main\\resources\\Assignment worksheet.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(fis);
		sh=w.getSheet("Assignment");
	}
	public double readData(int i,int j)
	{
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int cellType=c.getCellType();
		switch(cellType)
		{
		case Cell.CELL_TYPE_STRING:
			String data1=c.getStringCellValue();
			double data2=Double.parseDouble(data1);
			return data2;
		case Cell.CELL_TYPE_NUMERIC:
			double num=c.getNumericCellValue();
			
			return num;
		default:
			return 0;
		}
	}

	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Bank:1.SBI,2.Fedaral");
		int a=sc.nextInt();
		User us=new User();
		if(a==1)
		{
			System.out.println("Welcome to SBI");
			SBIMethod sbi=new SBIMethod();
			double p=us.readData(1,0);
			double r=us.readData(1,1);
			double n=us.readData(1,2);
			double simple=sbi.getInterestRate(p,r,n);
			System.out.println("Simple Interest="+simple);
		}
		else
		{
			System.out.println("Welcome to FEDARAL BANK");
			FederalMethod fed=new FederalMethod();
			double p=us.readData(1,0);
			double r=us.readData(1,1);
			double n=us.readData(1,2);
			double compound=fed.getInterestRate(p,r,n);
			System.out.println("Interest="+compound);
			fed.checkPancardNeeded(60000);
		}
		
		
	}

}
