
public class Ctax {

	public float TaxCalculator(int sal)
	{
		float t, t1,t2,t3,t4;
		t1=0;
		int s1;
		if(sal<=250000)
		{
			t=t1;
		}
		else
		if(sal<=500000)
		{
			s1=sal-250000;
			t2=(float)s1/10;
			t=t1+t2;
		}
		else
		if(sal<=1000000)
		{
			s1=sal-500000;
			t2=(float)250000/10;
			t3=(float)s1/5;
			t=t1+t2+t3;
			}
		else 
		{
			t2=250000/10;
			t3=500000/5;
			s1=sal-1000000;
			t4=(float)(s1*3)/10;
			t=t1+t2+t3+t4;
		}
		return t;
		}
		
	}

