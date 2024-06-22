package Max;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import java.util.List;


public class RemoveDuplicate {

	public static void main(String[] args)
	{
		List<Emp> l=SortEmpId.getEmpList();
		
		HashSet<Emp> h=new HashSet<Emp>();
			for(Emp e:l) {
				h.add(e);
			}
			
		List<Emp> l1=new ArrayList<Emp>(h);	
			Collections.sort(l1, new eidComparator());
			
			for(Emp e:l1)
			{
				System.out.println(e.eid +"   "+e.name);
			}
			
		
	}
}
