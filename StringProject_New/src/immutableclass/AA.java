package immutableclass;

public final class AA {
	
	final String p;
 AA(String s)
	  {
		  p=s;
	  }
	
public static AA getObject(String s)
	{
		return new AA(s);
	}

public String getP() {
	return p;
} 

public String toString()
{
	return p;
}

}
