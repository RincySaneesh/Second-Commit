package encapsulation.assignment;

public class User 
{
	
	public static void main(String[] args) 
	{
		BankAtm bankatm=new BankAtm();
		bankatm.setPinNum(1234);
		int pin=bankatm.getPinNum();
		System.out.println("Ur pin is:"+pin);
		bankatm.validatePin();
	}

}
