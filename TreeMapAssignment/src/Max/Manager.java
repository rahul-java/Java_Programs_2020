package Max;

import java.util.Comparator;

public class Manager implements Comparator<Manager>
{
	
int id;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public int compare(Manager o1, Manager o2) {
	// TODO Auto-generated method stub
	if(o1.getId()>o2.getId())
		return 1;
	else
		if(o1.getId()<o2.getId())
			return -1;
		else
	return 0;
}



}
