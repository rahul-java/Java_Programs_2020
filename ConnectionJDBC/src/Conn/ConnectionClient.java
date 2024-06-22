package Conn;

import java.util.List;

public class ConnectionClient {

	public static void main(String[] args) {
		//StudentDetails.insertData(25, "Cde", "Pqr");
		//int i=StudentDetails.updateData(10, "Rahul");
		/*int i=StudentDetails.deleteData(14);
		if(i>0)
		{
			System.out.println("Updated Successfully");
		}
		else
		{
			
			System.out.println("Error in Updation");
		}
		*/
		List<Student> l=StudentDetails.displayData("14");
		if(l.isEmpty())
		{
			System.out.println("The Record not found which have you entered the rollno.");
		}else
		{
			for(Student std:l)
			{
				System.out.println(std.rollno+"\t"+std.getName()+"\t"+std.getAddress());
			}
		}
		
	}

}
