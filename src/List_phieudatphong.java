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

    public void setup(List_rooms arrRoom) throws IOException {
        arrBooked = new Phieudatphong[3];
        arrBooked[0] = new Phieudatphong(arrRoom,
                new Customer("Nguyen Van A", "0969696969", "145784602148", "27", "Au co", "1", "Tan Phu", "Tp.HCM"),
                "102", new Dichvu("Spa", 300), new Dichvu("Casino", 200));
        arrBooked[1] = new Phieudatphong(arrRoom,
                new Customer("Le Thi B", "0969696969", "451258746231", "25", "Au co", "1", "Tan Phu", "Tp.HCM"), "103",
                new Dichvu("Nha hang", 200), new Dichvu("Fitness center", 200));
        arrBooked[2] = new Phieudatphong(arrRoom,
                new Customer("Phung Duy C", "0969696969", "784513548965", "29", "Au co", "1", "Tan Phu", "Tp.HCM"),
                "104", new Dichvu("Bar", 200), new Dichvu("Trong tre", 200));
        write();
    }
}