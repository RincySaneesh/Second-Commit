package propertyFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class MyPropertyFile
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("C:\\Users\\Saneesh\\git\\Jenkins\\My_Maven\\src\\main\\resources\\PropertyFileEx.properties");
		Properties pr=new Properties();
		/*pr.load(fr);
		System.out.println(pr.getProperty("userid"));
		System.out.println(pr.getProperty("password"));
		pr.setProperty("Email","Abcd@gmail.com");
		pr.setProperty("ph.No","12345");
		FileWriter fw=new FileWriter("C:\\Users\\Saneesh\\git\\Jenkins\\My_Maven\\src\\main\\resources\\PropertyFileEx.properties");
		pr.store(fw,"First Commit");*/
		Properties p=new Properties();
		p.setProperty("Email","Abcd@gmail.com");
		p.setProperty("ph.No","12345");
		p.store(new FileWriter("info.propertise"),"First Commit");
	}

}
