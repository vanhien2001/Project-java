import java.util.Scanner;

public class Hoadon {
    int s = 0;
    Scanner sc = new Scanner(System.in);

    public Hoadon() {
        s = 0;
    }

    public void Xuat_hoa_don(List_phieudatphong arrs) {
        System.out.print("\nMoi ban nhap cmnd : ");
        String cmnd = sc.nextLine();
        for (Phieudatphong arr : arrs.arrBooked) {
            if (arr.customer.cmnd.equalsIgnoreCase(cmnd)) {
                System.out.println("\n*------------------------------------------------------------*");
                System.out.println("|                          HOA DON                           |");
                System.out.println("|                                                            |");
                System.out.printf("|%-40s%-20s|\n", " Khach hang : " + arr.customer.name, "cmnd: " + arr.customer.cmnd);
                System.out.printf("|%-60s|\n", " Dia chi : " + arr.customer.address);
                System.out.printf("|%-60s|\n", " Da dat phong : " + arr.tenphong);
                System.out.printf("|%-60s|\n", " Su dung cac dich vu : ");
                System.out.printf("|%-20s%30s%10s|\n", " Ten dich vu", "Gia", "");
                arr.Xuat_thong_tin_dichvu();
                s = arr.Tongtien();
                System.out.printf("|%-60s|\n", " Tong tien la : " + s + "000 d");
                arr.arrRoom.Timkiemphong(arr.tenphong).booked = false;
                System.out.println("*------------------------------------------------------------*\n");
            }
        }
    }
}
