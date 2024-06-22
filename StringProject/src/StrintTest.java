
public class StrintTest {
  public static void main(String[] args) {
	    String s="india";
	    String s1="india";
	         System.out.println(s.toUpperCase());
	    System.out.println(s.substring(2).toUpperCase());
	    System.out.println(s.substring(2, 3));
	    char ch[]= {'r','a','m'};
	    String ss=new String(ch);
	    System.out.println(ss);
	    
	    for(int i=0; i<ch.length;i++)
	    {
	    	char b=ch[i];
	    	   
	    	System.out.println(b);
	    }
	    
	    
	    char[] d = s1.toCharArray();
	    
	    String t1 = new String("india");
	    String t2 = new String("india");
	  System.out.println(t1.equals(t1));
	  
	  System.out.println(s1.hashCode());
	  System.out.println(s.hashCode());
	  System.out.println(s==s1);
	  String s3="in";
	  System.out.println(s3.hashCode());
	s3=  s3+"dia";
	System.out.println(s3.hashCode());
	System.out.println(s.equals(s3));
	
	if(s==t1.intern())
	{
		System.out.println("same memoryyyy");
	}
	else
	{
		System.out.println("diff memory");
	}
	
	
	  
	  
	  
}
}
