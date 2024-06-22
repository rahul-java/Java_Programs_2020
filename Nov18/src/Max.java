import java.util.Scanner;
public class Max {

	public static void maxMin(int a,int b, int c)
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("The Maximum number is : "+a);
				if(b<c)
				System.out.println("The Minimum number is : "+b);
				else
				System.out.println("The Minimum number is : "+c);
			}	
			else
			{
				System.out.println("The Maximum number is : "+c);
				if(a<b)
					System.out.println("The Minimum number is : "+a);
				else
					System.out.println("The Minimum number is : "+b);
			}
		}
		else
		{
		   if(b>c)
		   {
			   System.out.println("The Maximum number is : "+b);
			   if(a<c)
					System.out.println("The Minimum number is : "+a);
				else
					System.out.println("The Minimum number is : "+c);
		   }
		   else
		   {
			   System.out.println("The Maximum number is : "+c);
			   if(a<b)
					System.out.println("The Minimum number is : "+a);
				else
					System.out.println("The Minimum number is : "+b);
		   }
		   
		}
	}
	public static void main(String args[])
	{
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the First number  :");
		n1 = sc.nextInt();
		System.out.println("Please Enter the Second number :");
		n2=sc.nextInt();
		System.out.println("Please Enter the Third number  :");
		n3= sc.nextInt();
		Max m=new Max();
		m.maxMin(n1,n2,n3);

	}
}

		
		
