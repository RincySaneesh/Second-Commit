package exception.example;

public class JavaExceptionExample
{
	int a;
	int b;
	int result;
	public void division(int x,int y)
	{
	 try
	 {	
	a=x;
	b=y;	
	result=	a/b;

	System.out.println("Answer="+result);

	 int arr[]=new int [5];

		for(int i=0;i<=arr.length;i++)
		{
			arr[i]=i+1;
			System.out.println(arr[i]);
			}
	}
	 
	catch(ArithmeticException e)
	{
		System.out.println("divisible by zero is not defined");
	}
	catch(ArrayIndexOutOfBoundsException s)
	 {
		System.out.println("arry out of bound ");
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
		JavaExceptionExample ex=new JavaExceptionExample();
		ex.division(20,2);
	}

}
