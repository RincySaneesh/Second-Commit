package exception.example;

import java.io.IOException;

public class ThrowAndThrowsExample 
{
	int a;
	int b;
	int result;
	public void division(int x,int y)throws Exception
	{
	
	a=x;
	b=y;	
	result=	a+b;

	System.out.println("Answer="+result);

	if(result>10)
	
		throw new ArithmeticException();
	
	else
		throw new IOException();
	
	}
	public void display()
	{
		try
		{
			division(10,2);
		}
	 
	catch(ArithmeticException e)
	{
		System.out.println("Arithemetic Exception ");
	}
	catch(IOException s)
	 {
		System.out.println("IOException ");
	 }
	 catch(Exception c)
	 {
		 System.out.println("dException found");
	 }
	 finally
	 {
		 System.out.println("finall block executed");
	 }
	}

	public static void main(String[] args)
	{
		ThrowAndThrowsExample th=new ThrowAndThrowsExample();
		th.display();
	}

}
