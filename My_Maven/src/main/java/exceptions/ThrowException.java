package exceptions;

public class ThrowException {

	public void display(int a)throws CustomExceptionExample
	{
		if(a<10)
		{
	
		throw new CustomExceptionExample();
		}
		else
		{
			System.out.println("U r eliglble");
		}
				
	}
	public static void main(String[] args) throws CustomExceptionExample
	{
		ThrowException th=new ThrowException();
		try
		{
		th.display(5);
		}
		catch(CustomExceptionExample e)
		{
			System.out.println("U r  not eliglble");
		}
		

	}

}
