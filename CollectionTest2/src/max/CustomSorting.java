package max;

import java.util.ArrayList;
import java.util.List;

public class CustomSorting {
  public static  List<Train>  getTrainList() {
	  List<Train> l=new ArrayList<Train>();
	    Train t = new Train();
	    t.setDistance(100);
	    t.setStatenCode("NDLS");
	    l.add(t);
	    
	    Train t1 = new Train();
	    t1.setDistance(20);
	    t1.setStatenCode("DLI");
	    l.add(t1);
	    
	    Train t2 = new Train();
	    t2.setDistance(40);
	    t2.setStatenCode("NZM");
	    l.add(t2);
		return l;
	    
	    
}
}
