package max;

import java.io.IOException;

public class Raja 
{
public static void main(String[] args) throws IOException 
{
    	PropertiesTest.getProp();
    	
    	System.out.println(System.getProperty("k1"));
    	System.out.println(System.getProperty("k2"));
    	
    	//String uid = System.getProperty("userid");
    	//System.out.println(uid);
    	//System.out.println(System.getProperty("pass"));
}
}
