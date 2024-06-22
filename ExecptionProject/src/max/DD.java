package max;

public class DD {
	
	  public static void generateMobileNo(String mob)
	  {    int count=0;
		     if(mob.length()==10)
		     {
		    	      String m= mob.substring(0, 9);
		    	      
		    	         if(m.length()==9)
		    	         {
		    	        	 for(int i=0; i<10;i++)
		    	        	 {
		    	        		 System.out.println(m+i);
		    	        		 count++;
		    	        	 }
		    	        	 
		    	        	 System.out.println("total no "+count);
		    	         }
		     }
	  }
	  public static void main(String[] args) {
		DD.generateMobileNo("7503382136");
	}

}
