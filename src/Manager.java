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
        System.out.printf("%-20s%-20s%-25s%-25s%-20s%15d000 d\n", "Quan ly", id, name, "quan ly khac san", dayBegin,
                salary);
    }
}
