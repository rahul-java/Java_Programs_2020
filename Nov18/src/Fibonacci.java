import java.util.Scanner;
public class Fibonacci {

	static int n1=0,n2=1,n3=1;
	static int n;
	public static void fiboWithoutLoop(int no)
	{
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if(n3<=n)
			{
				System.out.println(" , "+n3);
				fiboWithoutLoop(n3);
			}
		
		
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the max limit upto you want to print the Fibonacci Series :");
		n = sc.nextInt();
		System.out.println(n1+" , "+n2);
		fiboWithoutLoop(n);
	}
}
