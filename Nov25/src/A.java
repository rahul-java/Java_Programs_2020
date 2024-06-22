import java.util.Scanner;

public class A {

	public static void main(String args[])
	{
		Ctax ct=new Ctax();
		Btax bt=new Btax();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Monthly Salary You want to calculate the Income Tax (in Congress Govt.):");
		int cMonthSal=sc.nextInt();
		System.out.println("Please Enter Your Monthly Salary You want to calculate the Income Tax (in BJP Govt.):");
		int bMonthSal=sc.nextInt();
		if(cMonthSal>0)
		{
		float ctax=ct.TaxCalculator(cMonthSal*12);
		System.out.println("The total tax after Calculation (Cong. Govt.)is "+ctax);
		}
		else
			{
			System.out.println("Please Enter the valid Salary Details for Congress Govt.. The Salary Must be +ve.");
			}
		if(bMonthSal>0)
		{
			float btax=bt.TaxCalculator(bMonthSal*12);
			System.out.println("The total tax after Calculation (BJP Govt.) is :"+btax);
		}
		else
		{
		  System.out.println("Please Enter the valid Salary Details for BJP Govt.. The Salary Must be +ve.");
		}
		
	}
}
