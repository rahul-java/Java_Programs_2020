package max;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginIntercepter implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		 ValueStack stack = ai.getStack();
	String n = stack.findString("phone");
	System.out.println("mob "+n);
	if(n.length()==10)
	{
		stack.set("phone", "+91"+n);	
		ai.invoke();
	}
		return "e";
	
	}
}
