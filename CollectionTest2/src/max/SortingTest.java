package max;

import java.util.ArrayList;
import java.util.Collections;

public class SortingTest {
  public static void main(String[] args) {
	ArrayList<String> l = new ArrayList<String>();
	l.add("bala");
	l.add("kala");
	l.add("ala");
	System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
}
}
