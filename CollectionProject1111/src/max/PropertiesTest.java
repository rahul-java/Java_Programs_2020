package max;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class PropertiesTest {
	
	
	public static void getProp() throws IOException
	{
		Properties p = new Properties();
		//InputStream i = p.getClass().getResourceAsStream("/max/p.properties");
		
		//InputStream in = p.getClass().getResourceAsStream("E:\\Java Programs\\CollectionProject1111\\src\\p.properties");
		  // p.load(i);
		
		p.put("k1", "Abc");
		p.put("k2","Bcd");
		p.put("k3", "Cde");
		get(p);
	}
	
	private static void get(Properties p)
	{
		Set<Entry<Object, Object>> s = p.entrySet();
		for(Entry<Object, Object> t:s)
		{
			System.setProperty((String)t.getKey(), (String)t.getValue());
		}
	}
	
	
	
	
  public Map<String,String> getData()
  {
	  TreeMap<String,String> m=new  TreeMap<String, String>();
	 m.put("k1", "22202");
	 m.put("k2", "2222");
	 m.put("k3", "8888");
	 m.put("k5", "2222");
	 m.put("k4", "11111");
       return  m.subMap("k2", "k5");
	 
	//return m;
  }
}
