package MapAssignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AssignnmentClass {

	public static Map<Integer,Map<String,Set<String>>> getData()
	{
		Map<Integer,Map<String,Set<String>>> m=new HashMap<Integer,Map<String,Set<String>>>();
		
		Map<String,Set<String>> am=new HashMap<String,Set<String>>();
		
		Set<String> s1=new HashSet<String>();
		s1.add("Ram");
		s1.add("Ramesh");
		s1.add("Anish");
		am.put("k1",s1);
		
		Set<String> s2=new HashSet<String>();
		s2.add("Rahul");
		s2.add("anil");
		s2.add("Animesh");
		am.put("k2",s2);
		
		Set<String> s3=new HashSet<String>();
		s3.add("Ravi");
		s3.add("Naresh");
		s3.add("Ansh");
		am.put("k3",s3);
		
Map<String,Set<String>> bm=new HashMap<String,Set<String>>();
		
		Set<String> s11=new HashSet<String>();
		s11.add("Abc");
		s11.add("Def");
		s11.add("Ghi");
		bm.put("k1",s11);
		
		Set<String> s22=new HashSet<String>();
		s22.add("Jkl");
		s22.add("Mno");
		s22.add("Pqr");
		bm.put("k2",s22);
		
		Set<String> s33=new HashSet<String>();
		s33.add("Stv");
		s33.add("Uvw");
		s33.add("Xyz");
		bm.put("k3",s33);
		
		
		m.put(101,am);
		m.put(201,bm);
		
		return m;
	}
}
