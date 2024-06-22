package immutableclass;

public class AC {
	public static void main(String[] args) {
		AdharGenerate adhar = AdharGenerate.getAdhar("1111111111");
	   System.out.println(adhar.toString());
	}

}
