package max;

public class A {
public void add(int a, int b)
{
	    int c=a+b;
	    System.out.println("add "+c);
}
public void div(int a, int b)
{       try
        {
	    int c=a/b;
	    System.out.println("Div "+c);
         }
catch (ArithmeticException e) 
{
	e.printStackTrace();
	  System.exit(0);
}
catch (Exception e) {
	e.printStackTrace();
}
finally
{
	System.out.println("finally");
}

}

public static void main(String[] args) {
	     
	    A ob=new A();
	    ob.div(4, 1);
	    ob.add(4, 9);
}
}
