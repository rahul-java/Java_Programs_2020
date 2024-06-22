package Max;


import java.util.Collections;
import java.util.List;

public class SortEid {

	public static void main(String[] args) {
		
		List<Emp> list=SortEmpId.getEmpList();
		
		Collections.sort(list, new eidComparator());
		
		for(Emp e:list)
		{
			
			System.out.println(e.eid +"  "+ e.name);
		}
		
		/*
		//Another way for sorting without creating comparator method or class.
		Collections.sort(list,(e1,e2)->
		{
			return e1.eid>e2.eid?1:e1.eid<e2.eid?-1:0;
		});
		*/
		
	}

}
