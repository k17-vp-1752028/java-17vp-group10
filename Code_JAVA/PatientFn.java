package Group_10_OOP;

import java.time.LocalDate;
import java.util.Scanner;

class PatientFn extends PatientF0 {
    String relationShip;

    PatientFn(){
        super();
    }

    PatientFn(String na, int ag, String add, LocalDate start, LocalDate end, String nat, String car, String work, String lo, int lev, int num, String rel) {
        super(na, ag, add, start, end, nat, car, work, lo, lev, num);
        relationShip = rel;
    }
    
    void Input(){
        Scanner scanner = new Scanner(System.in);
        super.Input();
        System.out.println("Nhập mối quan hệ với F0: ");
        relationShip = scanner.nextLine();
    }
}
