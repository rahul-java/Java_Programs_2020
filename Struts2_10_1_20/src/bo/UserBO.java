package bo;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import dao.UserDAO;
import dto.UDTO;
import bean.UserBean;

public class UserBO {
	
	public boolean getUserBO(UserBean ub) throws IllegalAccessException, InvocationTargetException
	{ UDTO udto = new UDTO();
		if(ub.getPhone().length()==10)
		{
			String tid = ub.getName()+ ub.getPhone().substring(6);
			
			BeanUtils.copyProperties(udto, ub);
			udto.setTid(tid);
		}
		return new UserDAO().insertData(udto);
	}

}
