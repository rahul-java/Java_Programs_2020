import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args)
	{
		Hashtable<String,Double> ht = new Hashtable<String,Double>();
	     
	      ht.put("k1",3434.34);
	      ht.put("k2",123.22);
	      ht.put("k3",1378.00);
	      ht.put("k4",99.22);
	      ht.put("k5",-19.08);

	      Enumeration name = ht.keys();
	      
	      while(name.hasMoreElements()) {
	    	 String str = (String) name.nextElement();
	         System.out.println(str + ": " + ht.get(str));
	      }        
	      System.out.println();
	      
	      double bal = ht.get("k1");
	      ht.put("k1",bal + 2000);
	      System.out.println("k1's new balance: " + ht.get("k1"));
	      System.out.println();
	      Set<Entry<String,Double>> s=ht.entrySet();
	      for(Entry<String,Double> e:s)
	      {
	    	  System.out.println(e.getKey()+"   "+e.getValue());
	      }

	}

}
