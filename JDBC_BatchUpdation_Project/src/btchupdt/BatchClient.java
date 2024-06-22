package btchupdt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import max.JDBCConnection;
import max.UserDAO;

public class BatchClient {

	public static void main(String[] args) {
		try
		{
		 UserDAO userDAO=new UserDAO();
		 Connection con = JDBCConnection.getConnn();
PreparedStatement ps = con.prepareStatement("insert into tb2 values (?,?,?)");
			
		Scanner s = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter UId");
	
	  String id=s.nextLine();
	 int i= Integer.parseInt(id);
	  System.out.println("Enter Name");
	  
	String n = s.nextLine();
	
System.out.println("enter Addd");
	String a = s.nextLine();
	
	ps.setInt(1, i);
    ps.setString(2, n);
    ps.setString(3, a);
	
    ps.addBatch();
    
	System.out.println("enter Y/N");
	String st = s.nextLine();
	 
     
    
    
  if(!st.equalsIgnoreCase("Y"))
  {
	   break; 
	     
	  }
 }
		
		int[] n = ps.executeBatch();
		//System.out.println(n);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
}

