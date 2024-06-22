package max;


public class class1 {
	

	    public void method(Object obj){
	        System.out.println("Object");
	    }

	    public void method(String str){
	        System.out.println("String");
	    }

	    public static void main(String[] arg){
	        class1 ob=new class1();
	       // Object b = null;
	       
	        ob.method(null);
	        //ob.method((Object)null);
	        
	    }

	}


