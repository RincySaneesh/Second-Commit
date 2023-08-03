/*Program to withdraw amount from an ATM.
i) Class 1- Bank One method to set pin from „User‟ class and validate Pin in another method.
   [Valid pins – 1001, 1234, 1212] Pin number should declare as private. 
ii) Class 2 – User Get the pin from User.*/

package encapsulation.assignment;

public class BankAtm 
{
	private int pinNum;
	
	public int getPinNum() 
	{
		return pinNum;
	}
	public void setPinNum(int a)
	{
		pinNum=a;
	}
	public void validatePin()
	{
		if(pinNum==1001)
		{
			System.out.println("Valid");
		}
		else if(pinNum==1234)
		{
			System.out.println("Valid");
		}
		else if(pinNum==1212)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("InValid");
		}
			
	}
}

