package Max;

import java.util.Comparator;


public class eidComparator implements Comparator<Emp>{

public int compare(Emp e1, Emp e2) {
		
		if(e1.getEid()==e2.getEid())
			return 0;
		else if(e1.getEid()<e2.getEid())
			return -1;
		else 
			return 1;
	
}

}
	

