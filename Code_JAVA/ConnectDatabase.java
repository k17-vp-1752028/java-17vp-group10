import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDatabase {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String connectionUrl = "jdbc:sqlserver://ACHILLE;databaseName=Project_Java_NCOVI";
		
		String user = "sa";
		String pass = "123";
		
		try {
			Connection con = DriverManager.getConnection(connectionUrl, user, pass);
			System.out.println("connected!!");

////////////////////////////////////////////////////////////////

			String sql = "SELECT * FROM Personnes";
			
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(sql);
			
			
			int count = 0;
			while(result.next()) {
				count++;
				int ID = result.getInt("ID");
				String name = result.getNString("Ho_Ten");
				String add = result.getNString("Dia_Chi");
				String phone = result.getString("Dien_Thoai");
				String status = result.getString("Type_De_Sante");
				int idRes = result.getInt("ID_Reason_Per");
				int idCon = result.getInt("ID_Per_Contac");
				String enter = result.getString("Ngay_Cach_Ly");
				String out = result.getString("Ngay_Het_Cach_Ly");
						
				System.out.println(ID + " : " + name + " | " + 
						add + " | " + phone + " | " + status
						+ " | " + idRes + " | " + idCon
						+ " | " + enter + " | " + out);
			}
				
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("OPPS, THERE'S AN ERROR!!");
			e.printStackTrace();
		}
		
		
	}

}
