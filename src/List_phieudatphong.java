import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class List_phieudatphong implements Filehandle {
    Phieudatphong[] arrBooked;
    transient Scanner sc = new Scanner(System.in);
    Phieudatphong a;

    public List_phieudatphong() {
        arrBooked = new Phieudatphong[0];
    }

    @Override
    public void read() throws IOException {
        ObjectInputStream oi = null;
        try {
            oi = new ObjectInputStream(new FileInputStream(file_customer));
            try {
                arrBooked = (Phieudatphong[]) oi.readObject();

            } catch (Exception e) {
                arrBooked = new Phieudatphong[0];
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            oi.close();
        }
    }

    @Override
    public void write() throws IOException {
        ObjectOutputStream oo = null;
        try {
            oo = new ObjectOutputStream(new FileOutputStream(file_customer));
            oo.writeObject(arrBooked);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oo.close();
        }
    }

    public void Dat_phong(List_rooms arrRoom, List_dichvu dichvu) throws IOException {
        read();
        a = new Phieudatphong(arrRoom);
        a.Dat_phong(arrRoom, dichvu);
        arrBooked = Arrays.copyOf(arrBooked, arrBooked.length + 1);
        arrBooked[arrBooked.length - 1] = a;
        write();
    }

    public void Xuatdsphieu(List_rooms arrRoom) throws IOException {
        read();
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