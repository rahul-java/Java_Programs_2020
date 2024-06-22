package max;

public class T {
	
	T()
	{
		System.out.println("Constructor");
	}
	
	{
		System.out.println("instance block");
	}
	
	static
	{
		System.out.println("static");
	}
	
	
	
	
	public static void main(String[] args) {
		  new T();
	}
}
