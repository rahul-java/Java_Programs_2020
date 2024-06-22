package max1;

public class Cl {
	public static void main(String[] args) {
		UserDAO userDAO=new UserDAO();
		int rest = userDAO.insertUserDetails(3, "kk", "noida");
		if(rest==3)
		{
			System.out.println("succcesss");
		}
		else
		{
			System.out.println("errrrorrr");
		}
	}

}
