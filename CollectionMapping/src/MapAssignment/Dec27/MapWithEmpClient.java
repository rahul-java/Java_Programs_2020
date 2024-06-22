package MapAssignment.Dec27;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapWithEmpClient {

	public static void main(String[] args) 
	{
		Map<Emp,String> m=MapWithEmp.getData();
		Set<Entry<Emp,String>> s=m.entrySet();
		for(Entry<Emp,String> e:s)
		{
			Emp emp=e.getKey();
			int id=emp.getEid();
			String name=emp.getEname();
			String v=e.getValue();
			System.out.println("Emp Id :"+id+"\tEmp Name :"+name+"   \tEmp Department :"+v);
		}

	}

}
