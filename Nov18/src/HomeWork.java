import java.util.Scanner;
public class HomeWork {

	public static int[] afterSwap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		return new int[] {a, b};
		
	}
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the First number you want to swap  :");
		a = sc.nextInt();
		System.out.println("Please Enter the Secontd number you want to swap  :");
		b=sc.nextInt();
		int num[]=afterSwap(a,b);
		System.out.println("After Swapping First number is :"+num[0]+ " Second Numer is :"+num[1]);
		
		
				
		
		
		
	}
}

