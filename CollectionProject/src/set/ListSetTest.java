package set;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ListSetTest {
	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		  l.add("A");
		  l.add("B");
		  l.add("C");
		  l.add("C");
		  l.add("A");
		  //System.out.println(l.remove("C"));
		  System.out.println(l);
		  
		 Collections.synchronizedList(l);
		  
		  System.out.println("list "+l);
		 HashSet<String> s = new HashSet<String>(l);
		  System.out.println("set "+s);
		s.remove("A");
		 System.out.println(s);
		
		 System.out.println(l.contains("A"));
		  
		 
		 synchronized (l) {
			
			 
			 for(String c:l)
			 {
				 System.out.println(c);
			 }
		}
		 
		
	}

}
