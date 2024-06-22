package max;

import java.util.Random;

public class A {
  
	public static String getOTP()
	{
		StringBuilder b = new StringBuilder();
		for(int i=0;i<=10;i++)
		{
			b.append(new Random().nextInt(10));
		}
		return b.toString().substring(6);
	}
	 
}
