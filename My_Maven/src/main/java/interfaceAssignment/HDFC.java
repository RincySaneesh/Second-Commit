package interfaceAssignment;

public class HDFC implements RBI
{
	
	public void recurringDeposit(double amount,int duration)
	{
	double totalAmt=amount*duration*interest;//PNR
	System.out.println("The TotalAmount will get after"+" "+duration+" "+"years="+totalAmt);
	}
	public static void main(String args[])
	{	
	HDFC hdfc=new HDFC();
	hdfc.recurringDeposit(10000,2);
	
	}	
}
