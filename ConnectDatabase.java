package net.codejava.sql;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDatabase {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String connectionUrl = "jdbc:sqlserver://ACHILLE;databaseName=Test";
		
		String user = "sa";
		String pass = "123";
		
		try {
			Connection con = DriverManager.getConnection(connectionUrl, user, pass);
			System.out.println("connected!!");

			/*String sql = "INSERT INTO info (Ten, SDT, Status)"
					+ "VALUES ('MINH', '123456789', 'DIE')";
			
			Statement st = con.createStatement();
			int rows = st.executeUpdate(sql);
			
			if(rows > 0) {
				System.out.println("Row has been inserted.");
			}*/
			
			/*
			String sql = "INSERT INTO info (Ten, SDT, Status)"
					+ "VALUES (?, ?, ?)";
					
			PreparedStatement pst = con.prepareStatement(sql);
			
			st.setString(1, "My");
			st.setString(2, "0967234907");
			st.setString(3, "NCOVI");
			
			int rows = pst.executeUpdate();
			
			if(rows > 0) {
				System.out.println("Row has been inserted.");
			}
			*/
			
			//==================================================================
			//==================================================================
			String sql = "SELECT * FROM info";
			
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(sql);
			
			
			int count = 0;
			while(result.next()) {
				count++;
				String name = result.getString("Ten");
				String phone = result.getString("SDT");
				String status = result.getString("Status");
				
				System.out.println(count + " : " + name + " | " + phone + " | " + status);
			}
				
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("OPPS, THERE'S AN ERROR!!");
			e.printStackTrace();
		}
		
		
	}

}
