package Test;

import java.lang.reflect.Method;

public class ImmutableClassClient {

	public static void main(String[] args) 
	{
		//ImmutableClass ob=new ImmutableClass("Rahul");
			
		ImmutableClass ob = ImmutableClass.getData("India");
		Class<? extends ImmutableClass> cl = ob.getClass();
		Method[] m = cl.getMethods();
		for(Method p:m)
		{
			System.out.println(p.getName()+"\t"+p.getModifiers());
		}
		
		System.out.println(ob);
		System.out.println(ob.p);
	}

}
