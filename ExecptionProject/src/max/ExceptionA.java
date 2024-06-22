package max;

import org.omg.CORBA.SystemException;

public class ExceptionA {
	public void add(int a, int b)
	{			
		int c=a+b;
		System.out.println("add"+c);
	}
	public void div (int a,int b){
	{ 
		try
		{
		int c=a/b;
		System.out.println("div"+c);
		}
	catch(ArithmeticException e){
		e.printStackTrace();
		System.exit(0);
	}
		catch (Exception e){
			e.printStackTrace();
		}
	finally
	{
	System.out.println("finally");
	}
	}	
}
	public static void main(String[] args) {
		ExceptionA ob=new ExceptionA();
		ob.div(4, 2);
		ob.add(4, 9);
}
}