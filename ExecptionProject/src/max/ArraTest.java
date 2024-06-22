package max;

public class ArraTest extends Exception{
	ArraTest(){}
	ArraTest(String ss)
	{
		super(ss);
	}
	
	public String getValue(int n) throws ArraTest
	{
		
	int d[]=	{9,4,3,2,5};
	if(n<d.length)  
	{
		return "Value is "+d[n];
	}
	else
	{
		throw new ArraTest("lessthan "+d.length);
	}
	
	
	}
	
	public static void main(String[] args) {
		ArraTest arraTest=new ArraTest();
		try {
			String rest = arraTest.getValue(5);
			System.out.println(rest);
		} catch (ArraTest e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
