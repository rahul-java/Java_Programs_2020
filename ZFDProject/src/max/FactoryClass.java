package max;

public class FactoryClass {
	private FactoryClass()
	{
		
	}
	 static Calculator ob;
	public static Calculator getFactory(String s)
	{
		if(s.equals("+"))
		{
			 ob = new Addition();
		}
		else if(s.equals("*"))
		{
			 ob = new Multiply();
		}
		else if(s.equals("/"))
		{
			 ob = new Divide();
		}
		return ob;
	}
	
}
