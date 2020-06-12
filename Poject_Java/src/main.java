public class main {
    public static void main(String[] args) {
        PatientF0 f0 = new PatientF0();
        f0.Input();
        f0.Output();

        System.out.println("====================");


        PatientFN fN = new PatientFN();
        System.out.println("Nhap: ");
        fN.Input();
        fN.Output();

    }
}
