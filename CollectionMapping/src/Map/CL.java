package Map;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CL {
	public static void main(String[] args) {
		MapTest mapTest=new	MapTest();
		Map<String, List<String>> t = mapTest.getMapData();
		  
      Set<Entry<String, List<String>>> s = t.entrySet();
      for(    Entry<String, List<String>> p:s)
      {
    	  String k = p.getKey();
    	  System.out.println("key "+k);
    	      List<String> v = p.getValue();
    	      
    	      for(String r:v)
    	      {
    	    	  System.out.println(r);
    	      }
    	      
    	  
      }
		
	}

}
