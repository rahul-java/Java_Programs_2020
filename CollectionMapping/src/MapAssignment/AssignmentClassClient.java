package MapAssignment;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AssignmentClassClient {

	public static void main(String[] args)
	{
		Map<Integer,Map<String,Set<String>>> map=AssignnmentClass.getData();

		Set<Entry<Integer,Map<String,Set<String>>>> s=map.entrySet();
		for(Entry<Integer,Map<String,Set<String>>> e:s)
		{
			int n=e.getKey();
			System.out.println("Integer Code\t:"+n+"\n");
			Map<String,Set<String>> m=e.getValue();
			Set<Entry<String,Set<String>>> s1=m.entrySet();
			for(Entry<String,Set<String>> e1:s1)
			{
				String s11=e1.getKey();
				//System.out.println("\t"+s11);
				Set<String> s2=e1.getValue();
				Iterator<String> itr=s2.iterator();
				while(itr.hasNext())
				{
					String s3=itr.next();
					System.out.println(s11+"\t"+s3);
				}
				System.out.println("\n");
			}
		}
	}

}
