package max;

public class AA{
	int n;
public void m1(int n1)
{
	this.n=n1;
	System.out.println("ma..........."+n);
}
public void m2()
{
	this.m1(10);
	System.out.println("m2222");
}
public static void main(String[] args) {
	AA ob=new AA();
	ob.m2();
}
}
