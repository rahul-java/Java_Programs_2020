
public class Factorial {
	public int getFactorialWithoutLoop(int no)
	{
		int f=1;int t;
		if(no==0 || no==1)
		{return f;
		}
		else
		{
			t =no*getFactorialWithoutLoop(no-1);
		}
		
		return t ;
	}
	}




