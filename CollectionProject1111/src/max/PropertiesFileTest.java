package max;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileTest
{
public static void getProp() throws Exception
{
	 Properties p=new Properties();
	InputStream i = new FileInputStream("src/Max/p.properties");   
    p.load(i);
	get(p);
 }
private static void get(Properties p)
{
	Set<Entry<Object,Object>> s=p.entrySet();
	for(Entry<Object,Object> e:s)
	{
		System.setProperty((String)e.getKey(), (String)e.getValue());
	}
}
}
