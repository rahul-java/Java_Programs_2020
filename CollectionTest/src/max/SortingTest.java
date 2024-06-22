package max;

import java.util.ArrayList;
import java.util.Collections;

public class SortingTest {
  public static void main(String[] args) {
	ArrayList<Integer> l = new ArrayList<Integer>();
	l.add(5);
	l.add(1);
	l.add(3);
	System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
	Collections.reverse(l);
	System.out.println(l);
}
}
