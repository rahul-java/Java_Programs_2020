package max;

import java.util.Collections;
import java.util.List;

public class KK 
{
	public static void main(String[] args) 
	{
		List<Train> list = CustomSorting.getTrainList();
		
		 for(Train c:list)
		 {
			 System.out.println(c.getDistance()+ "   "+c.getStatenCode());
		 }
		 
		 Collections.sort(list);
	}

}
