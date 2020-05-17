package Group_10_OOP;
import java.util.Scanner;

class PatientF0 extends Human{
    String tag;
    String hometown;
    long noOfPeople;
    String dateStartQuanrantine;
    String dateEndQuanrantine;
    String healthCondition;
    long noOfPatient;

    @Override
    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên người bệnh F0: ");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi F0: ");
        this.age = sc.nextInt(); sc.skip("\n");
        System.out.println("Nhập giới tính F0: ");
        this.gender = sc.nextLine();
        System.out.println("Nhập địa chỉ F0: ");
        this.address = sc.nextLine();
        System.out.println("Nhập quốc tịch:");
        this.hometown = sc.nextLine();
        System.out.println("Nhập số người mà F0 tiếp xúc: ");
        this.noOfPeople = sc.nextLong(); sc.skip("\n");
        System.out.println("Nhập ngày bắt đầu cách ly của F0: ");
        this.dateStartQuanrantine = sc.nextLine();
        System.out.println("Nhập ngày kết thúc cách ly của F0: ");
        this.dateEndQuanrantine = sc.nextLine();
        System.out.println("Nhập tình trạng sức khỏe hiện tại của F0: ");
        this.healthCondition = sc.nextLine();
        System.out.println("Nhập số thứ tự bệnh nhân: ");
        this.noOfPatient = sc.nextLong(); sc.skip("\n");
    }

    @Override
    void Output() {
        System.out.println("Tên người bệnh F0: " + this.name);
        System.out.println("Tuổi F0: " + this.age);
        System.out.println("Giới tính F0: " + this.gender);
        System.out.println("Địa chỉ F0: " + this.address);
        System.out.println("Quốc tịch: " + this.hometown);
        System.out.println("Số người mà F0 tiếp xúc: " + this.noOfPeople);
        System.out.println("Ngày bắt đầu cách ly của F0: " + this.dateStartQuanrantine);
        System.out.println("Ngày kết thúc cách ly của F0: " + this. dateEndQuanrantine);
        System.out.println("Tình trạng sức khỏe hiện tại của F0: " + this.healthCondition);
        System.out.println("Số thứ tự bệnh nhân: " + this.noOfPatient);
    }

    boolean IsPositive(){
        boolean flag = false;
        switch (this.healthCondition){
            case "tốt":
                tag = "không nhiễm bệnh.";
                flag = true;
                break;
            case "Khá":
                tag = "có nguy cơ nhiễm.";
                flag = false;
                break;
            case "tệ":
                tag = "đã nhiễm";
                flag = false;
                break;
        }
        return flag;
    }

    String GetHealth(){
        return this.healthCondition;
    }

    long NumOfPeople(){
        return this.noOfPeople;
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
}
