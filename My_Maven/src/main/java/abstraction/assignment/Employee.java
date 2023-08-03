/*
  i) first create the superclass Employee and define a method called calculateSalary() as an abstract method.
  ii) The Contractor class inherits all properties from its parent Employee
      but have to provide its own implementation of calculateSalary() method 
      and multiply the value of payment per hour with given working hours.
 iii) The FullTimeEmployee class also has its own implementation of calculateSalary()method.
      In this case we just multiply by constant 8 hours.
      */

package abstraction.assignment;
public abstract class Employee
{
public abstract void calculateSalary(int a,int b);
}
	