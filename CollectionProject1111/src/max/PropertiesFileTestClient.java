package max;

public class PropertiesFileTestClient {

	public static void main(String[] args) throws Exception {
		PropertiesFileTest.getProp();
       System.out.println(System.getProperty("pass"));
       System.out.println(System.getProperty("userid"));
       System.out.println(System.getProperty("url"));
       System.out.println(System.getProperty("driver"));
	}

}
