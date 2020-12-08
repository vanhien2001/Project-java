import java.util.Scanner;
import java.util.Arrays;

public class Phieudatphong {
    List_rooms arrRoom;
    Customer customer;
    String tenphong, tendichvu;
    int solan;
    Dichvu[] arr_dichvu = new Dichvu[0];
    int s = 0, x, n = 0;
    Scanner sc = new Scanner(System.in);

    public Phieudatphong(List_rooms arrRoom, List_dichvu dichvu) {
        this.arrRoom = arrRoom;
        customer = new Customer();
        tenphong = null;
        tendichvu = null;
    }

    public void ThongtinKhachhang() {
        customer.nhap_thontin();
    }

    public void Dat_phong(List_rooms arrRoom) {
        boolean kt = false;
        arrRoom.Xuatdsphongtrong();
        System.out.print("Moi ban chon phong : ");
        tenphong = sc.nextLine();
        for (int i = 0; i < arrRoom.arrRooms.length; i++) {
            if (arrRoom.arrRooms[i].tenphong.equalsIgnoreCase(tenphong) && !arrRoom.arrRooms[i].booked) {
                arrRoom.arrRooms[i].booked = true;
                kt = true;
                ThongtinKhachhang();
                System.out.println("Dat phong thanh cong");
                break;
            }
        }
        if (!kt) {
            System.out.println("Ten phong khong dung !");
        }
        this.arrRoom = arrRoom;
    }

    public void Su_dung_dichvu(List_dichvu dichvu) {
        boolean kt = false;
        dichvu.Xuatdsdichvu();
        System.out.print("Moi ban chon dich vu : ");
        tendichvu = sc.nextLine();
        while (!tendichvu.isEmpty()) {
            for (Dichvu arr : dichvu.arrs) {
                if (arr.tendichvu.equalsIgnoreCase(tendichvu)) {
                    arr_dichvu = Arrays.copyOf(arr_dichvu, n + 1);
                    arr_dichvu[n] = arr;
                    System.out.print("So lan su dung : ");
                    solan = sc.nextInt();
                    arr_dichvu[n].solan = solan;
                    kt = true;
                    n++;
                }
            }
            if (!kt) {
                System.out.println("Ten dich vu khong dung !");
            }
            sc.nextLine();
            System.out.print("Moi ban chon tiep dich vu : ");
            tendichvu = sc.nextLine();
        }
    }

    public int Tongtien() {
        for (Dichvu dv : arr_dichvu) {
            s += dv.Tongtien();
        }
        s += arrRoom.Timkiemphong(tenphong).gia;
        return s;
    }

    public void Xuat_thong_tin_dichvu() {
        for (Dichvu arr : arr_dichvu) {
            arr.xuatthongtin();
        }
    }

    public void Xuat_thong_tin_khachhang() {
        customer.xuatthongtin();
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public void Xuat_thong_tin() {
        System.out.println("|                                                            |");
        System.out.printf("|%-40s%-20s|\n", " Khach hang : " + customer.name, "cmnd: " + customer.cmnd);
        System.out.printf("|%-60s|\n", " Dia chi : " + customer.address);
        System.out.printf("|%-60s|\n", " Da dat phong : " + tenphong);
        System.out.printf("|%-60s|\n", " Su dung cac dich vu : ");
        System.out.printf("|%-20s%20s%20s|\n", " Ten dich vu", "Gia", "");
        Xuat_thong_tin_dichvu();
    }
}
