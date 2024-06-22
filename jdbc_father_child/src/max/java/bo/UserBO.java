package max.java.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import max.java.bean.ChildDetail;
import max.java.bean.FatherDetail;
import max.java.dl.UserDAO;
import max.java.dto.ChildDTO;
import max.java.dto.FatherDTO;

public class UserBO {
	public boolean getData(FatherDetail fd)
	{
	   FatherDTO fdto = new	FatherDTO();
		
		List<ChildDTO> li=new ArrayList<ChildDTO>();
		if(fd.getFage()>40)
		{
			fdto.setFname(fd.getFname());
			fdto.setFage(fd.getFage());
			fdto.setPan(generatePAN(fd.getFname()));
			
			List<ChildDetail> list = fd.getList();
			
			for(ChildDetail p:list)
			{
				ChildDTO cdto = new ChildDTO();
				
				cdto.setCname(p.getCname());
				cdto.setGndr(p.getGndr());
				cdto.setAdhar(p.getAdhar());
				
				li.add(cdto);
			}
		}
		return new UserDAO().insertData(fdto, li);
		
		
	}
	
	public static String generatePAN(String name)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<10;i++)
		{
			sb.append(new Random().nextInt(10));
		}
		return "UP31"+name.substring(0, 2)+sb.substring(6);
		
	}

}
