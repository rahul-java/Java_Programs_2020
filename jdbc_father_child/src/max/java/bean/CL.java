package max.java.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import max.java.bo.UserBO;

public class CL 
{
	public static void main(String[] args)
	{
		
	Scanner s = new Scanner(System.in);
	List<ChildDetail> list=new ArrayList<ChildDetail>();
	FatherDetail fd = new FatherDetail ();
	  System.out.println("F Name");
	String fn=  s.nextLine();
	System.out.println("F age ");
	String fa=  s.nextLine();
	int ffa=Integer.parseInt(fa);
	fd.setFname(fn);
	fd.setFage(ffa);
	while(true)
	{    ChildDetail childDetail=new ChildDetail();
		System.out.println("Child Name");
		String cn=  s.nextLine();
		childDetail.setCname(cn);
		System.out.println("Child Adhar ");
		String cadhr=  s.nextLine();
		childDetail.setAdhar(cadhr);
		System.out.println("Gender ");
		String cgndr=  s.nextLine();
		childDetail.setGndr(cgndr);
		System.out.println("Y/N");
		String child=  s.nextLine();
		list.add(childDetail);
		if(!child.equalsIgnoreCase("Y"))
		{
			break;
		}
	}
	
	UserBO userBO=new UserBO();
	fd.setList(list);
	if(userBO.getData(fd))
	{
		System.out.println("Successs ");
	}
	else
	{
		System.out.println("erooorr");
	}
	
	}

}
