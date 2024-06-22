package max;

public class StringTest {
	
	public String myReverse(String s)
	{       String s2 = "";
	       for(int i=s.length()-1; i>=0;i--)
	       {
	    	     char r = s.charAt(i);
	    	     s2=s2+r;
	       }
		return s2;
	}
	
	
	
	
	
	
	public String checkSPL(String str)
	{   int l=0; int d=0; int spl=0;
		char[] ch = str.toCharArray();
		for(char p:ch)
		{
			if(Character.isLetter(p) )
			{
				l++;
			}
			else if(Character.isDigit(p))
			{
				d++;
			}
			else
			{
				spl++;
			}
		}
		return "lettr "+l+" dgt "+d+ " spl "+spl;
	}

}
