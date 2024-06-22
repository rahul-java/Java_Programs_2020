package max.java.factorial;

public class FactorialIMPL implements Factorial{


	public String getFactorial(int no) {
		int f=1;
		if(no==1 || no==0)
		{
			return "Result is = "+f;
		}
		else
		{
			for(int i=no; i>1;i--)
			{
				f=f*i;
			}
			return "Result is = "+f;
		}
		
		}
	public static void main(String[] args) 
	{
		FactorialIMPL fact=new FactorialIMPL();
		String s=fact.getFactorial(10);
		System.out.println(s);
		
	}
      
}
