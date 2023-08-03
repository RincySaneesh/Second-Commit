package encapsulation;

public class Customer
{
	int a;
	int b;
	
	public static void main(String[] args)
	{
		String cusname;
		float curblnce;
		Customer cu=new Customer();
		cu.a=10;
		cu.b=2;
	Bank ban=new Bank();
	ban.setName("ABC");
	cusname=ban.getName();
	System.out.println("Name:"+cusname);
	ban.setBalance(20000);
	ban.display();
	curblnce=ban.getBalance();
	System.out.println("Balance:"+curblnce);
	
	}

}
