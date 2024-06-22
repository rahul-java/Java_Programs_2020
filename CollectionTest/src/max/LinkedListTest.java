package max;

import java.util.ArrayList;


public class LinkedListTest {
 public static void main(String[] args) {
	 
	//LinkedList<String> ll=new  LinkedList<String>();
	 
	 ArrayList<String> ll=new ArrayList<String>();
	 
	ll.add("A");
	ll.add("B");
	ll.add("C");
	ll.add("D");
	ll.add("E");
	
	System.out.println(ll);
	ll.add(2, "w");
	System.out.println(ll);
	System.out.println(ll.size());
	
}
}
