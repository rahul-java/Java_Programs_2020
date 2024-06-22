package MapAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapAssignment {

	public static void main(String[] args)
	{
	HashMap<String,Emp> hm=new HashMap<String,Emp>();
	
	Emp e1=new Emp();
	e1.setEid(111);
	e1.setName("Ramesh");
	hm.put("k1", e1);
	
	Emp e2=new Emp();
	e2.setEid(222);
	e2.setName("Mahesh");
	hm.put("k2", e2);
	
	Emp e3=new Emp();
	e3.setEid(333);
	e3.setName("Rakesh");
	hm.put("k3", e3);
	
	Emp e4=new Emp();
	e4.setEid(444);
	e4.setName("Ram-Maresh");
	hm.put("k4", e4);
	
	Emp e5=new Emp();
	e5.setEid(555);
	e5.setName("Kamlesh");
	hm.put("k5", e5);
	
	Set<Entry<String,Emp>> s=hm.entrySet();
	
	for(Entry<String,Emp> p:s)
	{
		String k=p.getKey();
		Emp e=p.getValue();
		int id=e.getEid();
		String name=e.getName();
		
		System.out.println(" Key is :"+k+"   "+"Emp Id : "+id+" Emp Name :"+name);
		
	}
	
	System.out.println("\n*********** By Using Iterator **************\n");
	
	Iterator<Entry<String,Emp>> it=s.iterator();
	
	while(it.hasNext())
	{
		Entry<String,Emp> entry=it.next();
		String k=entry.getKey();
		Emp e=entry.getValue();
		int id=e.getEid();
		String name=e.getName();
		System.out.println(" Key is :"+k+"   "+"Emp Id : "+id+" Emp Name :"+name);
	}
	
}
}
