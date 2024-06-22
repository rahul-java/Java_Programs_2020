package max;

public class D {
  public int m(int a)
  {
	  System.out.println("int");
	  return a;
  }
  public void m(int a,int b,int c)
  {
	  System.out.println("int int");
	  System.out.println(8L);
  }
  public void m(long a)
  {
	  System.out.println("long");
  }
  public void m(int a,long b)
  {
	  System.out.println("int long");
  }
  public static void main(String[] args) {
	  D ob = new D();
	  ob.m(8,9,7);
}
}
