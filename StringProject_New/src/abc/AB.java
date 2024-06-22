package abc;

public class AB {
	
	String s="ram is a good boy";
	     
	
	
	
	public static   int countSPC(String s) {
		   int sp=0;
		
		String[] t = s.split("");
		for(int i=0; i<t.length;i++)
		{
			  if(t[i].equals(" ") || t[i].equals("\t"))
			  {
				  sp++;
			  }
		}
		return sp;
		
	}
	
public static void main(String[] args) {
	String s="	ram is a good boy      ";
	int r = AB.countSPC(s);
	System.out.println(r);
}
	
	

}
