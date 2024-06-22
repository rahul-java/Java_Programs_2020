package MapAssignment.Dec27;

import java.util.HashMap;
import java.util.Map;

public class MapWithEmp 
{
	public static Map<Emp,String> getData()
	{
	Map<Emp,String> m=new HashMap<Emp,String>();
	Emp e1=new Emp();
	e1.setEid(101);
	e1.setEname("Mahesh");
	m.put(e1, "HR Department");
	
	Emp e2=new Emp();
	e2.setEid(101);
	e2.setEname("Mahesh");
	m.put(e2, "HR Department");
	
	Emp e3=new Emp();
	e3.setEid(102);
	e3.setEname("Rahul");
	m.put(e3, "IT Department");
	
	Emp e4=new Emp();
	e4.setEid(103);
	e4.setEname("Ravi");
	m.put(e4, "MIS Department");
	
	return m;
	}
	

}
