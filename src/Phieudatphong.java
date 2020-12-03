import java.util.Scanner;
import java.util.Arrays;

public class Phieudatphong {
    List_rooms arrRoom;
    List_dichvu dichvu;
    Customer customer;
    String tenphong, tendichvu;
    int solan;
    Dichvu[] arr_dichvu = new Dichvu[0];;
    int s = 0,x;
    Scanner sc = new Scanner(System.in);

    public Phieudatphong(List_rooms arrRoom, List_dichvu dichvu) {
        this.arrRoom = arrRoom;
        this.dichvu = dichvu;
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
            System.out.println("Ten phong khong dung vui long nhap lai : " + kt);
            this.Dat_phong(arrRoom);
        }
        this.arrRoom = arrRoom;
    }

    public void Su_dung_dichvu() {
        dichvu.Xuatdsdichvu();
        System.out.print("Ban co muon chon tiep dich vu (Nhan 1 de su dung them dich vu, nhan so bat ki de bo qua) ");
        x = Integer.parseInt(sc.nextLine());
        if (x == 1) {
            System.out.print("Moi ban chon dich vu : ");
            tendichvu = sc.nextLine();
            for (Dichvu arr : dichvu.arrs) {
                if (arr.tendichvu.equalsIgnoreCase(tendichvu)) {
                    arr_dichvu = Arrays.copyOf(arr_dichvu, arr_dichvu.length + 1);
                    arr_dichvu[arr_dichvu.length - 1] = arr;
                    System.out.print("So lan su dung : ");
                    solan = sc.nextInt();
                    arr_dichvu[arr_dichvu.length - 1].solan = solan;
                }
            }
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
        Xuat_thong_tin_khachhang();
        System.out.println("Phong :" + getTenphong());
        Xuat_thong_tin_dichvu();
    }
}
