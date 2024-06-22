package max;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D {
	public static void main(String[] args) {
		  
		Date d = new Date();
		 SimpleDateFormat s = new SimpleDateFormat("dd-mm-yyyy");
		 s.format(d);
		//s.format("dd-mm-yyyy");
		System.out.println(s.getCalendar());
		//System.out.println(d);
		
	}

}
