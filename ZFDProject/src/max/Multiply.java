package max;

public class Multiply implements Calculator{

	@Override
	public String service(int a, int b) {
	int	c= a*b;
		return "Mul "+c;
	}

}
