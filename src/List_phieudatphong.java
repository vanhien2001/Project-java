import java.util.Scanner;

public class List_phieudatphong {
    List_rooms arrRoom;
    List_dichvu dichvu;
    Phieudatphong[] arrBooked;
    Scanner sc = new Scanner(System.in);
    Phieudatphong a;
    int n=0;

    public List_phieudatphong(List_rooms arrRoom, List_dichvu dichvu) {
        this.arrRoom = arrRoom;
        this.dichvu = dichvu;
        arrBooked = new Phieudatphong[100];
    }

    public void Dat_phong(List_rooms arrRoom) {
        a = new Phieudatphong(arrRoom, dichvu);
        a.Dat_phong(arrRoom);
        a.Su_dung_dichvu();
        arrBooked[n] = a;
        n++;
    }

    public void Xuatdsphieu(List_rooms arrRoom) {
        for (Phieudatphong booked : arrBooked) {
            booked.Xuat_thong_tin();
        }
    }

}