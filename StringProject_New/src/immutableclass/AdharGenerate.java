package immutableclass;

public final class AdharGenerate {

	final String adhar;
	AdharGenerate()
	{
	  adhar=GA.adhar();
	}
	
	public static AdharGenerate getAdhar(String s)
	{
		if(s.length()==10)
		{
			return new AdharGenerate();
		}
		return null;
	}
	public String toString1()
	{
		return adhar;
	}
	
	
}
