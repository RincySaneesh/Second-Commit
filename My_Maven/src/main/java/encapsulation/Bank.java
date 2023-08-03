package encapsulation;

public class Bank 
{
  private String name;
  private float balance;
 float mainbalance;
 
public String getName() 
{
	return name;

}
public void setName(String name) 
{
	this.name = name;
	
}
public float getBalance() 
{
	return balance;
}
public void setBalance(float balance)
{
	this.balance = balance;
}
 public void display()
 {
	 System.out.println("Welcome");
	 mainbalance=getBalance();
	 System.out.println("Your balance is:"+mainbalance);
 }
}
