package TL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TotalList {
public static void main(String[] args)
{
	int count=0;
	List<String> list=new ArrayList<String>();
	List<String> ul=new ArrayList<String>();
	List<String> dl=new ArrayList<String>();
	
	  list.add("A");
	  list.add("B");
	  list.add("C");
	  list.add("D");
	  list.add("A");
	  list.add("B");
	  list.add("B");
	  list.add("C");
	  list.add("E");
	  list.add("F");
	  
	  
	  Iterator<String> it=list.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  
	  System.out.println("\n Removing Dublicate values by using HashList\n");
	  
	  HashSet<String> h=new HashSet<String>();
	  Iterator<String> itr=list.iterator();
	  while(itr.hasNext())
	  {
          h.add(itr.next());
          
	  }
	  	  
	System.out.println("Afetr Deleting Duplicate values : ");
	for(String s1:h)
	{
		System.out.println(s1);
	}
	
	
	for(String st:list)
	{
		for(String str:list)
		{
			if(st==str)
			{
				count++;
			}
		    			
		}
		if(count==1)
		{
	    	ul.add(st);
	    }
	    else
	    {
	    	dl.add(st);
	    }
		count=0;
	}
	System.out.println("\nThe Unique values are : ");
	for(String s1:ul)
	{
		System.out.println(s1);
	}
	System.out.println("\nThe dupliate values are : \n");
	for(String s:dl)
	{
	System.out.println(s);
	}
}
}
