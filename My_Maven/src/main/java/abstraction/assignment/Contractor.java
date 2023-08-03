package abstraction.assignment;

public class Contractor extends Employee
{
	public void calculateSalary(int payment,int hour)
	{
		int amount=payment*hour;
		System.out.println("Contractor Salary="+amount);
	}
}