package crud_operations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveDFT {
public static void main(String[] fd)
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishnu","vishnu28");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from customer where cus_id='"+2+"'");
		while(rs.next())
		{
			System.out.println(rs.getInt("cus_id"));
			System.out.println(rs.getString("cus_name"));
			System.out.println(rs.getString("loc"));
			
			
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
