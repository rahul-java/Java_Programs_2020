package max;

import java.util.Iterator;
import java.util.List;

public class Sahib {
public static void main(String[] args) {
	ListTest ob = new ListTest();
	 List<String> list = ob.getData();
	   for(int i=0;i<list.size();i++)
	   {
		  String b = list.get(i);
		  System.out.println(b);
	   }
	   
	   System.out.println("--------------");
	   System.out.println("size "+list.size());
	   
	    Iterator<String> it = list.iterator();
	    while(it.hasNext())
	    {
	    	String b = it.next();
	    	System.out.println(b);
	    	//it.remove();
	    }
	    
	    System.out.println("after "+list.size());
	    
	    System.out.println("-----for each------");
	    
	   for(String p:list)
	   {
		   System.out.println(p);
		   
	   }
	   
	 
}
}
