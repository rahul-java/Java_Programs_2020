package max;

public class FinalizeB {
	public void Finalize()
	{
		System.out.println("Finalize");
	}
public void m()
{
	System.out.println("mm");
}
public static void main(String[] args) {
	FinalizeB ob=new FinalizeB();
	ob.m();
	ob=null;
	
}
}
