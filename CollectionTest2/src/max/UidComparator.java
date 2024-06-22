package max;

import java.util.Comparator;

public class UidComparator implements Comparator<User>{

	
	public int compare(User o1, User o2) {
		
		if(o1.getUid()==o2.getUid())
			return 0;
		else if(o1.getUid()>o2.getUid())
			return 1;
		else 
			return -1;
	}

}
