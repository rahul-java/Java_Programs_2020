package max;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static List<Emp> getData()
	{
		List<Emp> l=new ArrayList<Emp>();
		//Emp e = new Emp(2,"raja");
		l.add(new Emp(2,"raja"));
		l.add(new Emp(22,"ram"));
		l.add(new Emp(21,"kk"));
		return l;
	}

}
