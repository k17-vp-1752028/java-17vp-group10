import java.util.Scanner;

abstract class Human {
    protected String name;
    protected int age;
    protected String gender;
    protected String address;

    abstract void Input();
    abstract void Output();
}

//////////////////////////////////////

class PatientF0 extends Human{
    String tag;
    long noOfPeople;
    String dateStartQuanrantine;
    String dateEndQuanrantine;
    String healthCondition;


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
//        System.out.println("Nhập tag F0: ");
//        this.tag = sc.nextLine();
        System.out.println("Nhập số người mà F0 tiếp xúc: ");
        this.noOfPeople = sc.nextLong(); sc.skip("\n");
        System.out.println("Nhập ngày bắt đầu cách ly của F0: ");
        this.dateStartQuanrantine = sc.nextLine();
        System.out.println("Nhập ngày kết thúc cách ly của F0: ");
        this.dateEndQuanrantine = sc.nextLine();
        System.out.println("Nhập tình trạng sức khỏe hiện tại của F0: ");
        this.healthCondition = sc.nextLine();
    }
////////////////////////////////////////////////////////////////

    @Override
    void Output() {
        System.out.println("Tên người bệnh F0: " + this.name);
        System.out.println("Tuổi F0: " + this.age);
        System.out.println("Giới tính F0: " + this.gender);
        System.out.println("Địa chỉ F0: " + this.address);
//        System.out.println("Tag F0: " + this.tag);
        System.out.println("Số người mà F0 tiếp xúc: " + this.noOfPeople);
        System.out.println("Ngày bắt đầu cách ly của F0: " + this.dateStartQuanrantine);
        System.out.println("Ngày kết thúc cách ly của F0: " + this. dateEndQuanrantine);
        System.out.println("Tình trạng sức khỏe hiện tại của F0: " + this.healthCondition);
    }
////////////////////////////////////////////////////////////////

    boolean IsPositive(){
        boolean flag = false;
        switch (this.healthCondition){
            case "Tốt":
                tag = "Không nhiễm bệnh.";
                flag = true;
                break;
            case "Khá":
                tag = "Có nguy cơ nhiễm.";
                flag = false;
                break;
            case "Tệ":
                tag = "Đã nhiễm";
                flag = false;
                break;
            default:
                System.out.println("Cần xem xét thêm.");
                flag = false;
        }
        return flag;
    }
////////////////////////////////////////////////////////////////

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



////////////////////////////////////////
class PatientFN extends Human{
    String tag; // âm tính hoặc dương tính
    long numberOfPeople;
    String dateStartQuanrantine;
    String dateEndQuanrantine;
    String healthCondition;
////////////////////////////////////////////////////////////////


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
    }
////////////////////////////////////////////////////////////////

    @Override
    void Output() {
        System.out.println("Tên người bệnh FN: " + this.name);
        System.out.println("Tuổi FN: " + this.age);
        System.out.println("Giới tính FN: " + this.gender);
        System.out.println("Địa chỉ FN: " + this.address);
        System.out.println("Tag FN: " + this.tag);
        System.out.println("Số người mà FN tiếp xúc: " + this.numberOfPeople);
        System.out.println("Ngày bắt đầu cách ly của FN: " + this.dateStartQuanrantine);
        System.out.println("Ngày kết thúc cách ly của FN: " + this. dateEndQuanrantine);
        System.out.println("Tình trạng sức khỏe hiện tại của FN: " + this.healthCondition);
    }

    String GetHealth(){
        return this.healthCondition;
    }

    boolean IsPositive(){
        boolean flag = false;
        switch (this.healthCondition){
            case "Tốt":
                tag = "Không nhiễm bệnh.";
                flag = true;
                break;
            case "Khá":
                tag = "Có nguy cơ nhiễm.";
                flag = false;
                break;
            case "Tệ":
                tag = "Đã nhiễm";
                flag = false;
                break;
            default:
                System.out.println("Cần xem xét thêm.");
                flag = false;
        }
        return flag;
    }
////////////////////////////////////////////////////////////////

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
