import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class List_rooms implements File_handle {
    String file = "list_room.txt";
    Room[] arrRooms;
    private int n;

    public List_rooms() {
        arrRooms = null;
        n = 0;
    }

    @Override
    public void read() throws IOException {
        ObjectInputStream oi = null;
        try {
            oi = new ObjectInputStream(new FileInputStream(file));
            arrRooms = (Room[]) oi.readObject();

        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        } finally {
            oi.close();
        }
    }

    @Override
    public void write() throws IOException {
        ObjectOutputStream oo = null;
        try {
            oo = new ObjectOutputStream(new FileOutputStream(file));
            oo.writeObject(arrRooms);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oo.close();
        }
    }

    public void Nhapdsphong() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong phong : ");
        n = Integer.parseInt(sc.nextLine());
        arrRooms = new Room[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin phong thu " + (i + 1));
            arrRooms[i] = new Room();
            arrRooms[i].nhap_thontin();
        }
        sc.close();
        write();
    }

    public void Xuatdsphong() {
        System.out.println("\n*------------------------------------------------------------*");
        System.out.println("|                      DANH SACH PHONG                       |");
        System.out.println("|                                                            |");
        System.out.printf("|%-20s%-20s%19s |\n", " Ten phong", "So giuong", "Gia");
        for (Room room : arrRooms) {
            room.xuatthongtin();
        }
        System.out.println("*------------------------------------------------------------*\n");
    }

    public void Xuatdsphongtrong() {
        System.out.println("\n*------------------------------------------------------------*");
        System.out.println("|                   DANH SACH PHONG TRONG                    |");
        System.out.println("|                                                            |");
        System.out.printf("|%-20s%-20s%19s |\n", " Ten phong", "So giuong", "Gia");
        for (Room room : arrRooms) {
            if (!room.booked)
                room.xuatthongtin();
        }
        System.out.println("|                                                            |");
        System.out.println("*------------------------------------------------------------*\n");
    }

    public Room Timkiemphong(String a) {
        for (Room room : arrRooms) {
            if (room.tenphong.equalsIgnoreCase(a))
                return room;
        }
        return null;
    }
}
