package max;

import java.util.Scanner;

public class Ram {
	public static void main(String[] args) {
		UserDAO userDAO=new UserDAO();
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter UId");
	
	  String id=s.nextLine();
	 int i= Integer.parseInt(id);
	  System.out.println("Enter Name");
	  
	String n = s.nextLine();
	
System.out.println("enter Addd");
	String a = s.nextLine();
	
		if(userDAO.insertData(i,n,a)>0)
		{
			System.out.println("suceesss");
		}
		else
		{
			System.out.println("fails");
		}
	}

}
