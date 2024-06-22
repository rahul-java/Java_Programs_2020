package set;

public class Emp {
  int eid;
  String name;
public Emp(int eid, String name) {
	super();
	this.eid = eid;
	this.name = name;
}

public int hashCode() {
	
	return 1;
}

public boolean equals(Object obj) {
	Emp e = (Emp)obj;
	return name.equals(e.name);
}


  
}
