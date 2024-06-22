package max;

public class A {
	
	
	public static void main(String[] args) {
		String s="india";
		  
		String s1="india";
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s.substring(2,3).toUpperCase());
		
		char ch[]={'r','a','m'};
		String ss = new String(ch);
		System.out.println(ss);
		
		char[] t = s.toCharArray();
		
		for(int i=0; i<t.length;i++)
		{
			  char p=t[i];
			  System.out.println(p);
		}
		String s2 = new String("India");
		String s3 = new String("india");
		
	System.out.println(s==s1);
	
	  if(s==s2.intern())
	  {
		  System.out.println("same memory");
	  }
	  else
	  {
		  System.out.println("diff memmoory");
	  }
		
	}

}
