import java.util.Scanner;

public class Manager extends Staff {
    transient Scanner sc = new Scanner(System.in);

    public Manager() {
        super();
        manager = true;
        chucvu = "Quan ly";
        posision = "Quan ly khach san";
    }

    public void Giang_cap() {
        manager = false;
        System.out.print("Cong viec : ");
        posision = sc.nextLine();
        chucvu = "Nhan vien";
    }

    public Manager(String name, String sdt, String cmnd, String so_nha, String duong, String phuong, String quan,
            String tinh, String id, String pass, Time dayBegin, int salary) {
        super(name, sdt, cmnd, so_nha, duong, phuong, quan, tinh, id, pass, dayBegin, salary, "Quan ly khach san");
        manager = true;
        chucvu = "Quan ly";
    }

    public void Nhapthongtin() {
        nhap_thontin();
        setId();
        setName();
        setDayBegin();
        setSalary();
    }

    public void Xuat_thong_tin() {
        System.out.printf("| %-15s%-15s%-25s%-25s%-15s%15d000d |\n", chucvu, id, name, posision, dayBegin, salary);
    }

    public void Xuat_thong_tin_chi_tiet() {
        System.out.println("\n*------------------------------------------------------------*");
        System.out.println("|                   THONG TIN NHAN VIEN                      |");
        System.out.println("|                                                            |");
        System.out.printf("|%-40s%-20s|\n", " Nhan vien : " + name, "cmnd: " + cmnd);
        System.out.printf("|%-60s|\n", " Sdt : " + sdt);
        System.out.printf("|%-60s|\n", " Dia chi : " + address);
        System.out.printf("|%-30s%-30s|\n", " Id : " + id, "pass: " + pass);
        System.out.printf("|%-40s%-20s|\n", " Cong viec : " + posision, "luong : " + String.valueOf(salary));
        System.out.printf("|%-60s|\n", " Thoi diem bat dau lam viec : " + dayBegin);
        System.out.println("|                                                            |");
        System.out.println("*------------------------------------------------------------*\n");
    }
}
