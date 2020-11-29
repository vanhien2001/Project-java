import java.util.Scanner;

public class Phieudatphong {
    Customer customer;
    List_rooms arrRooms;
    List_dichvu dichvu;
    String tenphong, tendichvu;
    int solan, n = 0;
    Dichvu[] arr_dichvu;
    Scanner sc = new Scanner(System.in);

    public Phieudatphong(List_rooms arrRooms, List_dichvu dichvu) {
        this.arrRooms = arrRooms;
        this.dichvu = dichvu;
    }

    public void ThongtinKhachhang() {
        customer = new Customer();
        customer.nhap_thontin();
    }

    public void Dat_phong() {
        arrRooms.Xuatdsphongtrong();
        System.out.print("Moi ban chon phong : ");
        tenphong = sc.nextLine();
        if (arrRooms.Timkiemphong(tenphong).booked = false) {
            arrRooms.Timkiemphong(tenphong).booked = true;
        } else {
            System.out.println("Ten phong khong dung");
        }
    }

    public void Su_dung_dichvu() {
        arr_dichvu = new Dichvu[n];
        dichvu.Xuatdsdichvu();
        System.out.print("Moi ban chon dich vu : ");
        tendichvu = sc.nextLine();
        while (tendichvu != null) {
            for (Dichvu arr : dichvu.arrs) {
                if (arr.tendichvu == tendichvu) {
                    arr_dichvu[n++] = arr;
                    System.out.print("So lan su dung : ");
                    solan = sc.nextInt();
                    arr_dichvu[n].solan = solan;
                }
            }
            System.out.println("Dich vu khong co");
            System.out.print("Moi ban chon tiep dich vu : ");
            tendichvu = sc.nextLine();
        }
    }

    public void Xuat_thong_tin() {
        customer.xuatthongtin();
        arrRooms.Timkiemphong(tenphong).xuatthongtin();
        for (Dichvu arr : dichvu.arrs) {
            arr.xuatthongtin();
        }
    }
}
