/* Write a program, where RBI will be an interface, have a method recurringDeposit

   which can accept the amount and duration. This must be implemented in class HDFC. 
    i) When a customer deposit amount in HDFC, they must be able to know 
       how much amount they will get after depositing for n period of time. 
   ii) Interest rate is defined in RBI interface */
package interfaceAssignment;
public interface  RBI 
{
	int interest=8;
	public void recurringDeposit(double amount,int duration);
}

