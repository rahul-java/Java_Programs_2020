
public class Btax {
	public float TaxCalculator(int sal)
	{
		float t, t1,t2,t3,t4;
		int s1;
		t1=0;
		if(sal<=500000)
		{
		    t=t1;
		}
		else
		if(sal<=1000000)
		{
			s1=sal-500000;
			t2=(float)s1/10;
			t=t1+t2;
		}
		else
		if(sal<=2000000)
		{
			t2=500000/10;
			s1=sal-1000000;
			t3=(float)s1/5;
			t=t1+t2+t3;
			}
		else 
			{
			t2=500000/10;
			t3=1000000/5;
			s1=sal-2000000;
			t4=(float)(s1*3)/10;
			t=t1+t2+t3+t4;
		}
		
		return t;
		}
		

}
