package crud_operations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class TableCreation {
public static void main(String[] args){
  try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vishnu","vishnu28");
		String query="create table customer(cus_id int,cus_name varchar(20),loc varchar(10))";
		PreparedStatement ps=con.prepareStatement(query);
		int res=ps.executeUpdate();
		if(res>0){
			System.out.println("Success...");
		}
	  }
   catch(Exception e){
		e.printStackTrace();
	}
}
}
