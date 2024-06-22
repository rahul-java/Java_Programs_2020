package set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
public static void main(String[] args) {
	
	 Set<Emp> s=new HashSet<Emp>();
	
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
