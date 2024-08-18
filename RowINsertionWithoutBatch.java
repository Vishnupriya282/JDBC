package crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RowINsertionWithoutBatch {
	public static void main(String[] args)
	{
	try{
		Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter cusid");
	int cus_id=sc.nextInt();
	System.out.println("Enter customer name:");
	String cus_name=sc.next();
	System.out.println("Enter location");
	String loc=sc.next();
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vishnu","vishnu28");
	String query="insert into customer values ('"+cus_id+"','"+cus_name+"','"+loc+"')";
	PreparedStatement ps=con.prepareStatement(query);
	
	int res=ps.executeUpdate();
	if(res>0)
	{
		System.out.println("Success...");
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
