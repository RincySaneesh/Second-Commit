package interfaceExample.fromUtube;

public class Income implements Bank,Tax
{  
	double income;
	public void calculateIncome(double a)
	{
		double savings=10000;
		income=a+savings;
		System.out.println("ur balance is="+income);
	}
	public void calculateTax()
	{
		double tax=1000;
		double finalBalance=income-tax;
		System.out.println("ur FinalBalance is="+finalBalance);
	}
	public static void main(String args[])
	{
	Income in=new Income();
	in.calculateIncome(2000);
	in.calculateTax();
	}
}
