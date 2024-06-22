package max;

public class Addition implements Calculator{

	@Override
	public String service(int a, int b) {
		int c=a+b;
		return "Add "+c;
	}

}
