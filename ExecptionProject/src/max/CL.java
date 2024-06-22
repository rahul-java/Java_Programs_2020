package max;

public class CL {
	public static void main(String[] args) {
		CustomExp ob = new CustomExp();
		try
		{
		int r = ob.div(8, 1);
		System.out.println(r);
		}
		catch(CustomExp e)
		{
			e.printStackTrace();
		}
	}

}
