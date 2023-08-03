package excelRead.Assignment.package2;

import excelRead.Assignment.package1.RBIMethods;
import java.util.*;
public class SBIMethod implements RBIMethods
{
	Scanner sc=new Scanner(System.in);
	public void checkWithdrawalAmt()
	{
		System.out.println("Enter Your Withdrawal Amt:");
		double d=sc.nextDouble();
		if(d>50000)
		{
			System.out.println("Your Amount greaterthan 50000 ");
		}
		else
		{
			System.out.println("Your Amount lessthan 50000 ");
		}
	
	}
	public double getInterestRate(double p,double r,double n)
	{
		double SI=p*r*n;
		return SI;
	}
}
