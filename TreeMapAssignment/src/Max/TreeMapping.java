package Max;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapping {

	public static Map<Manager,Set<Emp>> getDetails()
	{
		Map<Manager,Set<Emp>> m=new TreeMap<Manager,Set<Emp>>(new Manager());
		
		Manager mgr1=new Manager();
		mgr1.setId(101);
		mgr1.setName("Rahul");
		
		Set<Emp> s1=new HashSet<Emp>();
		Emp e1=new Emp();
		e1.setEid(111);
		e1.setEname("Ravi");
		e1.setAdd("Delhi");
		s1.add(e1);
		
		Emp e2=new Emp();
		e2.setEid(112);
		e2.setEname("Ravindra");
		e2.setAdd("Malviya Nagar ");
		s1.add(e2);
		
		Emp e3=new Emp();
		e3.setEid(113);
		e3.setEname("Rakesh");
		e3.setAdd("Delhi NCR");
		s1.add(e3);
		
		Emp e4=new Emp();
		e4.setEid(111);
		e4.setEname("Ravi");
		e4.setAdd("Delhi");
		s1.add(e4);
		
		m.put(mgr1, s1);
		
		Manager mgr2=new Manager();
		mgr2.setId(102);
		mgr2.setName("Anil");
		
		Set<Emp> s2=new HashSet<Emp>();
		Emp e11=new Emp();
		e11.setEid(211);
		e11.setEname("Ramesh");
		e11.setAdd("Noida");
		s2.add(e11);
		
		Emp e22=new Emp();
		e22.setEid(212);
		e22.setEname("Rakesh");
		e22.setAdd("Malviya Nagar ");
		s2.add(e22);
		
		Emp e33=new Emp();
		e33.setEid(213);
		e33.setEname("Ram");
		e33.setAdd("Delhi NCR");
		s2.add(e33);
		
		m.put(mgr2, s2);
		
		Manager mgr3=new Manager();
		mgr3.setId(103);
		mgr3.setName("Rahul Pandey");
		
		Set<Emp> s3=new HashSet<Emp>();
		Emp e111=new Emp();
		e111.setEid(311);
		e111.setEname("Ravi Tiwari");
		e111.setAdd("Noida NCR");
		s3.add(e111);
		
		Emp e222=new Emp();
		e222.setEid(312);
		e222.setEname("Ravindra Singh");
		e222.setAdd("Malviya Nagar ");
		s3.add(e222);
		
		Emp e333=new Emp();
		e333.setEid(313);
		e333.setEname("Rakesh Sharma");
		e333.setAdd("Delhi NCR");
		s3.add(e333);
		
		m.put(mgr3, s3);
		
		Manager mgr4=new Manager();
		mgr4.setId(101);
		mgr4.setName("Rahul");
		
		Set<Emp> s4=new HashSet<Emp>();
		Emp e1111=new Emp();
		e1111.setEid(111);
		e1111.setEname("Ravi");
		e1111.setAdd("Delhi");
		s4.add(e1111);
		
		Emp e2222=new Emp();
		e2222.setEid(112);
		e2222.setEname("Ravindra");
		e2222.setAdd("Malviya Nagar ");
		s4.add(e2222);
		
		Emp e3333=new Emp();
		e3333.setEid(113);
		e3333.setEname("Rakesh");
		e3333.setAdd("Delhi NCR");
		s4.add(e3333);
		
		m.put(mgr4, s4);
		
		return m;
	}
}
