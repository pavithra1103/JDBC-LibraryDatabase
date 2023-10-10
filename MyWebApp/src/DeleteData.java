import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
	public static void delete()throws Exception{
		String url= "jdbc:mysql://127.0.0.1:3306/library";
		String username="root";
		String password="1999";
		String query="select * from user";
		Connection con= DriverManager.getConnection(url, username, password);
	Statement pst= con.createStatement();


	String one = "delete from user where Id='11'";
	pst = con.prepareStatement(query);
	
	pst.executeUpdate(one);
		System.out.println("Delete complete");
		con.close();
		
	}
	public static void main(String[] args) throws Exception {
	delete();
	}
	}


