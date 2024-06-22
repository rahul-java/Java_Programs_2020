package max;

public class AB {
	public static void main(String[] args) throws CloneNotSupportedException {
		for(int i=1; i<=10;i++)
		{
		   HH b = HH.getOBJ();
		   
		   
		   System.out.println(" ---  "+b.hashCode());
		   HH ob = b.getClone();
		   
		   ob.m1();
		   ob.m2();
		   
		   System.out.println("clone "+ob.hashCode());
		   
		}
	}

}
