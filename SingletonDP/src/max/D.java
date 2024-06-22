package max;

public class D {
	public void show(int a)
	{
		if(a<=10)
		{
		System.out.println(a);
		show(a+1);
	}
	}
	public static void main(String[] args) {
		D b=new D();
		b.show(1);
	}

}
