import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
public class Insert {
	public static void insertdata() throws Exception{
		String url= "jdbc:mysql://127.0.0.1:3306/library";
		String username="root";
		String password="1999";
		String query="insert into  user values(?,?,?,?,?,?,?,?,?)";
		Connection con= DriverManager.getConnection(url, username, password);
		PreparedStatement pst= con.prepareStatement(query);
		pst.setInt(1, 1);
		pst.setString(2,"Game of thrones");
		pst.setString(3, "George R.R. Martin");
		pst.setString(4,"1996");
		pst.setString(5, "Pavithra");
		pst.setString(6,"10/10/2023");
		pst.setString(7,"18/10/2023");
		pst.setInt(8, 0);
		pst.setString(9, "Mr.John");
		
		pst.setInt(1, 2);
		pst.setString(2,"The Lost Throne");
		pst.setString(3, "Chris Kuzneski");
		pst.setString(4,"2008");
		pst.setString(5, "Daniel");
		pst.setString(6,"12/12/2023");
		pst.setString(7,"01/01/2024");
		pst.setInt(8, 0);
		pst.setString(9, "Mr.John");
		
		
		pst.setInt(1, 3);
		pst.setString(2,"Only Time Will Tell");
		pst.setString(3, "Jeffrey Archer");
		pst.setString(4,"2011");
		pst.setString(5, "Tina");
		pst.setString(6,"12/12/2023");
		pst.setString(7,"01/01/2024");
		pst.setInt(8, 0);
		pst.setString(9, "Mr.David");
		
		pst.setInt(1, 4);
		pst.setString(2,"Death On the Nile");
		pst.setString(3, "Agatha Christie");
		pst.setString(4,"1937");
		pst.setString(5, "Demi");
		pst.setString(6,"16/09/2023");
		pst.setString(7,"02/02/2024");
		pst.setInt(8, 0);
		pst.setString(9, "Mr.David");

		pst.setInt(1, 5);
		pst.setString(2,"Emily Dickinson: Autobiography");
		pst.setString(3, "Emily Dickinson");
		pst.setString(4,"1886");
		pst.setString(5, "Alex");
		pst.setString(6,"23/10/2023");
		pst.setString(7,"15/03/2024");
		pst.setInt(8, 50);
		pst.setString(9, "Mr.John");
		
		pst.setInt(1, 6);
		pst.setString(2,"Romeo & Juliet");
		pst.setString(3, "William Shakesphere");
		pst.setString(4,"1623");
		pst.setString(5, "Stefi");
		pst.setString(6,"23/10/2023");
		pst.setString(7,"15/03/2024");
		pst.setInt(8, 100);
		pst.setString(9, "Mr.John");
		
		pst.setInt(1, 7);
		pst.setString(2,"Macbeth");
		pst.setString(3, "William Shakesphere");
		pst.setString(4,"1623");
		pst.setString(5, "Luke");
		pst.setString(6,"25/11/2023");
		pst.setString(7,"13/04/2024");
		pst.setInt(8, 0);
		pst.setString(9, "Mr.David");

		pst.setInt(1, 8);
		pst.setString(2,"DaVinci Code");
		pst.setString(3, "Dan Brown");
		pst.setString(4,"2003");
		pst.setString(5, "Luke");
		pst.setString(6,"25/11/2023");
		pst.setString(7,"13/04/2024");
		pst.setInt(8, 0);
		pst.setString(9, "Mr.David");

		pst.setInt(1, 9);
		pst.setString(2,"Harry Potter & The Half Blood Prince");
		pst.setString(3, "J.K Rowling");
		pst.setString(4,"2007");
		pst.setString(5, "Louis");
		pst.setString(6,"25/11/2023");
		pst.setString(7,"13/04/2024");
		pst.setInt(8, 100);
		pst.setString(9, "Mr.John");
		
		pst.setInt(1, 10);
		pst.setString(2,"The Alchemist");
		pst.setString(3, "Paulo Coelho");
		pst.setString(4,"1988");
		pst.setString(5, "Sam");
		pst.setString(6,"25/11/2023");
		pst.setString(7,"13/04/2024");
		pst.setInt(8, 50);
		pst.setString(9, "Mr.John");
		pst.setInt(1, 11);
		pst.setString(2,"A tale of Two Cities");
		pst.setString(3, "Charles Dickens");
		pst.setString(4,"1859");
		pst.setString(5, "Lauren");
		pst.setString(6,"25/11/2023");
		pst.setString(7,"13/04/2024");
		pst.setInt(8, 0);
		pst.setString(9, "Mr.David");
		
		
		
		
		

		
		
	
		
		pst.executeUpdate();
		System.out.println("Insert complete");
		con.close();
		
		
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		insertdata();
	}

}
