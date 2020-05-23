package Group_10_OOP;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class PatientF0 extends Group_10_OOP.Human {
    String name;
    static int id;
    int age;
    String address;
    String gender;
    LocalDate dateStartQuarantine;
    LocalDate dateExpectEndQuarantine;
    String nationality;
    String career;
    String workSpace;
    String locationHaveGone;
    int level;
    int noOfPeople;



    @Override
    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên F0: ");
        name = sc.nextLine();
        id++;
        System.out.println("Tuổi: ");
        age = sc.nextInt(); sc.skip("\n");
        System.out.println("Địa chỉ: ");
        address = sc.nextLine();
        System.out.println("Giới tính: ");
        gender = sc.nextLine();
        System.out.println("Ngày bắt đầu cách ly: ");
        dateStartQuarantine = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());//year,month,day
        System.out.println("Ngày dự định sẽ kết thúc cách ly: ");
        dateExpectEndQuarantine = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());//year,month,day
        System.out.println("Quốc tịch: ");
        nationality = sc.nextLine();
        System.out.println("Nghề nghiệp: ");
        career = sc.nextLine();
        System.out.println("Nơi làm việc: ");
        workSpace = sc.nextLine();
        System.out.println("Những nơi đã đến trong 1 tháng trước khi phát bệnh: ");
        locationHaveGone = sc.nextLine();
        System.out.println("Tình trạng: ");
        level = sc.nextInt(); sc.skip("\n");
        System.out.println("Số người đã tiếp xúc: ");
        noOfPeople = sc.nextInt();
    }

    @Override
    void Output() {
        System.out.println("Họ tên F0: " + name);
        System.out.println("ID: " + id);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Giới tính: " + gender);
        System.out.println("Ngày bắt đầu cách ly: " + dateStartQuarantine);
        System.out.println("Ngày dự định sẽ kết thúc cách ly: " + dateExpectEndQuarantine);
        System.out.println("Quốc tịch: " + nationality);
        System.out.println("Nghề nghiệp: " + career);
        System.out.println("Nơi làm việc: " + workSpace);
        System.out.println("Những nơi đã đến trong 1 tháng trước khi phát bệnh: " + locationHaveGone);
        System.out.println("Tình trạng: " + level);
        System.out.println("Số người đã tiếp xúc: " + noOfPeople);
    }

}
