package max;

public class RevrseTest {
public String reverse(String str)
{   
	String s2="";
	  for(int i=str.length()-1;i>=0;i--)
	  {
		char t = str.charAt(i);
		//System.out.println(t);
		s2=s2+t;
	  }
	return s2;
}
public static void main(String[] args) {
	RevrseTest d = new RevrseTest();
	String res = d.reverse("india");
	System.out.println(res);
}
}
