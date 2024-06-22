package max.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCConnection {
	private JDBCConnection()
	{
		
	}
	static Connection con=null;
	static
	{
		try {
			Class.forName("org.postgresql.Driver");
con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dinesh", "postgres", "postgres");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnn()
	{
		return con;
	}
	
	
	public static int getFID(Connection con)
	{
		try {
			PreparedStatement ps = con.prepareStatement("select max(fid) as fd from father");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			int fid=rs.getInt("fd");
			return 1+fid;
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static int getCID(Connection con)
	{
		try {
			PreparedStatement ps = con.prepareStatement("select max(cid) as cd from child");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			int cid=rs.getInt("cd");
			return 1+cid;
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
