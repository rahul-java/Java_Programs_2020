package max;

public class Rahul {
public static void main(String[] args) {
	Calculator b = FactoryClass.getFactory("*");
	System.out.println(b.getClass());
	String t = b.service(10, 9);
	System.out.println(t);
}
}
