import java.sql.*;


public class GetData {
	public static void get() throws Exception {

	String url= "jdbc:mysql://127.0.0.1:3306/library";
	String username="root";
	String password="1999";
	String query="select * from user";
	
	Connection con= DriverManager.getConnection(url, username, password);
	PreparedStatement pst= con.prepareStatement(query);
	
	Statement st=con.createStatement();
	ResultSet rt= st.executeQuery(query);
	while(rt.next()) {
		System.out.println("Id: "+rt.getInt(1));
		System.out.println("Title: "+rt.getString("Title"));
		
		System.out.println("Author: "+rt.getString("Author"));
		System.out.println("PublishedDate: "+rt.getInt("PublishedDate"));
		System.out.println("RecipientName: "+rt.getString("RecipientName"));
	
		System.out.println("ReturnDate: "+rt.getString("ReturnDate"));
		System.out.println("Fine: "+rt.getInt("Fine"));
		System.out.println("LibrarianIncharge: "+rt.getString("LibrarianIncharge"));
		
		
		}
	}

	public static void main(String[] args) throws Exception {
		
		get();
		
		

	

}


}
