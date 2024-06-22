package max;

public class Train implements Comparable<Train> {
	
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
@Override
public int compareTo(Train o) {
	// TODO Auto-generated method stub
	return 0;
}
  
}
