import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class List_phieudatphong implements File_handle {

    String file = "list_customer.txt";
    Phieudatphong[] arrBooked;
    Phieudatphong a;

    public List_phieudatphong() {
        arrBooked = new Phieudatphong[0];
    }

    @Override
    public void read() throws IOException {
        ObjectInputStream oi = null;
        try {
            oi = new ObjectInputStream(new FileInputStream(file));
            arrBooked = (Phieudatphong[]) oi.readObject();

        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }finally {
            oi.close();
        }
    }

    @Override
    public void write() throws IOException {
        ObjectOutputStream oo =null;
        try {
            oo = new ObjectOutputStream(new FileOutputStream(file));
            oo.writeObject(arrBooked);
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            oo.close();
        }
    }

    public void Dat_phong(List_rooms arrRoom, List_dichvu dichvu) throws IOException {
        a = new Phieudatphong(arrRoom, dichvu);
        a.Dat_phong(arrRoom);
        a.Su_dung_dichvu(dichvu);
        arrBooked = Arrays.copyOf(arrBooked, arrBooked.length + 1);
        arrBooked[arrBooked.length - 1] = a;
        write();
    }

    public void Xuatdsphieu(List_rooms arrRoom) throws IOException {
        read();
        System.out.println("\n*------------------------------------------------------------*");
        System.out.println("|                    DANH SACH KHACH HANG                    |");
        System.out.println("|                                                            |");
        for (Phieudatphong booked : arrBooked) {
            booked.Xuat_thong_tin();
        }
        System.out.println("|                                                            |");
        System.out.println("*------------------------------------------------------------*");
    }
}