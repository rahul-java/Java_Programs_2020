package immutableclass;

import java.util.Random;

public class GA {
public static String adhar()
{
	StringBuilder sb = new StringBuilder();
	for(int i=0; i<12;i++)
	{
		sb.append(new Random().nextInt(10));
	}
	return "31"+sb.substring(2);
}

}
