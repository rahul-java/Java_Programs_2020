package max;

import java.util.List;

public class AB {
	public static void main(String[] args) {
		List<Emp> ob = ListTest.getData();
		
		for(int i=0;i<ob.size();i++)
		{
			Emp t = ob.get(i);
			// Emp e = (Emp)t;
			 System.out.println(t.eid);
		}
	}

}
