package set;

import java.util.HashSet;

import java.util.Iterator;


public class Cl {
public static void main(String[] args) {
	  HashSet<Emp> s = SetTest.getData();
	   Iterator<Emp> it = s.iterator();
	   while(it.hasNext())
	   {
		   Emp t = it.next();
		   System.out.println(t.getEid()+" "+t.getName());
	   }
}
}
