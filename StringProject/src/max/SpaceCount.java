package max;

public class SpaceCount {
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String s="ram is a good boy";
		String[] p = s.split("");
		int y=0;
		for(int i=0; i<p.length;i++)
		{
			if(p[i].equals(" "))
			{
				y++;
			}
		}
		
		System.out.println(y);
	}

}
