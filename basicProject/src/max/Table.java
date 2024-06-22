package max;

public class Table {
	
	public void table(int a, int n)
	{
		if(a<=10)
		{
		System.out.println(a*n);
		table(a+1,n);
		}
		
	}
	public static void main(String[] args) {
		Table table=new Table();
		table.table(1,30);
	}

}
