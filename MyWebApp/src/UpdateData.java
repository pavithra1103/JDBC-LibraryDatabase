import java.sql.*;
import java.sql.DriverManager;


public class UpdateData {
	
public static void update()throws Exception{
	String url= "jdbc:mysql://127.0.0.1:3306/library";
	String username="root";
	String password="1999";
	String query="select * from data";
	Connection con= DriverManager.getConnection(url, username, password);
Statement pst= con.createStatement();

String str = "update user set RecipientName='Mary' where Id=8 ";


pst = con.prepareStatement(query);

pst.executeUpdate(str);


	System.out.println("Data Updated ");
	con.close();
	
}
public static void main(String[] args) throws Exception {
update();
}
}



