import java.sql.*;


public class DB_Connect {
	
	public static void main(String[] args) {
		
		Connection con;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost/PunchrBase", "root", null);
			System.out.println("Database Connected");
			
			PreparedStatement select = con.prepareStatement("Select * From Customers");
			ResultSet rs = select.executeQuery();
			while(rs.next()) {
				System.out.println("Punch Code = " + rs.getString("Punch_code"));
				System.out.println("First Name = " + rs.getString("FirstName"));
				System.out.println("Last Name = " + rs.getString("LastName"));
				System.out.println("E-Mail = " + rs.getString("Email"));
				System.out.println("Phone = " + rs.getString("Phone"));
			}
			
			con.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
