package max;

public class Child extends AA{
public void m1()
{
	super.m1(20);
	System.out.println("voidddd");
}
public void m2(String s)
{
	System.out.println("ssss");
}
public void m3(int n)
{
	System.out.println("nnnnnnnn");
}
public static void main(String[] args) {
	Child ch=new Child();
	
	ch.m1();
	
}
}
