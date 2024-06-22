package dlt;

public class DeleteClient {
public static void main(String[] args) {
	  int rst = DeleteDAO.deleteRecords(3);
	   if(rst>0)
	   {
		   System.out.println("delete from table "+rst);
	   }
	   else
	   {
		   System.out.println("not deleteee ");
	   }
}
}
