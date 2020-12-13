import java.util.Scanner;
import java.util.Arrays;

public class List_phieudatphong {
        Phieudatphong[] arrBooked;
        Scanner sc = new Scanner(System.in);
        Phieudatphong a;

        public List_phieudatphong() {
                arrBooked = new Phieudatphong[0];
        }

        public void Dat_phong(List_rooms arrRoom, List_dichvu dichvu) {
                a = new Phieudatphong(arrRoom);
                a.Dat_phong(arrRoom, dichvu);
                arrBooked = Arrays.copyOf(arrBooked, arrBooked.length + 1);
                arrBooked[arrBooked.length - 1] = a;
        }

        public void Xuatdsphieu(List_rooms arrRoom) {
                System.out.println(
                                "\n*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*");
                System.out.println(
                                "|                                                                                DANH SACH KHACH HANG                                                                             |");
                System.out.println(
                                "|                                                                                                                                                                                 |");
                System.out.printf("| %-25s%-15s%-60s%-15s%-60s |\n", "Ho ten", "Cmnd", "Dia chi", "Phong dat",
                                "Dich vu su dung");
                for (Phieudatphong booked : arrBooked) {
                        booked.Xuat_thong_tin();
                }
                System.out.println(
                                "|                                                                                                                                                                                 |");
                System.out.println(
                                "*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*\n");
        }
}