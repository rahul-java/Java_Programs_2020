package max;

public class SBTest {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("abcd");
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	StringBuffer sb1 = new StringBuffer("india");
	System.out.println(sb1.capacity());
	System.out.println(sb1.append("one"));
	System.out.println(sb1.capacity());
	
	System.out.println(sb.reverse());
	sb1.replace(2, 3, "Z");
	System.out.println(sb1);
	
	
}
}
