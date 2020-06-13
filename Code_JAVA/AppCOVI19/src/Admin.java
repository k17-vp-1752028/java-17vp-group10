import java.sql.*;
import java.util.ArrayList;

public class Admin {
	private Human[] Person;
	private ArrayList<String> ID = new ArrayList<>();
	private long AmountF0 = 0;
	private long AmountF1 = 0;
	private long AmountIsole = 0;
	private long AmountGuegi = 0;
	private long AmountNormal = 0;
	
	String connectionUrl = "jdbc:sqlserver://ACHILLE;databaseName=Project_Java_NCOVI";
	String user = "sa";
	String pass = "123";
	
	Admin(){
		try {
			Connection con = DriverManager.getConnection(connectionUrl, user, pass);
			System.out.println("connected!!");
			
			String sql = "SELECT * FROM Person";
			
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(sql);
			
			//Get amount
			int count = 0;
			while(result.next()) {
				count++;
			}
			
			//==============================================
			st = con.createStatement();
			result = st.executeQuery(sql);
			this.Person = new Human[count];
			int temp = 0;
			
			//SET UP DATA TO JAVA
			while(result.next()) {
				String ID = result.getString("ID");
				String name = result.getString("Ho_Ten");
				byte age = result.getByte("Tuoi");
				String gender = result.getString("Gender");
				String add = result.getNString("Dia_Chi");
				String phone = result.getString("Dien_Thoai");
				String nation = result.getString("Nation");
				String status = result.getString("Type_De_Sante");
				String enter = result.getString("Ngay_Cach_Ly");
				String out = result.getString("Ngay_Het_Cach_Ly");
				
				System.out.println(ID + " : " + name + " | " + 
						add + " | " + phone + " | " + status
						+ " | " + enter + " | " + out);
				
				this.Person[temp] = new Human(ID, name, age, gender, add, phone, nation, status, enter, out);
				temp++;
			}
			
			//THONG KE SO LUONG 
			for(int i = 0; i < count; i ++) {
				if(this.Compare(this.Person[i].GetType(), "NORMAL"))
					this.AmountNormal++;
				
				if(this.Compare(this.Person[i].GetType(), "F0"))
					this.AmountF0++;
				
				if(this.Compare(this.Person[i].GetType(), "F1"))
					this.AmountF1++;
				
				if(this.Compare(this.Person[i].GetType(), "ISOLEE"))
					this.AmountIsole++;
				
				if(this.Compare(this.Person[i].GetType(), "GUEGI"))
					this.AmountGuegi++;
			}
		
			
			//set IDLIST
			this.SetIDList();
			
			//
			
			for(int i = 0; i < this.Person.length; i++)
			{
				sql = "SELECT * FROM Connect_Person WHERE Connect_Person.ID_Reason = '" + (String)this.Person[i].GetID() + "'";
				st = con.createStatement();
				ResultSet result2 = st.executeQuery(sql);
				
				while(result2.next()) {
					String id = result2.getString("ID_Connect");
					
					this.Person[i].AddConnect(id);
				}
				
				
				sql = "SELECT * FROM Connect_Person WHERE Connect_Person.ID_Connect = '" + (String)this.Person[i].GetID() + "'";
				st = con.createStatement();
				result = st.executeQuery(sql);
				
				while(result.next()) {
					String id = result.getString("ID_Reason");
					
					this.Person[i].AddReason(id);
				}
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("OPPS, THERE'S AN ERROR!!");
			e.printStackTrace();
		}
	}
	
	//=====================CHECK-ACCOUNT-PASS=========================
	boolean CheckAcPas(String user, String pass) {
		for (int i = 0; i < this.Person.length; i++) {
			if(this.Person[i].CheckUser(user) == true)
				if(this.Person[i].CheckPass(pass) == true)
					return true;
		}
		
		return false;
	}
	
	boolean CheckAc(String user) {
		for (int i = 0; i < this.Person.length; i++) {
			if(this.Person[i].CheckUser(user) == true)
				return true;
		}
		
		return false;
	}
	
	 boolean Compare(String a, String b) {
			if(a.length() != b.length()) 
				return false;
			
			for(int i = 0; i < a.length(); i++)
				if(a.charAt(i) != b.charAt(i))
					return false;
		
			return true;
		}
	 
	//======================EXCUTIVE=================================
	 void SetIDList() {
		 for(int i  = 0; i <  this.Person.length; i++) {
			 this.ID.add(this.Person[i].GetID());
		 }
	 }
	
	//======================SET=======================================
	
	
	
	//======================GET=======================================
	long GetF0() {
		return this.AmountF0;
	}
	
	long GetF1() {
		return this.AmountF1;
	}
	
	long GeIsole() {
		return this.AmountIsole;
	}
	
	long GetGuegi() {
		return this.AmountGuegi;
	}
	
	long GetNor() {
		return this.AmountNormal;
	}
	
	ArrayList<String> GetIDList(){
		return this.ID;
	}
	
	Human[] GetList() {
		return this.Person.clone();
	}
	//=================================================================
//	public static void main(String[] args) {
//		Admin a = new Admin();
//	}
}
