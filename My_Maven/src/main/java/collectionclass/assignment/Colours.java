
/* Collection 


 a) Write a Java program to create a new array list, add some colors (string) and print out the collection. 
 b) Retrieve an element (at a specified index) from a given array list.
 c) Iterate through all elements in the array list. 
 d) Remove the third element from the array list.
 e) Search an element in the array list.*/

package collectionclass.assignment;
import java.util.*;
public class Colours
{
	ArrayList <String>colours=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	
/*a*/public void setColours()
	{
		colours.add("Violet");
		colours.add("Indigo");
		colours.add("Blue");
		colours.add("Green");
		colours.add("Yellow");
		colours.add("Orange");
		colours.add("Red");
    System.out.println(colours);
	}
/*b*/public void retriveElement()
	{
		System.out.println("Retrieve an element:");	
		System.out.println("Which index u want to retrive:");
		int a=sc.nextInt();
		System.out.println(a+" "+"th index element is:"+colours.get(a));
	}
/*c*/public void iterateElements()
	{
		System.out.println("Iterate through all elements in the array list:");	
		System.out.println("Enter the value of i:");
		int i=sc.nextInt();
		 for( i=0;i<colours.size();i++)
			{
	    System.out.println(colours.get(i)+" ");	
			}
	}
/*d*/public void removeElement()
	{
		System.out.println("Removing third element from the array list");
		System.out.println("Which index u want to remove:");
		int b=sc.nextInt();
		 colours.remove(b);
		 System.out.println(b+"index element is removed from the list!"+colours);
	}
/*e*/public void searchElement()
	{
	   	System.out.println("Which colour you want to search:");
	   	String c=sc.next();
	   	if(colours.contains(c))
		{
	   	System.out.println(c+" "+"Colour is in the list");
		}
		else
		{
			System.out.println(c+" "+"Colour not included in the list");
		}
	 }
	public static void main(String[] args)
	{
     Colours co=new Colours();
     co.setColours();
     co.retriveElement();
     co.iterateElements();
     co.removeElement();
     co.searchElement();
	}

}
