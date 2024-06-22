package set;

public class Emp {
  int eid;
  String name;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public int hashCode() {
	System.out.println("hashCode");
	return 222;
}
@Override
public boolean equals(Object obj) {
	Emp e = (Emp)obj;
	System.out.println("equals");
	return name.equals(e.getName());
}




  
}
