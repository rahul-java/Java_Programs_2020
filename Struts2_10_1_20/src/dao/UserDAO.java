package dao;

import dto.UDTO;

public class UserDAO {
  
	public boolean insertData(UDTO udto)
	{
		System.out.println("dao");
		System.out.println(udto.getEmail()+ " "+udto.getTid());
		  if(udto.getPhone().length()==10)
		  {
			  return true;
		  }
		return false;
		
	}
}
