package abstraction.assignment;
class FulltimeEmployee extends Employee
{
	public void calculateSalary(int payment,int hour)
	{
		int amount=payment*8;
		System.out.println("FullTime Employee Salary="+amount);
	}
	public static void main(String args[]) 
	{
		FulltimeEmployee fullemp=new FulltimeEmployee();
		fullemp.calculateSalary(1000, 2);
		Contractor con=new Contractor();
		con.calculateSalary(2000, 8);
	}
}
