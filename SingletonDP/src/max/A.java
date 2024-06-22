package max;

public class A {
	static A ob=null;
	int n;
	String s;
	
	public void A(String s1, int n1)
	{
		n=n1;
		s=s1;
	}
	private A()
	{
		
	}
	
	public static A getOB()
	{  if(ob==null)
	{
		 ob=new A();
		  System.out.println("obj created "+ob.hashCode());
	}
	else
	{
		System.out.println("already created "+ob.hashCode());
	}
		return ob;
		
	}
	
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	
	
	
}
