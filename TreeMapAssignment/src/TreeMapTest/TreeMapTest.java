package TreeMapTest;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest 
{
	public static void main(String[] args) {
		
		Map<Integer,String> m=new TreeMap<Integer,String>();
		m.put(10, "Abc");
		m.put(40, "Efg");
		m.put(30, "Cde");
		m.put(50, "Fgh");
		m.put(20, "Bcd");
		m.put(10, "Def");
		
		Set<Entry<Integer,String>> s=m.entrySet();
		
		for(Entry<Integer,String> e:s)
		{
			System.out.println(e.getKey()+"   "+e.getValue());
		}
	}

}
