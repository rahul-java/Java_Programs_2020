package max;

public class A {
	
	public void generateMob(String mob)
	{
		    if(mob.length()==10)
		    {    int count =0;
		    	String m=mob.substring(0, 7);
		    	  for(int i=0; i<=999;i++)
		    	  {
		    		  String t=m;
		    		  if(t.length()==7)
		    		  {
		    			  t=t+"00"+i;
		    		  }
		    		  if(t.length()==11)
		    		  {
		    			  t=t+"0"+i;
		    		  }
		    		  
		    		  if(t.length()==10)
		    		  {
		    		  System.out.println(t);
		    		  count ++;
		    		  }
		    	  }
		    	System.out.println("total " +count);
		    	
		    	
		    }
		    
		
		
	}
	public static void main(String[] args) {
		A ob = new A();
		ob.generateMob("7503382136");
	}
	
	

}
