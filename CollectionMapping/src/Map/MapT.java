package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapT {
	public static Map<String, String>  getData() {
		//Map<String, String> m = new HashMap<String, String>();
		Map<String, String> m = new ConcurrentHashMap<String, String>();
		m.put("k1", "100");
		m.put("k2", "1100");
		m.put("k3", "10");
		m.put("k4", "1010");
		m.put("k5", "1020");
		System.out.println("before "+m);
		
	/*Set<String> ss = m.keySet();
		
		for(String p:ss)
		{
			if(p.equals("k3"))
			{
				m.put("k111", "99999");
			}
		}*/
		
		Set<Entry<String, String>> s = m.entrySet();
		
		Iterator<Entry<String, String>> it = s.iterator();
		
		while(it.hasNext())
		{
		Entry<String, String> b = it.next();
	   String ob = b.getKey();
	     if(ob.equalsIgnoreCase("k3"))
	     {
	    	m.put("pnr", GeneratePNR.generatePNR()); 
	     }

	  
	   System.out.println(b.getValue());
		}
		
		System.out.println("after "+m);
		
		return m;
		
	}

}
