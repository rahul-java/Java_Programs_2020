import max.java.factorial.Factorial;
import max.java.factorial.FactorialIMPL;

//import max.java.factorial.Factorial;
//import max.java.factorial.FactorialIMPL;

public class Jar_Test 
{
public static void main(String arg[])
{
	Factorial ob=new FactorialIMPL();
	String s=ob.getFactorial(6);
	System.out.println(s);
}
}
