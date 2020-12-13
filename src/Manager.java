import java.util.Scanner;

public class Manager extends Person {
    transient Scanner sc = new Scanner(System.in);

    public Manager() {
        super();
        pass = "123";
    }

    public Manager(String id, String name, String pass, Time dayBegin, int salary) {
        super(id, name, pass, dayBegin, salary);
    }

    public void Nhapthongtin() {
        super.Nhapthongtin();
    }

    @Override
    public void Xuat_thong_tin() {
        System.out.printf("| %-15s%-15s%-25s%-25s%-15s%15d000d |\n", "Quan ly", id, name, "Quan ly khach san", dayBegin,
                salary);
    }
}
