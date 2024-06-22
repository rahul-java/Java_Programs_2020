package max.java.dl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import max.java.JDBCConnection;
import max.java.dto.ChildDTO;
import max.java.dto.FatherDTO;

public class UserDAO {
public boolean insertData(FatherDTO fdto,List<ChildDTO> li)
	{  Connection con = JDBCConnection.getConnn();
	PreparedStatement ps1=null;
		
		try {
			con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("insert into father values (?,?,?,?)"); 
            int id= JDBCConnection.getFID(con);
			if(id>0)
			{
				ps.setInt(1, id);
				ps.setString(2,fdto.getFname() );
				ps.setInt(3, fdto.getFage());
				ps.setString(4, fdto.getPan());
				int i=ps.executeUpdate();
				if(i>0)
				{   int cd=JDBCConnection.getCID(con);
				 ps1 = con.prepareStatement("insert into child values (?,?,?,?,?)");
					for(ChildDTO p:li)
					{
										
						if(cd>0)
						{
					ps1.setInt(1, cd);
					ps1.setString(2, p.getCname());
					ps1.setString(3, p.getAdhar());
					ps1.setString(4, p.getGndr());
					ps1.setInt(5,JDBCConnection.getFID(con)-1 );
					
					ps1.addBatch();
					
					++cd;
						}
					}
					
					ps1.executeBatch();
				}
				con.commit();
			}
			
			
			return true;
		} 
		
		catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
		
	}

}
