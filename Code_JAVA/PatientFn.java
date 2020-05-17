package Group_10_OOP;

import java.util.Scanner;

class PatientFN extends Human{
    String tag; // âm tính hoặc dương tính
    long numberOfPeople;
    String hometown;
    String dateStartQuanrantine;
    String dateEndQuanrantine;
    String healthCondition;
    long noOfPatient;


    @Override
    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên người bệnh FN: ");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi FN: ");
        this.age = sc.nextInt(); sc.skip("\n");
        System.out.println("Nhập giới tính FN: ");
        this.gender = sc.nextLine();
        System.out.println("Nhập địa chỉ FN: ");
        this.address = sc.nextLine();
        System.out.println("Nhập quốc tịch");
        this.hometown = sc.nextLine();
        System.out.println("Nhập tag FN: ");
        this.tag = sc.nextLine();
        System.out.println("Nhập số người mà FN tiếp xúc: ");
        this.numberOfPeople = sc.nextLong(); sc.skip("\n");
        System.out.println("Nhập ngày bắt đầu cách ly của FN: ");
        this.dateStartQuanrantine = sc.nextLine();
        System.out.println("Nhập ngày kết thúc cách ly của FN: ");
        this.dateEndQuanrantine = sc.nextLine();
        System.out.println("Nhập tình trạng sức khỏe hiện tại của FN: ");
        this.healthCondition = sc.nextLine();
        System.out.println("Nhập số thứ tự bệnh nhân: ");
        this.noOfPatient = sc.nextLong(); sc.skip("\n");
    }

    @Override
    void Output() {
        System.out.println("Tên người bệnh FN: " + this.name);
        System.out.println("Tuổi FN: " + this.age);
        System.out.println("Giới tính FN: " + this.gender);
        System.out.println("Địa chỉ FN: " + this.address);
        System.out.println("Quốc tịch: " + this.hometown);
        System.out.println("Tag FN: " + this.tag);
        System.out.println("Số người mà FN tiếp xúc: " + this.numberOfPeople);
        System.out.println("Ngày bắt đầu cách ly của FN: " + this.dateStartQuanrantine);
        System.out.println("Ngày kết thúc cách ly của FN: " + this. dateEndQuanrantine);
        System.out.println("Tình trạng sức khỏe hiện tại của FN: " + this.healthCondition);
        System.out.println("Số thứ tự bệnh nhân: " + this.noOfPatient);
    }

    String GetHealth(){
        return this.healthCondition;
    }

    boolean IsPositive(){
        boolean flag = false;
        switch (this.healthCondition){
            case "tốt":
                tag = "Không nhiễm bệnh.";
                flag = true;
                break;
            case "khá":
                tag = "Có nguy cơ nhiễm.";
                flag = false;
                break;
            case "tệ":
                tag = "Đã nhiễm";
                flag = false;
                break;
        }
        return flag;
    }

    boolean IsQuarantine(){
        return IsPositive(); //true là không nhiễm, false là đã nhiễm
    }

    boolean IsEndQuarantine(){
        if(this.dateEndQuanrantine == "Hết cách ly" && IsPositive())
            return true; //đc ra
        else System.out.println("Gia hạn thêm cách ly để theo dõi thêm.");
        return false;
    }
    
    boolean isContactWithF0() {
    	boolean flag = false;
    	PatientF0 patient = new PatientF0();
    	System.out.println("Có ba trường hợp tương ứng là có, tiếp xúc trung gian và không.");
    	System.out.println("Người này có tiếp xúc với bệnh nhân số: " + patient.noOfPatient);
        switch (this.healthCondition){
            case "có":
                tag = "Đưa đi xét nghiệm";
                flag = true;
                break;
            case "tiếp xúc trung gian":
                tag = "Đưa đi xét nghiệm.";
                flag = false;
                break;
            case "không":
                tag = "Theo dõi 14 ngày";
                flag = false;
                break;
        }
        return flag;
    }
}
