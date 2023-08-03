package excel.read;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead
{
	XSSFSheet sh;
	public ExcelRead() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Saneesh\\Desktop\\JavaExcelRead.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(fis);
		sh=w.getSheet("Sheet1");
	}
	public void readFile()
	{
		for(Row r:sh)
		{
			System.out.println();
			
			for(Cell c:r)
			{
				System.out.print(c+" ");
			}
		}
	}
	
	public String readData(int i,int j)
		{
			Row r=sh.getRow(i);
			Cell c=r.getCell(j);
			int cellType=c.getCellType();
			switch(cellType)
			{
			case Cell.CELL_TYPE_STRING:
				String data1=c.getStringCellValue();
				return data1;
			case Cell.CELL_TYPE_NUMERIC:
				double num=c.getNumericCellValue();
				String data2=String.valueOf(num);
				return data2;
			default:
				return null;
			}
		}
public static void main (String args[])throws IOException
	{
	ExcelRead er=new ExcelRead();
	er.readFile();
	String value;
	value=er.readData(1, 1);
	System.out.println("data:"+value);
	
	
	
	
	
}
}
