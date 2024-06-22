package max;
class F
{  int a=9;  //int b=11;  //4 12
	F(int a)
	{
	  this.a=a;
	}}
public class T extends F{
	int a=1; int b=3;

	T(int a,int b)
	{  super(a+2);
		a*=a;
		  a+=b;
		  --a;
		  this.a=b;
		this.b=b+a;
	}
public void m() { System.out.println(a+"   "+b);
		}
	public static void main(String[] args) {
		T ob=new T(2,5);
		ob.m();
		
	}

}
