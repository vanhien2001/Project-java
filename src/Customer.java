import java.util.Scanner;

public class Customer {
    String name, sdt, cmnd;
    Address address;
    Scanner sc = new Scanner(System.in);

    public Customer() {
        name = null;
        sdt = null;
        cmnd = null;
        address = new Address();
    }

    public Customer(String name, String sdt, String cmnd, String so_nha, String duong, String phuong, String quan,
            String tinh) {
        this.name = name;
        this.sdt = sdt;
        this.cmnd = cmnd;
        address = new Address(so_nha, duong, phuong, quan, tinh);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setName() {
        System.out.println("Ho ten :");
        this.name = sc.nextLine();
    }

    public void setSdt() {
        System.out.println("Sdt :");
        this.sdt = sc.nextLine();
    }

    public void setCmnd() {
        System.out.println("Cmnd :");
        this.cmnd = sc.nextLine();
    }

    public void setDiachi() {
        address.nhap_thontin();
    }

    public void nhap_thontin() {
        System.out.println("Moi ban nhap thong tin thue phong :");
        setName();
        setSdt();
        setCmnd();
        setDiachi();
    }

    public void xuatthongtin() {
        System.out.printf("%-20s%-15s%-15s%-40s\n", name, sdt, cmnd, address);
    }
}
