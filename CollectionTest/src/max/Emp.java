package max;

public class Emp {
	
     int eid;
     String name;
     
	public Emp(int eid, String name) 
	{
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() 
	{
		System.out.println("kkkkkkk tostring");
		return "Emp [eid=" + eid + ", name=" + name + "]";
	};
	
	
     
}
