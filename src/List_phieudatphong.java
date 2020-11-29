import java.util.Arrays;
import java.util.Scanner;

public class List_phieudatphong {
    Phieudatphong[] arrBooked;
    Scanner sc = new Scanner(System.in);

    public List_phieudatphong() {
        arrBooked = new Phieudatphong[0];
    }

    public void Dat_phong() {
        Phieudatphong a;
        arrBooked = Arrays.copyOf(arrBooked, arrBooked.length + 1);
        a.Dat_phong();
        arrBooked[arrBooked.length - 1] = a;
    }

    public void Xuatdsphieu() {
        for (Phieudatphong booked : arrBooked) {
            booked.Xuat_thong_tin();
        }
    }

}