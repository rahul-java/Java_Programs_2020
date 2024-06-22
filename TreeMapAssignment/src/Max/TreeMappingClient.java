package Max;

import java.util.Iterator;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMappingClient
{
public static void main(String[] args)
{
	Map<Manager,Set<Emp>> m=TreeMapping.getDetails();
	
	Set<Entry<Manager,Set<Emp>>> s=m.entrySet();
	
	for(Entry<Manager,Set<Emp>> ss:s)
	{
		Manager mgr=ss.getKey();
		System.out.println("\nManager Id :\t"+mgr.getId()+" Manager Name :\t"+mgr.getName()+"\n");
		Set<Emp> s1=ss.getValue();
		for(Emp e:s1)
		{
			
			System.out.println("Emp id :"+e.getEid()+"\tEmp Name :"+e.getEname()+"\t"+"\tEmp Add :"+e.getAdd());
		}
	}
	/*
	Iterator<Entry<Manager,Set<Emp>>> it=s.iterator();
	while(it.hasNext())
	{
		Entry<Manager,Set<Emp>> e=it.next();
		System.out.println("\nManager Id :\t"+e.getKey().getId()+" Manager Name :\t"+e.getKey().getName());
		
		Set<Emp> s1=e.getValue();
		Iterator<Emp> itr=s1.iterator();
		while(itr.hasNext())
		{
			Emp e1=itr.next();
			System.out.println("Emp id :"+e1.getEid()+"\tEmp Name :"+e1.getEname()+"\t   Emp Add :"+e1.getAdd());
			
		}
	}*/
}
}
