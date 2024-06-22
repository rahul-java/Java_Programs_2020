package Map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MulMapTestClientCheckKey {

	public static void main(String[] args) 
	{
		Map<String,Map<String,String>> m=MulMapTest.get();
		
		Set<Entry<String,Map<String,String>>> s=m.entrySet();
		for(Entry<String,Map<String,String>> e:s)
		{
			String k=e.getKey();
			if(k.equalsIgnoreCase("mp"))
			{
				System.out.println("The State "+k);
				Map<String,String> s1=e.getValue();
				Set<Entry<String,String>> e1=s1.entrySet();
				for(Entry<String,String> e2:e1)
				{
					String k1=e2.getKey();
					String v=e2.getValue();
					System.out.println("Key : "+k1+"\tValue : "+v);
				}
				
			}
		}

	}

}
