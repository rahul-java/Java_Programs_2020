package max;

import org.hibernate.Session;

public class GetLoadClient {
	public static void main(String[] args) {
		try {
			Session s = SessionUtility.getSession();
			User b = (User)s.load(User.class, 71);
			//User b = (User)s.get(User.class, 71);
			System.out.println(b.getUid() + " "+b.getName()+ " "+b.getAdd());
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
