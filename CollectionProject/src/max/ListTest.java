package max;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static List<Object> getDetails()
	{
		List<Object> list=new ArrayList<Object>();
		User u = new User ();
		u.setName("raja");
		u.setAdd("noida");
		u.setPhon("88888");
		list.add(u);
		
		list.add("JaiRam");
		
		User u1 = new User ();
		u1.setName("ram");
		u1.setAdd("noida");
		u1.setPhon("88888");
		list.add(u1);
		//String s="raja,9999,noida";
		return list;
	}
	
	
	
	
	
	
	
	public List<String> getData()
	{
	   List<String> list=new	ArrayList<String>();
	   list.add("a");
	   list.add("3");
	   list.add("b");
	   list.add("3");
	   list.add("b");
	   
	return list;
	}
	

}
