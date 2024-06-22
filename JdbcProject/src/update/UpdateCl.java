package update;

import max.UserDAO;

public class UpdateCl {
	public static void main(String[] args) {
		UserDAO userDAO=new UserDAO();
		if(userDAO.update(6, "puna")) {
			System.out.println("successsss");
		}
		else
		{
			System.out.println("eroooroororr");
		}
	}

}
