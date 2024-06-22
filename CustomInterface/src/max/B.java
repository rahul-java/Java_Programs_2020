package max;

public class B implements I,II{
@SuppressWarnings("static-access")
public static void main(String[] args) {
	   I b=new B();
	   System.out.println(b.a);
}
}
