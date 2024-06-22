package com.test;

public class Test {

	public static void main(String[] args) 
	{
		int x=10;
		int f=1;
		 for(int i=x;i>1;i--)
		{
			f = f*i;
		}
		System.out.println("The factorial of No is :"+f);
		
		System.out.println(" There is the febonacci series : ");
		f=1;
		System.out.print(f+" ,");
		int i=0;int sum=0;
		for(;sum<=50;)
		{
			sum=sum+f;
			System.out.print(sum+" ,");
			i=f;f=sum;
			
		}
		}
		}

	


