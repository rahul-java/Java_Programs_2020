package Max;

import java.util.ArrayList;
import java.util.List;

public class SortEmpId {

	public static List<Emp> getEmpList() {
		List<Emp> list=new ArrayList<Emp>();
        
		Emp e=new Emp();
		e.setEid(00);
		e.setName("Ram");
		list.add(e);
		
		Emp e1=new Emp();
		e1.setEid(55);
		e1.setName("BalRam");
		list.add(e1);
		
		Emp e2=new Emp();
		e2.setEid(55);
		e2.setName("BalRam");
		list.add(e2);
		
		Emp e3=new Emp();
		e3.setEid(99);
		e3.setName("Pranam");
		
		list.add(e3);
		
		
		return list;
	}
	

}
