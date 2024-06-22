package max;

import java.util.Random;

public class B {
	
	public void generateOTP()
	{  
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<=9;i++)
		{
			
		
			
			//Random r = new Random();
			//int t = r.nextInt(10);
			//System.out.println(t);
			sb.append(new Random().nextInt(10));
			
		}
		String r = sb.substring(5);
		System.out.println(r);
		
	}
public static void main(String[] args) throws InterruptedException {
	  B ob = new B();
	  
	  while(true)
	  {
	  ob.generateOTP();
	  Thread.sleep(1000);
	  }
}
}
