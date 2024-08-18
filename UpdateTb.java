package crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateTb {
public static void main(String[] dsd)
{
try {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter old id :");
	int id=sc.nextInt();
	System.out.println("Enter new id:");
	int newid=sc.nextInt();
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vishnu","vishnu28");
	
	PreparedStatement ps=con.prepareStatement("update customer set cus_id=? where cus_id=?");
	ps.setInt(1,newid);
	ps.setInt(2,id);
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

