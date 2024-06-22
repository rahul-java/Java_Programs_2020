package max;

public class Divide implements Calculator{

	@Override
	public String service(int a, int b) {
		  int c=a/b;
		return "Div "+c;
	}

}
