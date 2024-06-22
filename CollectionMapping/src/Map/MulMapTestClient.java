package Map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MulMapTestClient 
{
	public static void main(String[] args)
	{
		Map<String,Map<String,String>> m=MulMapTest.get();
		
		Set<Entry<String,Map<String,String>>> s=m.entrySet();
		for(Entry<String,Map<String,String>> e:s)
		{
			String k=e.getKey();
			System.out.println("\tState :"+k);
			Set<Entry<String,String>> s1=e.getValue().entrySet();
			for(Entry<String,String> e1:s1)
			{
				String k1=e1.getKey();
				String v=e1.getValue();
				System.out.println("State : "+k1+"   Value : "+v);
			}
		}
	}

}
