package max;

public class B {
	public void finalize()
	{
		System.out.println("finalize");
	}
	public void m()
	{
		System.out.println("mm");
	}
	public static void main(String[] args) {
	B ob=	new B();
	ob.m();
	ob=null;
	System.gc();
	
	}

}
