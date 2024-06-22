package max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorClient {
public static void main(String[] args) {
     List<User> list=new ArrayList<User>();
    User u = new User();
    u.setUid(10);
    u.setName("bala");
    list.add(u);
    
    User u1 = new User();
    u1.setUid(4);
    u1.setName("bala");
    list.add(u1);
    
    User u2 = new User();
    u2.setUid(3);
    u2.setName("ala");
    list.add(u2);
    
    
   Iterator<User> it = list.iterator();
   while(it.hasNext())
   {
	   User t = it.next();
	   System.out.println(t.getUid()+"  "+t.getName());
   }
   System.out.println("sorting by Name");
   Collections.sort(list, new NameComparator());
   for(User t:list)
   {
	   System.out.println(t.getUid()+"  "+t.getName());
   }
   System.out.println("uid sortingggggg");
   Collections.sort(list, new UidComparator());
   for(User t:list)
   {
	   System.out.println(t.getUid()+"  "+t.getName());
   }
   
   
   
}
}
