package perfomnc;

public class PerformanceStringBufferStringBuilder {
       public static void main(String[] args) {
		
    	 StringBuffer sb=null;
    	long t = System.currentTimeMillis();
    	   for(int i=0; i<1000; i++)
    	   {    sb=new StringBuffer();
    		   sb.append("A");
    		   sb.append("A");
    		   sb.append("A");
    		   sb.append("A");
    	   }
    	   long t1 = System.currentTimeMillis();
    	   System.out.println("sbuffer "+(t1-t));
    	   
    	   StringBuilder sb1=null;
       	long t2 = System.currentTimeMillis();
       	   for(int i=0; i<1000; i++)
       	   {    sb1=new StringBuilder();
       		   sb1.append("A");
       		   sb1.append("A");
       		   sb1.append("A");
       		   sb1.append("A");
       	   }
       	   long t3 = System.currentTimeMillis();
       	   System.out.println("sbuilder "+(t3-t2));
	}
}
