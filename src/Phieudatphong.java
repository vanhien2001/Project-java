import java.util.Scanner;

public class Phieudatphong {
    Customer customer;
    List_rooms arrRooms;
    String a;
    Scanner sc = new Scanner(System.in);

    public Phieudatphong(List_rooms arrRooms) {
        this.arrRooms = arrRooms;
    }

    public Phieudatphong(Customer customer, List_rooms arrRooms) {
        this.customer = customer;
        this.arrRooms = arrRooms;
    }

    public void Dat_phong() {
        arrRooms.Xuatdsphongtrong();
        System.out.print("Moi ban chon phong : ");
        a = sc.nextLine();
        if (arrRooms.Timkiemphong(a).booked = false) {
            arrRooms.Timkiemphong(a).booked = true;
        } else {
            System.out.println("Ten phong khong dung");
        }
        customer = new Customer();
        customer.nhap_thontin();
    }

    public void Xuat_thong_tin() {
        customer.xuatthongtin();
        arrRooms.Timkiemphong(a).xuatthongtin();
    }
}
