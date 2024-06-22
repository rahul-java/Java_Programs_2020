package max;

public class Y extends X{
  public void car(String s)
  {   if(s.equals("i10"))
  {
	  super.car(s);
  }
  else {
	  
	  System.out.println(s);
  }
  }
  
  
  public static void main(String[] args) {
	X b=new Y();
	b.car("i20");
	
}
}
