package max;

import java.util.List;

public class Fatch {
	public static void main(String[] args) {
		List<Emp> list = UserDAO.fatch("All");
		
		for(Emp p:list)
		{
			System.out.println(p.getId()+ " "+p.getN()+ " "+p.getAdd());
		}
	}

}
