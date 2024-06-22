package btchupdt;

import max.UserDAO;

public class Update {
	public static void main(String[] args)
	{
		int t = UserDAO.update(2, "Meerut");
		if(t>0)
		{
			System.out.println("update "+t);
		}
		else
		{
			System.out.println("Erroorrr ");
		}
	}

}
