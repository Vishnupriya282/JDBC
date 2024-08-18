package crud_operations;

import java.sql.*;
import java.sql.DriverManager;


public class Retrievedata {
	public static void main(String[] args)
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vishnu","vishnu28");
			PreparedStatement st=con.prepareStatement("select * from customer");
			ResultSet rs=st.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Customer ID: "+rs.getInt("cus_id"));
				System.out.println("Customer Name: "+rs.getString("cus_name"));
			}
			System.out.println("Success");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
}
}
