
public class StringBuffered {
	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	   System.out.println(sb.length());
	   System.out.println(sb.capacity());
	   StringBuffer sb1 = new StringBuffer("india");
	   System.out.println(sb1.length());
	   System.out.println(sb1.capacity());
	   System.out.println(sb1.append("one"));
	   System.out.println(sb1.capacity());
	   System.out.println(sb1.reverse());
	   String s="india";
	   StringBuffer t = new StringBuffer(s);
	   System.out.println(t.reverse());
	   System.out.println(sb1.replace(2, 3, "Z"));
	}

}
