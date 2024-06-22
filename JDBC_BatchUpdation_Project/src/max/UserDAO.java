package max;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	
	public static int update(int uid,String add)
	{
		try {
			Connection con = JDBCConnection.getConnn();
PreparedStatement ps = con.prepareStatement("update empdetail set add = ? where uid = ?");
		ps.setString(1, add);
		ps.setInt(2,uid);
	int t=	ps.executeUpdate();
	if(t>0)
	{
		return uid;
	}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	
	
	public static List<Emp> fatch(String id)
	{     PreparedStatement ps=null;
	 List<Emp> l=new ArrayList<Emp>();
		try {
			String q="select * from empdetail";
			Connection con = JDBCConnection.getConnn();
			if(id.equalsIgnoreCase("All"))
			{
			 ps = con.prepareStatement(q);
			}
			else
			{
				ps=con.prepareStatement(q+ " where uid = ?");
				ps.setInt(1, Integer.parseInt(id));
				
			}
			
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Emp e = new Emp();
			
				e.setId(rs.getInt(1));
				String n=rs.getString(2);
				e.setN(n.equalsIgnoreCase("")? "pms":n);
				String a=rs.getString(3);
				e.setAdd(a);
				l.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
	
	
	
	
public int insertData(int ui,String n,String a)
{
	try {
		Connection con = JDBCConnection.getConnn();
		PreparedStatement ps = con.prepareStatement("insert into empdetail values (?,?,?)");
	     ps.setInt(1, ui);
	     ps.setString(2, n);
	     ps.setString(3, a);
	    return  ps.executeUpdate();
	    
	} catch (Exception e) {
		e.printStackTrace();
	}
	return 0;
}
	
	
}
