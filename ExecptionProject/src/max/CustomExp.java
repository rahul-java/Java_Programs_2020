package max;

public class CustomExp extends Exception{
	CustomExp()
	{
		
	}
	CustomExp(String s)
	{
		super(s);
	}
	
	public int div(int a, int b) throws CustomExp
	{
		if(b!=0)
		{
		int c=a/b;
		return c;
		}
		else
		{
		throw	new CustomExp("0 is not alllowww");
		}
	}
	
	
	
	
	
	
	    public String mul(int a, int b) throws CustomExp
	    {
	    	      if(a!=0 && b!=0)
	    	      {
	    	    	  int c=a*b;

	    	    	  return "Mul is "+c;
	    	      }
	    	      
	    	      else
	    	      {
	    	    	  throw  new CustomExp("a and b r not 0");
	    	      }
	    }
	
	
	    
	    
	
	

}
