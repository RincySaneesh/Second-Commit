package abstraction;

public class Child extends Parent
{
	public void childDisplay()
	{
	System.out.println("Have a niceday");
	}
 public void display()
 {
	 System.out.println("Hello");
 }
  public int print(int a) 
  {
	   a+=10;
	   return a;
  }

	public static void main(String[] args)
	{
		Child ch=new Child();
		ch.parentDisplay();
		ch.childDisplay();
		ch.display();
		int x=ch.print(12);
		System.out.println("Returned value="+x);
	}

}
