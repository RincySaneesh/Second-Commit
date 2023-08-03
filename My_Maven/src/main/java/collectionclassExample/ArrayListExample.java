package collectionclassExample;
import java.util.*;
public class ArrayListExample
{

	public static void main(String[] args) 
	{
		ArrayList <String>arr=new ArrayList<String>();
		ArrayList <Integer>li=new ArrayList<Integer>();
		arr.add("TINCY");
		arr.add("PRINCY");
		arr.add("RINCY");
		arr.add("SHINCY");
		li.add(28);
		li.add(27);
		li.add(26);
		li.add(25);
		arr.remove(3);
		System.out.println(arr);
		System.out.println(li);
		Collections.sort(arr);
		System.out.println(arr);
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));	
		}
	}

}
