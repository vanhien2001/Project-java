import java.util.Scanner;

public class Manager extends Person {
    Scanner sc = new Scanner(System.in);

    public Manager() {
        super();
    }

    public Manager(String id, String name, Time dayBegin) {
        super(id, name, dayBegin);
    }

    public void Nhapthongtin() {
        super.Nhapthongtin();
    }

    @Override
    public void Xuat_thong_tin() {
        System.out.printf("| %-10s%-9s%-25s%-25s%-15s%15d000 d |\n", "Quan ly", id, name, "Quan ly khach san", dayBegin,
                salary);
    }
}
