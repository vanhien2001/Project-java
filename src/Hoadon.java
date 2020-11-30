import java.util.Scanner;
public class Hoadon {
    int s=0;
    Scanner sc = new Scanner(System.in);

    public Hoadon() {
        s=0;
    }

    public void Xuat_hoa_don( List_phieudatphong arrs) {
        System.out.print("Moi ban nhap cmnd : ");
        String cmnd = sc.nextLine();
        for (Phieudatphong arr : arrs.arrBooked) {
            if (arr.customer.cmnd == cmnd) {
                System.out.println("Khach hang : " + arr.customer.name);
                System.out.println("Da dat phong : " + arr.tenphong);
                System.out.println("Su dung cac dich vu : ");
                arr.Xuat_thong_tin_dichvu();
                s = arr.Tongtien();
                System.out.println("Tong tien la : "+s);
            }
        }
    }
}
