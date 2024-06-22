package max;

public class Fact {
	
	
	public void print(int a)
	{
		if(a<=10);
		{
			System.out.println(a);
			print(a+1);
		}
		}
	
	public String getFacto(int n)
	{  int f=1;
		if(n==1 || n==0)
	{
		return"Fectorial rslt is= "+f+" of "+n+"!";
	}
		else
		{
			for(int i=n; i>=2;i--)
			{
				f=f*i;
			}
		}
		return"Fectorial rslt is= "+f+" of "+n+"!";

}
}