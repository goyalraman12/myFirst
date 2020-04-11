package lesson1;
import java.sql.*;

public class jdbc {
	public static void main(String[] args) throws Exception
	{
		try{
			String url = "jdbc:mysql://localhost:3306/database1";
			String uname = "root";
			String pass = "Raman@7891";
			String query = "select name from users where Customer_Id = 1";
			
			// Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,uname,pass);
		
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);	
			
			rs.next();
		
			String name = rs.getString("name");
		
			System.out.println(name);
		
			st.close();
			con.close();
		}
		catch(Exception e){ System.out.println(e);}			
	}
}


