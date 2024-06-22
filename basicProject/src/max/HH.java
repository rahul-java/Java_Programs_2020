package max;

public class HH implements Cloneable{
	static HH b =null;
	 HH()
	{
		
	}
	
	public HH getClone() throws CloneNotSupportedException
	{
		return (HH) super.clone();
	}
	
	
	public static HH getOBJ()
	{
		if(b==null)
		{
	     b = new HH();
	     System.out.println("obj created "+b.hashCode());
		}
		else
		{
		System.out.println("Already created "+b.hashCode());	
		}
		
		return b;
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
