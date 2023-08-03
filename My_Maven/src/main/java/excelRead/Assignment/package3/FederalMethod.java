package excelRead.Assignment.package3;

import java.util.Scanner;

import excelRead.Assignment.package1.RBIMethods;

public class FederalMethod implements RBIMethods
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
	public double getInterestRate(double p,double r,double n )
	{
		double CI=p*(1+r/100)*n;
		return CI;
		
	}
	public void checkPancardNeeded(double amt)
	{
		if(amt>50000)
		{
			System.out.println("Pancard Needed ");
		}
		else
		{
			System.out.println("Pancard Not Needed ");
		}	
	}
	
	
	
}
