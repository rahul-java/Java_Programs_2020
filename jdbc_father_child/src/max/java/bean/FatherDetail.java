package max.java.bean;

import java.util.List;

public class FatherDetail {
 
  String fname;
  int fage;
   List<ChildDetail> list;
   
public List<ChildDetail> getList() {
	return list;
}
public void setList(List<ChildDetail> list) {
	this.list = list;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public int getFage() {
	return fage;
}
public void setFage(int fage) {
	this.fage = fage;
}
  
}
