package set;

import java.util.HashSet;

public class SetTest {
	public static HashSet<Emp> getData()
	{
		HashSet<Emp> s = new HashSet<Emp>();
		Emp e = new Emp();
		e.setEid(10);
		e.setName("raja");
		s.add(e);
		
		Emp e1 = new Emp();
		e1.setEid(10);
		e1.setName("raaja");
		s.add(e1);
		
		Emp e2 = new Emp();
		e2.setEid(101);
		e2.setName("araja");
		s.add(e2);
		
		return s;
	}

}
