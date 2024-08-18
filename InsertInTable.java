package crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class InsertInTable {
public static void main(String[] ads)
{
	try {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter id :");
	
	int id=sc.nextInt();
	System.out.println("Enter name :");
	String name=sc.next();
	System.out.println("Enter location :");
	String loc=sc.next();
	
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vishnu","vishnu28");
	PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?)");
	ps.setInt(1,id);
	ps.setString(2,name);
	ps.setString(3, loc);
	//ps.addBatch();
	
	//ps.executeBatch();
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
