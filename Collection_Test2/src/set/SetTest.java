package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
public static void main(String[] args) {
	// Set<String> s=new HashSet<String>();
	// Set<String> s=new LinkedHashSet<String>();
	// Set<String> s=new TreeSet<String>();
	 Set<Emp> s=new HashSet<Emp>();
	// s.add("C");
	 //s.add("B");
	 //s.add("A");
	// s.add(null);
	Emp e = new Emp(2,"kk");
	 s.add(e);
	 System.out.println(e.hashCode());
	Emp e1 = new Emp(2,"kk");
	 s.add(e1);
	 System.out.println(e1.hashCode());
	Emp e2 = new Emp(2,"kk");
	 s.add(e2);
	 System.out.println(e2.hashCode());
	
	 
	 for(Emp p:s)
	 {
		 System.out.println(p.eid+ " "+p.name);
	 }
}
}
