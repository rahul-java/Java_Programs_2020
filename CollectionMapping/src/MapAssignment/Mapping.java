package MapAssignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Mapping {

	public static void main(String[] args)
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("k1", "100");
		hm.put("k2", "200");
		hm.put("k3", "300");
		hm.put("k4", "400");
		hm.put("k4", "1500");
		
		Set<Entry<String,String>> s=hm.entrySet();
		for(Entry<String,String> e:s)
		{
			String k=e.getKey();
			String v=e.getValue();
			System.out.println("Key :"+k+"   value"+v);
		}
	}
}
