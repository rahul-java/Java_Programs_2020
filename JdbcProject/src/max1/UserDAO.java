package max1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {
	public int insertUserDetails(int eid,String name,String add){
		try {
			
			Connection con = ConnUtil.getConnnnn();
			PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?)");
		  ps.setInt(1, eid);
		  ps.setString(2, name);
		  ps.setString(3,add);
		  int i = ps.executeUpdate();
		  if(i>0)
		  {
			  return eid;
		  }
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
		
		
	}

}
