package max;


public class SPLCount implements SPL{

	
	public String splcount(String str) {
		    int l=0; int d=0; int s=0;
		  for( Character c: str.toCharArray())
				  {
			  
			      if(Character.isLetter(c))
			      {
			    	    l++;
			      }
			      else if(Character.isDigit(c))
			      {
			    	  d++;
			      }
			      else
			      {
			    	  s++;
			      }
			  
				  }
		
		
		
		return "SPL "+s+ " Lttr "+l+ " digit  "+d;
	}

}
