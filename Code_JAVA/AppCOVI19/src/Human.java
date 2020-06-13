import java.time.LocalDate;
import java.util.LinkedList;

class Human {
	private String id;
	private String name;
    private byte age;
    private String gender;
    private String address;
    private String SDT;
    private String nationality;
    
    private String Type;
    
    private String DayStart;
    private String DayEnd;
    
    private LinkedList<String> Reason;
    private LinkedList<String> Connect;
    
 
    Human(String id, String name, byte a, String g, String ad, String sdt, String na, String t, String st, String end){
    	this.id = id;
    	this.name = name;
    	this.age = a;
    	this.gender = g;
    	this.address = ad;
    	this.SDT = sdt;
    	this.nationality = na;
    	this.Type = t;
    	this.DayStart = st;
    	this.DayEnd = end;
    	
    	this.Reason = new LinkedList<String>();
    	this.Connect = new LinkedList<String>();
    }
    
    //=======================ADD=============================================
    void AddReason(String r) {
    	this.Reason.add(r);
    }
    
    void AddConnect(String c) {
    	this.Connect.add(c);
    }
    
    //=======================EXCUSIVE========================================
    void Print() {
    	System.out.println(this.id);
    }
    
    boolean CheckUser(String user) {
    	if (this.Compare(this.id, user) == true)
    		return true;
    	else
    		return false;
    }
    
    boolean CheckPass(String pass) {
    	if (this.Compare(this.SDT, pass))
    		return true;
    	else
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
    
    //=======================SET=============================================
    void SetReason(LinkedList<String> r) {
    	this.Reason = r;
    }
    
    void SetConnect(LinkedList<String> c) {
    	this.Connect = c;
    }
    
    void SetType(String t) {
    	this.Type = t;
    }
    
    //======================GET================================================
    LinkedList<String> GetReason() {
    	return this.Reason;
    }
    
    LinkedList<String> GetConnect() {
    	return this.Connect;
    }
    
    String GetType() {
    	return this.Type;
    }
    
    String GetID() {
    	return this.id;
    }
    
    String GetName() {
    	return this.name;
    }
    String GetGen() {
    	return this.gender;
    }
    
    byte GetAge() {
    	return this.age;
    }
    
    String GetAd() {
    	return this.address;
    }
    
    String GetNa() {
    	return this.nationality;
    }
    
    String GetSDT() {
    	return this.SDT;
    }
    
    String GetDaySt() {
    	
    	return this.DayStart;
    }
    
    String GetDayEnd() {
    	return this.DayEnd;
    }
}
