package max;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CL {
public static void main(String[] args) {
	PropertiesTest b=new PropertiesTest();
	Map<String, String> m = b.getData();
	Set<Entry<String, String>> s = m.entrySet();
	for(Entry<String, String> p:s)
	{
		System.out.println(p.getKey()+"   "+p.getValue());
		
	}
}
}
