package max;

public class Train  implements Comparable<Train>{
  int distance;
  String statenCode;
public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public String getStatenCode() {
	return statenCode;
}
public void setStatenCode(String statenCode) {
	this.statenCode = statenCode;
}

public int compareTo(Train o) {
	if(distance==o.getDistance())
		return 0;
	else if(distance>o.getDistance())
		return -1;
	else
		return 1;
	
	
	
}

}
