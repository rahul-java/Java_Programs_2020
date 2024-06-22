package Test;

public final class ImmutableClass 
{
  final String p;
  
  public ImmutableClass(String p)
  {
	this.p = p;
	 
  }
  public static ImmutableClass getData(String s)
  {
	  return new ImmutableClass(s);
  }

public String toString() {
	return p;
}
  
}
