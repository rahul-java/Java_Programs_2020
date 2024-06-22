package max;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	
   public static void main(String[] args) {
	  Vector<Object> v = new Vector<Object>();
	  v.add("A");
	  v.add(7);
	  v.add(8.8);
	  v.add("A");
	  v.add("AB");
	 // v.add(new Emp(1,"pp"));
	  
	    Iterator<Object> it = v.iterator();
	  
	  while(it.hasNext())
	  {
		    Object y = it.next();
		    System.out.println(y);
	  }
	  
	  
	    Enumeration<Object> e = v.elements();
	  while(e.hasMoreElements())
	  {
		 Object r = e.nextElement();
	  System.out.println(r);
	  
	 /* for(Object c:v)
	  {
		//  Emp e = (Emp)c;
		  
		  if(c instanceof String )
		  System.out.println(c);
		  else if(c instanceof Integer )
			  System.out.println(c);
		  else if(c instanceof Double)
			  System.out.println(c);
		  else if(c instanceof Emp)
		  {
			Emp p= (Emp) c;
			System.out.println(p.eid);
		  }*/
	  }
	  
	  
	  
}



}
