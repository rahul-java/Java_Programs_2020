package Map;

import java.util.Random;

public class GeneratePNR {
  public static String generatePNR()
  {
	  StringBuilder sb=new StringBuilder();
	  
	  for(int i=0; i<=9;i++)
	  {
		  sb.append(new Random().nextInt(10));
	  }
	 String s = sb.toString();
	  return s;
  }
}
