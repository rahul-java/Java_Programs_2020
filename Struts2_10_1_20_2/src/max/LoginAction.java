package max;

import java.lang.reflect.InvocationTargetException;

import bean.UserBean;
import bo.UserBO;

import com.opensymphony.xwork2.ModelDriven;

public class LoginAction implements ModelDriven<UserBean>{
 
	UserBean userBean=new UserBean();
	public String execute() throws IllegalAccessException, InvocationTargetException
	{
		
		System.out.println("in actionnn----");
		
		UserBO userBO=	new	UserBO();
		System.out.println("in action "+userBean.getPhone());
		if(userBO.getUserBO(userBean))
		{
			return "s";
			
		}
		return "e";
		
		
		
	}

	
	public UserBean getModel() {
		
		return userBean;
	}

	
	
	
	
	
}
