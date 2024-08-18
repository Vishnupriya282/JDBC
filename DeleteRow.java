package crud_operations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class DeleteRow {
public static void main(String[] ad)
{
	try
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row to be deleted");
	int id=sc.nextInt();
	//Driver class
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//connection to jdbc and odbc
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vishnu","vishnu28");
	//data transfer from jdbc to odbc
	PreparedStatement ps=con.prepareStatement("delete from customer where cus_id=?");
	ps.setInt(1, id);
	int res=ps.executeUpdate();
	if(res>0)
	{
		System.out.println("Success..");
	}
	sc.close();
	ps.close();
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
