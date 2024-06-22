package Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDetails {
	static Connection con=ConnectionJDBC.getConnection();
	
	public static void insertData(int rollno, String name, String add)
	{
		
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?,?)");
			for(int i=0;i<5;i++)
			{
				ps.setInt(1, rollno+i);
				ps.setString(2, name);
				ps.setString(3, add);
				ps.setInt(4, 0);
				
				int k=ps.executeUpdate();
				if(k>0)
				{
					System.out.println("Inserted Successfully");
					k=0;
				}
				else
				{
					System.out.println("Error in Insertion");
				}
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int updateData(int rolno,String name)
	{
		
		try {
			PreparedStatement ps=con.prepareStatement("update student set name=? where rollno=?");
			ps.setString(1, name);
			ps.setInt(2, rolno);
			
			int i=ps.executeUpdate();
			return i;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public static int deleteData(int rolno)
	{
		
		try {
			PreparedStatement ps=con.prepareStatement("update student set cflag=? where rollno =?");
			ps.setInt(1, 1);
			ps.setInt(2, rolno);
			
			int i=ps.executeUpdate();
			return i;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static ArrayList<Student> displayData(String n)
	{
		ArrayList<Student> list=new ArrayList<Student>();
		try {
			if(n.equalsIgnoreCase("ALL"))
			{
			PreparedStatement ps=con.prepareStatement("select * from student where cflag=?");
			ps.setInt(1, 0);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Student std=new Student();
				std.setRollno(rs.getInt(1));
				std.setName(rs.getString(2));
				std.setAddress(rs.getString(3));
				
				list.add(std);
				
			}
			}
			else
			{
				PreparedStatement ps=con.prepareStatement("select * from student where rollno=? and cflag=?");
				ps.setInt(1, Integer.parseInt(n));
				ps.setInt(2, 0);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					Student std=new Student();
					std.setRollno(rs.getInt(1));
					std.setName(rs.getString(2));
					std.setAddress(rs.getString(3));
					
					list.add(std);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
