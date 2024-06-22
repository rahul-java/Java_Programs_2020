package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public Map<String,List<String>>  getMapData()
	{
	  Map<String,List<String>> m=new HashMap<String, List<String>>();
	  
		List<String> acc=new ArrayList<String>();
		acc.add("raja");
		acc.add("KK");
		m.put("accepted", acc);
		List<String> dup=new ArrayList<String>();
		dup.add("ramesh");
		m.put("duplicat", dup);
		List<String> rej=new ArrayList<String>();
		rej.add("ranaji");
		rej.add("ram");
		m.put("rejcted", rej);
		return m;
		
		
		
		
	}

}
