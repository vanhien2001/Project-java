import java.util.Scanner;

public class Phieudatphong {
    List_rooms arrRoom;
    List_dichvu dichvu;
    Customer customer;
    String tenphong, tendichvu;
    int solan, n;
    Dichvu[] arr_dichvu;
    int s=0;
    Scanner sc = new Scanner(System.in);

    public Phieudatphong(List_rooms arrRoom,List_dichvu dichvu) {
        this.arrRoom=arrRoom;
        this.dichvu=dichvu;
        customer = new Customer();
        tenphong = null;
        tendichvu = null;
        arr_dichvu = null;
        n = 0;
    }

    public void ThongtinKhachhang() {
        customer.nhap_thontin();
    }

    public void Dat_phong(List_rooms arrRoom) {
        boolean kt = false;
        arrRoom.Xuatdsphongtrong();
        System.out.print("Moi ban chon phong : ");
        tenphong = sc.nextLine();
        for (Room arr : arrRoom.arrRooms) {
            if (arr.tenphong == tenphong && arr.booked == false) {
                arr.booked = true;
                kt = true;
                ThongtinKhachhang();
                break;
            }
        }
        if (!kt) {
            System.out.println("Ten phong khong dung vui long nhap lai :");
            this.Dat_phong(arrRoom);
        }
        this.arrRoom=arrRoom;
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
            System.out.print("Moi ban chon tiep dich vu : ");
            tendichvu = sc.nextLine();
        }
    }
    public int Tongtien(){
        for (Dichvu dv : arr_dichvu) {
            s+=(dv.gia*dv.solan);
        }
        s+=arrRoom.Timkiemphong(tenphong).gia;
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
    public void Xuat_thong_tin(){
        Xuat_thong_tin_khachhang();
        System.out.println("Phong :"+getTenphong());
        Xuat_thong_tin_dichvu();
    }
}
