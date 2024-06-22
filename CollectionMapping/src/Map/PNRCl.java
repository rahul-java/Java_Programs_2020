package Map;

import java.util.Map;

public class PNRCl {
public static void main(String[] args) {
	  Map<String, String> m = MapT.getData();
	  String r = m.get("pnr");
	  System.out.println(r);
}
}
