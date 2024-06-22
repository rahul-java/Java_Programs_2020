package max;

import java.util.List;

public class Anurag {
public static void main(String[] args) {
	  List<Object> d = ListTest.getDetails();


	    for(Object p:d)
	    {
	    	if(p instanceof User)
	    	{
	    		User u = (User)p;
	    		System.out.println(u.getPhon()+ " "+u.getAdd()+ " "+u.getName());
	    	}
	    	else if(p instanceof String)
	    	{
	    		String r = (String)p;
	    		System.out.println(r);
	    	}
	    	
	    	
	    	
	    	 // User t =(User) p;
	    	 // System.out.println(p.getClass());
	    	  //System.out.println(t.getName());
	    }
	  
	  
}
}
