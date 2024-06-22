import java.util.Scanner;

public class DiffBtwnFactOfTwoNos {

	public static int getFactorial(int n)
	{
		int f=1;
		int fact;
		if(n==0 || n==1)
		{
			return f;
		}
		else
		{
			fact=n*getFactorial(n-1);
		}
		return fact;
	}
	public static void main(String args[])
	{
		int a,b,f1,f2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the First number  :");
		a = sc.nextInt();
		System.out.println("Please Enter the Secontd number  :");
		b=sc.nextInt();
		
		DiffBtwnFactOfTwoNos df=new DiffBtwnFactOfTwoNos();
		f1=df.getFactorial(a);
		f2=df.getFactorial(b);
		if(f1>f2)
		{
			res=f1-f2;
			System.out.println("The Difference of the factorial of "+a+" and"+b+" is ="+res);
		}
		else
		{
			res=f2-f1;
			System.out.println("The Difference of the factorial of "+a+" and"+b+" is ="+res);
		}
	}
}
