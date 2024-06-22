package Map;

import java.util.HashMap;
import java.util.Map;

public class MulMapTest 
{
	public static Map<String,Map<String,String>> get()
	{
Map<String,Map<String,String>> india=new	HashMap<String, Map<String,String>> ();

Map<String,String> up=new HashMap<String, String>();
up.put("k1", "1000");
up.put("k11", "10010");
up.put("k12", "10020");
india.put("up", up);


Map<String,String> ap=new HashMap<String, String>();
ap.put("k1", "1000");
ap.put("k11", "10010");
ap.put("k12", "10020");
india.put("ap", ap);

Map<String,String> mp=new HashMap<String, String>();
mp.put("k1", "1000");
mp.put("k11", "10010");
mp.put("k12", "10020");
india.put("mp", mp);

return india;


	}

}
