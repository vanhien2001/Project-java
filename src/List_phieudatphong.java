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

    public void Dat_phong(List_rooms arrRoom, List_dichvu dichvu, Staff nv) throws IOException {
        read();
        a = new Phieudatphong(arrRoom);
        a.Dat_phong(arrRoom, dichvu);
        a.nv = nv;
        arrBooked = Arrays.copyOf(arrBooked, arrBooked.length + 1);
        arrBooked[arrBooked.length - 1] = a;
        write();
    }

    public void Xuatdsphieu(List_rooms arrRoom) throws IOException {
        read();
        System.out.println(
                "\n*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*");
        System.out.println(
                "|                                                                                                 DANH SACH KHACH HANG                                                                                               |");
        System.out.println(
                "|                                                                                                                                                                                                                    |");
        System.out.printf("| %-25s%-15s%-60s%-15s%-40s%-15s%-25s%15s |\n", "Ho ten", "Cmnd", "Dia chi", "Phong dat",
                "Dich vu su dung", "Thoi diem", "Nhan vien dat phong", "Id nhan vien");
        for (Phieudatphong booked : arrBooked) {
            booked.Xuat_thong_tin();
        }
        System.out.println(
                "|                                                                                                                                                                                                                    |");
        System.out.println(
                "*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*\n");
    }

    public void setup(List_rooms a, List_dichvu b, List_staff c) throws IOException {
        arrBooked = new Phieudatphong[3];
        arrBooked[0] = new Phieudatphong(a, new Customer("Nguyen Van A", "0969696969", "145784602148", "27", "Au co",
                "1", "Tan Phu", "Tp.HCM", new Time(1, 11, 2020)), "102", b.arrs[3], b.arrs[5], c.arrPerson[1]);
        arrBooked[1] = new Phieudatphong(a, new Customer("Le Thi B", "0969696969", "451258746231", "25", "Au co", "1",
                "Tan Phu", "Tp.HCM", new Time(3, 11, 2020)), "103", b.arrs[1], b.arrs[2], c.arrPerson[2]);
        arrBooked[2] = new Phieudatphong(a, new Customer("Phung Duy C", "0969696969", "784513548965", "29", "Au co",
                "1", "Tan Phu", "Tp.HCM", new Time(5, 11, 2020)), "203", b.arrs[4], b.arrs[6], c.arrPerson[3]);
        write();
    }
}